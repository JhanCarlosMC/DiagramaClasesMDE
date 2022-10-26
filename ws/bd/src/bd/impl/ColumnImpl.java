/**
 */
package bd.impl;

import bd.BdPackage;
import bd.Column;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bd.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link bd.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link bd.impl.ColumnImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link bd.impl.ColumnImpl#isUniqueData <em>Unique Data</em>}</li>
 *   <li>{@link bd.impl.ColumnImpl#isAutoIncrement <em>Auto Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BdPackage.Literals.COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.COLUMN__NOT_NULL, oldNotNull, notNull));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.COLUMN__UNIQUE_DATA, oldUniqueData, uniqueData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.COLUMN__AUTO_INCREMENT, oldAutoIncrement, autoIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BdPackage.COLUMN__TYPE:
				return getType();
			case BdPackage.COLUMN__NAME:
				return getName();
			case BdPackage.COLUMN__NOT_NULL:
				return isNotNull();
			case BdPackage.COLUMN__UNIQUE_DATA:
				return isUniqueData();
			case BdPackage.COLUMN__AUTO_INCREMENT:
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
			case BdPackage.COLUMN__TYPE:
				setType((String)newValue);
				return;
			case BdPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case BdPackage.COLUMN__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case BdPackage.COLUMN__UNIQUE_DATA:
				setUniqueData((Boolean)newValue);
				return;
			case BdPackage.COLUMN__AUTO_INCREMENT:
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
			case BdPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BdPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BdPackage.COLUMN__NOT_NULL:
				setNotNull(NOT_NULL_EDEFAULT);
				return;
			case BdPackage.COLUMN__UNIQUE_DATA:
				setUniqueData(UNIQUE_DATA_EDEFAULT);
				return;
			case BdPackage.COLUMN__AUTO_INCREMENT:
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
			case BdPackage.COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BdPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BdPackage.COLUMN__NOT_NULL:
				return notNull != NOT_NULL_EDEFAULT;
			case BdPackage.COLUMN__UNIQUE_DATA:
				return uniqueData != UNIQUE_DATA_EDEFAULT;
			case BdPackage.COLUMN__AUTO_INCREMENT:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", notNull: ");
		result.append(notNull);
		result.append(", uniqueData: ");
		result.append(uniqueData);
		result.append(", autoIncrement: ");
		result.append(autoIncrement);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
