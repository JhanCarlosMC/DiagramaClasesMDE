/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.MKJClase#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.MKJClase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link abstracta.MKJClase#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link abstracta.MKJClase#getRelaciones <em>Relaciones</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMKJClase()
 * @model
 * @generated
 */
public interface MKJClase extends EObject {
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
	 * @see abstracta.AbstractaPackage#getMKJClase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta.MKJClase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJClase_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAtributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJmetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJClase_Metodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJmetodo> getMetodos();

	/**
	 * Returns the value of the '<em><b>Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJClase_Relaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJRelacion> getRelaciones();

} // MKJClase
