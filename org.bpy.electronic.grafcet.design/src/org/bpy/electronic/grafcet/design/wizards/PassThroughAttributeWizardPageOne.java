package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.PassThrough;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class PassThroughAttributeWizardPageOne extends WizardPage {
	
	private Text actionCName;
	private Text description;
	
	private PassThrough element;
	
	public PassThroughAttributeWizardPageOne(PassThrough element) {
		super("wizardPage");
		setTitle("Edit Pass through attributes");
		setDescription("Allow to edit the attributes of a Pass through element");
		this.element = element;
	}

	public String getActionCName() {
		return actionCName.getText();
	}

	public String getDescription() {
		return description.getText();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblTransitionCFunction = new Label(container, SWT.NONE);
		lblTransitionCFunction.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTransitionCFunction.setText("Transition C function:");
		
		Label lblActionCFunction = new Label(container, SWT.NONE);
		lblActionCFunction.setText("Action C Function:");
		
		Label lblComment = new Label(container, SWT.NONE);
		lblComment.setText("Comment:");
		new Label(container, SWT.NONE);
		
		description = new Text(container, SWT.BORDER | SWT.MULTI);
		description.setToolTipText("Set here a description of the purpose of the Transition/Action");
		description.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		description.setText(element.getComment()!=null?element.getComment():"");
		checkConsistency();
	}

	protected void checkConsistency() {
		setPageComplete(true);
	}
}
