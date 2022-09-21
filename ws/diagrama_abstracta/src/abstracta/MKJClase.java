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
 *   <li>{@link abstracta.MKJClase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.MKJClase#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.MKJClase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link abstracta.MKJClase#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link abstracta.MKJClase#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link abstracta.MKJClase#getHerencias <em>Herencias</em>}</li>
 *   <li>{@link abstracta.MKJClase#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMKJClase()
 * @model
 * @generated
 */
public interface MKJClase extends EObject {
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
	 * @see abstracta.AbstractaPackage#getMKJClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.MKJClase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see abstracta.AbstractaPackage#getMKJClase_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.MKJClase#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

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
	 * The list contents are of type {@link abstracta.MKJMetodo}.
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
	EList<MKJMetodo> getMetodos();

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

	/**
	 * Returns the value of the '<em><b>Herencias</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJHerencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJClase_Herencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJHerencia> getHerencias();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMKJClase_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJInterface> getInterfaces();

} // MKJClase
