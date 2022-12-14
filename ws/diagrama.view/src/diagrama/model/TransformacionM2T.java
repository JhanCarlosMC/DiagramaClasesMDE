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

	public TransformacionM2T(abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}

	public String transformarM2T() {
		String mensaje = "";
		String pathRaiz = "";
	
		StringBuilder textoCod = new StringBuilder();
		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generaci?n de c?digo");
		pathRaiz = fd.open();
		
		for (abstracta.MKJClase mkjClase : modelFactoryAbstracta.getListaTodasLasClases()) {
			generarClase(mkjClase, textoCod);
			guardarArchivo(textoCod.toString(), pathRaiz + "/" + mkjClase.getRuta(), mkjClase.getName());
		}
		
		return "Se ha generado el codigo se su proyecto";
	}
	
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try
		{	
			File archivo=new File(ruta);
			System.out.println("");
			if(archivo.exists() == false) {
				archivo.mkdirs();
			}
			FileWriter escribir=new FileWriter(archivo+"/"+nombre,true);
			escribir.write(cadena);
			escribir.close();
		}

		catch(Exception e)
		{
			System.out.println("Error al Guardar");
		}
	}

	private void generarClase(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		textoCodigo.append("package " + clase.getRuta() + ";\n\n");
		
		agregarEncabezado(clase, textoCodigo);
		agregarConstructor(clase, textoCodigo);
		agregarMetodosSetyGet(clase, textoCodigo);
		agregarAtributos(clase, textoCodigo);
	}

	private void agregarMetodosSetyGet(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		
	}

	private void agregarAtributos(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		for(MKJAtributo atributo: clase.getAtributos()) {
			textoCodigo.append("");
		}
	}

	private void agregarConstructor(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		textoCodigo.append("def __init__(self,");
		for(int i =0; i< clase.getAtributos().size(); i++) {
			textoCodigo.append(clase.getAtributos().get(i).getNombre());
			if(i != clase.getAtributos().size()-1) {
				textoCodigo.append(",");
			}
		}
		textoCodigo.append("): \n");
		
		for(int i =0; i< clase.getAtributos().size(); i++) {
			textoCodigo.append("	self."+clase.getAtributos().get(i).getNombre()+ "=" + clase.getAtributos().get(i).getNombre());
		}
		
	}

	private void agregarEncabezado(abstracta.MKJClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		textoCodigo.append("class " + clase.getName() + ": \n\n");
	}
}
