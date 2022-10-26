/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJMetodo;

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
 *   <li>{@link concreta.impl.MKJClaseImpl#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link concreta.impl.MKJClaseImpl#getMetodos <em>Metodos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJClaseImpl extends EObjectImpl implements MKJClase {
	/**
	 * The default value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificador() <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected String identificador = IDENTIFICADOR_EDEFAULT;

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
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificador(String newIdentificador) {
		String oldIdentificador = identificador;
		identificador = newIdentificador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_CLASE__IDENTIFICADOR, oldIdentificador, identificador));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_CLASE__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_CLASE__RUTA, oldRuta, ruta));
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
	public EList<MKJMetodo> getMetodos() {
		if (metodos == null) {
			metodos = new EObjectContainmentEList<MKJMetodo>(MKJMetodo.class, this, ConcretaPackage.MKJ_CLASE__METODOS);
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
			case ConcretaPackage.MKJ_CLASE__IDENTIFICADOR:
				return getIdentificador();
			case ConcretaPackage.MKJ_CLASE__NOMBRE:
				return getNombre();
			case ConcretaPackage.MKJ_CLASE__RUTA:
				return getRuta();
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
			case ConcretaPackage.MKJ_CLASE__IDENTIFICADOR:
				setIdentificador((String)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__RUTA:
				setRuta((String)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends MKJAtributo>)newValue);
				return;
			case ConcretaPackage.MKJ_CLASE__METODOS:
				getMetodos().clear();
				getMetodos().addAll((Collection<? extends MKJMetodo>)newValue);
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
			case ConcretaPackage.MKJ_CLASE__IDENTIFICADOR:
				setIdentificador(IDENTIFICADOR_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_CLASE__RUTA:
				setRuta(RUTA_EDEFAULT);
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
			case ConcretaPackage.MKJ_CLASE__IDENTIFICADOR:
				return IDENTIFICADOR_EDEFAULT == null ? identificador != null : !IDENTIFICADOR_EDEFAULT.equals(identificador);
			case ConcretaPackage.MKJ_CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MKJ_CLASE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
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
		result.append(" (identificador: ");
		result.append(identificador);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //MKJClaseImpl
