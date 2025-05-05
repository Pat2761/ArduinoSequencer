package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.grafcet.design.utils.CFunctionNameValidator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

public class GrafcetAttributeWizardPageOne extends WizardPage {
	private Text grafcetName;
	private Text description;
	
	private Grafcet grafcet;

	public GrafcetAttributeWizardPageOne(Grafcet grafcet) {
		super("wizardPage");
		setTitle("Grafcet attribute editor");
		setDescription("Allow to set the attributes values of the grafcet");
		
		this.grafcet = grafcet;
	}

	public String getGrafcetName() {
		return grafcetName.getText();
	}

	public String getDescription() {
		return description.getText();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Grafcet name:");
		
		grafcetName = new Text(container, SWT.BORDER);
		grafcetName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		grafcetName.setToolTipText("Allow to define the name the grafcet. \r\nThis name shall respect the C standard naming");
		grafcetName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description:");
		new Label(container, SWT.NONE);
		
		description = new Text(container, SWT.BORDER | SWT.MULTI);
		description.setToolTipText("Allow to display a description of the grafcet.\r\nThes test defined here will be reused for the grafcet editor and in the generated code");
		description.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	
		description.setText(grafcet.getDescription()==null? "" : grafcet.getDescription());
		grafcetName.setText(grafcet.getName()==null?"" : grafcet.getName() );
		checkConsistency();
	}

	protected void checkConsistency() {
		if (!CFunctionNameValidator.isValidCFunctionName(grafcetName.getText())) {
			setErrorMessage("Transition C function Name isn't a valid C function name");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
