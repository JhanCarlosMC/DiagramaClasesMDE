/**
 */
package concreta.impl;

import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.MKJMetodo;
import concreta.MKJPaquete;
import concreta.MKJRelacion;

import concreta.ModelFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretaPackageImpl extends EPackageImpl implements ConcretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjDiagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjPaqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjClaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjAtributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjMetodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjAsociacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjConteinmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjAgregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjHerenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjInterfaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see concreta.ConcretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretaPackageImpl() {
		super(eNS_URI, ConcretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConcretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretaPackage init() {
		if (isInited) return (ConcretaPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretaPackage.eNS_URI);

		// Obtain or create and register package
		ConcretaPackageImpl theConcretaPackage = (ConcretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConcretaPackage.createPackageContents();

		// Initialize created meta-data
		theConcretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretaPackage.eNS_URI, theConcretaPackage);
		return theConcretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaDiagramas() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJDiagramaClases() {
		return mkjDiagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJDiagramaClases_Nombre() {
		return (EAttribute)mkjDiagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaClases() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaPaquetes() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaAsociaciones() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaConteiments() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaAgregaciones() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaHerencias() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaInterfaces() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJPaquete() {
		return mkjPaqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJPaquete_Nombre() {
		return (EAttribute)mkjPaqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJPaquete_Ruta() {
		return (EAttribute)mkjPaqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJPaquete_Paquetes() {
		return (EReference)mkjPaqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJPaquete_Clases() {
		return (EReference)mkjPaqueteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJClase() {
		return mkjClaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJClase_Identificador() {
		return (EAttribute)mkjClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJClase_Name() {
		return (EAttribute)mkjClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJClase_Atributos() {
		return (EReference)mkjClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJClase_Metodos() {
		return (EReference)mkjClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJAtributo() {
		return mkjAtributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJAtributo_Name() {
		return (EAttribute)mkjAtributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJMetodo() {
		return mkjMetodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJMetodo_Name() {
		return (EAttribute)mkjMetodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJAsociacion() {
		return mkjAsociacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJAsociacion_Source() {
		return (EReference)mkjAsociacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJAsociacion_Target() {
		return (EReference)mkjAsociacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJConteinment() {
		return mkjConteinmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJConteinment_Source() {
		return (EReference)mkjConteinmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJConteinment_Target() {
		return (EReference)mkjConteinmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJAgregacion() {
		return mkjAgregacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJAgregacion_Source() {
		return (EReference)mkjAgregacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJAgregacion_Target() {
		return (EReference)mkjAgregacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJHerencia() {
		return mkjHerenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJHerencia_Source() {
		return (EReference)mkjHerenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJHerencia_Target() {
		return (EReference)mkjHerenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJInterface() {
		return mkjInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJInterface_Source() {
		return (EReference)mkjInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJInterface_Target() {
		return (EReference)mkjInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactory getConcretaFactory() {
		return (ConcretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_DIAGRAMAS);

		mkjDiagramaClasesEClass = createEClass(MKJ_DIAGRAMA_CLASES);
		createEAttribute(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__NOMBRE);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_CLASES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES);

		mkjPaqueteEClass = createEClass(MKJ_PAQUETE);
		createEAttribute(mkjPaqueteEClass, MKJ_PAQUETE__NOMBRE);
		createEAttribute(mkjPaqueteEClass, MKJ_PAQUETE__RUTA);
		createEReference(mkjPaqueteEClass, MKJ_PAQUETE__PAQUETES);
		createEReference(mkjPaqueteEClass, MKJ_PAQUETE__CLASES);

		mkjClaseEClass = createEClass(MKJ_CLASE);
		createEAttribute(mkjClaseEClass, MKJ_CLASE__IDENTIFICADOR);
		createEAttribute(mkjClaseEClass, MKJ_CLASE__NAME);
		createEReference(mkjClaseEClass, MKJ_CLASE__ATRIBUTOS);
		createEReference(mkjClaseEClass, MKJ_CLASE__METODOS);

		mkjAtributoEClass = createEClass(MKJ_ATRIBUTO);
		createEAttribute(mkjAtributoEClass, MKJ_ATRIBUTO__NAME);

		mkjMetodoEClass = createEClass(MKJ_METODO);
		createEAttribute(mkjMetodoEClass, MKJ_METODO__NAME);

		mkjAsociacionEClass = createEClass(MKJ_ASOCIACION);
		createEReference(mkjAsociacionEClass, MKJ_ASOCIACION__SOURCE);
		createEReference(mkjAsociacionEClass, MKJ_ASOCIACION__TARGET);

		mkjConteinmentEClass = createEClass(MKJ_CONTEINMENT);
		createEReference(mkjConteinmentEClass, MKJ_CONTEINMENT__SOURCE);
		createEReference(mkjConteinmentEClass, MKJ_CONTEINMENT__TARGET);

		mkjAgregacionEClass = createEClass(MKJ_AGREGACION);
		createEReference(mkjAgregacionEClass, MKJ_AGREGACION__SOURCE);
		createEReference(mkjAgregacionEClass, MKJ_AGREGACION__TARGET);

		mkjHerenciaEClass = createEClass(MKJ_HERENCIA);
		createEReference(mkjHerenciaEClass, MKJ_HERENCIA__SOURCE);
		createEReference(mkjHerenciaEClass, MKJ_HERENCIA__TARGET);

		mkjInterfaceEClass = createEClass(MKJ_INTERFACE);
		createEReference(mkjInterfaceEClass, MKJ_INTERFACE__SOURCE);
		createEReference(mkjInterfaceEClass, MKJ_INTERFACE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaDiagramas(), this.getMKJDiagramaClases(), null, "listaDiagramas", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjDiagramaClasesEClass, MKJDiagramaClases.class, "MKJDiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJDiagramaClases_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaClases(), this.getMKJClase(), null, "listaClases", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaPaquetes(), this.getMKJPaquete(), null, "listaPaquetes", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaAsociaciones(), this.getMKJAsociacion(), null, "listaAsociaciones", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaConteiments(), this.getMKJConteinment(), null, "listaConteiments", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaAgregaciones(), this.getMKJAgregacion(), null, "listaAgregaciones", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaHerencias(), this.getMKJHerencia(), null, "listaHerencias", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaInterfaces(), this.getMKJInterface(), null, "listaInterfaces", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjPaqueteEClass, MKJPaquete.class, "MKJPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMKJPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJPaquete_Paquetes(), this.getMKJPaquete(), null, "paquetes", null, 0, -1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJPaquete_Clases(), this.getMKJClase(), null, "clases", null, 0, -1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjClaseEClass, MKJClase.class, "MKJClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJClase_Identificador(), ecorePackage.getEString(), "identificador", null, 0, 1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMKJClase_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJClase_Atributos(), this.getMKJAtributo(), null, "atributos", null, 0, -1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJClase_Metodos(), this.getMKJMetodo(), null, "metodos", null, 0, -1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjAtributoEClass, MKJAtributo.class, "MKJAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJAtributo_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjMetodoEClass, MKJMetodo.class, "MKJMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJMetodo_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjAsociacionEClass, MKJAsociacion.class, "MKJAsociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJAsociacion_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJAsociacion_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjConteinmentEClass, MKJConteinment.class, "MKJConteinment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJConteinment_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJConteinment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJConteinment_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJConteinment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjAgregacionEClass, MKJAgregacion.class, "MKJAgregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJAgregacion_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJAgregacion_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjHerenciaEClass, MKJHerencia.class, "MKJHerencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJHerencia_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJHerencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJHerencia_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJHerencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjInterfaceEClass, MKJInterface.class, "MKJInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJInterface_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJInterface_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (mkjDiagramaClasesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (mkjPaqueteEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (mkjClaseEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (mkjAtributoEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "255,255,255"
		   });	
		addAnnotation
		  (mkjMetodoEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "255,255,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getMKJClase_Atributos(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getMKJClase_Metodos(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (mkjAsociacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });	
		addAnnotation
		  (mkjConteinmentEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });	
		addAnnotation
		  (mkjAgregacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });	
		addAnnotation
		  (mkjHerenciaEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });	
		addAnnotation
		  (mkjInterfaceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });
	}

} //ConcretaPackageImpl
