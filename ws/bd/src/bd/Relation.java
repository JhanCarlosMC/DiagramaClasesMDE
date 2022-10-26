/**
 */
package bd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bd.Relation#getName <em>Name</em>}</li>
 *   <li>{@link bd.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}</li>
 *   <li>{@link bd.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}</li>
 *   <li>{@link bd.Relation#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link bd.Relation#getTableTarget <em>Table Target</em>}</li>
 * </ul>
 *
 * @see bd.BdPackage#getRelation()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Relation extends EObject {
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
	 * @see bd.BdPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bd.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Source</em>' attribute.
	 * @see #setMultiplicidadSource(String)
	 * @see bd.BdPackage#getRelation_MultiplicidadSource()
	 * @model
	 * @generated
	 */
	String getMultiplicidadSource();

	/**
	 * Sets the value of the '{@link bd.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Source</em>' attribute.
	 * @see #getMultiplicidadSource()
	 * @generated
	 */
	void setMultiplicidadSource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Target</em>' attribute.
	 * @see #setMultiplicidadTarget(String)
	 * @see bd.BdPackage#getRelation_MultiplicidadTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicidadTarget();

	/**
	 * Sets the value of the '{@link bd.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Target</em>' attribute.
	 * @see #getMultiplicidadTarget()
	 * @generated
	 */
	void setMultiplicidadTarget(String value);

	/**
	 * Returns the value of the '<em><b>Table Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Source</em>' reference.
	 * @see #setTableSource(Table)
	 * @see bd.BdPackage#getRelation_TableSource()
	 * @model
	 * @generated
	 */
	Table getTableSource();

	/**
	 * Sets the value of the '{@link bd.Relation#getTableSource <em>Table Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Source</em>' reference.
	 * @see #getTableSource()
	 * @generated
	 */
	void setTableSource(Table value);

	/**
	 * Returns the value of the '<em><b>Table Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Target</em>' reference.
	 * @see #setTableTarget(Table)
	 * @see bd.BdPackage#getRelation_TableTarget()
	 * @model
	 * @generated
	 */
	Table getTableTarget();

	/**
	 * Sets the value of the '{@link bd.Relation#getTableTarget <em>Table Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Target</em>' reference.
	 * @see #getTableTarget()
	 * @generated
	 */
	void setTableTarget(Table value);

} // Relation
