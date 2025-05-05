/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntry;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryImpl#getStartingGrafcet <em>Starting Grafcet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetEntryImpl extends MinimalEObjectImpl.Container implements GrafcetEntry {
	/**
	 * The cached value of the '{@link #getStartingGrafcet() <em>Starting Grafcet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingGrafcet()
	 * @generated
	 * @ordered
	 */
	protected Grafcet startingGrafcet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet getStartingGrafcet() {
		if (startingGrafcet != null && startingGrafcet.eIsProxy()) {
			InternalEObject oldStartingGrafcet = (InternalEObject)startingGrafcet;
			startingGrafcet = (Grafcet)eResolveProxy(oldStartingGrafcet);
			if (startingGrafcet != oldStartingGrafcet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET, oldStartingGrafcet, startingGrafcet));
			}
		}
		return startingGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet basicGetStartingGrafcet() {
		return startingGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingGrafcet(Grafcet newStartingGrafcet) {
		Grafcet oldStartingGrafcet = startingGrafcet;
		startingGrafcet = newStartingGrafcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET, oldStartingGrafcet, startingGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET:
				if (resolve) return getStartingGrafcet();
				return basicGetStartingGrafcet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET:
				setStartingGrafcet((Grafcet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET:
				setStartingGrafcet((Grafcet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_ENTRY__STARTING_GRAFCET:
				return startingGrafcet != null;
		}
		return super.eIsSet(featureID);
	}

} //GrafcetEntryImpl
