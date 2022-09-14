package diagrama.model;

import java.util.Iterator;

import abstracta.AbstractaFactory;
import concreta.MKJClase;
import concreta.MKJDiagramaClases;
import concreta.MKJPaquete;
import concreta.ModelFactory;

public class TransformacionM2M {

	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;

	public TransformacionM2M(ModelFactory modelFactoryConcreta, abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryConcreta = modelFactoryConcreta;
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}

	public String transformarM2M() {
		String mensaje = "Se ha realizado la transformacion M2M";

		for (MKJDiagramaClases diagramaConcreta : modelFactoryConcreta.getListaDiagramas()) {

			// Crear los paquetes
			for (MKJPaquete paquete : diagramaConcreta.getListaPaquetes()) {
				crearPaquete(paquete);
			}
			for (MKJClase clase : diagramaConcreta.getListaClases()) {
				crearClase(clase);
			}
		}

		return mensaje;
	}

	private void crearClase(MKJClase clase) {
		String ruta = clase.getRuta();
		String name = clase.getName();
		
		abstracta.MKJClase claseAbstracta = obtenerClaseAbstracta(name,ruta);
		if(claseAbstracta == null) {
			abstracta.MKJClase mkjClase= AbstractaFactory.eINSTANCE.createMKJClase();
			mkjClase.setName(clase.getName());
			mkjClase.setRuta(clase.getRuta());
		}
	}
	
	private abstracta.MKJClase obtenerClaseAbstracta(String name, String ruta) {
		// TODO Auto-generated method stub
		abstracta.MKJPaquete mkjPaquete = modelFactoryAbstracta.getPaquetes().get(0);
		for (abstracta.MKJClase mkjClase : mkjPaquete.getClases()) {
			if(mkjClase.getName().equals(name)) {
				return mkjClase;
			}
		}
		for (abstracta.MKJPaquete mkjPaquete2 : mkjPaquete.getPaquetes()) {
			abstracta.MKJClase mkjClase = obtenerClasePaquete(mkjPaquete2, name, ruta);
			if(mkjClase != null) {
				return mkjClase;
			}
		}
		return null;
	}

	private abstracta.MKJClase obtenerClasePaquete(abstracta.MKJPaquete mkjPaquete2, String name, String ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	private void crearPaquete(MKJPaquete paquete) {

		String ruta = paquete.getRuta()+ paquete.getNombre();
		String[] split = ruta.split("/");
		abstracta.MKJPaquete paqueteParent = null;

		String nuevaRuta = "";
		for (int i = 0; i < split.length; i++) {
			String rutaNombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(rutaNombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i] + "/";
		}
	}

	private abstracta.MKJPaquete obtenerPaqueteAbstracta(String nombrePaquete, String nuevaRuta,
			abstracta.MKJPaquete paqueteParent) {

		if (paqueteParent == null) {
			for (int i = 0; i < modelFactoryAbstracta.getPaquetes().size(); i++) {
				if (modelFactoryAbstracta.getPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					return modelFactoryAbstracta.getPaquetes().get(i);
				}
			}
			abstracta.MKJPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMKJPaquete();
			nuevoPackage.setNombre(nombrePaquete);
			nuevoPackage.setRuta(nuevaRuta);
			modelFactoryAbstracta.getPaquetes().add(nuevoPackage);
			return nuevoPackage;

		} else {
			for (int i = 0; i < paqueteParent.getPaquetes().size(); i++) {
				if (paqueteParent.getPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					if (paqueteParent.getPaquetes().get(i).getRuta().equals(nuevaRuta)) {
						return paqueteParent.getPaquetes().get(i);
					}
				}
			}
		}

		abstracta.MKJPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMKJPaquete();
		nuevoPackage.setNombre(nombrePaquete);
		nuevoPackage.setRuta(nuevaRuta);
		paqueteParent.getPaquetes().add(nuevoPackage);
		return nuevoPackage;
	}
}
