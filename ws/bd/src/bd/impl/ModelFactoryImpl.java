/**
 */
package bd.impl;

import bd.BdPackage;
import bd.ModelFactory;
import bd.Schema;

import bd.Table;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bd.impl.ModelFactoryImpl#getLstSchema <em>Lst Schema</em>}</li>
 *   <li>{@link bd.impl.ModelFactoryImpl#getListaTablas <em>Lista Tablas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The cached value of the '{@link #getLstSchema() <em>Lst Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> lstSchema;

	/**
	 * The cached value of the '{@link #getListaTablas() <em>Lista Tablas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaTablas()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> listaTablas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BdPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getLstSchema() {
		if (lstSchema == null) {
			lstSchema = new EObjectContainmentEList<Schema>(Schema.class, this, BdPackage.MODEL_FACTORY__LST_SCHEMA);
		}
		return lstSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getListaTablas() {
		if (listaTablas == null) {
			listaTablas = new EObjectResolvingEList<Table>(Table.class, this, BdPackage.MODEL_FACTORY__LISTA_TABLAS);
		}
		return listaTablas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BdPackage.MODEL_FACTORY__LST_SCHEMA:
				return ((InternalEList<?>)getLstSchema()).basicRemove(otherEnd, msgs);
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
			case BdPackage.MODEL_FACTORY__LST_SCHEMA:
				return getLstSchema();
			case BdPackage.MODEL_FACTORY__LISTA_TABLAS:
				return getListaTablas();
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
			case BdPackage.MODEL_FACTORY__LST_SCHEMA:
				getLstSchema().clear();
				getLstSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case BdPackage.MODEL_FACTORY__LISTA_TABLAS:
				getListaTablas().clear();
				getListaTablas().addAll((Collection<? extends Table>)newValue);
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
			case BdPackage.MODEL_FACTORY__LST_SCHEMA:
				getLstSchema().clear();
				return;
			case BdPackage.MODEL_FACTORY__LISTA_TABLAS:
				getListaTablas().clear();
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
			case BdPackage.MODEL_FACTORY__LST_SCHEMA:
				return lstSchema != null && !lstSchema.isEmpty();
			case BdPackage.MODEL_FACTORY__LISTA_TABLAS:
				return listaTablas != null && !listaTablas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryImpl
