package org.bpy.electronic.grafcet.design.wizards;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.TransitionAction;
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

public class ActionAttributeWizardPageOne extends WizardPage {
	
	private Text actionCName;
	private Text description;
	
	private Action element;
	
	public ActionAttributeWizardPageOne(Action element) {
		super("wizardPage");
		setTitle("Edit Action attributes");
		setDescription("Allow to edit the attributes of a Action element");
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
		
		Label lblActionCFunction = new Label(container, SWT.NONE);
		lblActionCFunction.setText("Action C Function:");
		
		actionCName = new Text(container, SWT.BORDER);
		actionCName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				checkConsistency();
		}
		});
		actionCName.setToolTipText("Set the name of a C action function");
		actionCName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		actionCName.setText(element.getActionFct()!=null?element.getActionFct():"");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
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
		if (!CFunctionNameValidator.isValidCFunctionName(actionCName.getText())) {
			setErrorMessage("Action C function Name isn't a valid C function name");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
