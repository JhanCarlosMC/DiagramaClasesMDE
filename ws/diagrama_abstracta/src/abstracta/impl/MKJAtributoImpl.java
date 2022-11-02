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
 *   <li>{@link abstracta.impl.MKJAtributoImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#isUniqueData <em>Unique Data</em>}</li>
 *   <li>{@link abstracta.impl.MKJAtributoImpl#isAutoIncrement <em>Auto Increment</em>}</li>
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean notNull = NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueData() <em>Unique Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueData() <em>Unique Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueData()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueData = UNIQUE_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_INCREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected boolean autoIncrement = AUTO_INCREMENT_EDEFAULT;

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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotNull() {
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotNull(boolean newNotNull) {
		boolean oldNotNull = notNull;
		notNull = newNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__NOT_NULL, oldNotNull, notNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueData() {
		return uniqueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueData(boolean newUniqueData) {
		boolean oldUniqueData = uniqueData;
		uniqueData = newUniqueData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__UNIQUE_DATA, oldUniqueData, uniqueData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoIncrement() {
		return autoIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoIncrement(boolean newAutoIncrement) {
		boolean oldAutoIncrement = autoIncrement;
		autoIncrement = newAutoIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_ATRIBUTO__AUTO_INCREMENT, oldAutoIncrement, autoIncrement));
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
			case AbstractaPackage.MKJ_ATRIBUTO__TYPE:
				return getType();
			case AbstractaPackage.MKJ_ATRIBUTO__NOT_NULL:
				return isNotNull();
			case AbstractaPackage.MKJ_ATRIBUTO__UNIQUE_DATA:
				return isUniqueData();
			case AbstractaPackage.MKJ_ATRIBUTO__AUTO_INCREMENT:
				return isAutoIncrement();
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
			case AbstractaPackage.MKJ_ATRIBUTO__TYPE:
				setType((String)newValue);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__UNIQUE_DATA:
				setUniqueData((Boolean)newValue);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__AUTO_INCREMENT:
				setAutoIncrement((Boolean)newValue);
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
			case AbstractaPackage.MKJ_ATRIBUTO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__NOT_NULL:
				setNotNull(NOT_NULL_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__UNIQUE_DATA:
				setUniqueData(UNIQUE_DATA_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_ATRIBUTO__AUTO_INCREMENT:
				setAutoIncrement(AUTO_INCREMENT_EDEFAULT);
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
			case AbstractaPackage.MKJ_ATRIBUTO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbstractaPackage.MKJ_ATRIBUTO__NOT_NULL:
				return notNull != NOT_NULL_EDEFAULT;
			case AbstractaPackage.MKJ_ATRIBUTO__UNIQUE_DATA:
				return uniqueData != UNIQUE_DATA_EDEFAULT;
			case AbstractaPackage.MKJ_ATRIBUTO__AUTO_INCREMENT:
				return autoIncrement != AUTO_INCREMENT_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", notNull: ");
		result.append(notNull);
		result.append(", uniqueData: ");
		result.append(uniqueData);
		result.append(", autoIncrement: ");
		result.append(autoIncrement);
		result.append(')');
		return result.toString();
	}

} //MKJAtributoImpl
