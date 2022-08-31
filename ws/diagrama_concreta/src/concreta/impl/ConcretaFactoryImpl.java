/**
 */
package concreta.impl;

import concreta.*;

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
public class ConcretaFactoryImpl extends EFactoryImpl implements ConcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretaFactory init() {
		try {
			ConcretaFactory theConcretaFactory = (ConcretaFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretaPackage.eNS_URI);
			if (theConcretaFactory != null) {
				return theConcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactoryImpl() {
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES: return createMKJDiagramaClases();
			case ConcretaPackage.MKJ_PAQUETE: return createMKJPaquete();
			case ConcretaPackage.MKJ_CLASE: return createMKJClase();
			case ConcretaPackage.MKJ_ATRIBUTO: return createMKJAtributo();
			case ConcretaPackage.MK_JMETODO: return createMKJmetodo();
			case ConcretaPackage.MKJ_RELACION: return createMKJRelacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJDiagramaClases createMKJDiagramaClases() {
		MKJDiagramaClasesImpl mkjDiagramaClases = new MKJDiagramaClasesImpl();
		return mkjDiagramaClases;
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
	public MKJmetodo createMKJmetodo() {
		MKJmetodoImpl mkJmetodo = new MKJmetodoImpl();
		return mkJmetodo;
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
	public ConcretaPackage getConcretaPackage() {
		return (ConcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretaPackage getPackage() {
		return ConcretaPackage.eINSTANCE;
	}

} //ConcretaFactoryImpl
