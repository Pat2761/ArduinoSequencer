/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetFactoryImpl extends EFactoryImpl implements GrafcetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrafcetFactory init() {
		try {
			GrafcetFactory theGrafcetFactory = (GrafcetFactory)EPackage.Registry.INSTANCE.getEFactory(GrafcetPackage.eNS_URI);
			if (theGrafcetFactory != null) {
				return theGrafcetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrafcetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrafcetPackage.MODEL: return createModel();
			case GrafcetPackage.GRAFCET: return createGrafcet();
			case GrafcetPackage.GRAFCET_ENTRY_POINT: return createGrafcetEntryPoint();
			case GrafcetPackage.TRANSITION_ACTION: return createTransitionAction();
			case GrafcetPackage.GRAFCET_STEP: return createGrafcetStep();
			case GrafcetPackage.GRAFCET_ENTRY: return createGrafcetEntry();
			case GrafcetPackage.GRAFCET_ENDED: return createGrafcetEnded();
			case GrafcetPackage.ACTION: return createAction();
			case GrafcetPackage.TRANSITION: return createTransition();
			case GrafcetPackage.PASS_THROUGH: return createPassThrough();
			case GrafcetPackage.REPORT: return createReport();
			case GrafcetPackage.GRAFCET_CONNECTOR: return createGrafcetConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet createGrafcet() {
		GrafcetImpl grafcet = new GrafcetImpl();
		return grafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEntryPoint createGrafcetEntryPoint() {
		GrafcetEntryPointImpl grafcetEntryPoint = new GrafcetEntryPointImpl();
		return grafcetEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionAction createTransitionAction() {
		TransitionActionImpl transitionAction = new TransitionActionImpl();
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetStep createGrafcetStep() {
		GrafcetStepImpl grafcetStep = new GrafcetStepImpl();
		return grafcetStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEntry createGrafcetEntry() {
		GrafcetEntryImpl grafcetEntry = new GrafcetEntryImpl();
		return grafcetEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetEnded createGrafcetEnded() {
		GrafcetEndedImpl grafcetEnded = new GrafcetEndedImpl();
		return grafcetEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThrough createPassThrough() {
		PassThroughImpl passThrough = new PassThroughImpl();
		return passThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetConnector createGrafcetConnector() {
		GrafcetConnectorImpl grafcetConnector = new GrafcetConnectorImpl();
		return grafcetConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetPackage getGrafcetPackage() {
		return (GrafcetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrafcetPackage getPackage() {
		return GrafcetPackage.eINSTANCE;
	}

} //GrafcetFactoryImpl
