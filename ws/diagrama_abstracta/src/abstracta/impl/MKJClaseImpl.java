/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MKJAtributo;
import abstracta.MKJClase;
import abstracta.MKJHerencia;
import abstracta.MKJInterface;
import abstracta.MKJMetodo;
import abstracta.MKJRelacion;

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
 *   <li>{@link abstracta.impl.MKJClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getHerencias <em>Herencias</em>}</li>
 *   <li>{@link abstracta.impl.MKJClaseImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJClaseImpl extends EObjectImpl implements MKJClase {
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
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

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
	protected EList<MKJMetodo> metodos;

	/**
	 * The cached value of the '{@link #getRelaciones() <em>Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJRelacion> relaciones;

	/**
	 * The cached value of the '{@link #getHerencias() <em>Herencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerencias()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJHerencia> herencias;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJInterface> interfaces;

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
		return AbstractaPackage.Literals.MKJ_CLASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MKJ_CLASE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJAtributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<MKJAtributo>(MKJAtributo.class, this, AbstractaPackage.MKJ_CLASE__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJMetodo> getMetodos() {
		if (metodos == null) {
			metodos = new EObjectContainmentEList<MKJMetodo>(MKJMetodo.class, this, AbstractaPackage.MKJ_CLASE__METODOS);
		}
		return metodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJRelacion> getRelaciones() {
		if (relaciones == null) {
			relaciones = new EObjectContainmentEList<MKJRelacion>(MKJRelacion.class, this, AbstractaPackage.MKJ_CLASE__RELACIONES);
		}
		return relaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJHerencia> getHerencias() {
		if (herencias == null) {
			herencias = new EObjectContainmentEList<MKJHerencia>(MKJHerencia.class, this, AbstractaPackage.MKJ_CLASE__HERENCIAS);
		}
		return herencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<MKJInterface>(MKJInterface.class, this, AbstractaPackage.MKJ_CLASE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MKJ_CLASE__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MKJ_CLASE__METODOS:
				return ((InternalEList<?>)getMetodos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MKJ_CLASE__RELACIONES:
				return ((InternalEList<?>)getRelaciones()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MKJ_CLASE__HERENCIAS:
				return ((InternalEList<?>)getHerencias()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MKJ_CLASE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.MKJ_CLASE__NOMBRE:
				return getNombre();
			case AbstractaPackage.MKJ_CLASE__RUTA:
				return getRuta();
			case AbstractaPackage.MKJ_CLASE__ATRIBUTOS:
				return getAtributos();
			case AbstractaPackage.MKJ_CLASE__METODOS:
				return getMetodos();
			case AbstractaPackage.MKJ_CLASE__RELACIONES:
				return getRelaciones();
			case AbstractaPackage.MKJ_CLASE__HERENCIAS:
				return getHerencias();
			case AbstractaPackage.MKJ_CLASE__INTERFACES:
				return getInterfaces();
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
			case AbstractaPackage.MKJ_CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends MKJAtributo>)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__METODOS:
				getMetodos().clear();
				getMetodos().addAll((Collection<? extends MKJMetodo>)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__RELACIONES:
				getRelaciones().clear();
				getRelaciones().addAll((Collection<? extends MKJRelacion>)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__HERENCIAS:
				getHerencias().clear();
				getHerencias().addAll((Collection<? extends MKJHerencia>)newValue);
				return;
			case AbstractaPackage.MKJ_CLASE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends MKJInterface>)newValue);
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
			case AbstractaPackage.MKJ_CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_CLASE__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MKJ_CLASE__ATRIBUTOS:
				getAtributos().clear();
				return;
			case AbstractaPackage.MKJ_CLASE__METODOS:
				getMetodos().clear();
				return;
			case AbstractaPackage.MKJ_CLASE__RELACIONES:
				getRelaciones().clear();
				return;
			case AbstractaPackage.MKJ_CLASE__HERENCIAS:
				getHerencias().clear();
				return;
			case AbstractaPackage.MKJ_CLASE__INTERFACES:
				getInterfaces().clear();
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
			case AbstractaPackage.MKJ_CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MKJ_CLASE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MKJ_CLASE__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case AbstractaPackage.MKJ_CLASE__METODOS:
				return metodos != null && !metodos.isEmpty();
			case AbstractaPackage.MKJ_CLASE__RELACIONES:
				return relaciones != null && !relaciones.isEmpty();
			case AbstractaPackage.MKJ_CLASE__HERENCIAS:
				return herencias != null && !herencias.isEmpty();
			case AbstractaPackage.MKJ_CLASE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
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
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //MKJClaseImpl
