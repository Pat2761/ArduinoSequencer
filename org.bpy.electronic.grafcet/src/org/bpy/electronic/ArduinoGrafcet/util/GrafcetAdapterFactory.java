/**
 */
package org.bpy.electronic.ArduinoGrafcet.util;

import org.bpy.electronic.ArduinoGrafcet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetPackage
 * @generated
 */
public class GrafcetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrafcetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafcetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrafcetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafcetSwitch<Adapter> modelSwitch =
		new GrafcetSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseGrafcet(Grafcet object) {
				return createGrafcetAdapter();
			}
			@Override
			public Adapter caseGrafcetEntryPoint(GrafcetEntryPoint object) {
				return createGrafcetEntryPointAdapter();
			}
			@Override
			public Adapter caseTransitionAction(TransitionAction object) {
				return createTransitionActionAdapter();
			}
			@Override
			public Adapter caseGrafcetStep(GrafcetStep object) {
				return createGrafcetStepAdapter();
			}
			@Override
			public Adapter caseGrafcetEntry(GrafcetEntry object) {
				return createGrafcetEntryAdapter();
			}
			@Override
			public Adapter caseGrafcetEnded(GrafcetEnded object) {
				return createGrafcetEndedAdapter();
			}
			@Override
			public Adapter caseGrafcetElement(GrafcetElement object) {
				return createGrafcetElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter casePassThrough(PassThrough object) {
				return createPassThroughAdapter();
			}
			@Override
			public Adapter caseReport(Report object) {
				return createReportAdapter();
			}
			@Override
			public Adapter caseGrafcetConnector(GrafcetConnector object) {
				return createGrafcetConnectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.Grafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.Grafcet
	 * @generated
	 */
	public Adapter createGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint
	 * @generated
	 */
	public Adapter createGrafcetEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.TransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.TransitionAction
	 * @generated
	 */
	public Adapter createTransitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetStep
	 * @generated
	 */
	public Adapter createGrafcetStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEntry
	 * @generated
	 */
	public Adapter createGrafcetEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetEnded <em>Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetEnded
	 * @generated
	 */
	public Adapter createGrafcetEndedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetElement
	 * @generated
	 */
	public Adapter createGrafcetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.PassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.PassThrough
	 * @generated
	 */
	public Adapter createPassThroughAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bpy.electronic.ArduinoGrafcet.GrafcetConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bpy.electronic.ArduinoGrafcet.GrafcetConnector
	 * @generated
	 */
	public Adapter createGrafcetConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GrafcetAdapterFactory
