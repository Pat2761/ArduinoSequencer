/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ActionImpl#getActionFct <em>Action Fct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends GrafcetElementImpl implements Action {
	/**
	 * The default value of the '{@link #getActionFct() <em>Action Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFct()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_FCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionFct() <em>Action Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFct()
	 * @generated
	 * @ordered
	 */
	protected String actionFct = ACTION_FCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFct() {
		return actionFct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFct(String newActionFct) {
		String oldActionFct = actionFct;
		actionFct = newActionFct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.ACTION__ACTION_FCT, oldActionFct, actionFct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.ACTION__ACTION_FCT:
				return getActionFct();
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
			case GrafcetPackage.ACTION__ACTION_FCT:
				setActionFct((String)newValue);
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
			case GrafcetPackage.ACTION__ACTION_FCT:
				setActionFct(ACTION_FCT_EDEFAULT);
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
			case GrafcetPackage.ACTION__ACTION_FCT:
				return ACTION_FCT_EDEFAULT == null ? actionFct != null : !ACTION_FCT_EDEFAULT.equals(actionFct);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (actionFct: ");
		result.append(actionFct);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
