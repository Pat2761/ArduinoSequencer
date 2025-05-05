package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.eclipse.jface.wizard.Wizard;

public class ActionAttributeWizard extends Wizard {

	private Action element;
	private ActionAttributeWizardPageOne pageOne;

	public ActionAttributeWizard(Action element) {
		setWindowTitle("Edit a Transition/action");
		this.element = element;
	}

	@Override
	public void addPages() {
		pageOne = new ActionAttributeWizardPageOne(element);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		element.setActionFct(pageOne.getActionCName());
		element.setComment(pageOne.getDescription());
		return true;
	}

}
