/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getLocation <em>Location</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextReportStep <em>Next Report Step</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement()
 * @model abstract="true"
 * @generated
 */
public interface GrafcetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' reference.
	 * @see #setNextStep(GrafcetStep)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement_NextStep()
	 * @model
	 * @generated
	 */
	GrafcetStep getNextStep();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextStep <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' reference.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(GrafcetStep value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(int)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement_Location()
	 * @model required="true"
	 * @generated
	 */
	int getLocation();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(int value);

	/**
	 * Returns the value of the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Report Step</em>' reference.
	 * @see #setNextReportStep(Report)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement_NextReportStep()
	 * @model
	 * @generated
	 */
	Report getNextReportStep();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextReportStep <em>Next Report Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Report Step</em>' reference.
	 * @see #getNextReportStep()
	 * @generated
	 */
	void setNextReportStep(Report value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetElement_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // GrafcetElement
