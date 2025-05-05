package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.grafcet.design.utils.CFunctionNameValidator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

public class StepAttribiteEditorPage extends WizardPage {

	private GrafcetStep step;
	
	private Text name;
	private Text shortComment;
	private Text description;

	public StepAttribiteEditorPage(GrafcetStep step) {
		super("wizardPage");
		setTitle("Step attribute editor");
		setDescription("Allow to edit the step attributes");
		this.step = step;
	}
	
	public String getName() {
		return name.getText();
	}
	
	public String getShortDescription() {
		return shortComment.getText();
	}
	
	public String getDescription() {
		return description.getText();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblNameOfThe = new Label(container, SWT.NONE);
		lblNameOfThe.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNameOfThe.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNameOfThe.setToolTipText("Must be a  C identifer used for code generation");
		lblNameOfThe.setText("Name of the step:");
		
		name = new Text(container, SWT.BORDER);
		name.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		name.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		name.setToolTipText("Must be a  C identifer used for code generation");
		name.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Label lblShortComment = new Label(container, SWT.NONE);
		lblShortComment.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblShortComment.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblShortComment.setText("Short comment:");
		
		shortComment = new Text(container, SWT.BORDER);
		shortComment.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		shortComment.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description:");
		new Label(container, SWT.NONE);
		
		description = new Text(container, SWT.BORDER | SWT.MULTI);
		description.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		
		name.setText(step.getName()==null ? "" : step.getName());
		shortComment.setText(step.getComment() == null ? "" : step.getComment());
		description.setText(step.getDescription() == null ? "" : step.getDescription());
		checkConsistency();
	}

	protected void checkConsistency() {
		
		if (name.getText().isBlank() || !CFunctionNameValidator.isValidCFunctionName(name.getText())) {
			setErrorMessage("The name of the Step must be a valid C Identfier");
			setPageComplete(false);
			return;
		}
		
		if (shortComment.getText().isBlank()) {
			setErrorMessage("Short comment can't be empty");
			setPageComplete(false);
			return;
		}
		
		// TODO Auto-generated method stub
		setErrorMessage(null);
		setPageComplete(true);
	}

}
