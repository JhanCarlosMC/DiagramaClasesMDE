/**
 */
package bd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bd.Table#getName <em>Name</em>}</li>
 *   <li>{@link bd.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link bd.Table#getListIndexes <em>List Indexes</em>}</li>
 *   <li>{@link bd.Table#getListRelations <em>List Relations</em>}</li>
 *   <li>{@link bd.Table#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link bd.Table#getListForeignKey <em>List Foreign Key</em>}</li>
 *   <li>{@link bd.Table#getListTriggers <em>List Triggers</em>}</li>
 * </ul>
 *
 * @see bd.BdPackage#getTable()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bd.BdPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bd.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see bd.BdPackage#getTable_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link bd.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>List Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link bd.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Indexes</em>' containment reference list.
	 * @see bd.BdPackage#getTable_ListIndexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getListIndexes();

	/**
	 * Returns the value of the '<em><b>List Relations</b></em>' containment reference list.
	 * The list contents are of type {@link bd.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relations</em>' containment reference list.
	 * @see bd.BdPackage#getTable_ListRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getListRelations();

	/**
	 * Returns the value of the '<em><b>List Columns</b></em>' containment reference list.
	 * The list contents are of type {@link bd.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Columns</em>' containment reference list.
	 * @see bd.BdPackage#getTable_ListColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getListColumns();

	/**
	 * Returns the value of the '<em><b>List Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link bd.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Foreign Key</em>' containment reference list.
	 * @see bd.BdPackage#getTable_ListForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getListForeignKey();

	/**
	 * Returns the value of the '<em><b>List Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link bd.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Triggers</em>' containment reference list.
	 * @see bd.BdPackage#getTable_ListTriggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getListTriggers();

} // Table
