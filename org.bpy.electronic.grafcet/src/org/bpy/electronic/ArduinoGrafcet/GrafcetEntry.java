/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntry#getStartingGrafcet <em>Starting Grafcet</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntry()
 * @model
 * @generated
 */
public interface GrafcetEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Grafcet</em>' reference.
	 * @see #setStartingGrafcet(Grafcet)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntry_StartingGrafcet()
	 * @model required="true"
	 * @generated
	 */
	Grafcet getStartingGrafcet();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntry#getStartingGrafcet <em>Starting Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Grafcet</em>' reference.
	 * @see #getStartingGrafcet()
	 * @generated
	 */
	void setStartingGrafcet(Grafcet value);

} // GrafcetEntry
