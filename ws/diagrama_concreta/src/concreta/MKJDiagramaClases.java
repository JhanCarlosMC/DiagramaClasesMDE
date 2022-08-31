/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MKJDiagramaClases#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJDiagramaClases()
 * @model
 * @generated
 */
public interface MKJDiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJClase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJRelacion> getListaRelaciones();

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJPaquete> getListaPaquetes();

} // MKJDiagramaClases
