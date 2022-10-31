package diagrama.model;

import abstracta.ModelFactory;
import bd.BdFactory;
import bd.Table;
import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJClase;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.MKJPaquete;

public class TransformacionRelacional {
	private abstracta.ModelFactory modelFactoryAbstracta;
	private bd.ModelFactory modelFactoryBd;
	
	public TransformacionRelacional(abstracta.ModelFactory modelFactoryAbstracta, bd.ModelFactory modelFactoryBd) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactoryBd = modelFactoryBd;
	}

	public String transformarAbstractaToRelacional() {
		if (modelFactoryBd.getLstSchema().size() !=0) {
			System.out.println("Entroooooooooooo");
			modelFactoryBd.getLstSchema().get(0).getListTables().clear();
			modelFactoryBd.getLstSchema().clear();
		}
		bd.Schema esquemaNuevo = BdFactory.eINSTANCE.createSchema();
		modelFactoryBd.getLstSchema().add(esquemaNuevo);
		System.out.println("Se creo el esquema");
		for (abstracta.MKJClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
			// Crear los paquetes
			System.out.println("Generando transformación");
			crearTable(clase, esquemaNuevo);
		}
		return "Se ha realizado la transofrmación";
	}

	private void crearTable(abstracta.MKJClase clase, bd.Schema esquemaNuevo) {
		// TODO Auto-generated method stub
		String ruta = clase.getRuta();
		String name = clase.getNombre();
		System.out.println("Creando tablas");

		bd.Table tablaNueva = BdFactory.eINSTANCE.createTable();
		tablaNueva.setName(name);
		esquemaNuevo.getListTables().add(tablaNueva);
		System.out.println("tabla " + tablaNueva.getName() + " creada");
		if(clase.getAtributos().size() > 0) {
			crearColumnas(clase, tablaNueva);
		}
	}
	
	private void crearColumnas(abstracta.MKJClase clase, Table tablaNueva) {
		// TODO Auto-generated method stub
		System.out.println("Creando tablas");
		for(abstracta.MKJAtributo atributo: clase.getAtributos()) {
			if(atributo.isPrimaryKey()) {
				bd.PrimaryKey clavePrimaria = BdFactory.eINSTANCE.createPrimaryKey();
				clavePrimaria.setName(atributo.getNombre());
				clavePrimaria.setType("INT");
				clavePrimaria.setAutoIncrement(true);
				tablaNueva.setPrimaryKey(clavePrimaria);
				System.out.println("columna " + clavePrimaria.getName() + " creada");
			}else if(atributo.isForeignKey()) {
				bd.ForeignKey claveForanea = BdFactory.eINSTANCE.createForeignKey();
				claveForanea.setName(atributo.getNombre());
				tablaNueva.getListForeignKey().add(claveForanea);
				System.out.println("columna " + claveForanea.getName() + " creada");
			}else {
				bd.Column columnaNueva = BdFactory.eINSTANCE.createColumn();
				columnaNueva.setName(atributo.getNombre());
				tablaNueva.getListColumns().add(columnaNueva);
				System.out.println("tabla " +columnaNueva.getName() + " creada");
			}
		}
		
	}


	private abstracta.MKJClase obtenerClaseAbstracta(String name, String ruta) {

		abstracta.MKJPaquete mkjPaquete = modelFactoryAbstracta.getPaquetes().get(0);

		for (abstracta.MKJClase mkjClase : mkjPaquete.getClases()) {
			if (mkjClase.getNombre().equals(name)) {
				return mkjClase;
			}
		}
		for (abstracta.MKJPaquete mkjPaquete2 : mkjPaquete.getPaquetes()) {
			abstracta.MKJClase mkjClase = obtenerClasePaquete(mkjPaquete2, name, ruta);
			if (mkjClase != null) {
				return mkjClase;
			}
		}
		return null;
	}
	private abstracta.MKJClase obtenerClasePaquete(abstracta.MKJPaquete mkjPaquete, String name, String ruta) {
		// TODO Auto-generated method stub
		for (abstracta.MKJClase mkjClase : mkjPaquete.getClases()) {
			if (mkjClase.getNombre().equals(name)) {
				return mkjClase;
			}
		}
		for (abstracta.MKJPaquete mkjPaquete2 : mkjPaquete.getPaquetes()) {
			abstracta.MKJClase mkjClase = obtenerClasePaquete(mkjPaquete2, name, ruta);
			if (mkjClase != null) {
				return mkjClase;
			}
		}
		return null;
	}

}
