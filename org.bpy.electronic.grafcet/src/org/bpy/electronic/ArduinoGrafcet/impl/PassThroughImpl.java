/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;
import org.bpy.electronic.ArduinoGrafcet.PassThrough;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pass Through</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.PassThroughImpl#getTransitionFct <em>Transition Fct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassThroughImpl extends GrafcetElementImpl implements PassThrough {
	/**
	 * The default value of the '{@link #getTransitionFct() <em>Transition Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFct()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_FCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionFct() <em>Transition Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFct()
	 * @generated
	 * @ordered
	 */
	protected String transitionFct = TRANSITION_FCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassThroughImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.PASS_THROUGH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionFct() {
		return transitionFct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionFct(String newTransitionFct) {
		String oldTransitionFct = transitionFct;
		transitionFct = newTransitionFct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.PASS_THROUGH__TRANSITION_FCT, oldTransitionFct, transitionFct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.PASS_THROUGH__TRANSITION_FCT:
				return getTransitionFct();
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
			case GrafcetPackage.PASS_THROUGH__TRANSITION_FCT:
				setTransitionFct((String)newValue);
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
			case GrafcetPackage.PASS_THROUGH__TRANSITION_FCT:
				setTransitionFct(TRANSITION_FCT_EDEFAULT);
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
			case GrafcetPackage.PASS_THROUGH__TRANSITION_FCT:
				return TRANSITION_FCT_EDEFAULT == null ? transitionFct != null : !TRANSITION_FCT_EDEFAULT.equals(transitionFct);
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
		result.append(" (transitionFct: ");
		result.append(transitionFct);
		result.append(')');
		return result.toString();
	}

} //PassThroughImpl
