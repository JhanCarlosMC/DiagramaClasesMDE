/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJmetodo;

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
 * An implementation of the model object '<em><b>MKJ Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MKJClaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getMetodos <em>Metodos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJClaseImpl extends EObjectImpl implements MKJClase {
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
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAtributo> atributos;

	/**
	 * The cached value of the '{@link #getMetodos() <em>Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJmetodo> metodos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MKJ_CLASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_CLASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJAtributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<MKJAtributo>(MKJAtributo.class, this, ConcretaPackage.MKJ_CLASE__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJmetodo> getMetodos() {
		if (metodos == null) {
			metodos = new EObjectContainmentEList<MKJmetodo>(MKJmetodo.class, this, ConcretaPackage.MKJ_CLASE__METODOS);
		}
		return metodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_CLASE__METODOS:
				return ((InternalEList<?>)getMetodos()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.MKJ_CLASE__NAME:
				return getName();
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				return getAtributos();
			case ConcretaPackage.MKJ_CLASE__METODOS:
				return getMetodos();
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
			case ConcretaPackage.MKJ_CLASE__NAME:
				setName((String)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends MKJAtributo>)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__METODOS:
				getMetodos().clear();
				getMetodos().addAll((Collection<? extends MKJmetodo>)newValue);
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
			case ConcretaPackage.MKJ_CLASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				getAtributos().clear();
				return;
			case ConcretaPackage.MKJ_CLASE__METODOS:
				getMetodos().clear();
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
			case ConcretaPackage.MKJ_CLASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case ConcretaPackage.MKJ_CLASE__METODOS:
				return metodos != null && !metodos.isEmpty();
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

} //MKJClaseImpl
