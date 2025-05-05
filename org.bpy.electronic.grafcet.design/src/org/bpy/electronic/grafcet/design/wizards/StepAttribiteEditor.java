package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.eclipse.jface.wizard.Wizard;

public class StepAttribiteEditor extends Wizard {

	private GrafcetStep step;
	private StepAttribiteEditorPage pageOne;

	public StepAttribiteEditor(GrafcetStep step) {
		setWindowTitle("New Wizard");
		this.step = step;
	}

	@Override
	public void addPages() {
		pageOne = new StepAttribiteEditorPage(step);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		step.setName(pageOne.getName());
		step.setComment(pageOne.getShortDescription());
		step.setDescription(pageOne.getDescription());
		return true;
	}

}
