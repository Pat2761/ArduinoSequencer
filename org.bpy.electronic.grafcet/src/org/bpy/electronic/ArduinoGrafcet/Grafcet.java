/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getNext <em>Next</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#isAutorun <em>Autorun</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEnd <em>End</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference.
	 * @see #setEntryPoint(GrafcetEntryPoint)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_EntryPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GrafcetEntryPoint getEntryPoint();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEntryPoint <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' containment reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(GrafcetEntryPoint value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Grafcet)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Next()
	 * @model
	 * @generated
	 */
	Grafcet getNext();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Grafcet value);

	/**
	 * Returns the value of the '<em><b>Autorun</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorun</em>' attribute.
	 * @see #setAutorun(boolean)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Autorun()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutorun();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#isAutorun <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorun</em>' attribute.
	 * @see #isAutorun()
	 * @generated
	 */
	void setAutorun(boolean value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(GrafcetEnded)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_End()
	 * @model
	 * @generated
	 */
	GrafcetEnded getEnd();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(GrafcetEnded value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GrafcetStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference list.
	 * The list contents are of type {@link org.bpy.electronic.ArduinoGrafcet.Report}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference list.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcet_Reports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Report> getReports();

} // Grafcet
