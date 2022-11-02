/**
 */
package bd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bd.BdFactory
 * @model kind="package"
 * @generated
 */
public interface BdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BdPackage eINSTANCE = bd.impl.BdPackageImpl.init();

	/**
	 * The meta object id for the '{@link bd.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.ModelFactoryImpl
	 * @see bd.impl.BdPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Lista Tablas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_TABLAS = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bd.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.SchemaImpl
	 * @see bd.impl.BdPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__USER = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>List Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LIST_TABLES = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link bd.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.TableImpl
	 * @see bd.impl.BdPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>List Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_INDEXES = 2;

	/**
	 * The feature id for the '<em><b>List Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>List Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COLUMNS = 4;

	/**
	 * The feature id for the '<em><b>List Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>List Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_TRIGGERS = 6;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link bd.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.IndexImpl
	 * @see bd.impl.BdPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bd.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.ColumnImpl
	 * @see bd.impl.BdPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NOT_NULL = 2;

	/**
	 * The feature id for the '<em><b>Unique Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__AUTO_INCREMENT = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link bd.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.RelationImpl
	 * @see bd.impl.BdPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicidad Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Table Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TABLE_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Table Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TABLE_TARGET = 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link bd.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.TriggerImpl
	 * @see bd.impl.BdPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Moment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MOMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link bd.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.PrimaryKeyImpl
	 * @see bd.impl.BdPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__AUTO_INCREMENT = 2;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link bd.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bd.impl.ForeignKeyImpl
	 * @see bd.impl.BdPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TYPE = COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NOT_NULL = COLUMN__NOT_NULL;

	/**
	 * The feature id for the '<em><b>Unique Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__UNIQUE_DATA = COLUMN__UNIQUE_DATA;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__AUTO_INCREMENT = COLUMN__AUTO_INCREMENT;

	/**
	 * The feature id for the '<em><b>Table Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TABLE_REFERENCED = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link bd.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see bd.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.ModelFactory#getLstSchema <em>Lst Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Schema</em>'.
	 * @see bd.ModelFactory#getLstSchema()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstSchema();

	/**
	 * Returns the meta object for the reference list '{@link bd.ModelFactory#getListaTablas <em>Lista Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Tablas</em>'.
	 * @see bd.ModelFactory#getListaTablas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaTablas();

	/**
	 * Returns the meta object for class '{@link bd.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see bd.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link bd.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.Schema#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see bd.Schema#getUser()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_User();

	/**
	 * Returns the meta object for the attribute '{@link bd.Schema#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see bd.Schema#getPassword()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Schema#getListTables <em>List Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Tables</em>'.
	 * @see bd.Schema#getListTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ListTables();

	/**
	 * Returns the meta object for class '{@link bd.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see bd.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link bd.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link bd.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see bd.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Table#getListIndexes <em>List Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Indexes</em>'.
	 * @see bd.Table#getListIndexes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListIndexes();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Table#getListRelations <em>List Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Relations</em>'.
	 * @see bd.Table#getListRelations()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Table#getListColumns <em>List Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Columns</em>'.
	 * @see bd.Table#getListColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Table#getListForeignKey <em>List Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Foreign Key</em>'.
	 * @see bd.Table#getListForeignKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link bd.Table#getListTriggers <em>List Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Triggers</em>'.
	 * @see bd.Table#getListTriggers()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListTriggers();

	/**
	 * Returns the meta object for class '{@link bd.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see bd.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link bd.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.Index#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bd.Index#getType()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Type();

	/**
	 * Returns the meta object for class '{@link bd.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see bd.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link bd.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bd.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link bd.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.Column#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see bd.Column#isNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link bd.Column#isUniqueData <em>Unique Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Data</em>'.
	 * @see bd.Column#isUniqueData()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_UniqueData();

	/**
	 * Returns the meta object for the attribute '{@link bd.Column#isAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see bd.Column#isAutoIncrement()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_AutoIncrement();

	/**
	 * Returns the meta object for class '{@link bd.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see bd.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link bd.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Source</em>'.
	 * @see bd.Relation#getMultiplicidadSource()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadSource();

	/**
	 * Returns the meta object for the attribute '{@link bd.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Target</em>'.
	 * @see bd.Relation#getMultiplicidadTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadTarget();

	/**
	 * Returns the meta object for the reference '{@link bd.Relation#getTableSource <em>Table Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Source</em>'.
	 * @see bd.Relation#getTableSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TableSource();

	/**
	 * Returns the meta object for the reference '{@link bd.Relation#getTableTarget <em>Table Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Target</em>'.
	 * @see bd.Relation#getTableTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TableTarget();

	/**
	 * Returns the meta object for class '{@link bd.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see bd.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link bd.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.Trigger#getMomentType <em>Moment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment Type</em>'.
	 * @see bd.Trigger#getMomentType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_MomentType();

	/**
	 * Returns the meta object for the attribute '{@link bd.Trigger#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see bd.Trigger#getActionType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ActionType();

	/**
	 * Returns the meta object for class '{@link bd.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see bd.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link bd.PrimaryKey#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bd.PrimaryKey#getType()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Type();

	/**
	 * Returns the meta object for the attribute '{@link bd.PrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bd.PrimaryKey#getName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link bd.PrimaryKey#isAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see bd.PrimaryKey#isAutoIncrement()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_AutoIncrement();

	/**
	 * Returns the meta object for class '{@link bd.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see bd.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link bd.ForeignKey#getTableReferenced <em>Table Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Referenced</em>'.
	 * @see bd.ForeignKey#getTableReferenced()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TableReferenced();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BdFactory getBdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bd.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.ModelFactoryImpl
		 * @see bd.impl.BdPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_SCHEMA = eINSTANCE.getModelFactory_LstSchema();

		/**
		 * The meta object literal for the '<em><b>Lista Tablas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_TABLAS = eINSTANCE.getModelFactory_ListaTablas();

		/**
		 * The meta object literal for the '{@link bd.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.SchemaImpl
		 * @see bd.impl.BdPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__USER = eINSTANCE.getSchema_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__PASSWORD = eINSTANCE.getSchema_Password();

		/**
		 * The meta object literal for the '<em><b>List Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LIST_TABLES = eINSTANCE.getSchema_ListTables();

		/**
		 * The meta object literal for the '{@link bd.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.TableImpl
		 * @see bd.impl.BdPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>List Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_INDEXES = eINSTANCE.getTable_ListIndexes();

		/**
		 * The meta object literal for the '<em><b>List Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_RELATIONS = eINSTANCE.getTable_ListRelations();

		/**
		 * The meta object literal for the '<em><b>List Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COLUMNS = eINSTANCE.getTable_ListColumns();

		/**
		 * The meta object literal for the '<em><b>List Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_FOREIGN_KEY = eINSTANCE.getTable_ListForeignKey();

		/**
		 * The meta object literal for the '<em><b>List Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_TRIGGERS = eINSTANCE.getTable_ListTriggers();

		/**
		 * The meta object literal for the '{@link bd.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.IndexImpl
		 * @see bd.impl.BdPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__TYPE = eINSTANCE.getIndex_Type();

		/**
		 * The meta object literal for the '{@link bd.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.ColumnImpl
		 * @see bd.impl.BdPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NOT_NULL = eINSTANCE.getColumn_NotNull();

		/**
		 * The meta object literal for the '<em><b>Unique Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UNIQUE_DATA = eINSTANCE.getColumn_UniqueData();

		/**
		 * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__AUTO_INCREMENT = eINSTANCE.getColumn_AutoIncrement();

		/**
		 * The meta object literal for the '{@link bd.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.RelationImpl
		 * @see bd.impl.BdPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_SOURCE = eINSTANCE.getRelation_MultiplicidadSource();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_TARGET = eINSTANCE.getRelation_MultiplicidadTarget();

		/**
		 * The meta object literal for the '<em><b>Table Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TABLE_SOURCE = eINSTANCE.getRelation_TableSource();

		/**
		 * The meta object literal for the '<em><b>Table Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TABLE_TARGET = eINSTANCE.getRelation_TableTarget();

		/**
		 * The meta object literal for the '{@link bd.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.TriggerImpl
		 * @see bd.impl.BdPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Moment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__MOMENT_TYPE = eINSTANCE.getTrigger_MomentType();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION_TYPE = eINSTANCE.getTrigger_ActionType();

		/**
		 * The meta object literal for the '{@link bd.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.PrimaryKeyImpl
		 * @see bd.impl.BdPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__TYPE = eINSTANCE.getPrimaryKey_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__NAME = eINSTANCE.getPrimaryKey_Name();

		/**
		 * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__AUTO_INCREMENT = eINSTANCE.getPrimaryKey_AutoIncrement();

		/**
		 * The meta object literal for the '{@link bd.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bd.impl.ForeignKeyImpl
		 * @see bd.impl.BdPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Table Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TABLE_REFERENCED = eINSTANCE.getForeignKey_TableReferenced();

	}

} //BdPackage
