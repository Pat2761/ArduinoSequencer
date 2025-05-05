package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Transition;
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

public class TransitionAttributeWizardPageOne extends WizardPage {
	
	private Text transitionCName;
	private Text description;
	
	private Transition element;
	
	public TransitionAttributeWizardPageOne(Transition element) {
		super("wizardPage");
		setTitle("Edit Transition attributes");
		setDescription("Allow to edit the attributes of a Transition element");
		this.element = element;
	}

	public String getTransitionCName() {
		return transitionCName.getText();
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
		
		transitionCName = new Text(container, SWT.BORDER);
		transitionCName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
			}
		});
		transitionCName.setToolTipText("Set the name of a C transition function");
		transitionCName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
	
		Label lblComment = new Label(container, SWT.NONE);
		lblComment.setText("Comment:");
		new Label(container, SWT.NONE);
		
		description = new Text(container, SWT.BORDER | SWT.MULTI);
		description.setToolTipText("Set here a description of the purpose of the Transition/Action");
		description.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		transitionCName.setText(element.getTransitionFct()!=null?element.getTransitionFct():"");
		description.setText(element.getComment()!=null?element.getComment():"");
		checkConsistency();
	}

	protected void checkConsistency() {
		if (!CFunctionNameValidator.isValidCFunctionName(transitionCName.getText())) {
			setErrorMessage("Transition C function Name isn't a valid C function name");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
