package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.TransitionAction;
import org.eclipse.jface.wizard.Wizard;

public class TransitionActionAttributeWizard extends Wizard {

	private TransitionAction element;
	private TransitionActionAttributeWizardPageOne pageOne;

	public TransitionActionAttributeWizard(TransitionAction element) {
		setWindowTitle("Edit a Transition/action");
		this.element = element;
	}

	@Override
	public void addPages() {
		pageOne = new TransitionActionAttributeWizardPageOne(element);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		element.setTransitionFct(pageOne.getTransitionCName());
		element.setActionFct(pageOne.getActionCName());
		element.setComment(pageOne.getDescription());
		return true;
	}

}
