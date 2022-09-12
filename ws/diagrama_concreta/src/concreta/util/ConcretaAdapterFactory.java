/**
 */
package concreta.util;

import concreta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see concreta.ConcretaPackage
 * @generated
 */
public class ConcretaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConcretaPackage.eINSTANCE;
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
	protected ConcretaSwitch<Adapter> modelSwitch =
		new ConcretaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseMKJDiagramaClases(MKJDiagramaClases object) {
				return createMKJDiagramaClasesAdapter();
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
			public Adapter caseMKJAsociacion(MKJAsociacion object) {
				return createMKJAsociacionAdapter();
			}
			@Override
			public Adapter caseMKJConteinment(MKJConteinment object) {
				return createMKJConteinmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJDiagramaClases <em>MKJ Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJDiagramaClases
	 * @generated
	 */
	public Adapter createMKJDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJPaquete <em>MKJ Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJPaquete
	 * @generated
	 */
	public Adapter createMKJPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJClase <em>MKJ Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJClase
	 * @generated
	 */
	public Adapter createMKJClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJAtributo <em>MKJ Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJAtributo
	 * @generated
	 */
	public Adapter createMKJAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJMetodo <em>MKJ Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJMetodo
	 * @generated
	 */
	public Adapter createMKJMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJAsociacion <em>MKJ Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJAsociacion
	 * @generated
	 */
	public Adapter createMKJAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJConteinment <em>MKJ Conteinment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJConteinment
	 * @generated
	 */
	public Adapter createMKJConteinmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJAgregacion <em>MKJ Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJAgregacion
	 * @generated
	 */
	public Adapter createMKJAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJHerencia <em>MKJ Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJHerencia
	 * @generated
	 */
	public Adapter createMKJHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concreta.MKJInterface <em>MKJ Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concreta.MKJInterface
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

} //ConcretaAdapterFactory
