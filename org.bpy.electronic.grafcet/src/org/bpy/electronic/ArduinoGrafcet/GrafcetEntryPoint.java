/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getStep <em>Step</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntryPoint()
 * @model
 * @generated
 */
public interface GrafcetEntryPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(GrafcetStep)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntryPoint_Step()
	 * @model required="true"
	 * @generated
	 */
	GrafcetStep getStep();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(GrafcetStep value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntryPoint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' reference.
	 * @see #setReport(Report)
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#getGrafcetEntryPoint_Report()
	 * @model
	 * @generated
	 */
	Report getReport();

	/**
	 * Sets the value of the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getReport <em>Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(Report value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void newOperation1();

} // GrafcetEntryPoint
