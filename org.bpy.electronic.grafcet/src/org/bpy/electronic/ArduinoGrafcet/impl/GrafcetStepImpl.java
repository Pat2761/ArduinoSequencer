/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import java.util.Collection;
import org.bpy.electronic.ArduinoGrafcet.GrafcetConnector;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getStartingGraphicalPoint <em>Starting Graphical Point</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getEntryConnector <em>Entry Connector</em>}</li>
 *   <li>{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl#getGrafcetElements <em>Grafcet Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrafcetStepImpl extends MinimalEObjectImpl.Container implements GrafcetStep {
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
	 * The default value of the '{@link #getStartingGraphicalPoint() <em>Starting Graphical Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingGraphicalPoint()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTING_GRAPHICAL_POINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartingGraphicalPoint() <em>Starting Graphical Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingGraphicalPoint()
	 * @generated
	 * @ordered
	 */
	protected int startingGraphicalPoint = STARTING_GRAPHICAL_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryConnector() <em>Entry Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryConnector()
	 * @generated
	 * @ordered
	 */
	protected GrafcetConnector entryConnector;

	/**
	 * The cached value of the '{@link #getGrafcetElements() <em>Grafcet Elements</em>}' containment reference list.
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
	protected GrafcetStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.GRAFCET_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartingGraphicalPoint() {
		return startingGraphicalPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingGraphicalPoint(int newStartingGraphicalPoint) {
		int oldStartingGraphicalPoint = startingGraphicalPoint;
		startingGraphicalPoint = newStartingGraphicalPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__STARTING_GRAPHICAL_POINT, oldStartingGraphicalPoint, startingGraphicalPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetConnector getEntryConnector() {
		return entryConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryConnector(GrafcetConnector newEntryConnector, NotificationChain msgs) {
		GrafcetConnector oldEntryConnector = entryConnector;
		entryConnector = newEntryConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR, oldEntryConnector, newEntryConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryConnector(GrafcetConnector newEntryConnector) {
		if (newEntryConnector != entryConnector) {
			NotificationChain msgs = null;
			if (entryConnector != null)
				msgs = ((InternalEObject)entryConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR, null, msgs);
			if (newEntryConnector != null)
				msgs = ((InternalEObject)newEntryConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR, null, msgs);
			msgs = basicSetEntryConnector(newEntryConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR, newEntryConnector, newEntryConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrafcetElement> getGrafcetElements() {
		if (grafcetElements == null) {
			grafcetElements = new EObjectContainmentEList<GrafcetElement>(GrafcetElement.class, this, GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS);
		}
		return grafcetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR:
				return basicSetEntryConnector(null, msgs);
			case GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS:
				return ((InternalEList<?>)getGrafcetElements()).basicRemove(otherEnd, msgs);
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
			case GrafcetPackage.GRAFCET_STEP__NAME:
				return getName();
			case GrafcetPackage.GRAFCET_STEP__COMMENT:
				return getComment();
			case GrafcetPackage.GRAFCET_STEP__DESCRIPTION:
				return getDescription();
			case GrafcetPackage.GRAFCET_STEP__STARTING_GRAPHICAL_POINT:
				return getStartingGraphicalPoint();
			case GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR:
				return getEntryConnector();
			case GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS:
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
			case GrafcetPackage.GRAFCET_STEP__NAME:
				setName((String)newValue);
				return;
			case GrafcetPackage.GRAFCET_STEP__COMMENT:
				setComment((String)newValue);
				return;
			case GrafcetPackage.GRAFCET_STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GrafcetPackage.GRAFCET_STEP__STARTING_GRAPHICAL_POINT:
				setStartingGraphicalPoint((Integer)newValue);
				return;
			case GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR:
				setEntryConnector((GrafcetConnector)newValue);
				return;
			case GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS:
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
			case GrafcetPackage.GRAFCET_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_STEP__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_STEP__STARTING_GRAPHICAL_POINT:
				setStartingGraphicalPoint(STARTING_GRAPHICAL_POINT_EDEFAULT);
				return;
			case GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR:
				setEntryConnector((GrafcetConnector)null);
				return;
			case GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS:
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
			case GrafcetPackage.GRAFCET_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrafcetPackage.GRAFCET_STEP__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case GrafcetPackage.GRAFCET_STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GrafcetPackage.GRAFCET_STEP__STARTING_GRAPHICAL_POINT:
				return startingGraphicalPoint != STARTING_GRAPHICAL_POINT_EDEFAULT;
			case GrafcetPackage.GRAFCET_STEP__ENTRY_CONNECTOR:
				return entryConnector != null;
			case GrafcetPackage.GRAFCET_STEP__GRAFCET_ELEMENTS:
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
		result.append(", comment: ");
		result.append(comment);
		result.append(", description: ");
		result.append(description);
		result.append(", startingGraphicalPoint: ");
		result.append(startingGraphicalPoint);
		result.append(')');
		return result.toString();
	}

} //GrafcetStepImpl
