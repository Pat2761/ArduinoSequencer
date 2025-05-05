package org.bpy.electronic.grafcet.design.validation;

import java.util.Collection;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEnded;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntry;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class EdgeValidation {
	
	/**
	/**
	 * Check if connection can be done between Grafcet object and GrafcetEnded object.
	 * The conditions are:
	 * - Source isn't connected to another grafcet
	 * - Target isn't connected by another grafcet	
	 * 
	 * @param source reference to the source element
	 * @param target reference to the target element
	 * @return <b>true</b> if connection can be done, <b>false</b> otherwise
	 */
	public static boolean checkConnectionGrafcetToEnd(Grafcet source, GrafcetEnded target) {
		if (source.getNext() != null) {
			MessageDialog.openInformation(new Shell(), "Connection can't be done", "The Grafcet already connected '" + source.getNext().getName() + "'");
			return false;
		}
		
		Model model = (Model) source.eContainer();
		for (Grafcet element : model.getGrafcets()) {
			if (element instanceof Grafcet grafcet) {
				if (grafcet.getEnd() != null) {
					MessageDialog.openInformation(new Shell(), "Connection can't be done", 
							"The Grafcet '" + grafcet.getName()+ "' already connected to the END element");
				    return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Check if connection can be done between GrafcetEntry and Grafcet objects.
	 * The conditions are:
	 * 1) GrafcetEntry isn't already connected
	 * 2) Grafcet isn't already referenced by an another element
	 * 
	 * @param source
	 * @param target
	 * @return <b>true</b> if connection can be done, <b>false</b> otherwise
	 */
	public static boolean checkConnectionGrafcetEntryToGrafcet(GrafcetEntry source, Grafcet target) {
		if (source.getStartingGrafcet() != null) {
			MessageDialog.openInformation(new Shell(), "Connection can't be done", "The entry point already reference '" + source.getStartingGrafcet().getName() + "'");
			return false;
		}
		
		Collection<Setting> usage = EcoreUtil.UsageCrossReferencer.find(target, target.eResource());
		if (!usage.isEmpty()) {
			MessageDialog.openInformation(new Shell(), "Connection can't be done", "The target is already referenced");
			return false;
		}
		return true;
	}
	
	/**
	 * Check if connection can be done between GrafcetEntry and Grafcet objects.
	 * The conditions are:
	 * 1) Source isn't already connected
	 * 1) Target isn't already referenced
	 * 
	 * @param source
	 * @param target
	 * @return <b>true</b> if connection can be done, <b>false</b> otherwise
	 */
	public static boolean checkConnectionGrafcetToGrafcet(Grafcet source, Grafcet target) {
		if (source.getNext() != null) {
			MessageDialog.openInformation(new Shell(), "Connection can't be done", "The entry point already reference '" + source.getNext().getName() + "'");
			return false;
		}
		
		Collection<Setting> usage = EcoreUtil.UsageCrossReferencer.find(target, target.eResource());
		if (!usage.isEmpty()) {
			MessageDialog.openInformation(new Shell(), "Connection can't be done", "The target is already referenced");
			return false;
		}
		return true;
	}
}
