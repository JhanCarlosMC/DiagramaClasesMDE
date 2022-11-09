package diagrama.model;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import bd.Schema;
import bd.Table;

public class TransformacionSQL {

	private bd.ModelFactory modelFactoryBD;
	StringBuilder textoSQL = new StringBuilder();

	public TransformacionSQL(bd.ModelFactory modelFactoryBD) {
		super();
		this.modelFactoryBD = modelFactoryBD;
	}

	public String transformarSQL() {
		String mensaje = "";
		String pathRaiz = "";

		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generación de código");
		pathRaiz = fd.open();

		for (bd.Schema schema : modelFactoryBD.getLstSchema()) {
			generarScript(schema, textoSQL);
			guardarArchivo(textoSQL.toString(), pathRaiz + "/");
		}

		return "Se ha generado el codigo se su proyecto";
	}

	private void guardarArchivo(String cadena, String ruta) {
		// TODO Auto-generated method stub
		try {
			File archivo = new File(ruta);
			System.out.println("");
			if (archivo.exists() == false) {
				archivo.mkdirs();
			}
			FileWriter escribir = new FileWriter(archivo + "/script.sql", false);
			escribir.write(cadena);
			escribir.close();
			textoSQL = new StringBuilder();
		}

		catch (Exception e) {
			System.out.println("Error al Guardar");
		}
	}

	private void generarScript(Schema schema, StringBuilder textoSQL2) {
		// TODO Auto-generated method stub
		textoSQL2.append("");

		agregarCreacionBD(schema, textoSQL2);
		agregarTables(schema, textoSQL2);
		agregarForeignKeys(schema, textoSQL2);
	}

	private void agregarCreacionBD(Schema schema, StringBuilder textoSQL2) {
		// TODO Auto-generated method stub
		textoSQL2.append("DROP DATABASE IF EXISTS " + schema.getName() + "; \n \n");
		textoSQL2.append("CREATE DATABASE " + schema.getName() + "\n \n");
		textoSQL2.append("USE " + schema.getName() + "\n \n");

	}

	private void agregarTables(Schema schema, StringBuilder textoSQL2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < schema.getListTables().size(); i++) {
			textoSQL2.append("CREATE TABLE " + schema.getListTables().get(i).getName() + "(\n");

			textoSQL2.append(schema.getListTables().get(i).getPrimaryKey().getName() + " "
					+ schema.getListTables().get(i).getPrimaryKey().getType() + " NOT NULL,\n");

			for (int j = 0; j < schema.getListTables().get(i).getListColumns().size(); j++) {
				textoSQL2.append(schema.getListTables().get(i).getListColumns().get(j).getName() + " "
						+ schema.getListTables().get(i).getListColumns().get(j).getType());

				if (schema.getListTables().get(i).getListColumns().get(j).isNotNull()) {
					textoSQL2.append(" NOT NULL");
				}

				if (schema.getListTables().get(i).getListColumns().get(j).isUniqueData()) {
					textoSQL2.append(" UNIQUE");
				}

				if (schema.getListTables().get(i).getListColumns().get(j).isAutoIncrement()) {
					textoSQL2.append(" AUTO INCREMENT");
				}

				textoSQL2.append(",\n");
			}

			if (schema.getListTables().get(i).getListForeignKey().size() > 0) {

				for (int j = 0; j < schema.getListTables().get(i).getListForeignKey().size(); j++) {

					textoSQL2.append(schema.getListTables().get(i).getListForeignKey().get(j).getName() + " "
							+ schema.getListTables().get(i).getListForeignKey().get(j).getType());

					if (schema.getListTables().get(i).getListForeignKey().get(j).isNotNull()) {
						textoSQL2.append(" NOT NULL");
					}

					if (schema.getListTables().get(i).getListForeignKey().get(j).isUniqueData()) {
						textoSQL2.append(" UNIQUE");
					}

					if (schema.getListTables().get(i).getListForeignKey().get(j).isAutoIncrement()) {
						textoSQL2.append(" AUTO INCREMENT");
					}
					textoSQL2.append(",\n");
				}
			}

			textoSQL2.append("PRIMARY KEY (" + schema.getListTables().get(i).getPrimaryKey().getName() + "));\n\n");
		}
	}

	public void agregarForeignKeys(Schema schema, StringBuilder textoSQL2) {

		for (int i = 0; i < schema.getListTables().size(); i++) {
			if (schema.getListTables().get(i).getListForeignKey().size() > 0) {

				for (int j = 0; j < schema.getListTables().get(i).getListForeignKey().size(); j++) {

					textoSQL2.append("ALTER TABLE " + schema.getListTables().get(i).getName() + "\n");
					textoSQL2
							.append("ADD CONSTRAINT FK_"
									+ schema.getListTables().get(i).getName() + "_" + schema.getListTables().get(i)
											.getListForeignKey().get(j).getTableReferenced().getPrimaryKey().getName()
									+ "\n");

					textoSQL2.append("FOREIGN KEY ("
							+ schema.getListTables().get(i).getListForeignKey().get(j).getTableReferenced()
									.getPrimaryKey().getName()
							+ ") REFERENCES "
							+ schema.getListTables().get(i).getListForeignKey().get(j).getTableReferenced().getName()
							+ "(" + schema.getListTables().get(i).getListForeignKey().get(j).getTableReferenced()
									.getPrimaryKey().getName()
							+ ");\n\n");

				}
			}
		}
	}
}