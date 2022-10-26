/**
 */
package bd.impl;

import bd.BdPackage;
import bd.Column;
import bd.ForeignKey;
import bd.Index;
import bd.PrimaryKey;
import bd.Relation;
import bd.Table;
import bd.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bd.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link bd.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link bd.impl.TableImpl#getListIndexes <em>List Indexes</em>}</li>
 *   <li>{@link bd.impl.TableImpl#getListRelations <em>List Relations</em>}</li>
 *   <li>{@link bd.impl.TableImpl#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link bd.impl.TableImpl#getListTriggers <em>List Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
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
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * The cached value of the '{@link #getListIndexes() <em>List Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> listIndexes;

	/**
	 * The cached value of the '{@link #getListRelations() <em>List Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> listRelations;

	/**
	 * The cached value of the '{@link #getListColumns() <em>List Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> listColumns;

	/**
	 * The cached value of the '{@link #getListTriggers() <em>List Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> listTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BdPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BdPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BdPackage.TABLE__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BdPackage.TABLE__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BdPackage.TABLE__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getListIndexes() {
		if (listIndexes == null) {
			listIndexes = new EObjectContainmentEList<Index>(Index.class, this, BdPackage.TABLE__LIST_INDEXES);
		}
		return listIndexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getListRelations() {
		if (listRelations == null) {
			listRelations = new EObjectContainmentEList<Relation>(Relation.class, this, BdPackage.TABLE__LIST_RELATIONS);
		}
		return listRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getListColumns() {
		if (listColumns == null) {
			listColumns = new EObjectContainmentEList<Column>(Column.class, this, BdPackage.TABLE__LIST_COLUMNS);
		}
		return listColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getListTriggers() {
		if (listTriggers == null) {
			listTriggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, BdPackage.TABLE__LIST_TRIGGERS);
		}
		return listTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BdPackage.TABLE__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case BdPackage.TABLE__LIST_INDEXES:
				return ((InternalEList<?>)getListIndexes()).basicRemove(otherEnd, msgs);
			case BdPackage.TABLE__LIST_RELATIONS:
				return ((InternalEList<?>)getListRelations()).basicRemove(otherEnd, msgs);
			case BdPackage.TABLE__LIST_COLUMNS:
				return ((InternalEList<?>)getListColumns()).basicRemove(otherEnd, msgs);
			case BdPackage.TABLE__LIST_TRIGGERS:
				return ((InternalEList<?>)getListTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BdPackage.TABLE__NAME:
				return getName();
			case BdPackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey();
			case BdPackage.TABLE__LIST_INDEXES:
				return getListIndexes();
			case BdPackage.TABLE__LIST_RELATIONS:
				return getListRelations();
			case BdPackage.TABLE__LIST_COLUMNS:
				return getListColumns();
			case BdPackage.TABLE__LIST_TRIGGERS:
				return getListTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BdPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case BdPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case BdPackage.TABLE__LIST_INDEXES:
				getListIndexes().clear();
				getListIndexes().addAll((Collection<? extends Index>)newValue);
				return;
			case BdPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
				getListRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case BdPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				getListColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case BdPackage.TABLE__LIST_TRIGGERS:
				getListTriggers().clear();
				getListTriggers().addAll((Collection<? extends Trigger>)newValue);
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
			case BdPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BdPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case BdPackage.TABLE__LIST_INDEXES:
				getListIndexes().clear();
				return;
			case BdPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
				return;
			case BdPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				return;
			case BdPackage.TABLE__LIST_TRIGGERS:
				getListTriggers().clear();
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
			case BdPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BdPackage.TABLE__PRIMARY_KEY:
				return primaryKey != null;
			case BdPackage.TABLE__LIST_INDEXES:
				return listIndexes != null && !listIndexes.isEmpty();
			case BdPackage.TABLE__LIST_RELATIONS:
				return listRelations != null && !listRelations.isEmpty();
			case BdPackage.TABLE__LIST_COLUMNS:
				return listColumns != null && !listColumns.isEmpty();
			case BdPackage.TABLE__LIST_TRIGGERS:
				return listTriggers != null && !listTriggers.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
