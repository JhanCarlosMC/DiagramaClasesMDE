package diagrama.model;

import java.util.Iterator;

import abstracta.AbstractaFactory;
import concreta.MKJAsociacion;
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
		modelFactoryAbstracta.getPaquetes().get(0).getClases().clear();
		modelFactoryAbstracta.getPaquetes().get(0).getPaquetes().clear();
		modelFactoryAbstracta.getListaTodasLasClases().clear();
		modelFactoryAbstracta.getListaTodosLosPaquetes().clear();

		for (MKJDiagramaClases diagramaConcreta : modelFactoryConcreta.getListaDiagramas()) {
			// Crear los paquetes
			for (MKJPaquete paquete : diagramaConcreta.getListaPaquetes()) {
				crearPaquete(paquete);
			}
			for (MKJClase clase : diagramaConcreta.getListaClases()) {
				crearClase(clase);
			}
			for (MKJAsociacion asociacion : diagramaConcreta.getListaAsociaciones()) {
				crearAsociacion(asociacion);
			}
			
		}

		return mensaje;
	}

	private void crearAsociacion(MKJAsociacion asociacion) {
		// TODO Auto-generated method stub
		MKJClase sourceConcreta = asociacion.getSource();
		MKJClase targetConcreta = asociacion.getTarget();
		
		abstracta.MKJClase sourceAbstracta = obtenerClaseAbstracta(sourceConcreta.getName(), sourceConcreta.getRuta());
		abstracta.MKJClase targetAbstracta = obtenerClaseAbstracta(targetConcreta.getName(), targetConcreta.getRuta());
		
		abstracta.MKJRelacion relacionSource = AbstractaFactory.eINSTANCE.createMHJAsociacion();
		relacionSource.setMultiplicidad1(asociacion.getMultiplicidad1());
		relacionSource.setMultiplicidad2(asociacion.getMultiplicidad2());
		relacionSource.setNavegabilidad1(asociacion.getNavegabilidad1());
		relacionSource.setNavegabilidad2(asociacion.getNavegabilidad2());
		relacionSource.setRol1(asociacion.getRol1());
		relacionSource.setRol2(asociacion.getRol2());
		
		sourceAbstracta.getRelaciones().add(relacionSource);
		
		abstracta.MKJRelacion relacionTarget = AbstractaFactory.eINSTANCE.createMHJAsociacion();
		relacionTarget.setMultiplicidad1(asociacion.getMultiplicidad2());
		relacionTarget.setMultiplicidad2(asociacion.getMultiplicidad1());
		relacionTarget.setNavegabilidad1(asociacion.getNavegabilidad2());
		relacionTarget.setNavegabilidad2(asociacion.getNavegabilidad1());
		relacionTarget.setRol1(asociacion.getRol2());
		relacionTarget.setRol2(asociacion.getRol1());
		
		targetAbstracta.getRelaciones().add(relacionTarget);
	}

	private void crearClase(MKJClase clase) {
		String ruta = clase.getRuta();
		String name = clase.getName();
		
		abstracta.MKJClase claseAbstracta = obtenerClaseAbstracta(name,ruta);
		if(claseAbstracta == null) {
			abstracta.MKJClase mkjClase= AbstractaFactory.eINSTANCE.createMKJClase();
			mkjClase.setName(clase.getName());
			mkjClase.setRuta(clase.getRuta());
			modelFactoryAbstracta.getListaTodasLasClases().add(mkjClase);
			
			abstracta.MKJPaquete paquetePadre = obtenerPaquete(ruta);
			paquetePadre.getClases().add(mkjClase);
		}
	}
	
	private abstracta.MKJPaquete obtenerPaquete(String ruta) {
		for (abstracta.MKJPaquete mkjPaquete : modelFactoryAbstracta.getListaTodosLosPaquetes()) {
			String rutaAux= mkjPaquete.getRuta() + mkjPaquete.getNombre()+"/";
			if (rutaAux.equals(ruta)) {
				return mkjPaquete;
			}
		}
		return null;
	}

	private abstracta.MKJClase obtenerClaseAbstracta(String name, String ruta) {

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

	private abstracta.MKJClase obtenerClasePaquete(abstracta.MKJPaquete mkjPaquete, String name, String ruta) {
		// TODO Auto-generated method stub
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
			modelFactoryAbstracta.getListaTodosLosPaquetes().add(nuevoPackage);
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
		modelFactoryAbstracta.getListaTodosLosPaquetes().add(nuevoPackage);
		return nuevoPackage;
	}
}
