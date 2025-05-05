/**
 */
package org.bpy.electronic.ArduinoGrafcet.impl;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetConnector;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEnded;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntry;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint;
import org.bpy.electronic.ArduinoGrafcet.GrafcetFactory;
import org.bpy.electronic.ArduinoGrafcet.GrafcetPackage;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.ArduinoGrafcet.PassThrough;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.bpy.electronic.ArduinoGrafcet.Transition;
import org.bpy.electronic.ArduinoGrafcet.TransitionAction;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafcetPackageImpl extends EPackageImpl implements GrafcetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetEndedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passThroughEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafcetConnectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrafcetPackageImpl() {
		super(eNS_URI, GrafcetFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GrafcetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrafcetPackage init() {
		if (isInited) return (GrafcetPackage)EPackage.Registry.INSTANCE.getEPackage(GrafcetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrafcetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrafcetPackageImpl theGrafcetPackage = registeredGrafcetPackage instanceof GrafcetPackageImpl ? (GrafcetPackageImpl)registeredGrafcetPackage : new GrafcetPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGrafcetPackage.createPackageContents();

		// Initialize created meta-data
		theGrafcetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrafcetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrafcetPackage.eNS_URI, theGrafcetPackage);
		return theGrafcetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_GrafcetEntry() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_GrafcetEnded() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Grafcets() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_SequencerPath() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ProjectName() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Description() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcet() {
		return grafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_EntryPoint() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcet_Name() {
		return (EAttribute)grafcetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Next() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcet_Autorun() {
		return (EAttribute)grafcetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_End() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Steps() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcet_Description() {
		return (EAttribute)grafcetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcet_Reports() {
		return (EReference)grafcetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetEntryPoint() {
		return grafcetEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetEntryPoint_Step() {
		return (EReference)grafcetEntryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetEntryPoint_Name() {
		return (EAttribute)grafcetEntryPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetEntryPoint_Report() {
		return (EReference)grafcetEntryPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrafcetEntryPoint__NewOperation1() {
		return grafcetEntryPointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionAction() {
		return transitionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionAction_TransitionFct() {
		return (EAttribute)transitionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionAction_ActionFct() {
		return (EAttribute)transitionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetStep() {
		return grafcetStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetStep_Name() {
		return (EAttribute)grafcetStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetStep_Comment() {
		return (EAttribute)grafcetStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetStep_Description() {
		return (EAttribute)grafcetStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetStep_StartingGraphicalPoint() {
		return (EAttribute)grafcetStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetStep_EntryConnector() {
		return (EReference)grafcetStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetStep_GrafcetElements() {
		return (EReference)grafcetStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetEntry() {
		return grafcetEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetEntry_StartingGrafcet() {
		return (EReference)grafcetEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetEnded() {
		return grafcetEndedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetElement() {
		return grafcetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetElement_Comment() {
		return (EAttribute)grafcetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetElement_NextStep() {
		return (EReference)grafcetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetElement_Location() {
		return (EAttribute)grafcetElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetElement_NextReportStep() {
		return (EReference)grafcetElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetElement_Uuid() {
		return (EAttribute)grafcetElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ActionFct() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_TransitionFct() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassThrough() {
		return passThroughEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThrough_TransitionFct() {
		return (EAttribute)passThroughEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_Label() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_NextStep() {
		return (EReference)reportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafcetConnector() {
		return grafcetConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafcetConnector_Name() {
		return (EAttribute)grafcetConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafcetConnector_GrafcetElements() {
		return (EReference)grafcetConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetFactory getGrafcetFactory() {
		return (GrafcetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__GRAFCET_ENTRY);
		createEReference(modelEClass, MODEL__GRAFCET_ENDED);
		createEReference(modelEClass, MODEL__GRAFCETS);
		createEAttribute(modelEClass, MODEL__SEQUENCER_PATH);
		createEAttribute(modelEClass, MODEL__PROJECT_NAME);
		createEAttribute(modelEClass, MODEL__DESCRIPTION);

		grafcetEClass = createEClass(GRAFCET);
		createEReference(grafcetEClass, GRAFCET__ENTRY_POINT);
		createEAttribute(grafcetEClass, GRAFCET__NAME);
		createEReference(grafcetEClass, GRAFCET__NEXT);
		createEAttribute(grafcetEClass, GRAFCET__AUTORUN);
		createEReference(grafcetEClass, GRAFCET__END);
		createEReference(grafcetEClass, GRAFCET__STEPS);
		createEAttribute(grafcetEClass, GRAFCET__DESCRIPTION);
		createEReference(grafcetEClass, GRAFCET__REPORTS);

		grafcetEntryPointEClass = createEClass(GRAFCET_ENTRY_POINT);
		createEReference(grafcetEntryPointEClass, GRAFCET_ENTRY_POINT__STEP);
		createEAttribute(grafcetEntryPointEClass, GRAFCET_ENTRY_POINT__NAME);
		createEReference(grafcetEntryPointEClass, GRAFCET_ENTRY_POINT__REPORT);
		createEOperation(grafcetEntryPointEClass, GRAFCET_ENTRY_POINT___NEW_OPERATION1);

		transitionActionEClass = createEClass(TRANSITION_ACTION);
		createEAttribute(transitionActionEClass, TRANSITION_ACTION__TRANSITION_FCT);
		createEAttribute(transitionActionEClass, TRANSITION_ACTION__ACTION_FCT);

		grafcetStepEClass = createEClass(GRAFCET_STEP);
		createEAttribute(grafcetStepEClass, GRAFCET_STEP__NAME);
		createEAttribute(grafcetStepEClass, GRAFCET_STEP__COMMENT);
		createEAttribute(grafcetStepEClass, GRAFCET_STEP__DESCRIPTION);
		createEAttribute(grafcetStepEClass, GRAFCET_STEP__STARTING_GRAPHICAL_POINT);
		createEReference(grafcetStepEClass, GRAFCET_STEP__ENTRY_CONNECTOR);
		createEReference(grafcetStepEClass, GRAFCET_STEP__GRAFCET_ELEMENTS);

		grafcetEntryEClass = createEClass(GRAFCET_ENTRY);
		createEReference(grafcetEntryEClass, GRAFCET_ENTRY__STARTING_GRAFCET);

		grafcetEndedEClass = createEClass(GRAFCET_ENDED);

		grafcetElementEClass = createEClass(GRAFCET_ELEMENT);
		createEAttribute(grafcetElementEClass, GRAFCET_ELEMENT__COMMENT);
		createEReference(grafcetElementEClass, GRAFCET_ELEMENT__NEXT_STEP);
		createEAttribute(grafcetElementEClass, GRAFCET_ELEMENT__LOCATION);
		createEReference(grafcetElementEClass, GRAFCET_ELEMENT__NEXT_REPORT_STEP);
		createEAttribute(grafcetElementEClass, GRAFCET_ELEMENT__UUID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_FCT);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__TRANSITION_FCT);

		passThroughEClass = createEClass(PASS_THROUGH);
		createEAttribute(passThroughEClass, PASS_THROUGH__TRANSITION_FCT);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__LABEL);
		createEReference(reportEClass, REPORT__NEXT_STEP);

		grafcetConnectorEClass = createEClass(GRAFCET_CONNECTOR);
		createEAttribute(grafcetConnectorEClass, GRAFCET_CONNECTOR__NAME);
		createEReference(grafcetConnectorEClass, GRAFCET_CONNECTOR__GRAFCET_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionActionEClass.getESuperTypes().add(this.getGrafcetElement());
		actionEClass.getESuperTypes().add(this.getGrafcetElement());
		transitionEClass.getESuperTypes().add(this.getGrafcetElement());
		passThroughEClass.getESuperTypes().add(this.getGrafcetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_GrafcetEntry(), this.getGrafcetEntry(), null, "grafcetEntry", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_GrafcetEnded(), this.getGrafcetEnded(), null, "grafcetEnded", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Grafcets(), this.getGrafcet(), null, "grafcets", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_SequencerPath(), ecorePackage.getEString(), "sequencerPath", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetEClass, Grafcet.class, "Grafcet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrafcet_EntryPoint(), this.getGrafcetEntryPoint(), null, "entryPoint", null, 1, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcet_Name(), ecorePackage.getEString(), "name", null, 1, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Next(), this.getGrafcet(), null, "next", null, 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcet_Autorun(), ecorePackage.getEBoolean(), "autorun", "true", 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_End(), this.getGrafcetEnded(), null, "end", null, 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Steps(), this.getGrafcetStep(), null, "steps", null, 1, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcet_Description(), ecorePackage.getEString(), "description", null, 0, 1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcet_Reports(), this.getReport(), null, "reports", null, 0, -1, Grafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetEntryPointEClass, GrafcetEntryPoint.class, "GrafcetEntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrafcetEntryPoint_Step(), this.getGrafcetStep(), null, "step", null, 1, 1, GrafcetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetEntryPoint_Name(), ecorePackage.getEString(), "name", null, 1, 1, GrafcetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetEntryPoint_Report(), this.getReport(), null, "report", null, 0, 1, GrafcetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGrafcetEntryPoint__NewOperation1(), null, "newOperation1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionActionEClass, TransitionAction.class, "TransitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionAction_TransitionFct(), ecorePackage.getEString(), "transitionFct", null, 0, 1, TransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionAction_ActionFct(), ecorePackage.getEString(), "actionFct", null, 0, 1, TransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetStepEClass, GrafcetStep.class, "GrafcetStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrafcetStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetStep_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetStep_StartingGraphicalPoint(), ecorePackage.getEInt(), "startingGraphicalPoint", null, 0, 1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetStep_EntryConnector(), this.getGrafcetConnector(), null, "entryConnector", null, 1, 1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetStep_GrafcetElements(), this.getGrafcetElement(), null, "grafcetElements", null, 1, -1, GrafcetStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetEntryEClass, GrafcetEntry.class, "GrafcetEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrafcetEntry_StartingGrafcet(), this.getGrafcet(), null, "startingGrafcet", null, 1, 1, GrafcetEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetEndedEClass, GrafcetEnded.class, "GrafcetEnded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grafcetElementEClass, GrafcetElement.class, "GrafcetElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrafcetElement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, GrafcetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetElement_NextStep(), this.getGrafcetStep(), null, "nextStep", null, 0, 1, GrafcetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetElement_Location(), ecorePackage.getEInt(), "location", null, 1, 1, GrafcetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetElement_NextReportStep(), this.getReport(), null, "nextReportStep", null, 0, 1, GrafcetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafcetElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, GrafcetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionFct(), ecorePackage.getEString(), "actionFct", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_TransitionFct(), ecorePackage.getEString(), "transitionFct", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passThroughEClass, PassThrough.class, "PassThrough", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassThrough_TransitionFct(), ecorePackage.getEString(), "transitionFct", null, 0, 1, PassThrough.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReport_Label(), ecorePackage.getEString(), "label", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReport_NextStep(), this.getGrafcetStep(), null, "nextStep", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grafcetConnectorEClass, GrafcetConnector.class, "GrafcetConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrafcetConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, GrafcetConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafcetConnector_GrafcetElements(), this.getGrafcetElement(), null, "grafcetElements", null, 1, -1, GrafcetConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GrafcetPackageImpl
