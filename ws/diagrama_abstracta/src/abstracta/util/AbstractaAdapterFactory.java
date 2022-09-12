/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
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
	protected AbstractaSwitch<Adapter> modelSwitch =
		new AbstractaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseMKJPaquete(MKJPaquete object) {
				return createMKJPaqueteAdapter();
			}
			@Override
			public Adapter caseMKJClase(MKJClase object) {
				return createMKJClaseAdapter();
			}
			@Override
			public Adapter caseMKJAtributo(MKJAtributo object) {
				return createMKJAtributoAdapter();
			}
			@Override
			public Adapter caseMKJMetodo(MKJMetodo object) {
				return createMKJMetodoAdapter();
			}
			@Override
			public Adapter caseMKJRelacion(MKJRelacion object) {
				return createMKJRelacionAdapter();
			}
			@Override
			public Adapter caseMHJAsociacion(MHJAsociacion object) {
				return createMHJAsociacionAdapter();
			}
			@Override
			public Adapter caseMKJContainment(MKJContainment object) {
				return createMKJContainmentAdapter();
			}
			@Override
			public Adapter caseMKJAgregacion(MKJAgregacion object) {
				return createMKJAgregacionAdapter();
			}
			@Override
			public Adapter caseMKJHerencia(MKJHerencia object) {
				return createMKJHerenciaAdapter();
			}
			@Override
			public Adapter caseMKJInterface(MKJInterface object) {
				return createMKJInterfaceAdapter();
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
	 * Creates a new adapter for an object of class '{@link abstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJPaquete <em>MKJ Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJPaquete
	 * @generated
	 */
	public Adapter createMKJPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJClase <em>MKJ Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJClase
	 * @generated
	 */
	public Adapter createMKJClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJAtributo <em>MKJ Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJAtributo
	 * @generated
	 */
	public Adapter createMKJAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJMetodo <em>MKJ Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJMetodo
	 * @generated
	 */
	public Adapter createMKJMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJRelacion <em>MKJ Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJRelacion
	 * @generated
	 */
	public Adapter createMKJRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MHJAsociacion <em>MHJ Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MHJAsociacion
	 * @generated
	 */
	public Adapter createMHJAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJContainment <em>MKJ Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJContainment
	 * @generated
	 */
	public Adapter createMKJContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJAgregacion <em>MKJ Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJAgregacion
	 * @generated
	 */
	public Adapter createMKJAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJHerencia <em>MKJ Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJHerencia
	 * @generated
	 */
	public Adapter createMKJHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.MKJInterface <em>MKJ Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.MKJInterface
	 * @generated
	 */
	public Adapter createMKJInterfaceAdapter() {
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

} //AbstractaAdapterFactory
