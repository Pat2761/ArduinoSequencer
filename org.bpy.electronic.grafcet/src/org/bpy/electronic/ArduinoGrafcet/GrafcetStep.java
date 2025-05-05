/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getStartingGraphicalPoint <em>Starting Graphical Point</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getEntryConnector <em>Entry Connector</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getGrafcetElements <em>Grafcet Elements</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep()
 * @model
 * @generated
 */
public interface GrafcetStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Starting Graphical Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Graphical Point</em>' attribute.
	 * @see #setStartingGraphicalPoint(int)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_StartingGraphicalPoint()
	 * @model
	 * @generated
	 */
	int getStartingGraphicalPoint();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getStartingGraphicalPoint <em>Starting Graphical Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Graphical Point</em>' attribute.
	 * @see #getStartingGraphicalPoint()
	 * @generated
	 */
	void setStartingGraphicalPoint(int value);

	/**
	 * Returns the value of the '<em><b>Entry Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Connector</em>' containment reference.
	 * @see #setEntryConnector(GrafcetConnector)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_EntryConnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GrafcetConnector getEntryConnector();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getEntryConnector <em>Entry Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Connector</em>' containment reference.
	 * @see #getEntryConnector()
	 * @generated
	 */
	void setEntryConnector(GrafcetConnector value);

	/**
	 * Returns the value of the '<em><b>Grafcet Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet Elements</em>' containment reference list.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetStep_GrafcetElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GrafcetElement> getGrafcetElements();

} // GrafcetStep
