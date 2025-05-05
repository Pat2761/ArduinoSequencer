package org.bpy.electronic.grafcet.design.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.business.api.helper.task.ICommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;

public class SimpleCommandStack implements ICommandTask {

	private String message;

	public SimpleCommandStack(String message) {
		this.message = message;
	}
	
	@Override
	public String getLabel() {
		return message;
	}

	@Override
	public List<ICommandTask> getChildrenTasks() {
		return new ArrayList<>();
	}

	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		// Nothing to do
	}

	@Override
	public boolean executeMyselfChildrenTasks() {
		return false;
	}

	@Override
	public boolean canExecute() {
		return true;
	}

}
