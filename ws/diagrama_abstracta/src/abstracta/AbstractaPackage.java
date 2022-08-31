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
	 * The meta object id for the '{@link abstracta.impl.MKJPaqueteImpl <em>MKJ Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJPaqueteImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJPaquete()
	 * @generated
	 */
	int MKJ_PAQUETE = 0;

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
	int MKJ_CLASE = 1;

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
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE__RELACIONES = 3;

	/**
	 * The number of structural features of the '<em>MKJ Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_CLASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJAtributoImpl <em>MKJ Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJAtributoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJAtributo()
	 * @generated
	 */
	int MKJ_ATRIBUTO = 2;

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
	 * The meta object id for the '{@link abstracta.impl.MKJmetodoImpl <em>MK Jmetodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJmetodoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJmetodo()
	 * @generated
	 */
	int MK_JMETODO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO__RETORNO = 1;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO__LISTA_PARAMETROS = 2;

	/**
	 * The number of structural features of the '<em>MK Jmetodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MK_JMETODO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracta.impl.MKJRelacionImpl <em>MKJ Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MKJRelacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMKJRelacion()
	 * @generated
	 */
	int MKJ_RELACION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__MULTIPLICIDAD1 = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__MULTIPLICIDAD2 = 3;

	/**
	 * The feature id for the '<em><b>Rol1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__ROL1 = 4;

	/**
	 * The feature id for the '<em><b>Rol2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__ROL2 = 5;

	/**
	 * The feature id for the '<em><b>Navegabilidad1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NAVEGABILIDAD1 = 6;

	/**
	 * The feature id for the '<em><b>Navegabilidad2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__NAVEGABILIDAD2 = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION__TARGET = 9;

	/**
	 * The number of structural features of the '<em>MKJ Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MKJ_RELACION_FEATURE_COUNT = 10;


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
	 * Returns the meta object for the attribute '{@link abstracta.MKJClase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.MKJClase#getName()
	 * @see #getMKJClase()
	 * @generated
	 */
	EAttribute getMKJClase_Name();

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
	 * Returns the meta object for class '{@link abstracta.MKJmetodo <em>MK Jmetodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MK Jmetodo</em>'.
	 * @see abstracta.MKJmetodo
	 * @generated
	 */
	EClass getMKJmetodo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJmetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MKJmetodo#getNombre()
	 * @see #getMKJmetodo()
	 * @generated
	 */
	EAttribute getMKJmetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJmetodo#isRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retorno</em>'.
	 * @see abstracta.MKJmetodo#isRetorno()
	 * @see #getMKJmetodo()
	 * @generated
	 */
	EAttribute getMKJmetodo_Retorno();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MKJmetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see abstracta.MKJmetodo#getListaParametros()
	 * @see #getMKJmetodo()
	 * @generated
	 */
	EReference getMKJmetodo_ListaParametros();

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
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.MKJRelacion#getName()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MKJRelacion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see abstracta.MKJRelacion#getTipo()
	 * @see #getMKJRelacion()
	 * @generated
	 */
	EAttribute getMKJRelacion_Tipo();

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
		 * The meta object literal for the '<em><b>Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MKJ_CLASE__RELACIONES = eINSTANCE.getMKJClase_Relaciones();

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
		 * The meta object literal for the '{@link abstracta.impl.MKJmetodoImpl <em>MK Jmetodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MKJmetodoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMKJmetodo()
		 * @generated
		 */
		EClass MK_JMETODO = eINSTANCE.getMKJmetodo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MK_JMETODO__NOMBRE = eINSTANCE.getMKJmetodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MK_JMETODO__RETORNO = eINSTANCE.getMKJmetodo_Retorno();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MK_JMETODO__LISTA_PARAMETROS = eINSTANCE.getMKJmetodo_ListaParametros();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__NAME = eINSTANCE.getMKJRelacion_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MKJ_RELACION__TIPO = eINSTANCE.getMKJRelacion_Tipo();

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

	}

} //AbstractaPackage
