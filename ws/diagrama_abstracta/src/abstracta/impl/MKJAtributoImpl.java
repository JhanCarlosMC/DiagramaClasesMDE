/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MKJAtributo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MKJ Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#isForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJAtributoImpl extends EObjectImpl implements MKJAtributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJAtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MKJ_ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(boolean newForeignKey) {
		boolean oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.MKJ_ATRIBUTO__NOMBRE:
				return getNombre();
			case AbstractaPackage.MKJ_ATRIBUTO__PRIMARY_KEY:
				return isPrimaryKey();
			case AbstractaPackage.MKJ_ATRIBUTO__FOREIGN_KEY:
				return isForeignKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.MKJ_ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__FOREIGN_KEY:
				setForeignKey((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MKJ_ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MKJ_ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MKJ_ATRIBUTO__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case AbstractaPackage.MKJ_ATRIBUTO__FOREIGN_KEY:
				return foreignKey != FOREIGN_KEY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(')');
		return result.toString();
	}

} //MKJAtributoImpl
