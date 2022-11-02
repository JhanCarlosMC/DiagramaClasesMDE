/**
 */
package bd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bd.ModelFactory#getLstSchema <em>Lst Schema</em>}</li>
 *   <li>{@link bd.ModelFactory#getListaTablas <em>Lista Tablas</em>}</li>
 * </ul>
 *
 * @see bd.BdPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Schema</b></em>' containment reference list.
	 * The list contents are of type {@link bd.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Schema</em>' containment reference list.
	 * @see bd.BdPackage#getModelFactory_LstSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getLstSchema();

	/**
	 * Returns the value of the '<em><b>Lista Tablas</b></em>' reference list.
	 * The list contents are of type {@link bd.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Tablas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Tablas</em>' reference list.
	 * @see bd.BdPackage#getModelFactory_ListaTablas()
	 * @model
	 * @generated
	 */
	EList<Table> getListaTablas();

} // ModelFactory
