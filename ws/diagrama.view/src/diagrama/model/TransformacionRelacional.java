package diagrama.model;

import abstracta.MKJAtributo;
import abstracta.MKJRelacion;
import abstracta.ModelFactory;
import bd.BdFactory;
import bd.Column;
import bd.ForeignKey;
import bd.PrimaryKey;
import bd.Relation;
import bd.Schema;
import bd.Table;

public class TransformacionRelacional {
	private abstracta.ModelFactory modelFactoryAbstracta;
	private bd.ModelFactory modelFactoryBd;
	// private bd.Schema esquemaNuevo;

	public TransformacionRelacional(abstracta.ModelFactory modelFactoryAbstracta, bd.ModelFactory modelFactoryBd) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactoryBd = modelFactoryBd;
	}

	public String transformarAbstractaToRelacional() {
		if (modelFactoryBd.getLstSchema().size() != 0) {
			modelFactoryBd.getLstSchema().get(0).getListTables().clear();
			modelFactoryBd.getLstSchema().clear();
		}

		Schema esquemaNuevo = BdFactory.eINSTANCE.createSchema();
		modelFactoryBd.getLstSchema().add(esquemaNuevo);
		esquemaNuevo.setName(modelFactoryAbstracta.getPaquetes().get(0).getNombre());
		
		System.out.println("Se creo el esquema");
		
		for (abstracta.MKJClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
			System.out.println("Generando transformación");
			crearTable(clase, esquemaNuevo);
		}

		for (abstracta.MKJClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {
			if (clase.getAtributos().size() > 0) {
				for (abstracta.MKJAtributo atributo : clase.getAtributos()) {
					crearAtributos(clase.getNombre(), esquemaNuevo, atributo);
				}
			}
		}

		// Comprobar si hay herencia entre dos clases
		for (abstracta.MKJClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {

			crearHerencia(clase, esquemaNuevo);
		}

		// Crear relaciones
		// for (abstracta.MKJClase clase :
		// modelFactoryAbstracta.getListaTodasLasClases()) {
		//
		// crearRelacion(clase, esquemaNuevo);
		// }

		// Crear llaves foraneas
		for (abstracta.MKJClase clase : modelFactoryAbstracta.getListaTodasLasClases()) {

			crearForeignKeys(clase, esquemaNuevo);
		}

		return "Se ha realizado la transformación";
	}

	private void crearHerencia(abstracta.MKJClase clase, Schema esquemaNuevo) {
		// TODO Auto-generated method stub

		for (abstracta.MKJHerencia herencia : clase.getHerencias()) {

			Table tableSource = obtenerTabla(herencia.getSource().getNombre(), esquemaNuevo);
			Table tableTarget = obtenerTabla(herencia.getTarget().getNombre(), esquemaNuevo);

			if (tableSource != null && tableTarget != null) {

				if (tableSource.getPrimaryKey() == null && tableTarget.getPrimaryKey() == null) {

					PrimaryKey pk = BdFactory.eINSTANCE.createPrimaryKey();
					pk.setName(tableTarget.getPrimaryKey().getName());
					pk.setAutoIncrement(tableTarget.getPrimaryKey().isAutoIncrement());
					pk.setType(tableTarget.getPrimaryKey().getType());
					tableSource.setPrimaryKey(pk);
				}

				for (Column column : tableTarget.getListColumns()) {

					Column newColumn = BdFactory.eINSTANCE.createColumn();
					newColumn.setName(column.getName());
					newColumn.setAutoIncrement(column.isAutoIncrement());
					newColumn.setType(column.getType());
					
					for(int x = 0; x < tableSource.getListColumns().size(); x++) {
						if(tableSource.getListColumns().get(x) == (newColumn)) {
							
						}else {
							tableSource.getListColumns().add(newColumn);
						}
					}
//					tableSource.getListColumns().add(newColumn);
				}

			}

		}
	}

	private void crearForeignKeys(abstracta.MKJClase clase, Schema esquemaNuevo) {
		// TODO Auto-generated method stub
		if (clase.getRelaciones().size() > 0) {
			for (abstracta.MKJRelacion relacion : clase.getRelaciones()) {
				Table tableTarget = obtenerTabla(relacion.getTarget().getNombre(), esquemaNuevo);
				Table tableSource = obtenerTabla(relacion.getSource().getNombre(), esquemaNuevo);
				if (relacion.getMultiplicidad1().equals("1")) {
					bd.ForeignKey claveForanea = BdFactory.eINSTANCE.createForeignKey();

					for (abstracta.MKJAtributo atributo : relacion.getTarget().getAtributos()) {

						if (atributo.isPrimaryKey()) {
							claveForanea.setName(atributo.getNombre());
							// claveForanea.setType(atributo.getType());
							claveForanea.setAutoIncrement(atributo.isAutoIncrement());
							claveForanea.setTableReferenced(tableTarget);
							if (atributo.getType().toLowerCase().equals("string")
									|| atributo.getType().toLowerCase().equals("varchar")) {

								claveForanea.setType("varchar(60)");

							} else if (atributo.getType().toLowerCase().equals("int")) {

								claveForanea.setType("integer");
							} else {

								claveForanea.setType(atributo.getType());
							}
						}
					}

					tableSource.getListForeignKey().add(claveForanea);
				}

				if (tableSource != null && tableTarget != null) {
					if (relacion.getMultiplicidad1() != null && relacion.getMultiplicidad2() != null
							&& relacion.getMultiplicidad1().equals("*") && relacion.getMultiplicidad2().equals("*")) {

						// Se crea la tabla intermedia en caso de que la relacion sea de muchos a muchos
						crearTablaIntermedia(tableSource, tableTarget, esquemaNuevo);
					}
				}
			}
		}
	}

	private void crearRelacion(abstracta.MKJClase clase, Schema esquemaNuevo) {
		// TODO Auto-generated method stub
		Relation newRelation = BdFactory.eINSTANCE.createRelation();

		for (MKJRelacion relacion : clase.getRelaciones()) {

			Table source = obtenerTabla(relacion.getSource().getNombre(), esquemaNuevo);
			Table target = obtenerTabla(relacion.getTarget().getNombre(), esquemaNuevo);

			if (source != null && target != null) {
				if (relacion.getMultiplicidad1() != null && relacion.getMultiplicidad2() != null
						&& relacion.getMultiplicidad1().equals("*") && relacion.getMultiplicidad2().equals("*")) {

					// Se crea la tabla intermedia en caso de que la relacion sea de muchos a muchos
					String tableName = crearTablaIntermedia(source, target, esquemaNuevo);

					if (!tableName.equals("")) {

						Table tablaIntermedia = obtenerTabla(tableName, esquemaNuevo);
						Relation relation = BdFactory.eINSTANCE.createRelation();
						relation.setName(tablaIntermedia.getName() + "_" + source.getName());
						relation.setMultiplicidadSource("*");
						relation.setMultiplicidadTarget("1");
						relation.setTableSource(tablaIntermedia);
						relation.setTableTarget(source);

						tablaIntermedia.getListRelations().add(relation);

						Relation relation2 = BdFactory.eINSTANCE.createRelation();
						relation2.setName(tablaIntermedia.getName() + "_" + source.getName());
						relation2.setMultiplicidadSource("1");
						relation2.setMultiplicidadTarget("*");
						relation2.setTableSource(source);
						relation2.setTableTarget(tablaIntermedia);

						source.getListRelations().add(relation2);

						Relation relation3 = BdFactory.eINSTANCE.createRelation();
						relation3.setName(tablaIntermedia.getName() + "_" + target.getName());
						relation3.setMultiplicidadSource("*");
						relation3.setMultiplicidadTarget("1");
						relation3.setTableSource(tablaIntermedia);
						relation3.setTableTarget(target);

						tablaIntermedia.getListRelations().add(relation3);

						Relation relation4 = BdFactory.eINSTANCE.createRelation();
						relation3.setName(tablaIntermedia.getName() + "_" + target.getName());
						relation4.setMultiplicidadSource("1");
						relation4.setMultiplicidadTarget("*");
						relation4.setTableSource(target);
						relation4.setTableTarget(tablaIntermedia);

						target.getListRelations().add(relation4);
					}
				} else {

					if (relacion.getMultiplicidad1().equals("1")) {
						newRelation.setName(relacion.getRol1() + "_qq" + relacion.getRol2());
						newRelation.setTableSource(source);
						newRelation.setTableTarget(target);
						newRelation.setMultiplicidadSource(relacion.getMultiplicidad1());
						newRelation.setMultiplicidadTarget(relacion.getMultiplicidad2());
						target.getListRelations().add(newRelation);
						System.out.println(source.getName());
						System.out.println(target.getName());
					}

					if (relacion.getMultiplicidad1().equals("*")) {
						newRelation.setName(relacion.getRol1() + "_ddd" + relacion.getRol2());
						newRelation.setTableSource(source);
						newRelation.setTableTarget(target);
						newRelation.setMultiplicidadSource(relacion.getMultiplicidad1());
						newRelation.setMultiplicidadTarget(relacion.getMultiplicidad2());
						source.getListRelations().add(newRelation);
						System.out.println(source.getName());
						System.out.println(target.getName());
					}

				}

			}
		}
	}

	private String crearTablaIntermedia(Table source, Table target, Schema esquemaNuevo) {
		// TODO Auto-generated method stub
		PrimaryKey keySource = source.getPrimaryKey();
		PrimaryKey keyTarget = target.getPrimaryKey();

		String nombre1 = source.getName() + "_" + target.getName();
		String nombre2 = target.getName() + "_" + source.getName();

		Table table = obtenerTabla(nombre1, esquemaNuevo);

		if (table == null) {

			table = obtenerTabla(nombre2, esquemaNuevo);

			if (table == null) {

				table = BdFactory.eINSTANCE.createTable();
				table.setName(nombre1);

				PrimaryKey pk = BdFactory.eINSTANCE.createPrimaryKey();
				pk.setName("id");
				pk.setAutoIncrement(false);
				pk.setType("integer");
				// pk.setTableName(nombre1);
				table.setPrimaryKey(pk);

				ForeignKey fks = BdFactory.eINSTANCE.createForeignKey();
				fks.setName(keySource.getName());
				fks.setType(keySource.getType());
				fks.setAutoIncrement(keySource.isAutoIncrement());
				fks.setNotNull(true);
				fks.setTableReferenced(obtenerTabla(source.getName(), esquemaNuevo));
				// fks.setPrimaryKey(keySource);

				ForeignKey fkt = BdFactory.eINSTANCE.createForeignKey();
				fkt.setName(keyTarget.getName());
				fkt.setType(keyTarget.getType());
				fkt.setAutoIncrement(keyTarget.isAutoIncrement());
				fkt.setNotNull(true);
				fkt.setTableReferenced(obtenerTabla(target.getName(), esquemaNuevo));
				// fkt.setPrimaryKey(keyTarget);

				table.getListForeignKey().add(fks);
				table.getListForeignKey().add(fkt);

				modelFactoryBd.getLstSchema().get(0).getListTables().add(table);
				modelFactoryBd.getListaTablas().add(table);

				return nombre1;
			}
		}

		return "";

	}

	private void crearAtributos(String nombre, Schema esquemaNuevo, MKJAtributo atributo) {
		// TODO Auto-generated method stub
		Table tabla = obtenerTabla(nombre, esquemaNuevo);

		if (tabla != null) {

			if (atributo.isPrimaryKey()) {

				// Se crea la llave primaria en caso de que el atributo sea una llave primaria
				PrimaryKey primaryKeyTabla = crearPrimaryKey(atributo, tabla.getName());

				tabla.setPrimaryKey(primaryKeyTabla);
			} else {

				if (!atributo.isForeignKey()) {

					Column newColumn = BdFactory.eINSTANCE.createColumn();

					newColumn.setName(atributo.getNombre());
					newColumn.setNotNull(atributo.isNotNull());
					newColumn.setAutoIncrement(atributo.isAutoIncrement());
					newColumn.setUniqueData(atributo.isUniqueData());

					if (atributo.getType().equals("String") || atributo.getType().toLowerCase().equals("varchar")) {
						newColumn.setType("varchar(150)");

					} else if (atributo.getType().equals("Int")) {
						newColumn.setType("integer");

					} else {
						newColumn.setType(atributo.getType());
					}

					tabla.getListColumns().add(newColumn);
				}
			}
		}
	}

	private PrimaryKey crearPrimaryKey(MKJAtributo atributo, String name) {
		// TODO Auto-generated method stub
		PrimaryKey primaryKey = BdFactory.eINSTANCE.createPrimaryKey();

		primaryKey.setName(atributo.getNombre());
		primaryKey.setAutoIncrement(atributo.isAutoIncrement());

		if (atributo.getType().equals("String") || atributo.getType().toLowerCase().equals("varchar")) {

			primaryKey.setType("varchar(10)");
		} else if (atributo.getType().equals("Int")) {

			primaryKey.setType("integer");
		} else {

			primaryKey.setType(atributo.getType());
		}

		return primaryKey;
	}

	private void crearTable(abstracta.MKJClase clase, bd.Schema esquemaNuevo) {

		Table newTable = obtenerTabla(clase.getNombre(), esquemaNuevo);

		if (newTable == null) {
			newTable = BdFactory.eINSTANCE.createTable();
			newTable.setName(clase.getNombre());
			modelFactoryBd.getLstSchema().get(0).getListTables().add(newTable);
			modelFactoryBd.getListaTablas().add(newTable);
		}
	}

	private Table obtenerTabla(String nombre, Schema esquemaNuevo) {
		// TODO Auto-generated method stub

		if (esquemaNuevo != null) {

			for (Table table : esquemaNuevo.getListTables()) {

				if (table.getName().equals(nombre)) {

					return table;
				}
			}
		}

		return null;
	}
}
