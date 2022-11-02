/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getPaquetes <em>Paquetes</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaTodasLasClases <em>Lista Todas Las Clases</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaTodosLosPaquetes <em>Lista Todos Los Paquetes</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaAsociaciones <em>Lista Asociaciones</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaConteiments <em>Lista Conteiments</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaAgregaciones <em>Lista Agregaciones</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaHerencias <em>Lista Herencias</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaInterfaces <em>Lista Interfaces</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
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
	 * @see abstracta.AbstractaPackage#getModelFactory_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getModelFactory_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MKJPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquetes</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_Paquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MKJPaquete> getPaquetes();

	/**
	 * Returns the value of the '<em><b>Lista Todas Las Clases</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Todas Las Clases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Todas Las Clases</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaTodasLasClases()
	 * @model
	 * @generated
	 */
	EList<MKJClase> getListaTodasLasClases();

	/**
	 * Returns the value of the '<em><b>Lista Todos Los Paquetes</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Todos Los Paquetes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Todos Los Paquetes</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaTodosLosPaquetes()
	 * @model
	 * @generated
	 */
	EList<MKJPaquete> getListaTodosLosPaquetes();

	/**
	 * Returns the value of the '<em><b>Lista Asociaciones</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJAsociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Asociaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Asociaciones</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaAsociaciones()
	 * @model
	 * @generated
	 */
	EList<MKJAsociacion> getListaAsociaciones();

	/**
	 * Returns the value of the '<em><b>Lista Conteiments</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJContainment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Conteiments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Conteiments</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaConteiments()
	 * @model
	 * @generated
	 */
	EList<MKJContainment> getListaConteiments();

	/**
	 * Returns the value of the '<em><b>Lista Agregaciones</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJAgregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Agregaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Agregaciones</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaAgregaciones()
	 * @model
	 * @generated
	 */
	EList<MKJAgregacion> getListaAgregaciones();

	/**
	 * Returns the value of the '<em><b>Lista Herencias</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJHerencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Herencias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Herencias</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaHerencias()
	 * @model
	 * @generated
	 */
	EList<MKJHerencia> getListaHerencias();

	/**
	 * Returns the value of the '<em><b>Lista Interfaces</b></em>' reference list.
	 * The list contents are of type {@link abstracta.MKJInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Interfaces</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaInterfaces()
	 * @model
	 * @generated
	 */
	EList<MKJInterface> getListaInterfaces();

} // ModelFactory
