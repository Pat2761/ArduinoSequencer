/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import java.util.Collection;

import org.bpy.electronic.ArduinoGrafcet.GrafcetConnector;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl#getGrafcetElements <em>Grafcet Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetConnectorImpl extends MinimalEObjectImpl.Container implements GrafcetConnector {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrafcetElements() <em>Grafcet Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrafcetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GrafcetElement> grafcetElements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrafcetElement> getGrafcetElements() {
		if (grafcetElements == null) {
			grafcetElements = new EObjectResolvingEList<GrafcetElement>(GrafcetElement.class, this, GrafcetPackage.GRAFCET_CONNECTOR__GRAFCET_ELEMENTS);
		}
		return grafcetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_CONNECTOR__NAME:
				return getName();
			case GrafcetPackage.GRAFCET_CONNECTOR__GRAFCET_ELEMENTS:
				return getGrafcetElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case GrafcetPackage.GRAFCET_CONNECTOR__GRAFCET_ELEMENTS:
				getGrafcetElements().clear();
				getGrafcetElements().addAll((Collection<? extends GrafcetElement>)newValue);
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
			case GrafcetPackage.GRAFCET_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_CONNECTOR__GRAFCET_ELEMENTS:
				getGrafcetElements().clear();
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
			case GrafcetPackage.GRAFCET_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrafcetPackage.GRAFCET_CONNECTOR__GRAFCET_ELEMENTS:
				return grafcetElements != null && !grafcetElements.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GrafcetConnectorImpl
