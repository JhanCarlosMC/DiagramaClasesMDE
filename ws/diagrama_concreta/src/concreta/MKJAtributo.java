/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKJ Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MKJAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MKJAtributo#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link concreta.MKJAtributo#isForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMKJAtributo()
 * @model annotation="gmf.node label='nombre' border.color='118,255,102' color='118,255,102' figure='rectangle' border.width='1'"
 * @generated
 */
public interface MKJAtributo extends EObject {
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
	 * @see concreta.ConcretaPackage#getMKJAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see concreta.ConcretaPackage#getMKJAtributo_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(boolean)
	 * @see concreta.ConcretaPackage#getMKJAtributo_ForeignKey()
	 * @model
	 * @generated
	 */
	boolean isForeignKey();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#isForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #isForeignKey()
	 * @generated
	 */
	void setForeignKey(boolean value);

} // MKJAtributo
