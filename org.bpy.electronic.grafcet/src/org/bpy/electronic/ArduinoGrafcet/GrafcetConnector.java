/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getGrafcetElements <em>Grafcet Elements</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetConnector()
 * @model
 * @generated
 */
public interface GrafcetConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Grafcet Elements</b></em>' reference list.
	 * The list contents are of type {@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet Elements</em>' reference list.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetConnector_GrafcetElements()
	 * @model required="true"
	 * @generated
	 */
	EList<GrafcetElement> getGrafcetElements();

} // GrafcetConnector
