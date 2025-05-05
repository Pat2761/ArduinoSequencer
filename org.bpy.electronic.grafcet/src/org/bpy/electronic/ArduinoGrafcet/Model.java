/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEntry <em>Grafcet Entry</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEnded <em>Grafcet Ended</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcets <em>Grafcets</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getSequencerPath <em>Sequencer Path</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Model#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Grafcet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet Entry</em>' containment reference.
	 * @see #setGrafcetEntry(GrafcetEntry)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_GrafcetEntry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GrafcetEntry getGrafcetEntry();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEntry <em>Grafcet Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet Entry</em>' containment reference.
	 * @see #getGrafcetEntry()
	 * @generated
	 */
	void setGrafcetEntry(GrafcetEntry value);

	/**
	 * Returns the value of the '<em><b>Grafcet Ended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet Ended</em>' containment reference.
	 * @see #setGrafcetEnded(GrafcetEnded)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_GrafcetEnded()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GrafcetEnded getGrafcetEnded();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEnded <em>Grafcet Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet Ended</em>' containment reference.
	 * @see #getGrafcetEnded()
	 * @generated
	 */
	void setGrafcetEnded(GrafcetEnded value);

	/**
	 * Returns the value of the '<em><b>Grafcets</b></em>' containment reference list.
	 * The list contents are of type {@link org.bpy.electronic.ArduinoGrafcet.Grafcet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcets</em>' containment reference list.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_Grafcets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grafcet> getGrafcets();

	/**
	 * Returns the value of the '<em><b>Sequencer Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequencer Path</em>' attribute.
	 * @see #setSequencerPath(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_SequencerPath()
	 * @model required="true"
	 * @generated
	 */
	String getSequencerPath();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Model#getSequencerPath <em>Sequencer Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequencer Path</em>' attribute.
	 * @see #getSequencerPath()
	 * @generated
	 */
	void setSequencerPath(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Model#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Model
