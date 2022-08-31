/**
 */
package concreta;

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
 *   <li>{@link concreta.MKJClase#getName <em>Name</em>}</li>
 *   <li>{@link concreta.MKJClase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link concreta.MKJClase#getMetodos <em>Metodos</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJClase()
 * @model annotation="gmf.node label='name'"
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
	 * @see concreta.ConcretaPackage#getMKJClase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concreta.MKJClase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJClase_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAtributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJmetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJClase_Metodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJmetodo> getMetodos();

} // MKJClase
