package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Report;
import org.eclipse.jface.wizard.Wizard;

public class ReportAttriburteEditorWizard extends Wizard {

	private Report report;
	private ReportAttriburteEditorWizardPageOne pageOne;

	public ReportAttriburteEditorWizard(Report report) {
		setWindowTitle("New Wizard");
		this.report = report;
	}

	@Override
	public void addPages() {
		pageOne = new ReportAttriburteEditorWizardPageOne(report);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		report.setNextStep(pageOne.getSelectedStep());
		return true;
	}

}
