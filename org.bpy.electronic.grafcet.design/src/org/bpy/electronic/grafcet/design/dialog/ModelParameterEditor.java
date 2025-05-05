/*
 * Arduino grafcet editor
 * Copyright (C) 2025  Patrick BRIAND
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.bpy.electronic.grafcet.design.dialog;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * Dialog box for set the model parameters
 * 
 * @author Patrick BRIAND
 *
 */
public class ModelParameterEditor extends Dialog {

	private Model model;
	private Text sequencerPath;
	private Button btnNewButton;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public ModelParameterEditor(Shell parentShell, Model model) {
		super(parentShell);
		this.model = model;
	}

	@Override
	protected void configureShell(Shell newShell) {
		newShell.setText("Model configuration");
		super.configureShell(newShell);
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
		
		Label lblSequencerPath = new Label(container, SWT.NONE);
		lblSequencerPath.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblSequencerPath.setToolTipText("");
		lblSequencerPath.setText("Sequencer path:");
		new Label(container, SWT.NONE);
		
		sequencerPath = new Text(container, SWT.BORDER);
		sequencerPath.setToolTipText("Set the sequencer path for the generation of the general configuration source  files");
		sequencerPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectSequencerPathDialog();
			}
		});
		btnNewButton.setText("Browse");

		return container;
	}

	protected void selectSequencerPathDialog() {
		DirectoryDialog folderDialog = new DirectoryDialog(getParentShell());
		String folderPath = folderDialog.open();
		if (folderPath != null) {
			sequencerPath.setText(folderPath);
		}
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
		return new Point(450, 239);
	}
}
