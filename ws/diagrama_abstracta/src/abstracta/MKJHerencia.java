/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.MKJHerencia#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.MKJHerencia#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMKJHerencia()
 * @model
 * @generated
 */
public interface MKJHerencia extends EObject {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MKJClase)
	 * @see abstracta.AbstractaPackage#getMKJHerencia_Source()
	 * @model
	 * @generated
	 */
	MKJClase getSource();

	/**
	 * Sets the value of the '{@link abstracta.MKJHerencia#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MKJClase value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MKJClase)
	 * @see abstracta.AbstractaPackage#getMKJHerencia_Target()
	 * @model
	 * @generated
	 */
	MKJClase getTarget();

	/**
	 * Sets the value of the '{@link abstracta.MKJHerencia#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MKJClase value);
} // MKJHerencia