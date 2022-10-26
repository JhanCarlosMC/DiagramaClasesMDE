/**
 */
package bd.impl;

import bd.BdPackage;
import bd.ForeignKey;

import bd.Table;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bd.impl.ForeignKeyImpl#getTableReferenced <em>Table Referenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends ColumnImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getTableReferenced() <em>Table Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableReferenced()
	 * @generated
	 * @ordered
	 */
	protected Table tableReferenced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BdPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableReferenced() {
		if (tableReferenced != null && tableReferenced.eIsProxy()) {
			InternalEObject oldTableReferenced = (InternalEObject)tableReferenced;
			tableReferenced = (Table)eResolveProxy(oldTableReferenced);
			if (tableReferenced != oldTableReferenced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BdPackage.FOREIGN_KEY__TABLE_REFERENCED, oldTableReferenced, tableReferenced));
			}
		}
		return tableReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableReferenced() {
		return tableReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableReferenced(Table newTableReferenced) {
		Table oldTableReferenced = tableReferenced;
		tableReferenced = newTableReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.FOREIGN_KEY__TABLE_REFERENCED, oldTableReferenced, tableReferenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BdPackage.FOREIGN_KEY__TABLE_REFERENCED:
				if (resolve) return getTableReferenced();
				return basicGetTableReferenced();
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
			case BdPackage.FOREIGN_KEY__TABLE_REFERENCED:
				setTableReferenced((Table)newValue);
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
			case BdPackage.FOREIGN_KEY__TABLE_REFERENCED:
				setTableReferenced((Table)null);
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
			case BdPackage.FOREIGN_KEY__TABLE_REFERENCED:
				return tableReferenced != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
