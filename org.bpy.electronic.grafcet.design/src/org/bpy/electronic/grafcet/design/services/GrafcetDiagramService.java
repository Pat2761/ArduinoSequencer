package org.bpy.electronic.grafcet.design.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetConnector;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetFactory;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.PassThrough;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.bpy.electronic.ArduinoGrafcet.Transition;
import org.bpy.electronic.ArduinoGrafcet.TransitionAction;
import org.bpy.electronic.grafcet.design.utils.SimpleCommandStack;
import org.bpy.electronic.grafcet.design.wizards.ActionAttributeWizard;
import org.bpy.electronic.grafcet.design.wizards.PassThroughAttributeWizard;
import org.bpy.electronic.grafcet.design.wizards.ReportAttriburteEditorWizard;
import org.bpy.electronic.grafcet.design.wizards.StepAttribiteEditor;
import org.bpy.electronic.grafcet.design.wizards.TransitionActionAttributeWizard;
import org.bpy.electronic.grafcet.design.wizards.TransitionAttributeWizard;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.helper.task.ICommandTask;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.model.business.internal.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeSpec;
import org.eclipse.sirius.tools.api.command.ICommandFactory;
import org.eclipse.sirius.tools.api.command.SiriusCommand;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class GrafcetDiagramService {

	public static void createStepElement(Grafcet grafcet) {
		GrafcetStep grafcetStep = GrafcetFactory.eINSTANCE.createGrafcetStep();
		grafcet.getSteps().add(grafcetStep);

		GrafcetConnector connector = GrafcetFactory.eINSTANCE.createGrafcetConnector();
		grafcetStep.setEntryConnector(connector);
	}

	public static void createTransitionActionElement(GrafcetStep step) {
		TransitionAction element = GrafcetFactory.eINSTANCE.createTransitionAction();
		element.setActionFct("actionFct");
		element.setTransitionFct("transitionFct");
		step.getGrafcetElements().add(element);
	}

	public static void removeTransitionAction(GrafcetConnector connector, DEdgeSpec edge) {

		DNodeSpec nodeSpec = (DNodeSpec) edge.getTargetNode();
		if (nodeSpec.getTarget() instanceof GrafcetElement element) {

			Session session = SessionManager.INSTANCE.getSession(edge);
			TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
			SiriusCommand command = new SiriusCommand(domain, "Remove Action from Target");

			command.getTasks().add(new SimpleCommandStack("delete an edge") {
				@Override
				public void execute() {
					connector.getGrafcetElements().remove(element);
				}
			});
			domain.getCommandStack().execute(command);
		}
	}
	
	public static void centerBoderedNode(DNodeContainerSpec containerSpec) {
		for (DDiagramElement obj : containerSpec.getElements()) {
			if (obj instanceof DNodeSpec nodeSpec) {
				System.out.println(nodeSpec.getDiagramElementMapping());
			}
		}
		
	}

	public static void debug(EObject eObject) {
		System.out.println(eObject.getClass().getName());
	}

	public static String openTransitionActionAttributeEditor(TransitionAction transitionAction) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		TransitionActionAttributeWizard wizard = new TransitionActionAttributeWizard(transitionAction);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
		return "";
	}

	public static String openStepAttributeEditor(GrafcetStep step) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		StepAttribiteEditor editor = new StepAttribiteEditor(step);
		WizardDialog dialog = new WizardDialog(shell, editor);
		dialog.open();

		return step.getName();
	}

	public static String openActionAttributeEditor(Action action) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		ActionAttributeWizard editor = new ActionAttributeWizard(action);
		WizardDialog dialog = new WizardDialog(shell, editor);
		dialog.open();

		return "";
	}

	public static String openTransitionAttributeEditor(Transition transition) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		TransitionAttributeWizard editor = new TransitionAttributeWizard(transition);
		WizardDialog dialog = new WizardDialog(shell, editor);
		dialog.open();

		return "";
	}

	public static String openPassThroughAttributeEditor(PassThrough passThrough) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		PassThroughAttributeWizard editor = new PassThroughAttributeWizard(passThrough);
		WizardDialog dialog = new WizardDialog(shell, editor);
		dialog.open();

		return "";
	}

	public static String openReportAttributeEditor(Report report) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		ReportAttriburteEditorWizard editor = new ReportAttriburteEditorWizard(report);
		WizardDialog dialog = new WizardDialog(shell, editor);
		dialog.open();
		return "";
	}

	public static String getUUID(GrafcetElement element) {
		return UUID.randomUUID().toString();
	}
}
