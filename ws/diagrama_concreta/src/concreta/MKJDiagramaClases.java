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
 *   <li>{@link concreta.MKJDiagramaClases#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaAsociaciones <em>Lista Asociaciones</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaConteiments <em>Lista Conteiments</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaAgregaciones <em>Lista Agregaciones</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaHerencias <em>Lista Herencias</em>}</li>
 *   <li>{@link concreta.MKJDiagramaClases#getListaInterfaces <em>Lista Interfaces</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJDiagramaClases()
 * @model
 * @generated
 */
public interface MKJDiagramaClases extends EObject {
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
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MKJDiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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

	/**
	 * Returns the value of the '<em><b>Lista Asociaciones</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJAsociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Asociaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Asociaciones</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaAsociaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAsociacion> getListaAsociaciones();

	/**
	 * Returns the value of the '<em><b>Lista Conteiments</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJConteinment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Conteiments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Conteiments</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaConteiments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJConteinment> getListaConteiments();

	/**
	 * Returns the value of the '<em><b>Lista Agregaciones</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJAgregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Agregaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Agregaciones</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaAgregaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJAgregacion> getListaAgregaciones();

	/**
	 * Returns the value of the '<em><b>Lista Herencias</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJHerencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Herencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Herencias</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaHerencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJHerencia> getListaHerencias();

	/**
	 * Returns the value of the '<em><b>Lista Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MKJInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Interfaces</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMKJDiagramaClases_ListaInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJInterface> getListaInterfaces();

} // MKJDiagramaClases
