/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.MKJMetodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.MKJMetodo#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link abstracta.MKJMetodo#getListaParametros <em>Lista Parametros</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMKJMetodo()
 * @model
 * @generated
 */
public interface MKJMetodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see abstracta.AbstractaPackage#getMKJMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.MKJMetodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' attribute.
	 * @see #setSemantics(String)
	 * @see abstracta.AbstractaPackage#getMKJMetodo_Semantics()
	 * @model
	 * @generated
	 */
	String getSemantics();

	/**
	 * Sets the value of the '{@link abstracta.MKJMetodo#getSemantics <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' attribute.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(String value);

	/**
	 * Returns the value of the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Parametros</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJMetodo_ListaParametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAtributo> getListaParametros();

} // MKJMetodo
