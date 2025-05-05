package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Transition;
import org.eclipse.jface.wizard.Wizard;

public class TransitionAttributeWizard extends Wizard {

	private Transition element;
	private TransitionAttributeWizardPageOne pageOne;

	public TransitionAttributeWizard(Transition element) {
		setWindowTitle("Edit a Transition/action");
		this.element = element;
	}

	@Override
	public void addPages() {
		pageOne = new TransitionAttributeWizardPageOne(element);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		element.setTransitionFct(pageOne.getTransitionCName());
		element.setComment(pageOne.getDescription());
		return true;
	}

}
