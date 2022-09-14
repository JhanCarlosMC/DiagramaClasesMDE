/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Asociacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MKJAsociacion#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.MKJAsociacion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJAsociacion()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='2' color='0,0,0'"
 * @generated
 */
public interface MKJAsociacion extends MKJRelacion {
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
	 * @see concreta.ConcretaPackage#getMKJAsociacion_Source()
	 * @model
	 * @generated
	 */
	MKJClase getSource();

	/**
	 * Sets the value of the '{@link concreta.MKJAsociacion#getSource <em>Source</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getMKJAsociacion_Target()
	 * @model
	 * @generated
	 */
	MKJClase getTarget();

	/**
	 * Sets the value of the '{@link concreta.MKJAsociacion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MKJClase value);

} // MKJAsociacion
