/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import java.util.Collection;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEnded;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;

import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#isAutorun <em>Autorun</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetImpl extends MinimalEObjectImpl.Container implements Grafcet {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected GrafcetEntryPoint entryPoint;

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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Grafcet next;

	/**
	 * The default value of the '{@link #isAutorun() <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTORUN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutorun() <em>Autorun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorun()
	 * @generated
	 * @ordered
	 */
	protected boolean autorun = AUTORUN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected GrafcetEnded end;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<GrafcetStep> steps;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<Report> reports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEntryPoint getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPoint(GrafcetEntryPoint newEntryPoint, NotificationChain msgs) {
		GrafcetEntryPoint oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__ENTRY_POINT, oldEntryPoint, newEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(GrafcetEntryPoint newEntryPoint) {
		if (newEntryPoint != entryPoint) {
			NotificationChain msgs = null;
			if (entryPoint != null)
				msgs = ((InternalEObject)entryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET__ENTRY_POINT, null, msgs);
			if (newEntryPoint != null)
				msgs = ((InternalEObject)newEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET__ENTRY_POINT, null, msgs);
			msgs = basicSetEntryPoint(newEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__ENTRY_POINT, newEntryPoint, newEntryPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Grafcet)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Grafcet newNext) {
		Grafcet oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutorun() {
		return autorun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorun(boolean newAutorun) {
		boolean oldAutorun = autorun;
		autorun = newAutorun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__AUTORUN, oldAutorun, autorun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEnded getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (GrafcetEnded)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.GRAFCET__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEnded basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(GrafcetEnded newEnd) {
		GrafcetEnded oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrafcetStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<GrafcetStep>(GrafcetStep.class, this, GrafcetPackage.GRAFCET__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Report> getReports() {
		if (reports == null) {
			reports = new EObjectContainmentEList<Report>(Report.class, this, GrafcetPackage.GRAFCET__REPORTS);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET__ENTRY_POINT:
				return basicSetEntryPoint(null, msgs);
			case GrafcetPackage.GRAFCET__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case GrafcetPackage.GRAFCET__REPORTS:
				return ((InternalEList<?>)getReports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET__ENTRY_POINT:
				return getEntryPoint();
			case GrafcetPackage.GRAFCET__NAME:
				return getName();
			case GrafcetPackage.GRAFCET__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case GrafcetPackage.GRAFCET__AUTORUN:
				return isAutorun();
			case GrafcetPackage.GRAFCET__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case GrafcetPackage.GRAFCET__STEPS:
				return getSteps();
			case GrafcetPackage.GRAFCET__DESCRIPTION:
				return getDescription();
			case GrafcetPackage.GRAFCET__REPORTS:
				return getReports();
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
			case GrafcetPackage.GRAFCET__ENTRY_POINT:
				setEntryPoint((GrafcetEntryPoint)newValue);
				return;
			case GrafcetPackage.GRAFCET__NAME:
				setName((String)newValue);
				return;
			case GrafcetPackage.GRAFCET__NEXT:
				setNext((Grafcet)newValue);
				return;
			case GrafcetPackage.GRAFCET__AUTORUN:
				setAutorun((Boolean)newValue);
				return;
			case GrafcetPackage.GRAFCET__END:
				setEnd((GrafcetEnded)newValue);
				return;
			case GrafcetPackage.GRAFCET__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends GrafcetStep>)newValue);
				return;
			case GrafcetPackage.GRAFCET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GrafcetPackage.GRAFCET__REPORTS:
				getReports().clear();
				getReports().addAll((Collection<? extends Report>)newValue);
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
			case GrafcetPackage.GRAFCET__ENTRY_POINT:
				setEntryPoint((GrafcetEntryPoint)null);
				return;
			case GrafcetPackage.GRAFCET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET__NEXT:
				setNext((Grafcet)null);
				return;
			case GrafcetPackage.GRAFCET__AUTORUN:
				setAutorun(AUTORUN_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET__END:
				setEnd((GrafcetEnded)null);
				return;
			case GrafcetPackage.GRAFCET__STEPS:
				getSteps().clear();
				return;
			case GrafcetPackage.GRAFCET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET__REPORTS:
				getReports().clear();
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
			case GrafcetPackage.GRAFCET__ENTRY_POINT:
				return entryPoint != null;
			case GrafcetPackage.GRAFCET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrafcetPackage.GRAFCET__NEXT:
				return next != null;
			case GrafcetPackage.GRAFCET__AUTORUN:
				return autorun != AUTORUN_EDEFAULT;
			case GrafcetPackage.GRAFCET__END:
				return end != null;
			case GrafcetPackage.GRAFCET__STEPS:
				return steps != null && !steps.isEmpty();
			case GrafcetPackage.GRAFCET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GrafcetPackage.GRAFCET__REPORTS:
				return reports != null && !reports.isEmpty();
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
		result.append(", autorun: ");
		result.append(autorun);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GrafcetImpl
