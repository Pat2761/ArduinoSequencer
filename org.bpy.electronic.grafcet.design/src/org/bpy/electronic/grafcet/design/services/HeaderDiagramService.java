/*
 * Arduino grafcet editor
 * Copyright (C) 2025  Patrick BRIAND
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.bpy.electronic.grafcet.design.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint;
import org.bpy.electronic.ArduinoGrafcet.GrafcetFactory;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.grafcet.design.dialog.GrafcetAttributeEditor;
import org.bpy.electronic.grafcet.design.dialog.ModelParameterEditor;
import org.bpy.electronic.grafcet.design.wizards.GrafcetAttributeWizard;
import org.bpy.electronic.grafcet.design.wizards.GrafcetAttributeWizardPageOne;
import org.bpy.electronic.grafcet.design.wizards.ModelAttributeEditor;
import org.bpy.electronic.grafcet.design.wizards.TransitionActionAttributeWizard;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Supply services for the grafcet editor.
 * 
 * @author Patrick BRIAND
 *
 */
public class HeaderDiagramService {

	private static final String DIAGRAM_ID = "grafcetDiagram"; // ID defined in the .odesign

	public static String editModelAttributes(Model model) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		ModelAttributeEditor wizard = new ModelAttributeEditor(model);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
		return "";
	}
	
	/**
	 * Call a dialog box for set a grafcet parameters.
	 * 
	 * @param grafcet reference on the grafcet
	 * 
	 * @return name of the grafcet
	 */
	public static String openGrafcetAttrirbuteEditor(Grafcet grafcet) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		GrafcetAttributeWizard wizard = new GrafcetAttributeWizard(grafcet);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();

		changeNameOfDiagram(grafcet, grafcet.getName());

		return grafcet.getName();
	}

	public static void openOrCreateGrafcetDiagram(Grafcet grafcet) {
		// Get sirius session
		Session session = SessionManager.INSTANCE.getSession(grafcet);
		if (session == null) {
			return;
		}

		Stream<DRepresentationDescriptor> otherDiagram = session.getOwnedViews().stream()
				.flatMap((DView view) -> view.getOwnedRepresentationDescriptors().stream())
				.filter(desc -> desc.getRepresentation() != null && DIAGRAM_ID.equals(desc.getDescription().getName()));

		DRepresentationDescriptor representationDescriptor = null;
		if (otherDiagram != null) {
			Iterator<DRepresentationDescriptor> it = otherDiagram.iterator();
			// Diagram exist
			while (it.hasNext()) {
				DRepresentationDescriptor currentRepresentationDescriptor = it.next();
				if (DIAGRAM_ID.equals(currentRepresentationDescriptor.getDescription().getName())) { 
					if (grafcet.getName().equals(currentRepresentationDescriptor.getRepresentation().getName())) {
						openExistingGrafcet(session, currentRepresentationDescriptor);
						return;
					}
					representationDescriptor = currentRepresentationDescriptor;
				}	
			}
			
			// Diagram doesn't exist
			if (representationDescriptor != null) {
				System.out.println("Create Grafcet " + grafcet.getName());
				if (DIAGRAM_ID.equals(representationDescriptor.getDescription().getName())) {
					createMissingGrafcet(session, grafcet, representationDescriptor);
					return;
				}
			}
		}
	}

	private static void createMissingGrafcet(Session session, Grafcet grafcet,
			DRepresentationDescriptor representationDescriptor) {
		RepresentationDescription diagramDescription = representationDescriptor.getDescription();

		if (diagramDescription != null) {
			// create a new diagram
			DRepresentation newDiagram = DialectManager.INSTANCE.createRepresentation(grafcet.getName(), grafcet,
					diagramDescription, session, new NullProgressMonitor());

			if (newDiagram != null) {

				GrafcetEntryPoint entryPoint = GrafcetFactory.eINSTANCE.createGrafcetEntryPoint();
				grafcet.setEntryPoint(entryPoint);

				// Ouvrir le nouveau diagramme
				DialectUIManager.INSTANCE.openEditor(session, newDiagram, new NullProgressMonitor());
			}
		}
	}

	private static void openExistingGrafcet(Session session, DRepresentationDescriptor representationDescriptor) {
		DialectUIManager.INSTANCE.openEditor(session, representationDescriptor.getRepresentation(),
				new NullProgressMonitor());
	}

	private static void changeNameOfDiagram(Grafcet grafcet, String newName) {

		Session session = SessionManager.INSTANCE.getSession(grafcet);
		if (session == null) {
			return;
		}

		Optional<DRepresentation> existingDiagram = session.getOwnedViews().stream()
				.flatMap((DView view) -> view.getOwnedRepresentationDescriptors().stream())
				.filter(desc -> desc.getRepresentation() != null && DIAGRAM_ID.equals(desc.getDescription().getName()))
				.map(DRepresentationDescriptor::getRepresentation).findFirst();

		if (existingDiagram.isPresent() && existingDiagram.get() instanceof DRepresentation) {
			DRepresentation representation = existingDiagram.get();
			if (representation instanceof DDiagram) {
				DDiagram diagram = (DDiagram) representation;
				diagram.getRepresentationElements().get(0).setName(newName);
			}
			System.out.println(existingDiagram.getClass().getSimpleName());
		} else {
			System.out.println("BPY:not found");
		}

	}

	/**
	 * Call a dialog box for set the model parameters.
	 * 
	 * @param grafcet reference on the model
	 * 
	 * @return empty string
	 */
	public String fillModelParameters(Model model) {
		ModelParameterEditor modelParameterEditor = new ModelParameterEditor(new Shell(), model);
		modelParameterEditor.open();
		return "";
	}

}
