package org.bpy.electronic.grafcet.ui.handlers;

import java.util.Iterator;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.grafcet.core.generator.MainSequencerCodeGenerator;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class SequencerCodeGeneration implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object element = ((IStructuredSelection) selection).getFirstElement();

			if (element instanceof IFile) {
				IFile file = (IFile) element;
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

				// Vérifier si c'est bien un fichier .aird
				if (file.getFileExtension().equals("aird")) {
					// Charger la ressource .aird
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource airdResource = resourceSet.getResource(uri, true);

					// Vérifier que la ressource a bien été chargée
					if (airdResource != null) {
						// Charger la session Sirius à partir du fichier .aird
						Session session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
						if (session != null) {
							Model model = getSequencerModel(session);
							
							
							if (model != null) {
								MainSequencerCodeGenerator generator = new MainSequencerCodeGenerator();
								generator.generate(session, model);
							}
							MessageDialog.openInformation(new Shell(), "ok", "ok");
						}
					} else {
						throw new ExecutionException("Fichier .aird introuvable ou invalide.");
					}
				} else {
					throw new ExecutionException("Veuillez sélectionner un fichier .aird.");
				}
			}
		}
		return null;
	}

	private Model getSequencerModel(Session session) {
		if (!session.getSemanticResources().isEmpty()) {
			Iterator<Resource> it = session.getSemanticResources().iterator();
			Resource resource = it.next();
			URI resourceURI = resource.getURI();
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource emfResource = resourceSet.getResource(resourceURI, true);
			EObject emfModel = emfResource.getContents().get(0);
			if (emfModel instanceof Model model) {
				return model;
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
