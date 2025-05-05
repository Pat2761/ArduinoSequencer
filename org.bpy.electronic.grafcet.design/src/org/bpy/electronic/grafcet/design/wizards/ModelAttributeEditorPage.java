package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

public class ModelAttributeEditorPage extends WizardPage {

	private Model model;
	private Text projectName;
	private Text description;

	public ModelAttributeEditorPage(Model model) {
		super("projectAttributeEditorPageOne");
		this.model = model;
		setTitle("Project description");
		setDescription("Allow to define the project attributes");
	}

	public String getProjectName() {
		return projectName.getText();
	}
	
	public String getDescription() {
		return description.getText();
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblProjectName = new Label(container, SWT.NONE);
		lblProjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectName.setText("Project name:");
		
		projectName = new Text(container, SWT.BORDER);
		projectName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		projectName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description:");
		new Label(container, SWT.NONE);
		
		description = new Text(container, SWT.BORDER | SWT.MULTI);
		description.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		projectName.setText(model.getProjectName()==null ? "" : model.getProjectName());
		description.setText(model.getDescription()==null ? "" : model.getDescription());
		checkConsistency();
	}

	protected void checkConsistency() {
		// TODO Auto-generated method stub
		if (projectName.getText().isBlank()) {
			setErrorMessage("Project name can't be blank");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
