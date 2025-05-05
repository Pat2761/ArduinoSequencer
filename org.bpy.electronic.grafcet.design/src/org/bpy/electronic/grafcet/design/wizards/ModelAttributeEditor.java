package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.jface.wizard.Wizard;

public class ModelAttributeEditor extends Wizard {

	private Model model;
	private ModelAttributeEditorPage pageOne;

	public ModelAttributeEditor(Model model) {
		this.model = model;
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
		pageOne = new ModelAttributeEditorPage(model);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		model.setProjectName(pageOne.getProjectName());
		model.setDescription(pageOne.getDescription());
		return true;
	}

}
