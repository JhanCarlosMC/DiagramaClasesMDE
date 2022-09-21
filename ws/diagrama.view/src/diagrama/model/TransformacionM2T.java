package diagrama.model;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import abstracta.MKJAtributo;
import concreta.MKJAsociacion;
import concreta.MKJClase;
import concreta.MKJDiagramaClases;
import concreta.MKJPaquete;
import concreta.ModelFactory;

public class TransformacionM2T {

	private abstracta.ModelFactory modelFactoryAbstracta;
	StringBuilder textoCod = new StringBuilder();

	public TransformacionM2T(abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}

	public String transformarM2T() {
		String mensaje = "";
		String pathRaiz = "";

		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generación de código");
		pathRaiz = fd.open();

		for (abstracta.MKJClase mkjClase : modelFactoryAbstracta.getListaTodasLasClases()) {
			generarClase(mkjClase, textoCod);
			guardarArchivo(textoCod.toString(), pathRaiz + "/" + mkjClase.getRuta(), mkjClase.getNombre());
		}

		return "Se ha generado el codigo se su proyecto";
	}

	private void guardarArchivo(String cadena, String ruta, String nombre) {
		try {
			File archivo = new File(ruta);
			System.out.println("");
			if (archivo.exists() == false) {
				archivo.mkdirs();
			}
			FileWriter escribir = new FileWriter(archivo + "/" + nombre + ".py", false);
			escribir.write(cadena);
			escribir.close();
			textoCod = new StringBuilder();
		}

		catch (Exception e) {
			System.out.println("Error al Guardar");
		}
	}

	private void generarClase(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		textoCodigo.append("\n");

		agregarEncabezado(clase, textoCodigo);
		agregarConstructor(clase, textoCodigo);
		agregarMetodosSetyGet(clase, textoCodigo);
		agregarMetodos(clase, textoCodigo);
	}

	private void agregarMetodos(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < clase.getMetodos().size(); i++) {
			textoCodigo.append("\n	def " + clase.getMetodos().get(i).getNombre() + "(): \n");
			textoCodigo.append("        " + clase.getMetodos().get(i).getSemantics() + "\n");
			textoCodigo.append("		return null" + "\n");
		}
	}

	private void agregarMetodosSetyGet(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < clase.getAtributos().size(); i++) {
			textoCodigo.append("\n	def get" + clase.getAtributos().get(i).getNombre() + "(self): \n");
			textoCodigo.append("		return self." + clase.getAtributos().get(i).getNombre() + "\n");
		}
	}

	private void agregarConstructor(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		textoCodigo.append("	def __init__(self,");
		for (int i = 0; i < clase.getAtributos().size(); i++) {
			textoCodigo.append(clase.getAtributos().get(i).getNombre());
			if (i != clase.getAtributos().size() - 1) {
				textoCodigo.append(",");
			}
		}
		textoCodigo.append("): \n");

		for (int i = 0; i < clase.getAtributos().size(); i++) {
			textoCodigo.append("		self." + clase.getAtributos().get(i).getNombre() + "="
					+ clase.getAtributos().get(i).getNombre() + "\n");
		}

	}

	private void agregarEncabezado(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		if(clase.getHerencias().size() == 0)
			textoCodigo.append("class " + clase.getNombre() + ": \n\n");
		else if(clase.getHerencias().get(0).getSource() == clase) {
			textoCodigo.append("class " + clase.getNombre() + "("+ clase.getHerencias().get(0).getTarget().getNombre()+")" +": \n\n");
		}
	}
}
