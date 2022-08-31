/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MKJPaquete#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MKJPaquete#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.MKJPaquete#getPaquetes <em>Paquetes</em>}</li>
 *   <li>{@link concreta.MKJPaquete#getClases <em>Clases</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJPaquete()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface MKJPaquete extends EObject {
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
	 * @see concreta.ConcretaPackage#getMKJPaquete_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MKJPaquete#getNombre <em>Nombre</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMKJPaquete_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link concreta.MKJPaquete#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquetes</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJPaquete_Paquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJPaquete> getPaquetes();

	/**
	 * Returns the value of the '<em><b>Clases</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJPaquete_Clases()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJClase> getClases();

} // MKJPaquete
