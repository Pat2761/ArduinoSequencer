/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import java.util.Collection;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEnded;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntry;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;
import org.bpy.electronic.ArduinoGrafcet.Model;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getGrafcetEntry <em>Grafcet Entry</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getGrafcetEnded <em>Grafcet Ended</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getGrafcets <em>Grafcets</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getSequencerPath <em>Sequencer Path</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getGrafcetEntry() <em>Grafcet Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrafcetEntry()
	 * @generated
	 * @ordered
	 */
	protected GrafcetEntry grafcetEntry;

	/**
	 * The cached value of the '{@link #getGrafcetEnded() <em>Grafcet Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrafcetEnded()
	 * @generated
	 * @ordered
	 */
	protected GrafcetEnded grafcetEnded;

	/**
	 * The cached value of the '{@link #getGrafcets() <em>Grafcets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrafcets()
	 * @generated
	 * @ordered
	 */
	protected EList<Grafcet> grafcets;

	/**
	 * The default value of the '{@link #getSequencerPath() <em>Sequencer Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencerPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequencerPath() <em>Sequencer Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencerPath()
	 * @generated
	 * @ordered
	 */
	protected String sequencerPath = SEQUENCER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEntry getGrafcetEntry() {
		return grafcetEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcetEntry(GrafcetEntry newGrafcetEntry, NotificationChain msgs) {
		GrafcetEntry oldGrafcetEntry = grafcetEntry;
		grafcetEntry = newGrafcetEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__GRAFCET_ENTRY, oldGrafcetEntry, newGrafcetEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrafcetEntry(GrafcetEntry newGrafcetEntry) {
		if (newGrafcetEntry != grafcetEntry) {
			NotificationChain msgs = null;
			if (grafcetEntry != null)
				msgs = ((InternalEObject)grafcetEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.MODEL__GRAFCET_ENTRY, null, msgs);
			if (newGrafcetEntry != null)
				msgs = ((InternalEObject)newGrafcetEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.MODEL__GRAFCET_ENTRY, null, msgs);
			msgs = basicSetGrafcetEntry(newGrafcetEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__GRAFCET_ENTRY, newGrafcetEntry, newGrafcetEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEnded getGrafcetEnded() {
		return grafcetEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcetEnded(GrafcetEnded newGrafcetEnded, NotificationChain msgs) {
		GrafcetEnded oldGrafcetEnded = grafcetEnded;
		grafcetEnded = newGrafcetEnded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__GRAFCET_ENDED, oldGrafcetEnded, newGrafcetEnded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrafcetEnded(GrafcetEnded newGrafcetEnded) {
		if (newGrafcetEnded != grafcetEnded) {
			NotificationChain msgs = null;
			if (grafcetEnded != null)
				msgs = ((InternalEObject)grafcetEnded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.MODEL__GRAFCET_ENDED, null, msgs);
			if (newGrafcetEnded != null)
				msgs = ((InternalEObject)newGrafcetEnded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.MODEL__GRAFCET_ENDED, null, msgs);
			msgs = basicSetGrafcetEnded(newGrafcetEnded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__GRAFCET_ENDED, newGrafcetEnded, newGrafcetEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grafcet> getGrafcets() {
		if (grafcets == null) {
			grafcets = new EObjectContainmentEList<Grafcet>(Grafcet.class, this, GrafcetPackage.MODEL__GRAFCETS);
		}
		return grafcets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequencerPath() {
		return sequencerPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequencerPath(String newSequencerPath) {
		String oldSequencerPath = sequencerPath;
		sequencerPath = newSequencerPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__SEQUENCER_PATH, oldSequencerPath, sequencerPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__PROJECT_NAME, oldProjectName, projectName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetPackage.MODEL__GRAFCET_ENTRY:
				return basicSetGrafcetEntry(null, msgs);
			case GrafcetPackage.MODEL__GRAFCET_ENDED:
				return basicSetGrafcetEnded(null, msgs);
			case GrafcetPackage.MODEL__GRAFCETS:
				return ((InternalEList<?>)getGrafcets()).basicRemove(otherEnd, msgs);
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
			case GrafcetPackage.MODEL__GRAFCET_ENTRY:
				return getGrafcetEntry();
			case GrafcetPackage.MODEL__GRAFCET_ENDED:
				return getGrafcetEnded();
			case GrafcetPackage.MODEL__GRAFCETS:
				return getGrafcets();
			case GrafcetPackage.MODEL__SEQUENCER_PATH:
				return getSequencerPath();
			case GrafcetPackage.MODEL__PROJECT_NAME:
				return getProjectName();
			case GrafcetPackage.MODEL__DESCRIPTION:
				return getDescription();
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
			case GrafcetPackage.MODEL__GRAFCET_ENTRY:
				setGrafcetEntry((GrafcetEntry)newValue);
				return;
			case GrafcetPackage.MODEL__GRAFCET_ENDED:
				setGrafcetEnded((GrafcetEnded)newValue);
				return;
			case GrafcetPackage.MODEL__GRAFCETS:
				getGrafcets().clear();
				getGrafcets().addAll((Collection<? extends Grafcet>)newValue);
				return;
			case GrafcetPackage.MODEL__SEQUENCER_PATH:
				setSequencerPath((String)newValue);
				return;
			case GrafcetPackage.MODEL__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case GrafcetPackage.MODEL__DESCRIPTION:
				setDescription((String)newValue);
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
			case GrafcetPackage.MODEL__GRAFCET_ENTRY:
				setGrafcetEntry((GrafcetEntry)null);
				return;
			case GrafcetPackage.MODEL__GRAFCET_ENDED:
				setGrafcetEnded((GrafcetEnded)null);
				return;
			case GrafcetPackage.MODEL__GRAFCETS:
				getGrafcets().clear();
				return;
			case GrafcetPackage.MODEL__SEQUENCER_PATH:
				setSequencerPath(SEQUENCER_PATH_EDEFAULT);
				return;
			case GrafcetPackage.MODEL__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case GrafcetPackage.MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case GrafcetPackage.MODEL__GRAFCET_ENTRY:
				return grafcetEntry != null;
			case GrafcetPackage.MODEL__GRAFCET_ENDED:
				return grafcetEnded != null;
			case GrafcetPackage.MODEL__GRAFCETS:
				return grafcets != null && !grafcets.isEmpty();
			case GrafcetPackage.MODEL__SEQUENCER_PATH:
				return SEQUENCER_PATH_EDEFAULT == null ? sequencerPath != null : !SEQUENCER_PATH_EDEFAULT.equals(sequencerPath);
			case GrafcetPackage.MODEL__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case GrafcetPackage.MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (sequencerPath: ");
		result.append(sequencerPath);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
