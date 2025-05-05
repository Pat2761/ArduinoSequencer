/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;

import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl#getNextReportStep <em>Next Report Step</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GrafcetElementImpl extends MinimalEObjectImpl.Container implements GrafcetElement {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected GrafcetStep nextStep;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected int location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextReportStep() <em>Next Report Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextReportStep()
	 * @generated
	 * @ordered
	 */
	protected Report nextReportStep;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ELEMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetStep getNextStep() {
		if (nextStep != null && nextStep.eIsProxy()) {
			InternalEObject oldNextStep = (InternalEObject)nextStep;
			nextStep = (GrafcetStep)eResolveProxy(oldNextStep);
			if (nextStep != oldNextStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP, oldNextStep, nextStep));
			}
		}
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetStep basicGetNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStep(GrafcetStep newNextStep) {
		GrafcetStep oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP, oldNextStep, nextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(int newLocation) {
		int oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ELEMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report getNextReportStep() {
		if (nextReportStep != null && nextReportStep.eIsProxy()) {
			InternalEObject oldNextReportStep = (InternalEObject)nextReportStep;
			nextReportStep = (Report)eResolveProxy(oldNextReportStep);
			if (nextReportStep != oldNextReportStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP, oldNextReportStep, nextReportStep));
			}
		}
		return nextReportStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report basicGetNextReportStep() {
		return nextReportStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextReportStep(Report newNextReportStep) {
		Report oldNextReportStep = nextReportStep;
		nextReportStep = newNextReportStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP, oldNextReportStep, nextReportStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_ELEMENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_ELEMENT__COMMENT:
				return getComment();
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP:
				if (resolve) return getNextStep();
				return basicGetNextStep();
			case GrafcetPackage.GRAFCET_ELEMENT__LOCATION:
				return getLocation();
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP:
				if (resolve) return getNextReportStep();
				return basicGetNextReportStep();
			case GrafcetPackage.GRAFCET_ELEMENT__UUID:
				return getUuid();
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
			case GrafcetPackage.GRAFCET_ELEMENT__COMMENT:
				setComment((String)newValue);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP:
				setNextStep((GrafcetStep)newValue);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__LOCATION:
				setLocation((Integer)newValue);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP:
				setNextReportStep((Report)newValue);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__UUID:
				setUuid((String)newValue);
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
			case GrafcetPackage.GRAFCET_ELEMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP:
				setNextStep((GrafcetStep)null);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP:
				setNextReportStep((Report)null);
				return;
			case GrafcetPackage.GRAFCET_ELEMENT__UUID:
				setUuid(UUID_EDEFAULT);
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
			case GrafcetPackage.GRAFCET_ELEMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_STEP:
				return nextStep != null;
			case GrafcetPackage.GRAFCET_ELEMENT__LOCATION:
				return location != LOCATION_EDEFAULT;
			case GrafcetPackage.GRAFCET_ELEMENT__NEXT_REPORT_STEP:
				return nextReportStep != null;
			case GrafcetPackage.GRAFCET_ELEMENT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", location: ");
		result.append(location);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //GrafcetElementImpl
