package org.bpy.electronic.grafcet.design.dialog;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class GrafcetAttributeEditor extends Dialog {
	private Grafcet grafcet;
	private Text grafcetName;
	private Button btnAutorun;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public GrafcetAttributeEditor(Shell parentShell, Grafcet grafcet) {
		super(parentShell);
		this.grafcet = grafcet;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(grafcet.getName() + " parameters");
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = (GridLayout) container.getLayout();
		gridLayout.numColumns = 2;
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Grafcet name:");
		
		grafcetName = new Text(container, SWT.BORDER);
		grafcetName.setToolTipText("Define the name of the grafcet.\r\nthis name must be compatible with a C identifier");
		grafcetName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grafcetName.setText(grafcet.getName());
		
		btnAutorun = new Button(container, SWT.CHECK);
		btnAutorun.setToolTipText("If checked, the grafcet is active at initialization\r\n\r\n");
		btnAutorun.setText("Autorun");
		new Label(container, SWT.NONE);
		btnAutorun.setSelection(grafcet.isAutorun());

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	@Override
	protected void okPressed() {
		grafcet.setAutorun(btnAutorun.getSelection());
		grafcet.setName(grafcetName.getText());
		super.okPressed();
	}

}
