/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MKJ Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getMultiplicidad1 <em>Multiplicidad1</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getMultiplicidad2 <em>Multiplicidad2</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getRol1 <em>Rol1</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getRol2 <em>Rol2</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getNavegabilidad1 <em>Navegabilidad1</em>}</li>
 *   <li>{@link concreta.impl.MKJRelacionImpl#getNavegabilidad2 <em>Navegabilidad2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJRelacionImpl extends EObjectImpl implements MKJRelacion {
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
	 * The default value of the '{@link #getMultiplicidad1() <em>Multiplicidad1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad1()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidad1() <em>Multiplicidad1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad1()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidad1 = MULTIPLICIDAD1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidad2() <em>Multiplicidad2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad2()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidad2() <em>Multiplicidad2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad2()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidad2 = MULTIPLICIDAD2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol1() <em>Rol1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol1() <em>Rol1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol1()
	 * @generated
	 * @ordered
	 */
	protected String rol1 = ROL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol2() <em>Rol2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol2()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol2() <em>Rol2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol2()
	 * @generated
	 * @ordered
	 */
	protected String rol2 = ROL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegabilidad1() <em>Navegabilidad1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidad1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILIDAD1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilidad1() <em>Navegabilidad1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidad1()
	 * @generated
	 * @ordered
	 */
	protected String navegabilidad1 = NAVEGABILIDAD1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegabilidad2() <em>Navegabilidad2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidad2()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILIDAD2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilidad2() <em>Navegabilidad2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidad2()
	 * @generated
	 * @ordered
	 */
	protected String navegabilidad2 = NAVEGABILIDAD2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MKJ_RELACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidad1() {
		return multiplicidad1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidad1(String newMultiplicidad1) {
		String oldMultiplicidad1 = multiplicidad1;
		multiplicidad1 = newMultiplicidad1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD1, oldMultiplicidad1, multiplicidad1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidad2() {
		return multiplicidad2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidad2(String newMultiplicidad2) {
		String oldMultiplicidad2 = multiplicidad2;
		multiplicidad2 = newMultiplicidad2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD2, oldMultiplicidad2, multiplicidad2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRol1() {
		return rol1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol1(String newRol1) {
		String oldRol1 = rol1;
		rol1 = newRol1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__ROL1, oldRol1, rol1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRol2() {
		return rol2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol2(String newRol2) {
		String oldRol2 = rol2;
		rol2 = newRol2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__ROL2, oldRol2, rol2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegabilidad1() {
		return navegabilidad1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegabilidad1(String newNavegabilidad1) {
		String oldNavegabilidad1 = navegabilidad1;
		navegabilidad1 = newNavegabilidad1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD1, oldNavegabilidad1, navegabilidad1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegabilidad2() {
		return navegabilidad2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegabilidad2(String newNavegabilidad2) {
		String oldNavegabilidad2 = navegabilidad2;
		navegabilidad2 = newNavegabilidad2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD2, oldNavegabilidad2, navegabilidad2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.MKJ_RELACION__NOMBRE:
				return getNombre();
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD1:
				return getMultiplicidad1();
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD2:
				return getMultiplicidad2();
			case ConcretaPackage.MKJ_RELACION__ROL1:
				return getRol1();
			case ConcretaPackage.MKJ_RELACION__ROL2:
				return getRol2();
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD1:
				return getNavegabilidad1();
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD2:
				return getNavegabilidad2();
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
			case ConcretaPackage.MKJ_RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD1:
				setMultiplicidad1((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD2:
				setMultiplicidad2((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__ROL1:
				setRol1((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__ROL2:
				setRol2((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD1:
				setNavegabilidad1((String)newValue);
				return;
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD2:
				setNavegabilidad2((String)newValue);
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
			case ConcretaPackage.MKJ_RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD1:
				setMultiplicidad1(MULTIPLICIDAD1_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD2:
				setMultiplicidad2(MULTIPLICIDAD2_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__ROL1:
				setRol1(ROL1_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__ROL2:
				setRol2(ROL2_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD1:
				setNavegabilidad1(NAVEGABILIDAD1_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD2:
				setNavegabilidad2(NAVEGABILIDAD2_EDEFAULT);
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
			case ConcretaPackage.MKJ_RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD1:
				return MULTIPLICIDAD1_EDEFAULT == null ? multiplicidad1 != null : !MULTIPLICIDAD1_EDEFAULT.equals(multiplicidad1);
			case ConcretaPackage.MKJ_RELACION__MULTIPLICIDAD2:
				return MULTIPLICIDAD2_EDEFAULT == null ? multiplicidad2 != null : !MULTIPLICIDAD2_EDEFAULT.equals(multiplicidad2);
			case ConcretaPackage.MKJ_RELACION__ROL1:
				return ROL1_EDEFAULT == null ? rol1 != null : !ROL1_EDEFAULT.equals(rol1);
			case ConcretaPackage.MKJ_RELACION__ROL2:
				return ROL2_EDEFAULT == null ? rol2 != null : !ROL2_EDEFAULT.equals(rol2);
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD1:
				return NAVEGABILIDAD1_EDEFAULT == null ? navegabilidad1 != null : !NAVEGABILIDAD1_EDEFAULT.equals(navegabilidad1);
			case ConcretaPackage.MKJ_RELACION__NAVEGABILIDAD2:
				return NAVEGABILIDAD2_EDEFAULT == null ? navegabilidad2 != null : !NAVEGABILIDAD2_EDEFAULT.equals(navegabilidad2);
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
		result.append(", multiplicidad1: ");
		result.append(multiplicidad1);
		result.append(", multiplicidad2: ");
		result.append(multiplicidad2);
		result.append(", rol1: ");
		result.append(rol1);
		result.append(", rol2: ");
		result.append(rol2);
		result.append(", navegabilidad1: ");
		result.append(navegabilidad1);
		result.append(", navegabilidad2: ");
		result.append(navegabilidad2);
		result.append(')');
		return result.toString();
	}

} //MKJRelacionImpl
