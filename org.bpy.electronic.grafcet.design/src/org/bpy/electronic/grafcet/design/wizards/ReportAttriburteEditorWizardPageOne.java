package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

public class ReportAttriburteEditorWizardPageOne extends WizardPage {

	private Report report;
	private Combo grafcetSelector;

	public ReportAttriburteEditorWizardPageOne(Report report) {
		super("ReportAttriburteEditorWizardPageOne");
		setTitle("Report attribute Editor");
		setDescription("Allow to edit report attributes");
		
		this.report = report;
	}
	
	public GrafcetStep getSelectedStep() {
		int selection = grafcetSelector.getSelectionIndex();
		if (selection > -1) {
			return (GrafcetStep) grafcetSelector.getData(grafcetSelector.getItem(selection));
		}
		return null;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Label lblSelectTheDestination = new Label(container, SWT.NONE);
		lblSelectTheDestination.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblSelectTheDestination.setText("Select the destination Step:");
		
		grafcetSelector = new Combo(container, SWT.NONE);
		grafcetSelector.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		grafcetSelector.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	
		Grafcet grafcet = (Grafcet) report.eContainer();
		for (GrafcetStep step : grafcet.getSteps()) {
			grafcetSelector.add(step.getComment());
			grafcetSelector.setData(step.getComment(), step);
		}
		checkConsistency();
	}

	protected void checkConsistency() {
		if (grafcetSelector.getSelectionIndex() == -1) {
			setErrorMessage("A step must be selected");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}

}
