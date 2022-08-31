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
	 * The meta object id for the '{@link concreta.impl.MKJDiagramaClasesImpl <em>MKJ Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJDiagramaClasesImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJDiagramaClases()
	 * @generated
	 */
	int MKJ_DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES = 1;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES = 2;

	/**
	 * The number of structural features of the '<em>MKJ Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_DIAGRAMA_CLASES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJPaqueteImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJPaquete()
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
	 * The meta object id for the '{@link concreta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJClaseImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJClase()
	 * @generated
	 */
	int MKJ_CLASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__ATRIBUTOS = 1;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__METODOS = 2;

	/**
	 * The number of structural features of the '<em>MKJ Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJAtributoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJAtributo()
	 * @generated
	 */
	int MKJ_ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO__NAME = 0;

	/**
	 * The number of structural features of the '<em>MKJ Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_ATRIBUTO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJmetodoImpl <em>MK Jmetodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJmetodoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJmetodo()
	 * @generated
	 */
	int MK_JMETODO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO__NAME = 0;

	/**
	 * The number of structural features of the '<em>MK Jmetodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link concreta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MKJRelacionImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMKJRelacion()
	 * @generated
	 */
	int MKJ_RELACION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MKJ Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION_FEATURE_COUNT = 2;


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
	 * Returns the meta object for the containment reference list '{@link concreta.MKJDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see concreta.MKJDiagramaClases#getListaRelaciones()
	 * @see #getMKJDiagramaClases()
	 * @generated
	 */
	EReference getMKJDiagramaClases_ListaRelaciones();

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
	 * Returns the meta object for the containment reference list '{@link concreta.MKJPaquete#getPaquetes <em>Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paquetes</em>'.
	 * @see concreta.MKJPaquete#getPaquetes()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EReference getMKJPaquete_Paquetes();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MKJPaquete#getClases <em>Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases</em>'.
	 * @see concreta.MKJPaquete#getClases()
	 * @see #getMKJPaquete()
	 * @generated
	 */
	EReference getMKJPaquete_Clases();

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
	 * Returns the meta object for the attribute '{@link concreta.MKJClase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.MKJClase#getName()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Name();

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
	 * Returns the meta object for the attribute '{@link concreta.MKJAtributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.MKJAtributo#getName()
	 * @see #getMKJAtributo()
	 * @generated
	 */
	EAttribute getMKJAtributo_Name();

	/**
	 * Returns the meta object for class '{@link concreta.MKJmetodo <em>MK Jmetodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MK Jmetodo</em>'.
	 * @see concreta.MKJmetodo
	 * @generated
	 */
	EClass getMKJmetodo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MKJmetodo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.MKJmetodo#getName()
	 * @see #getMKJmetodo()
	 * @generated
	 */
	EAttribute getMKJmetodo_Name();

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
	 * Returns the meta object for the reference '{@link concreta.MKJRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MKJRelacion#getSource()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EReference getMKJRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MKJRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MKJRelacion#getTarget()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EReference getMKJRelacion_Target();

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
		 * The meta object literal for the '{@link concreta.impl.MKJDiagramaClasesImpl <em>MKJ Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJDiagramaClasesImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJDiagramaClases()
		 * @generated
		 */
		EClass MKJ_DIAGRAMA_CLASES = eINSTANCE.getMKJDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_CLASES = eINSTANCE.getMKJDiagramaClases_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES = eINSTANCE.getMKJDiagramaClases_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES = eINSTANCE.getMKJDiagramaClases_ListaPaquetes();

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
		 * The meta object literal for the '{@link concreta.impl.MKJClaseImpl <em>MKJ Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJClaseImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJClase()
		 * @generated
		 */
		EClass MKJ_CLASE = eINSTANCE.getMKJClase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_CLASE__NAME = eINSTANCE.getMKJClase_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_ATRIBUTO__NAME = eINSTANCE.getMKJAtributo_Name();

		/**
		 * The meta object literal for the '{@link concreta.impl.MKJmetodoImpl <em>MK Jmetodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MKJmetodoImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMKJmetodo()
		 * @generated
		 */
		EClass MK_JMETODO = eINSTANCE.getMKJmetodo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MK_JMETODO__NAME = eINSTANCE.getMKJmetodo_Name();

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

	}

} //ConcretaPackage
