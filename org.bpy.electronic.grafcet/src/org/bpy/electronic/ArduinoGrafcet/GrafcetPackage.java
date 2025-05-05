/**
 */
package org.bpy.electronic.ArduinoGrafcet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetFactory
 * @model kind="package"
 * @generated
 */
public interface GrafcetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ArduinoGrafcet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.bpy.electronic.grafcet/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArduinoGrafcet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafcetPackage eINSTANCE = org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Grafcet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GRAFCET_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Grafcet Ended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GRAFCET_ENDED = 1;

	/**
	 * The feature id for the '<em><b>Grafcets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GRAFCETS = 2;

	/**
	 * The feature id for the '<em><b>Sequencer Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SEQUENCER_PATH = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROJECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl <em>Grafcet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcet()
	 * @generated
	 */
	int GRAFCET = 1;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Autorun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__AUTORUN = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__END = 4;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__STEPS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__REPORTS = 7;

	/**
	 * The number of structural features of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryPointImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEntryPoint()
	 * @generated
	 */
	int GRAFCET_ENTRY_POINT = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT__STEP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT__REPORT = 2;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>New Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT___NEW_OPERATION1 = 0;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_POINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetElement()
	 * @generated
	 */
	int GRAFCET_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT__NEXT_STEP = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT__NEXT_REPORT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT__UUID = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.TransitionActionImpl <em>Transition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.TransitionActionImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getTransitionAction()
	 * @generated
	 */
	int TRANSITION_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__COMMENT = GRAFCET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__NEXT_STEP = GRAFCET_ELEMENT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__LOCATION = GRAFCET_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__NEXT_REPORT_STEP = GRAFCET_ELEMENT__NEXT_REPORT_STEP;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__UUID = GRAFCET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Transition Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__TRANSITION_FCT = GRAFCET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__ACTION_FCT = GRAFCET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION_FEATURE_COUNT = GRAFCET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION_OPERATION_COUNT = GRAFCET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetStep()
	 * @generated
	 */
	int GRAFCET_STEP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Starting Graphical Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__STARTING_GRAPHICAL_POINT = 3;

	/**
	 * The feature id for the '<em><b>Entry Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__ENTRY_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Grafcet Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP__GRAFCET_ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEntry()
	 * @generated
	 */
	int GRAFCET_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Starting Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY__STARTING_GRAFCET = 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEndedImpl <em>Ended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEndedImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEnded()
	 * @generated
	 */
	int GRAFCET_ENDED = 6;

	/**
	 * The number of structural features of the '<em>Ended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENDED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_ENDED_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.ActionImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMENT = GRAFCET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT_STEP = GRAFCET_ELEMENT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LOCATION = GRAFCET_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT_REPORT_STEP = GRAFCET_ELEMENT__NEXT_REPORT_STEP;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UUID = GRAFCET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Action Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_FCT = GRAFCET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = GRAFCET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = GRAFCET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.TransitionImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = GRAFCET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT_STEP = GRAFCET_ELEMENT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LOCATION = GRAFCET_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT_REPORT_STEP = GRAFCET_ELEMENT__NEXT_REPORT_STEP;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UUID = GRAFCET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Transition Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_FCT = GRAFCET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = GRAFCET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = GRAFCET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.PassThroughImpl <em>Pass Through</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.PassThroughImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getPassThrough()
	 * @generated
	 */
	int PASS_THROUGH = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__COMMENT = GRAFCET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__NEXT_STEP = GRAFCET_ELEMENT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__LOCATION = GRAFCET_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Next Report Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__NEXT_REPORT_STEP = GRAFCET_ELEMENT__NEXT_REPORT_STEP;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__UUID = GRAFCET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Transition Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH__TRANSITION_FCT = GRAFCET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pass Through</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_FEATURE_COUNT = GRAFCET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pass Through</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_THROUGH_OPERATION_COUNT = GRAFCET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.ReportImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__NEXT_STEP = 1;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl
	 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetConnector()
	 * @generated
	 */
	int GRAFCET_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Grafcet Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_CONNECTOR__GRAFCET_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_CONNECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEntry <em>Grafcet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grafcet Entry</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEntry()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_GrafcetEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEnded <em>Grafcet Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grafcet Ended</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getGrafcetEnded()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_GrafcetEnded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bpy.electronic.ArduinoGrafcet.Model#getGrafcets <em>Grafcets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grafcets</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getGrafcets()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Grafcets();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Model#getSequencerPath <em>Sequencer Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequencer Path</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getSequencerPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SequencerPath();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Model#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getProjectName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafcet</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet
	 * @generated
	 */
	EClass getGrafcet();

	/**
	 * Returns the meta object for the containment reference '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getEntryPoint()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getName()
	 * @see #getGrafcet()
	 * @generated
	 */
	EAttribute getGrafcet_Name();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getNext()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Next();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#isAutorun <em>Autorun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autorun</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#isAutorun()
	 * @see #getGrafcet()
	 * @generated
	 */
	EAttribute getGrafcet_Autorun();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getEnd()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_End();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getSteps()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Steps();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getDescription()
	 * @see #getGrafcet()
	 * @generated
	 */
	EAttribute getGrafcet_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reports</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet#getReports()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Reports();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint
	 * @generated
	 */
	EClass getGrafcetEntryPoint();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getStep()
	 * @see #getGrafcetEntryPoint()
	 * @generated
	 */
	EReference getGrafcetEntryPoint_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getName()
	 * @see #getGrafcetEntryPoint()
	 * @generated
	 */
	EAttribute getGrafcetEntryPoint_Name();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Report</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#getReport()
	 * @see #getGrafcetEntryPoint()
	 * @generated
	 */
	EReference getGrafcetEntryPoint_Report();

	/**
	 * Returns the meta object for the '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#newOperation1() <em>New Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Operation1</em>' operation.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint#newOperation1()
	 * @generated
	 */
	EOperation getGrafcetEntryPoint__NewOperation1();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.TransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Action</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.TransitionAction
	 * @generated
	 */
	EClass getTransitionAction();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.TransitionAction#getTransitionFct <em>Transition Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Fct</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.TransitionAction#getTransitionFct()
	 * @see #getTransitionAction()
	 * @generated
	 */
	EAttribute getTransitionAction_TransitionFct();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.TransitionAction#getActionFct <em>Action Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Fct</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.TransitionAction#getActionFct()
	 * @see #getTransitionAction()
	 * @generated
	 */
	EAttribute getTransitionAction_ActionFct();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep
	 * @generated
	 */
	EClass getGrafcetStep();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getName()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EAttribute getGrafcetStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getComment()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EAttribute getGrafcetStep_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getDescription()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EAttribute getGrafcetStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getStartingGraphicalPoint <em>Starting Graphical Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Graphical Point</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getStartingGraphicalPoint()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EAttribute getGrafcetStep_StartingGraphicalPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getEntryConnector <em>Entry Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Connector</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getEntryConnector()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EReference getGrafcetStep_EntryConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getGrafcetElements <em>Grafcet Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grafcet Elements</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep#getGrafcetElements()
	 * @see #getGrafcetStep()
	 * @generated
	 */
	EReference getGrafcetStep_GrafcetElements();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntry
	 * @generated
	 */
	EClass getGrafcetEntry();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntry#getStartingGrafcet <em>Starting Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Grafcet</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntry#getStartingGrafcet()
	 * @see #getGrafcetEntry()
	 * @generated
	 */
	EReference getGrafcetEntry_StartingGrafcet();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEnded <em>Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ended</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEnded
	 * @generated
	 */
	EClass getGrafcetEnded();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement
	 * @generated
	 */
	EClass getGrafcetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getComment()
	 * @see #getGrafcetElement()
	 * @generated
	 */
	EAttribute getGrafcetElement_Comment();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Step</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextStep()
	 * @see #getGrafcetElement()
	 * @generated
	 */
	EReference getGrafcetElement_NextStep();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getLocation()
	 * @see #getGrafcetElement()
	 * @generated
	 */
	EAttribute getGrafcetElement_Location();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextReportStep <em>Next Report Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Report Step</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getNextReportStep()
	 * @see #getGrafcetElement()
	 * @generated
	 */
	EReference getGrafcetElement_NextReportStep();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement#getUuid()
	 * @see #getGrafcetElement()
	 * @generated
	 */
	EAttribute getGrafcetElement_Uuid();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Action#getActionFct <em>Action Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Fct</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Action#getActionFct()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionFct();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Transition#getTransitionFct <em>Transition Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Fct</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Transition#getTransitionFct()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TransitionFct();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.PassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pass Through</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.PassThrough
	 * @generated
	 */
	EClass getPassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.PassThrough#getTransitionFct <em>Transition Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Fct</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.PassThrough#getTransitionFct()
	 * @see #getPassThrough()
	 * @generated
	 */
	EAttribute getPassThrough_TransitionFct();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.Report#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Report#getLabel()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_Label();

	/**
	 * Returns the meta object for the reference '{@link org.bpy.electronic.ArduinoGrafcet.Report#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Step</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.Report#getNextStep()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_NextStep();

	/**
	 * Returns the meta object for class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetConnector
	 * @generated
	 */
	EClass getGrafcetConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getName()
	 * @see #getGrafcetConnector()
	 * @generated
	 */
	EAttribute getGrafcetConnector_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getGrafcetElements <em>Grafcet Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grafcet Elements</em>'.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetConnector#getGrafcetElements()
	 * @see #getGrafcetConnector()
	 * @generated
	 */
	EReference getGrafcetConnector_GrafcetElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrafcetFactory getGrafcetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.ModelImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Grafcet Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GRAFCET_ENTRY = eINSTANCE.getModel_GrafcetEntry();

		/**
		 * The meta object literal for the '<em><b>Grafcet Ended</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GRAFCET_ENDED = eINSTANCE.getModel_GrafcetEnded();

		/**
		 * The meta object literal for the '<em><b>Grafcets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GRAFCETS = eINSTANCE.getModel_Grafcets();

		/**
		 * The meta object literal for the '<em><b>Sequencer Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SEQUENCER_PATH = eINSTANCE.getModel_SequencerPath();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PROJECT_NAME = eINSTANCE.getModel_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl <em>Grafcet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcet()
		 * @generated
		 */
		EClass GRAFCET = eINSTANCE.getGrafcet();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__ENTRY_POINT = eINSTANCE.getGrafcet_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET__NAME = eINSTANCE.getGrafcet_Name();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__NEXT = eINSTANCE.getGrafcet_Next();

		/**
		 * The meta object literal for the '<em><b>Autorun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET__AUTORUN = eINSTANCE.getGrafcet_Autorun();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__END = eINSTANCE.getGrafcet_End();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__STEPS = eINSTANCE.getGrafcet_Steps();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET__DESCRIPTION = eINSTANCE.getGrafcet_Description();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__REPORTS = eINSTANCE.getGrafcet_Reports();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryPointImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEntryPoint()
		 * @generated
		 */
		EClass GRAFCET_ENTRY_POINT = eINSTANCE.getGrafcetEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_ENTRY_POINT__STEP = eINSTANCE.getGrafcetEntryPoint_Step();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_ENTRY_POINT__NAME = eINSTANCE.getGrafcetEntryPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_ENTRY_POINT__REPORT = eINSTANCE.getGrafcetEntryPoint_Report();

		/**
		 * The meta object literal for the '<em><b>New Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAFCET_ENTRY_POINT___NEW_OPERATION1 = eINSTANCE.getGrafcetEntryPoint__NewOperation1();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.TransitionActionImpl <em>Transition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.TransitionActionImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getTransitionAction()
		 * @generated
		 */
		EClass TRANSITION_ACTION = eINSTANCE.getTransitionAction();

		/**
		 * The meta object literal for the '<em><b>Transition Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_ACTION__TRANSITION_FCT = eINSTANCE.getTransitionAction_TransitionFct();

		/**
		 * The meta object literal for the '<em><b>Action Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_ACTION__ACTION_FCT = eINSTANCE.getTransitionAction_ActionFct();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetStepImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetStep()
		 * @generated
		 */
		EClass GRAFCET_STEP = eINSTANCE.getGrafcetStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_STEP__NAME = eINSTANCE.getGrafcetStep_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_STEP__COMMENT = eINSTANCE.getGrafcetStep_Comment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_STEP__DESCRIPTION = eINSTANCE.getGrafcetStep_Description();

		/**
		 * The meta object literal for the '<em><b>Starting Graphical Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_STEP__STARTING_GRAPHICAL_POINT = eINSTANCE.getGrafcetStep_StartingGraphicalPoint();

		/**
		 * The meta object literal for the '<em><b>Entry Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_STEP__ENTRY_CONNECTOR = eINSTANCE.getGrafcetStep_EntryConnector();

		/**
		 * The meta object literal for the '<em><b>Grafcet Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_STEP__GRAFCET_ELEMENTS = eINSTANCE.getGrafcetStep_GrafcetElements();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEntryImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEntry()
		 * @generated
		 */
		EClass GRAFCET_ENTRY = eINSTANCE.getGrafcetEntry();

		/**
		 * The meta object literal for the '<em><b>Starting Grafcet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_ENTRY__STARTING_GRAFCET = eINSTANCE.getGrafcetEntry_StartingGrafcet();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEndedImpl <em>Ended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetEndedImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetEnded()
		 * @generated
		 */
		EClass GRAFCET_ENDED = eINSTANCE.getGrafcetEnded();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetElementImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetElement()
		 * @generated
		 */
		EClass GRAFCET_ELEMENT = eINSTANCE.getGrafcetElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_ELEMENT__COMMENT = eINSTANCE.getGrafcetElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_ELEMENT__NEXT_STEP = eINSTANCE.getGrafcetElement_NextStep();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_ELEMENT__LOCATION = eINSTANCE.getGrafcetElement_Location();

		/**
		 * The meta object literal for the '<em><b>Next Report Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_ELEMENT__NEXT_REPORT_STEP = eINSTANCE.getGrafcetElement_NextReportStep();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_ELEMENT__UUID = eINSTANCE.getGrafcetElement_Uuid();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.ActionImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_FCT = eINSTANCE.getAction_ActionFct();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.TransitionImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Transition Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRANSITION_FCT = eINSTANCE.getTransition_TransitionFct();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.PassThroughImpl <em>Pass Through</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.PassThroughImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getPassThrough()
		 * @generated
		 */
		EClass PASS_THROUGH = eINSTANCE.getPassThrough();

		/**
		 * The meta object literal for the '<em><b>Transition Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASS_THROUGH__TRANSITION_FCT = eINSTANCE.getPassThrough_TransitionFct();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.ReportImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__LABEL = eINSTANCE.getReport_Label();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__NEXT_STEP = eINSTANCE.getReport_NextStep();

		/**
		 * The meta object literal for the '{@link org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetConnectorImpl
		 * @see org.bpy.electronic.ArduinoGrafcet.impl.GrafcetPackageImpl#getGrafcetConnector()
		 * @generated
		 */
		EClass GRAFCET_CONNECTOR = eINSTANCE.getGrafcetConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET_CONNECTOR__NAME = eINSTANCE.getGrafcetConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Grafcet Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET_CONNECTOR__GRAFCET_ELEMENTS = eINSTANCE.getGrafcetConnector_GrafcetElements();

	}

} //GrafcetPackage
