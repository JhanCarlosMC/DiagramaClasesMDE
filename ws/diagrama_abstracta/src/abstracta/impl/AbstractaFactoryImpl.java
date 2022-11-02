/**
 */
package abstracta.impl;

import abstracta.*;

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
public class AbstractaFactoryImpl extends EFactoryImpl implements AbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractaFactory init() {
		try {
			AbstractaFactory theAbstractaFactory = (AbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractaPackage.eNS_URI);
			if (theAbstractaFactory != null) {
				return theAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactoryImpl() {
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
			case AbstractaPackage.MODEL_FACTORY: return createModelFactory();
			case AbstractaPackage.MKJ_PAQUETE: return createMKJPaquete();
			case AbstractaPackage.MKJ_CLASE: return createMKJClase();
			case AbstractaPackage.MKJ_ATRIBUTO: return createMKJAtributo();
			case AbstractaPackage.MKJ_METODO: return createMKJMetodo();
			case AbstractaPackage.MKJ_RELACION: return createMKJRelacion();
			case AbstractaPackage.MKJ_ASOCIACION: return createMKJAsociacion();
			case AbstractaPackage.MKJ_CONTAINMENT: return createMKJContainment();
			case AbstractaPackage.MKJ_AGREGACION: return createMKJAgregacion();
			case AbstractaPackage.MKJ_HERENCIA: return createMKJHerencia();
			case AbstractaPackage.MKJ_INTERFACE: return createMKJInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJPaquete createMKJPaquete() {
		MKJPaqueteImpl mkjPaquete = new MKJPaqueteImpl();
		return mkjPaquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJClase createMKJClase() {
		MKJClaseImpl mkjClase = new MKJClaseImpl();
		return mkjClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJAtributo createMKJAtributo() {
		MKJAtributoImpl mkjAtributo = new MKJAtributoImpl();
		return mkjAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJMetodo createMKJMetodo() {
		MKJMetodoImpl mkjMetodo = new MKJMetodoImpl();
		return mkjMetodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJRelacion createMKJRelacion() {
		MKJRelacionImpl mkjRelacion = new MKJRelacionImpl();
		return mkjRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJAsociacion createMKJAsociacion() {
		MKJAsociacionImpl mkjAsociacion = new MKJAsociacionImpl();
		return mkjAsociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJContainment createMKJContainment() {
		MKJContainmentImpl mkjContainment = new MKJContainmentImpl();
		return mkjContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJAgregacion createMKJAgregacion() {
		MKJAgregacionImpl mkjAgregacion = new MKJAgregacionImpl();
		return mkjAgregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJHerencia createMKJHerencia() {
		MKJHerenciaImpl mkjHerencia = new MKJHerenciaImpl();
		return mkjHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJInterface createMKJInterface() {
		MKJInterfaceImpl mkjInterface = new MKJInterfaceImpl();
		return mkjInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaPackage getAbstractaPackage() {
		return (AbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractaPackage getPackage() {
		return AbstractaPackage.eINSTANCE;
	}

} //AbstractaFactoryImpl
