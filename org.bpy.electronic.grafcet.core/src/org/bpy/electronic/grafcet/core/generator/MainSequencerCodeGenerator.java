package org.bpy.electronic.grafcet.core.generator;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.refresh.SiriusGMFSynchronizerDispatcher;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.model.business.internal.description.spec.DiagramDescriptionSpec;
import org.eclipse.sirius.diagram.model.business.internal.description.spec.NodeMappingSpec;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.w3c.dom.Node;

public class MainSequencerCodeGenerator {

   private static final String GRAFCET_DIAGRAM_NAME = "Grafcet Diagram";

   public MainSequencerCodeGenerator() {

   }

   public void generate(Session session, Model model) {
      try {
         setGrafcetElementsPriority(session, model);

         SequencerHeaderGenerator sequencerHeaderGenerator = new SequencerHeaderGenerator(model);
         sequencerHeaderGenerator.generate(getFilePath(session));

         SequencerSourceFileGenerator sequencerSourceGenerator = new SequencerSourceFileGenerator(model);
         sequencerSourceGenerator.generate(getFilePath(session));

         for (Grafcet grafcet : model.getGrafcets()) {
            GrafcetSourceCodeGenerator sourceCodeGenerator = new GrafcetSourceCodeGenerator(model, grafcet);
            sourceCodeGenerator.generate(getFilePath(session));

            GrafcetHeaderCodeGenerator headerCodeGenerator = new GrafcetHeaderCodeGenerator(model, grafcet);
            headerCodeGenerator.generate(getFilePath(session));
         }

      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      IProject project = getProjectFromEObject(model);
      try {
         project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
      } catch (CoreException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   private void setGrafcetElementsPriority(Session session, Model model) throws IOException {
      displaySession(session, model);
   }

   private void displaySession(Session session, Model model) {
      Collection<DView> views = session.getOwnedViews();
      for (DView rep : views) {

         EList<RepresentationDescription> representations = rep.getViewpoint().getOwnedRepresentations();
         for (RepresentationDescription representation : representations) {
            if (GRAFCET_DIAGRAM_NAME.equals(representation.getLabel())
                  && (representation instanceof DiagramDescriptionSpec diagramDescription)) {

               Collection<Setting> usages = EcoreUtil.UsageCrossReferencer.find(diagramDescription,
                     diagramDescription.eResource().getResourceSet());
               for (Setting usage : usages) {
                  if (usage.getEObject() instanceof DRepresentationDescriptor diagram) {

                     DRepresentation currentRepresentation = diagram.getRepresentation();
                     if (currentRepresentation instanceof DDiagram diagram1) {
                        for (DDiagramElement element : diagram1.getDiagramElements()) {
                           explorerElementRecursivement(element, session, model);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void explorerElementRecursivement(DDiagramElement element, Session session, Model model) {
      if (element instanceof DNodeContainerSpec container) {
         sortDiagramElements(container.getElements(), session, model);
      }
   }

   private void sortDiagramElements(EList<DDiagramElement> elements, Session session, Model model) {
      for (DDiagramElement element : elements) {
         if (element.getTarget() instanceof GrafcetElement grafcetElement) {
            org.eclipse.gmf.runtime.notation.Node gmfNode = SiriusGMFHelper.getGmfNode(element, session);
            LayoutConstraint constraint = gmfNode.getLayoutConstraint();
            if (constraint instanceof Bounds bound) {
               TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(grafcetElement);
               if (domain != null) {
                  domain.getCommandStack().execute(new RecordingCommand(domain) {

                     @Override
                     protected void doExecute() {
                        GrafcetElement realElementInModel = (GrafcetElement) findSameElementInModel(model, grafcetElement.getUuid());
                        if (realElementInModel != null) {
                           realElementInModel.setLocation(bound.getX());
                        }
                     }
                  });
               }
            }
            System.out.println(grafcetElement.getLocation());
         }
      }
   }

   private EObject findSameElementInModel(Model model, String uuid) {

      TreeIterator<EObject> it = model.eAllContents();
      while (it.hasNext()) {
         EObject obj = it.next();
         if (obj instanceof GrafcetElement grafcetElement) {
            if (uuid != null && uuid.equals(grafcetElement.getUuid())) {
               return grafcetElement;
            }
         }
      }
      return null;
   }

   private String getFilePath(Session session) {

      Resource sessionResource = session.getSessionResource();
      URI uri = sessionResource.getURI();
      if (uri.isPlatformResource()) {
         IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
         return file.getLocation().toFile().getParent();
      } else if (uri.isFile()) {
         return new File(uri.toFileString()).getParent();
      }
      return "";
   }

   private IProject getProjectFromEObject(EObject eObject) {
      if (eObject == null || eObject.eResource() == null) {
         return null;
      }

      Resource resource = eObject.eResource();
      URI uri = resource.getURI();

      if (uri.isPlatformResource()) {
         String platformString = uri.toPlatformString(true);
         Path path = new Path(platformString);
         IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
         return file.getProject();
      }

      return null;
   }
}
