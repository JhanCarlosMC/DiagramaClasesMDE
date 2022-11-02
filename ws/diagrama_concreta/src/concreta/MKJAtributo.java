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
 *   <li>{@link concreta.MKJAtributo#getType <em>Type</em>}</li>
 *   <li>{@link concreta.MKJAtributo#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link concreta.MKJAtributo#isUniqueData <em>Unique Data</em>}</li>
 *   <li>{@link concreta.MKJAtributo#isAutoIncrement <em>Auto Increment</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see concreta.ConcretaPackage#getMKJAtributo_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see concreta.ConcretaPackage#getMKJAtributo_NotNull()
	 * @model
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Data</em>' attribute.
	 * @see #setUniqueData(boolean)
	 * @see concreta.ConcretaPackage#getMKJAtributo_UniqueData()
	 * @model
	 * @generated
	 */
	boolean isUniqueData();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#isUniqueData <em>Unique Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Data</em>' attribute.
	 * @see #isUniqueData()
	 * @generated
	 */
	void setUniqueData(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Increment</em>' attribute.
	 * @see #setAutoIncrement(boolean)
	 * @see concreta.ConcretaPackage#getMKJAtributo_AutoIncrement()
	 * @model
	 * @generated
	 */
	boolean isAutoIncrement();

	/**
	 * Sets the value of the '{@link concreta.MKJAtributo#isAutoIncrement <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Increment</em>' attribute.
	 * @see #isAutoIncrement()
	 * @generated
	 */
	void setAutoIncrement(boolean value);

} // MKJAtributo
