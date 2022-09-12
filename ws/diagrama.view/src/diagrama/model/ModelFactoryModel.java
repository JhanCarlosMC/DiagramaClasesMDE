package diagrama.model;

import java.util.ArrayList;

import concreta.*;

public class ModelFactoryModel {

	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
	ModelFactory modelFactory = ConcretaFactory.eINSTANCE.createModelFactory();
	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;

	public ModelFactoryModel() {
		// TODO Auto-generated constructor stub

		ModelFactory tempModelFactory = modelFactory;

		//modelFactory = cargar();

		if ( modelFactory == null ){
			modelFactory = tempModelFactory;

		}
	}

	public ModelFactory cargarConcreta() {
		ModelFactory modelFactory = null;

		ConcretaPackage whoownmePackage =  ConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		//EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		//1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		//QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.concreta");

		//2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");

		//3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
	}
	
	public abstracta.ModelFactory cargarAbstracta() {
		abstracta.ModelFactory modelFactory = null;

		ConcretaPackage whoownmePackage =  ConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		//EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		//1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		//QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.abstracta");

		//2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");

		//3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracta.ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
	}
	
	public void generarM2M() {
		// TODO Auto-generated method stub
		//ModelFactory modelFactory = cargar();
		modelFactoryConcreta = cargarConcreta();
		modelFactoryAbstracta = cargarAbstracta(); 
		
		//crear paquetes 
		
		for(MKJDiagramaClases diagrama : modelFactoryConcreta.getListaDiagramas()) {
			for(MKJPaquete paquete : diagrama.getListaPaquetes()) {
				crearPaquete(paquete);
			}
		}
		
		//Imprimir las clases creadas por un usuario de cada diagrama
		for (MKJDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			System.out.println("Diagrama de clases: " +diagrama.getNombre());
			for (MKJClase clase : diagrama.getListaClases()) {
				System.out.println("Nombre de la clase: " + clase.getName());
			}
			System.out.println("\n");
		}
		
		//imprimir las relaciones salientes de una clase
		
		MKJClase claseEmpresa = obtenerClase("Empleado");
		
		ArrayList<Object> listaRelaciones = new ArrayList<>();
		
		listaRelaciones.add(obtenerRelacionesSalientes(claseEmpresa.getName()));
	}
	private void crearPaquete(MKJPaquete paquete) {
		// TODO Auto-generated method stub
		String ruta = paquete.getRuta();
		String[] split = ruta.split("/");
		
		for(int i =0; i< split.length; i++) {
			String nombrePaquete = split[0];
			MKJPaquete paqueteAux = obtenerPaquete(nombrePaquete);
			if(paqueteAux != null) {
				//crearPaquete
			}
		}
	}

	private MKJPaquete obtenerPaquete(String nombrePaquete) {
		// TODO Auto-generated method stub

		return null;
	}



	
	private ArrayList<Object> obtenerRelacionesSalientes(String nombreClase){
		System.out.println("Nombre clase: " + nombreClase);
		
		ArrayList<Object> listaRelaciones = new ArrayList<>();
		
		for(MKJDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			for(MKJAgregacion agregacion : diagrama.getListaAgregaciones()) {
				if(agregacion.getSource().getName().equals(nombreClase)) {
					listaRelaciones.add(agregacion);
					System.out.println("Relacion agregacion saliente con: " + agregacion.getSource().getName());
				}
			}
			for(MKJConteinment containtment : diagrama.getListaConteiments()) {
				if(containtment.getSource().getName().equals(nombreClase)) {
					listaRelaciones.add(containtment);
					System.out.println("Relacion containtment saliente con: " + containtment.getSource().getName());
				}
			}
			for(MKJHerencia herencia: diagrama.getListaHerencias()) {
				if(herencia.getSource().getName().equals(nombreClase)) {
					listaRelaciones.add(herencia);
					System.out.println("Relacion herencia saliente con: " + herencia.getSource().getName());
				}
			}
			for(MKJInterface mkjinterface : diagrama.getListaInterfaces()) {
				if(mkjinterface.getSource().getName().equals(nombreClase)) {
					listaRelaciones.add(mkjinterface);
					System.out.println("Relacion interface saliente con: " + mkjinterface.getSource().getName());
				}
			}
			for(MKJAsociacion asociacion : diagrama.getListaAsociaciones()) {
				if(asociacion.getSource().getName().equals(nombreClase)) {
					listaRelaciones.add(asociacion);
					System.out.println("Relacion asociacion saliente con: " + asociacion.getSource().getName());
				}
			}
		}
		return listaRelaciones;
		
	}
	private MKJClase obtenerClase(String name) {
		MKJClase clase = null;
		
		for (MKJDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			for(MKJClase mkjclase : diagrama.getListaClases()) {
				if(mkjclase.getName().equals(name)) {
					return mkjclase;
				}
			}
		}
		return clase;
				
	}


}

