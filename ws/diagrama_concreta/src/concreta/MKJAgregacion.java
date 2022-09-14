/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Agregacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MKJAgregacion#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.MKJAgregacion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJAgregacion()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='2' source.decoration='rhomb' color='0,0,0'"
 * @generated
 */
public interface MKJAgregacion extends MKJRelacion {
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
	 * @see concreta.ConcretaPackage#getMKJAgregacion_Source()
	 * @model
	 * @generated
	 */
	MKJClase getSource();

	/**
	 * Sets the value of the '{@link concreta.MKJAgregacion#getSource <em>Source</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getMKJAgregacion_Target()
	 * @model
	 * @generated
	 */
	MKJClase getTarget();

	/**
	 * Sets the value of the '{@link concreta.MKJAgregacion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MKJClase value);

} // MKJAgregacion
