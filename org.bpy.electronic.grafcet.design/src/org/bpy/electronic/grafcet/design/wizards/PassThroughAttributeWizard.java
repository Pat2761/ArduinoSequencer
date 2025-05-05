package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.PassThrough;
import org.eclipse.jface.wizard.Wizard;

public class PassThroughAttributeWizard extends Wizard {

	private PassThrough element;
	private PassThroughAttributeWizardPageOne pageOne;

	public PassThroughAttributeWizard(PassThrough element) {
		setWindowTitle("Edit a Pass Through");
		this.element = element;
	}

	@Override
	public void addPages() {
		pageOne = new PassThroughAttributeWizardPageOne(element);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		element.setComment(pageOne.getDescription());
		return true;
	}

}
