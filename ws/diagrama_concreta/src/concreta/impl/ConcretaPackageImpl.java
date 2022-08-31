/**
 */
package concreta.impl;

import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJDiagramaClases;
import concreta.MKJPaquete;
import concreta.MKJRelacion;
import concreta.MKJmetodo;

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
	private EClass mkJmetodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mkjRelacionEClass = null;

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
	public EClass getMKJDiagramaClases() {
		return mkjDiagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaClases() {
		return (EReference)mkjDiagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJDiagramaClases_ListaRelaciones() {
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
	public EAttribute getMKJClase_Name() {
		return (EAttribute)mkjClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJClase_Atributos() {
		return (EReference)mkjClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJClase_Metodos() {
		return (EReference)mkjClaseEClass.getEStructuralFeatures().get(2);
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
	public EClass getMKJmetodo() {
		return mkJmetodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMKJmetodo_Name() {
		return (EAttribute)mkJmetodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMKJRelacion() {
		return mkjRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJRelacion_Source() {
		return (EReference)mkjRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMKJRelacion_Target() {
		return (EReference)mkjRelacionEClass.getEStructuralFeatures().get(1);
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
		mkjDiagramaClasesEClass = createEClass(MKJ_DIAGRAMA_CLASES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_CLASES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES);
		createEReference(mkjDiagramaClasesEClass, MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES);

		mkjPaqueteEClass = createEClass(MKJ_PAQUETE);
		createEAttribute(mkjPaqueteEClass, MKJ_PAQUETE__NOMBRE);
		createEAttribute(mkjPaqueteEClass, MKJ_PAQUETE__RUTA);
		createEReference(mkjPaqueteEClass, MKJ_PAQUETE__PAQUETES);
		createEReference(mkjPaqueteEClass, MKJ_PAQUETE__CLASES);

		mkjClaseEClass = createEClass(MKJ_CLASE);
		createEAttribute(mkjClaseEClass, MKJ_CLASE__NAME);
		createEReference(mkjClaseEClass, MKJ_CLASE__ATRIBUTOS);
		createEReference(mkjClaseEClass, MKJ_CLASE__METODOS);

		mkjAtributoEClass = createEClass(MKJ_ATRIBUTO);
		createEAttribute(mkjAtributoEClass, MKJ_ATRIBUTO__NAME);

		mkJmetodoEClass = createEClass(MK_JMETODO);
		createEAttribute(mkJmetodoEClass, MK_JMETODO__NAME);

		mkjRelacionEClass = createEClass(MKJ_RELACION);
		createEReference(mkjRelacionEClass, MKJ_RELACION__SOURCE);
		createEReference(mkjRelacionEClass, MKJ_RELACION__TARGET);
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
		initEClass(mkjDiagramaClasesEClass, MKJDiagramaClases.class, "MKJDiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJDiagramaClases_ListaClases(), this.getMKJClase(), null, "listaClases", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaRelaciones(), this.getMKJRelacion(), null, "listaRelaciones", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJDiagramaClases_ListaPaquetes(), this.getMKJPaquete(), null, "listaPaquetes", null, 0, -1, MKJDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjPaqueteEClass, MKJPaquete.class, "MKJPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMKJPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJPaquete_Paquetes(), this.getMKJPaquete(), null, "paquetes", null, 0, -1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJPaquete_Clases(), this.getMKJClase(), null, "clases", null, 0, -1, MKJPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjClaseEClass, MKJClase.class, "MKJClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJClase_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJClase_Atributos(), this.getMKJAtributo(), null, "atributos", null, 0, -1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJClase_Metodos(), this.getMKJmetodo(), null, "metodos", null, 0, -1, MKJClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjAtributoEClass, MKJAtributo.class, "MKJAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJAtributo_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkJmetodoEClass, MKJmetodo.class, "MKJmetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMKJmetodo_Name(), ecorePackage.getEString(), "name", null, 0, 1, MKJmetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mkjRelacionEClass, MKJRelacion.class, "MKJRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMKJRelacion_Source(), this.getMKJClase(), null, "source", null, 0, 1, MKJRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMKJRelacion_Target(), this.getMKJClase(), null, "target", null, 0, 1, MKJRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "label", "name"
		   });	
		addAnnotation
		  (mkJmetodoEClass, 
		   source, 
		   new String[] {
			 "label", "name"
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
		   });	
		addAnnotation
		  (getMKJClase_Metodos(), 
		   source, 
		   new String[] {
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
		  (mkjRelacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });
	}

} //ConcretaPackageImpl
