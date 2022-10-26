/**
 */
package concreta;

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
 *   <li>{@link concreta.MKJMetodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MKJMetodo#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link concreta.MKJMetodo#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJMetodo()
 * @model annotation="gmf.node label='nombre' border.color='118,255,102' color='118,255,102'"
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
	 * @see concreta.ConcretaPackage#getMKJMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MKJMetodo#getNombre <em>Nombre</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMKJMetodo_Semantics()
	 * @model
	 * @generated
	 */
	String getSemantics();

	/**
	 * Sets the value of the '{@link concreta.MKJMetodo#getSemantics <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' attribute.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(String value);

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJMetodo_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAtributo> getParametros();

} // MKJMetodo
