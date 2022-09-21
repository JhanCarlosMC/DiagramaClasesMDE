/**
 */
package concreta;

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
 * @see concreta.ConcretaFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "concreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretaPackage eINSTANCE = concreta.impl.ConcretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ModelFactoryImpl
	 * @see concreta.impl.ConcretaPackageImpl#getModelFactory()
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
	 * The feature id for the '<em><b>Lista Diagramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_DIAGRAMAS = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJDiagramaClasesImpl <em>MKJ Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJDiagramaClasesImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJDiagramaClases()
	 * @generated
	 */
	int MKJ_DIAGRAMA_CLASES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_CLASES = 1;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES = 2;

	/**
	 * The feature id for the '<em><b>Lista Asociaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES = 3;

	/**
	 * The feature id for the '<em><b>Lista Conteiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS = 4;

	/**
	 * The feature id for the '<em><b>Lista Agregaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES = 5;

	/**
	 * The feature id for the '<em><b>Lista Herencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS = 6;

	/**
	 * The feature id for the '<em><b>Lista Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES = 7;

	/**
	 * The number of structural features of the '<em>MKJ Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJPaqueteImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJPaquete()
	 * @generated
	 */
	int MKJ_PAQUETE = 2;

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
	 * The number of structural features of the '<em>MKJ Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_PAQUETE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJClaseImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJClase()
	 * @generated
	 */
	int MKJ_CLASE = 3;

	/**
	 * The feature id for the '<em><b>Identificador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__IDENTIFICADOR = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__RUTA = 2;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__ATRIBUTOS = 3;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__METODOS = 4;

	/**
	 * The number of structural features of the '<em>MKJ Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJAtributoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJAtributo()
	 * @generated
	 */
	int MKJ_ATRIBUTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>MKJ Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJMetodoImpl <em>MKJ Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJMetodoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJMetodo()
	 * @generated
	 */
	int MKJ_METODO = 5;

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
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO__PARAMETROS = 2;

	/**
	 * The number of structural features of the '<em>MKJ Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_METODO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJRelacionImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJRelacion()
	 * @generated
	 */
	int MKJ_RELACION = 6;

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
	 * The number of structural features of the '<em>MKJ Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJAsociacionImpl <em>MKJ Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJAsociacionImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJAsociacion()
	 * @generated
	 */
	int MKJ_ASOCIACION = 7;

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
	int MKJ_ASOCIACION__SOURCE = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION__TARGET = MKJ_RELACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MKJ Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ASOCIACION_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJConteinmentImpl <em>MKJ Conteinment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJConteinmentImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJConteinment()
	 * @generated
	 */
	int MKJ_CONTEINMENT = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__NOMBRE = MKJ_RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__MULTIPLICIDAD1 = MKJ_RELACION__MULTIPLICIDAD1;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__MULTIPLICIDAD2 = MKJ_RELACION__MULTIPLICIDAD2;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__ROL1 = MKJ_RELACION__ROL1;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__ROL2 = MKJ_RELACION__ROL2;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__NAVEGABILIDAD1 = MKJ_RELACION__NAVEGABILIDAD1;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__NAVEGABILIDAD2 = MKJ_RELACION__NAVEGABILIDAD2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__SOURCE = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT__TARGET = MKJ_RELACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MKJ Conteinment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CONTEINMENT_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJAgregacionImpl <em>MKJ Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJAgregacionImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJAgregacion()
	 * @generated
	 */
	int MKJ_AGREGACION = 9;

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
	int MKJ_AGREGACION__SOURCE = MKJ_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION__TARGET = MKJ_RELACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MKJ Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_AGREGACION_FEATURE_COUNT = MKJ_RELACION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJHerenciaImpl <em>MKJ Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJHerenciaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJHerencia()
	 * @generated
	 */
	int MKJ_HERENCIA = 10;

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
	 * The meta object id for the '{@link concreta.impl.MKJInterfaceImpl <em>MKJ Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJInterfaceImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJInterface()
	 * @generated
	 */
	int MKJ_INTERFACE = 11;

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
	 * Returns the meta object for class '{@link concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see concreta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link concreta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.ModelFactory#getListaDiagramas <em>Lista Diagramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Diagramas</em>'.
	 * @see concreta.ModelFactory#getListaDiagramas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaDiagramas();

	/**
	 * Returns the meta object for class '{@link concreta.MKJDiagramaClases <em>MKJ Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Diagrama Clases</em>'.
	 * @see concreta.MKJDiagramaClases
	 * @generated
	 */
	EClass getMKJDiagramaClases();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJDiagramaClases#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJDiagramaClases#getNombre()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EAttribute getMKJDiagramaClases_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see concreta.MKJDiagramaClases#getListaClases()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see concreta.MKJDiagramaClases#getListaPaquetes()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaPaquetes();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaAsociaciones <em>Lista Asociaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Asociaciones</em>'.
	 * @see concreta.MKJDiagramaClases#getListaAsociaciones()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaAsociaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaConteiments <em>Lista Conteiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Conteiments</em>'.
	 * @see concreta.MKJDiagramaClases#getListaConteiments()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaConteiments();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaAgregaciones <em>Lista Agregaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Agregaciones</em>'.
	 * @see concreta.MKJDiagramaClases#getListaAgregaciones()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaAgregaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaHerencias <em>Lista Herencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Herencias</em>'.
	 * @see concreta.MKJDiagramaClases#getListaHerencias()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaHerencias();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaInterfaces <em>Lista Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Interfaces</em>'.
	 * @see concreta.MKJDiagramaClases#getListaInterfaces()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaInterfaces();

	/**
	 * Returns the meta object for class '{@link concreta.MKJPaquete <em>MKJ Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Paquete</em>'.
	 * @see concreta.MKJPaquete
	 * @generated
	 */
	EClass getMKJPaquete();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJPaquete#getNombre()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EAttribute getMKJPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MKJPaquete#getRuta()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EAttribute getMKJPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link concreta.MKJClase <em>MKJ Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Clase</em>'.
	 * @see concreta.MKJClase
	 * @generated
	 */
	EClass getMKJClase();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJClase#getIdentificador <em>Identificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identificador</em>'.
	 * @see concreta.MKJClase#getIdentificador()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Identificador();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJClase#getNombre()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJClase#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MKJClase#getRuta()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJClase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see concreta.MKJClase#getAtributos()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Atributos();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJClase#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see concreta.MKJClase#getMetodos()
	 * @see #getMKJClase()
	 * @generated
	 */
	EReference getMKJClase_Metodos();

	/**
	 * Returns the meta object for class '{@link concreta.MKJAtributo <em>MKJ Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Atributo</em>'.
	 * @see concreta.MKJAtributo
	 * @generated
	 */
	EClass getMKJAtributo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJAtributo#getNombre()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_Nombre();

	/**
	 * Returns the meta object for class '{@link concreta.MKJMetodo <em>MKJ Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Metodo</em>'.
	 * @see concreta.MKJMetodo
	 * @generated
	 */
	EClass getMKJMetodo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJMetodo#getNombre()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EAttribute getMKJMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJMetodo#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see concreta.MKJMetodo#getSemantics()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EAttribute getMKJMetodo_Semantics();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJMetodo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see concreta.MKJMetodo#getParametros()
	 * @see #getMKJMetodo()
	 * @generated
	 */
	EReference getMKJMetodo_Parametros();

	/**
	 * Returns the meta object for class '{@link concreta.MKJRelacion <em>MKJ Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Relacion</em>'.
	 * @see concreta.MKJRelacion
	 * @generated
	 */
	EClass getMKJRelacion();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MKJRelacion#getNombre()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getMultiplicidad1 <em>Multiplicidad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad1</em>'.
	 * @see concreta.MKJRelacion#getMultiplicidad1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Multiplicidad1();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getMultiplicidad2 <em>Multiplicidad2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad2</em>'.
	 * @see concreta.MKJRelacion#getMultiplicidad2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Multiplicidad2();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getRol1 <em>Rol1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol1</em>'.
	 * @see concreta.MKJRelacion#getRol1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Rol1();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getRol2 <em>Rol2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol2</em>'.
	 * @see concreta.MKJRelacion#getRol2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Rol2();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getNavegabilidad1 <em>Navegabilidad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad1</em>'.
	 * @see concreta.MKJRelacion#getNavegabilidad1()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Navegabilidad1();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJRelacion#getNavegabilidad2 <em>Navegabilidad2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad2</em>'.
	 * @see concreta.MKJRelacion#getNavegabilidad2()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Navegabilidad2();

	/**
	 * Returns the meta object for class '{@link concreta.MKJAsociacion <em>MKJ Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Asociacion</em>'.
	 * @see concreta.MKJAsociacion
	 * @generated
	 */
	EClass getMKJAsociacion();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJAsociacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJAsociacion#getSource()
	 * @see #getMKJAsociacion()
	 * @generated
	 */
	EReference getMKJAsociacion_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJAsociacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJAsociacion#getTarget()
	 * @see #getMKJAsociacion()
	 * @generated
	 */
	EReference getMKJAsociacion_Target();

	/**
	 * Returns the meta object for class '{@link concreta.MKJConteinment <em>MKJ Conteinment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Conteinment</em>'.
	 * @see concreta.MKJConteinment
	 * @generated
	 */
	EClass getMKJConteinment();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJConteinment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJConteinment#getSource()
	 * @see #getMKJConteinment()
	 * @generated
	 */
	EReference getMKJConteinment_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJConteinment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJConteinment#getTarget()
	 * @see #getMKJConteinment()
	 * @generated
	 */
	EReference getMKJConteinment_Target();

	/**
	 * Returns the meta object for class '{@link concreta.MKJAgregacion <em>MKJ Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Agregacion</em>'.
	 * @see concreta.MKJAgregacion
	 * @generated
	 */
	EClass getMKJAgregacion();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJAgregacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJAgregacion#getSource()
	 * @see #getMKJAgregacion()
	 * @generated
	 */
	EReference getMKJAgregacion_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJAgregacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJAgregacion#getTarget()
	 * @see #getMKJAgregacion()
	 * @generated
	 */
	EReference getMKJAgregacion_Target();

	/**
	 * Returns the meta object for class '{@link concreta.MKJHerencia <em>MKJ Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Herencia</em>'.
	 * @see concreta.MKJHerencia
	 * @generated
	 */
	EClass getMKJHerencia();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJHerencia#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJHerencia#getSource()
	 * @see #getMKJHerencia()
	 * @generated
	 */
	EReference getMKJHerencia_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJHerencia#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJHerencia#getTarget()
	 * @see #getMKJHerencia()
	 * @generated
	 */
	EReference getMKJHerencia_Target();

	/**
	 * Returns the meta object for class '{@link concreta.MKJInterface <em>MKJ Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MKJ Interface</em>'.
	 * @see concreta.MKJInterface
	 * @generated
	 */
	EClass getMKJInterface();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJInterface#getSource()
	 * @see #getMKJInterface()
	 * @generated
	 */
	EReference getMKJInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJInterface#getTarget()
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
	ConcretaFactory getConcretaFactory();

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
		 * The meta object literal for the '{@link concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ModelFactoryImpl
		 * @see concreta.impl.ConcretaPackageImpl#getModelFactory()
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
		 * The meta object literal for the '<em><b>Lista Diagramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_DIAGRAMAS = eINSTANCE.getModelFactory_ListaDiagramas();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJDiagramaClasesImpl <em>MKJ Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJDiagramaClasesImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJDiagramaClases()
		 * @generated
		 */
		EClass MKJ_DIAGRAMA_CLASES = eINSTANCE.getMKJDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_DIAGRAMA_CLASES__NOMBRE = eINSTANCE.getMKJDiagramaClases_Nombre();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_CLASES = eINSTANCE.getMKJDiagramaClases_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES = eINSTANCE.getMKJDiagramaClases_ListaPaquetes();

		/**
		 * The meta object literal for the '<em><b>Lista Asociaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES = eINSTANCE.getMKJDiagramaClases_ListaAsociaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Conteiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS = eINSTANCE.getMKJDiagramaClases_ListaConteiments();

		/**
		 * The meta object literal for the '<em><b>Lista Agregaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES = eINSTANCE.getMKJDiagramaClases_ListaAgregaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Herencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS = eINSTANCE.getMKJDiagramaClases_ListaHerencias();

		/**
		 * The meta object literal for the '<em><b>Lista Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES = eINSTANCE.getMKJDiagramaClases_ListaInterfaces();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJPaqueteImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJPaquete()
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
		 * The meta object literal for the '{@link concreta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJClaseImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJClase()
		 * @generated
		 */
		EClass MKJ_CLASE = eINSTANCE.getMKJClase();

		/**
		 * The meta object literal for the '<em><b>Identificador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_CLASE__IDENTIFICADOR = eINSTANCE.getMKJClase_Identificador();

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
		 * The meta object literal for the '{@link concreta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJAtributoImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJAtributo()
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
		 * The meta object literal for the '{@link concreta.impl.MKJMetodoImpl <em>MKJ Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJMetodoImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJMetodo()
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
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_METODO__PARAMETROS = eINSTANCE.getMKJMetodo_Parametros();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJRelacionImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJRelacion()
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
		 * The meta object literal for the '{@link concreta.impl.MKJAsociacionImpl <em>MKJ Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJAsociacionImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJAsociacion()
		 * @generated
		 */
		EClass MKJ_ASOCIACION = eINSTANCE.getMKJAsociacion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_ASOCIACION__SOURCE = eINSTANCE.getMKJAsociacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_ASOCIACION__TARGET = eINSTANCE.getMKJAsociacion_Target();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJConteinmentImpl <em>MKJ Conteinment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJConteinmentImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJConteinment()
		 * @generated
		 */
		EClass MKJ_CONTEINMENT = eINSTANCE.getMKJConteinment();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CONTEINMENT__SOURCE = eINSTANCE.getMKJConteinment_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CONTEINMENT__TARGET = eINSTANCE.getMKJConteinment_Target();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJAgregacionImpl <em>MKJ Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJAgregacionImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJAgregacion()
		 * @generated
		 */
		EClass MKJ_AGREGACION = eINSTANCE.getMKJAgregacion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_AGREGACION__SOURCE = eINSTANCE.getMKJAgregacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_AGREGACION__TARGET = eINSTANCE.getMKJAgregacion_Target();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJHerenciaImpl <em>MKJ Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJHerenciaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJHerencia()
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
		 * The meta object literal for the '{@link concreta.impl.MKJInterfaceImpl <em>MKJ Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJInterfaceImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJInterface()
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

} //ConcretaPackage
