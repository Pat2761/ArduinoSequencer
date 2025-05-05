package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.eclipse.jface.wizard.Wizard;

public class GrafcetAttributeWizard extends Wizard {

	private Grafcet grafcet;
	private GrafcetAttributeWizardPageOne pageOne;

	public GrafcetAttributeWizard(Grafcet grafcet) {
		setWindowTitle("Edit the grafcet attributes");
		this.grafcet = grafcet;
	}

	@Override
	public void addPages() {
		pageOne = new GrafcetAttributeWizardPageOne(grafcet);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		grafcet.setDescription(pageOne.getDescription());
		grafcet.setName(pageOne.getGrafcetName());
		return true;
	}

}
