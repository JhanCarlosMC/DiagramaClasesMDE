/**
 */
package abstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__PAQUETES = 2;

	/**
	 * The feature id for the '<em><b>Lista Todas Las Clases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_TODAS_LAS_CLASES = 3;

	/**
	 * The feature id for the '<em><b>Lista Todos Los Paquetes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES = 4;

	/**
	 * The feature id for the '<em><b>Lista Asociaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_ASOCIACIONES = 5;

	/**
	 * The feature id for the '<em><b>Lista Conteiments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_CONTEIMENTS = 6;

	/**
	 * The feature id for the '<em><b>Lista Agregaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_AGREGACIONES = 7;

	/**
	 * The feature id for the '<em><b>Lista Herencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_HERENCIAS = 8;

	/**
	 * The feature id for the '<em><b>Lista Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_INTERFACES = 9;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJPaqueteImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJPaquete()
	 * @generated
	 */
	int MKJ_PAQUETE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE__PAQUETES = 2;

	/**
	 * The feature id for the '<em><b>Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE__CLASES = 3;

	/**
	 * The number of structural features of the '<em>MKJ Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJClaseImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJClase()
	 * @generated
	 */
	int MKJ_CLASE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__ATRIBUTOS = 2;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__METODOS = 3;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__RELACIONES = 4;

	/**
	 * The feature id for the '<em><b>Herencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__HERENCIAS = 5;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__INTERFACES = 6;

	/**
	 * The number of structural features of the '<em>MKJ Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJAtributoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJAtributo()
	 * @generated
	 */
	int MKJ_ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__NOT_NULL = 4;

	/**
	 * The feature id for the '<em><b>Unique Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__UNIQUE_DATA = 5;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__AUTO_INCREMENT = 6;

	/**
	 * The number of structural features of the '<em>MKJ Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJMetodoImpl <em>MKJ Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJMetodoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJMetodo()
	 * @generated
	 */
	int MKJ_METODO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO__SEMANTICS = 1;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO__LISTA_PARAMETROS = 2;

	/**
	 * The number of structural features of the '<em>MKJ Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJRelacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJRelacion()
	 * @generated
	 */
	int MKJ_RELACION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__MULTIPLICIDAD1 = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__MULTIPLICIDAD2 = 2;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__ROL1 = 3;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__ROL2 = 4;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NAVEGABILIDAD1 = 5;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NAVEGABILIDAD2 = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__TARGET = 8;

	/**
	 * The number of structural features of the '<em>MKJ Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJAsociacionImpl <em>MKJ Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJAsociacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJAsociacion()
	 * @generated
	 */
	int MKJ_ASOCIACION = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__NOMBRE = MKJ_RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__MULTIPLICIDAD1 = MKJ_RELACION__MULTIPLICIDAD1;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__MULTIPLICIDAD2 = MKJ_RELACION__MULTIPLICIDAD2;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__ROL1 = MKJ_RELACION__ROL1;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__ROL2 = MKJ_RELACION__ROL2;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__NAVEGABILIDAD1 = MKJ_RELACION__NAVEGABILIDAD1;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__NAVEGABILIDAD2 = MKJ_RELACION__NAVEGABILIDAD2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__SOURCE = MKJ_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__TARGET = MKJ_RELACION__TARGET;

	/**
	 * The number of structural features of the '<em>MKJ Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJContainmentImpl <em>MKJ Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJContainmentImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJContainment()
	 * @generated
	 */
	int MKJ_CONTAINMENT = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__NOMBRE = MKJ_RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__MULTIPLICIDAD1 = MKJ_RELACION__MULTIPLICIDAD1;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__MULTIPLICIDAD2 = MKJ_RELACION__MULTIPLICIDAD2;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__ROL1 = MKJ_RELACION__ROL1;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__ROL2 = MKJ_RELACION__ROL2;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__NAVEGABILIDAD1 = MKJ_RELACION__NAVEGABILIDAD1;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__NAVEGABILIDAD2 = MKJ_RELACION__NAVEGABILIDAD2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__SOURCE = MKJ_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT__TARGET = MKJ_RELACION__TARGET;

	/**
	 * The number of structural features of the '<em>MKJ Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTAINMENT_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJAgregacionImpl <em>MKJ Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJAgregacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJAgregacion()
	 * @generated
	 */
	int MKJ_AGREGACION = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__NOMBRE = MKJ_RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__MULTIPLICIDAD1 = MKJ_RELACION__MULTIPLICIDAD1;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__MULTIPLICIDAD2 = MKJ_RELACION__MULTIPLICIDAD2;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__ROL1 = MKJ_RELACION__ROL1;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__ROL2 = MKJ_RELACION__ROL2;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__NAVEGABILIDAD1 = MKJ_RELACION__NAVEGABILIDAD1;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__NAVEGABILIDAD2 = MKJ_RELACION__NAVEGABILIDAD2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__SOURCE = MKJ_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__TARGET = MKJ_RELACION__TARGET;

	/**
	 * The number of structural features of the '<em>MKJ Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJHerenciaImpl <em>MKJ Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJHerenciaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJHerencia()
	 * @generated
	 */
	int MKJ_HERENCIA = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_HERENCIA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_HERENCIA__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MKJ Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_HERENCIA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJInterfaceImpl <em>MKJ Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJInterfaceImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJInterface()
	 * @generated
	 */
	int MKJ_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_INTERFACE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_INTERFACE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MKJ Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_INTERFACE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see abstracta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactory#getPaquetes <em>Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paquetes</em>'.
	 * @see abstracta.ModelFactory#getPaquetes()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_Paquetes();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaTodasLasClases <em>Lista Todas Las Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Todas Las Clases</em>'.
	 * @see abstracta.ModelFactory#getListaTodasLasClases()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaTodasLasClases();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaTodosLosPaquetes <em>Lista Todos Los Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Todos Los Paquetes</em>'.
	 * @see abstracta.ModelFactory#getListaTodosLosPaquetes()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaTodosLosPaquetes();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaAsociaciones <em>Lista Asociaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Asociaciones</em>'.
	 * @see abstracta.ModelFactory#getListaAsociaciones()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaAsociaciones();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaConteiments <em>Lista Conteiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Conteiments</em>'.
	 * @see abstracta.ModelFactory#getListaConteiments()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaConteiments();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaAgregaciones <em>Lista Agregaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Agregaciones</em>'.
	 * @see abstracta.ModelFactory#getListaAgregaciones()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaAgregaciones();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaHerencias <em>Lista Herencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Herencias</em>'.
	 * @see abstracta.ModelFactory#getListaHerencias()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaHerencias();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaInterfaces <em>Lista Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Interfaces</em>'.
	 * @see abstracta.ModelFactory#getListaInterfaces()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaInterfaces();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJPaquete <em>MKJ Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Paquete</em>'.
	 * @see abstracta.MKJPaquete
	 * @generated
	 */
	EClass getMKJPaquete();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJPaquete#getNombre()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EAttribute getMKJPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.MKJPaquete#getRuta()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EAttribute getMKJPaquete_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJPaquete#getPaquetes <em>Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paquetes</em>'.
	 * @see abstracta.MKJPaquete#getPaquetes()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EReference getMKJPaquete_Paquetes();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJPaquete#getClases <em>Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases</em>'.
	 * @see abstracta.MKJPaquete#getClases()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EReference getMKJPaquete_Clases();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJClase <em>MKJ Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Clase</em>'.
	 * @see abstracta.MKJClase
	 * @generated
	 */
	EClass getMKJClase();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJClase#getNombre()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJClase#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.MKJClase#getRuta()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJClase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see abstracta.MKJClase#getAtributos()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Atributos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJClase#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see abstracta.MKJClase#getMetodos()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Metodos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJClase#getRelaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones</em>'.
	 * @see abstracta.MKJClase#getRelaciones()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Relaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJClase#getHerencias <em>Herencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias</em>'.
	 * @see abstracta.MKJClase#getHerencias()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Herencias();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJClase#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see abstracta.MKJClase#getInterfaces()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Interfaces();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJAtributo <em>MKJ Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Atributo</em>'.
	 * @see abstracta.MKJAtributo
	 * @generated
	 */
	EClass getMKJAtributo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJAtributo#getNombre()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see abstracta.MKJAtributo#isPrimaryKey()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#isForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see abstracta.MKJAtributo#isForeignKey()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstracta.MKJAtributo#getType()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see abstracta.MKJAtributo#isNotNull()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#isUniqueData <em>Unique Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Data</em>'.
	 * @see abstracta.MKJAtributo#isUniqueData()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_UniqueData();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJAtributo#isAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see abstracta.MKJAtributo#isAutoIncrement()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_AutoIncrement();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJMetodo <em>MKJ Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Metodo</em>'.
	 * @see abstracta.MKJMetodo
	 * @generated
	 */
	EClass getMKJMetodo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJMetodo#getNombre()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EAttribute getMKJMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJMetodo#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see abstracta.MKJMetodo#getSemantics()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EAttribute getMKJMetodo_Semantics();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see abstracta.MKJMetodo#getListaParametros()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EReference getMKJMetodo_ListaParametros();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJRelacion <em>MKJ Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Relacion</em>'.
	 * @see abstracta.MKJRelacion
	 * @generated
	 */
	EClass getMKJRelacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJRelacion#getNombre()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getMultiplicidad1 <em>Multiplicidad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad1</em>'.
	 * @see abstracta.MKJRelacion#getMultiplicidad1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Multiplicidad1();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getMultiplicidad2 <em>Multiplicidad2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad2</em>'.
	 * @see abstracta.MKJRelacion#getMultiplicidad2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Multiplicidad2();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getRol1 <em>Rol1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol1</em>'.
	 * @see abstracta.MKJRelacion#getRol1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Rol1();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getRol2 <em>Rol2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol2</em>'.
	 * @see abstracta.MKJRelacion#getRol2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Rol2();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getNavegabilidad1 <em>Navegabilidad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad1</em>'.
	 * @see abstracta.MKJRelacion#getNavegabilidad1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Navegabilidad1();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getNavegabilidad2 <em>Navegabilidad2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad2</em>'.
	 * @see abstracta.MKJRelacion#getNavegabilidad2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Navegabilidad2();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.MKJRelacion#getSource()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EReference getMKJRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.MKJRelacion#getTarget()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EReference getMKJRelacion_Target();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJAsociacion <em>MKJ Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Asociacion</em>'.
	 * @see abstracta.MKJAsociacion
	 * @generated
	 */
	EClass getMKJAsociacion();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJContainment <em>MKJ Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Containment</em>'.
	 * @see abstracta.MKJContainment
	 * @generated
	 */
	EClass getMKJContainment();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJAgregacion <em>MKJ Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Agregacion</em>'.
	 * @see abstracta.MKJAgregacion
	 * @generated
	 */
	EClass getMKJAgregacion();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJHerencia <em>MKJ Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Herencia</em>'.
	 * @see abstracta.MKJHerencia
	 * @generated
	 */
	EClass getMKJHerencia();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJHerencia#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.MKJHerencia#getSource()
	 * @see #getMKJHerencia()
	 * @generated
	 */
	EReference getMKJHerencia_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJHerencia#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.MKJHerencia#getTarget()
	 * @see #getMKJHerencia()
	 * @generated
	 */
	EReference getMKJHerencia_Target();

	/**
	 * Returns the meta object for class '{@link abstracta.MKJInterface <em>MKJ Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Interface</em>'.
	 * @see abstracta.MKJInterface
	 * @generated
	 */
	EClass getMKJInterface();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.MKJInterface#getSource()
	 * @see #getMKJInterface()
	 * @generated
	 */
	EReference getMKJInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.MKJInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.MKJInterface#getTarget()
	 * @see #getMKJInterface()
	 * @generated
	 */
	EReference getMKJInterface_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__PAQUETES = eINSTANCE.getModelFactory_Paquetes();

		/**
		 * The meta object literal for the '<em><b>Lista Todas Las Clases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_TODAS_LAS_CLASES = eINSTANCE.getModelFactory_ListaTodasLasClases();

		/**
		 * The meta object literal for the '<em><b>Lista Todos Los Paquetes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES = eINSTANCE.getModelFactory_ListaTodosLosPaquetes();

		/**
		 * The meta object literal for the '<em><b>Lista Asociaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_ASOCIACIONES = eINSTANCE.getModelFactory_ListaAsociaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Conteiments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_CONTEIMENTS = eINSTANCE.getModelFactory_ListaConteiments();

		/**
		 * The meta object literal for the '<em><b>Lista Agregaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_AGREGACIONES = eINSTANCE.getModelFactory_ListaAgregaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Herencias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_HERENCIAS = eINSTANCE.getModelFactory_ListaHerencias();

		/**
		 * The meta object literal for the '<em><b>Lista Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_INTERFACES = eINSTANCE.getModelFactory_ListaInterfaces();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJPaqueteImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJPaquete()
		 * @generated
		 */
		EClass MKJ_PAQUETE = eINSTANCE.getMKJPaquete();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_PAQUETE__NOMBRE = eINSTANCE.getMKJPaquete_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_PAQUETE__RUTA = eINSTANCE.getMKJPaquete_Ruta();

		/**
		 * The meta object literal for the '<em><b>Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_PAQUETE__PAQUETES = eINSTANCE.getMKJPaquete_Paquetes();

		/**
		 * The meta object literal for the '<em><b>Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_PAQUETE__CLASES = eINSTANCE.getMKJPaquete_Clases();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJClaseImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJClase()
		 * @generated
		 */
		EClass MKJ_CLASE = eINSTANCE.getMKJClase();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_CLASE__NOMBRE = eINSTANCE.getMKJClase_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_CLASE__RUTA = eINSTANCE.getMKJClase_Ruta();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__ATRIBUTOS = eINSTANCE.getMKJClase_Atributos();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__METODOS = eINSTANCE.getMKJClase_Metodos();

		/**
		 * The meta object literal for the '<em><b>Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__RELACIONES = eINSTANCE.getMKJClase_Relaciones();

		/**
		 * The meta object literal for the '<em><b>Herencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__HERENCIAS = eINSTANCE.getMKJClase_Herencias();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__INTERFACES = eINSTANCE.getMKJClase_Interfaces();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJAtributoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJAtributo()
		 * @generated
		 */
		EClass MKJ_ATRIBUTO = eINSTANCE.getMKJAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__NOMBRE = eINSTANCE.getMKJAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__PRIMARY_KEY = eINSTANCE.getMKJAtributo_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__FOREIGN_KEY = eINSTANCE.getMKJAtributo_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__TYPE = eINSTANCE.getMKJAtributo_Type();

		/**
		 * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__NOT_NULL = eINSTANCE.getMKJAtributo_NotNull();

		/**
		 * The meta object literal for the '<em><b>Unique Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__UNIQUE_DATA = eINSTANCE.getMKJAtributo_UniqueData();

		/**
		 * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__AUTO_INCREMENT = eINSTANCE.getMKJAtributo_AutoIncrement();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJMetodoImpl <em>MKJ Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJMetodoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJMetodo()
		 * @generated
		 */
		EClass MKJ_METODO = eINSTANCE.getMKJMetodo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_METODO__NOMBRE = eINSTANCE.getMKJMetodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_METODO__SEMANTICS = eINSTANCE.getMKJMetodo_Semantics();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_METODO__LISTA_PARAMETROS = eINSTANCE.getMKJMetodo_ListaParametros();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJRelacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJRelacion()
		 * @generated
		 */
		EClass MKJ_RELACION = eINSTANCE.getMKJRelacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__NOMBRE = eINSTANCE.getMKJRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__MULTIPLICIDAD1 = eINSTANCE.getMKJRelacion_Multiplicidad1();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__MULTIPLICIDAD2 = eINSTANCE.getMKJRelacion_Multiplicidad2();

		/**
		 * The meta object literal for the '<em><b>Rol1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__ROL1 = eINSTANCE.getMKJRelacion_Rol1();

		/**
		 * The meta object literal for the '<em><b>Rol2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__ROL2 = eINSTANCE.getMKJRelacion_Rol2();

		/**
		 * The meta object literal for the '<em><b>Navegabilidad1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__NAVEGABILIDAD1 = eINSTANCE.getMKJRelacion_Navegabilidad1();

		/**
		 * The meta object literal for the '<em><b>Navegabilidad2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__NAVEGABILIDAD2 = eINSTANCE.getMKJRelacion_Navegabilidad2();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_RELACION__SOURCE = eINSTANCE.getMKJRelacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_RELACION__TARGET = eINSTANCE.getMKJRelacion_Target();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJAsociacionImpl <em>MKJ Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJAsociacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJAsociacion()
		 * @generated
		 */
		EClass MKJ_ASOCIACION = eINSTANCE.getMKJAsociacion();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJContainmentImpl <em>MKJ Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJContainmentImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJContainment()
		 * @generated
		 */
		EClass MKJ_CONTAINMENT = eINSTANCE.getMKJContainment();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJAgregacionImpl <em>MKJ Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJAgregacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJAgregacion()
		 * @generated
		 */
		EClass MKJ_AGREGACION = eINSTANCE.getMKJAgregacion();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJHerenciaImpl <em>MKJ Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJHerenciaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJHerencia()
		 * @generated
		 */
		EClass MKJ_HERENCIA = eINSTANCE.getMKJHerencia();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_HERENCIA__SOURCE = eINSTANCE.getMKJHerencia_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_HERENCIA__TARGET = eINSTANCE.getMKJHerencia_Target();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MKJInterfaceImpl <em>MKJ Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJInterfaceImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJInterface()
		 * @generated
		 */
		EClass MKJ_INTERFACE = eINSTANCE.getMKJInterface();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_INTERFACE__SOURCE = eINSTANCE.getMKJInterface_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_INTERFACE__TARGET = eINSTANCE.getMKJInterface_Target();

	}

} //AbstractaPackage
