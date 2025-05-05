package org.bpy.electronic.grafcet.design.validation;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MainSequencerValidation {

	private static final String C_IDENTIFIER_PATTERN = "^[a-zA-Z_][a-zA-Z0-9_]*$";
	private static final Pattern cIdentiferPattern = Pattern.compile(C_IDENTIFIER_PATTERN);

	public static boolean checkMissingStartElement(EObject obj) {
		if (obj instanceof Model model) { 
			return model.getGrafcetEntry() != null;
		}	
		return true;
	}

	public static boolean checkMissingEndElement(EObject obj) {
		if (obj instanceof Model model) { 
			return model.getGrafcetEnded() != null;
		}	
		return true;
	}
	
	public static boolean checkUncallEndedElement(EObject obj) {
		Collection<Setting> usage = EcoreUtil.UsageCrossReferencer.find(obj, obj.eResource());
		return !usage.isEmpty();
	}
	
	public static boolean checkGraphName(EObject obj) {
		Grafcet graph = (Grafcet) obj;
		Matcher matcher = cIdentiferPattern.matcher(graph.getName());
		return matcher.matches(); 
	}
	
	public static boolean checkEntryExistence(EObject obj) {
		Model model = (Model)obj;
		return model.getGrafcetEntry()==null;
	}
}
