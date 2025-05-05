/**
 */
package org.bpy.electronic.ArduinoGrafcet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetTest extends TestCase {

	/**
	 * The fixture for this Grafcet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grafcet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GrafcetTest.class);
	}

	/**
	 * Constructs a new Grafcet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grafcet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Grafcet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grafcet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grafcet getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafcetFactory.eINSTANCE.createGrafcet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GrafcetTest
