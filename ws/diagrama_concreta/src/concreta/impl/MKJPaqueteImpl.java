/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJClase;
import concreta.MKJPaquete;

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
 * An implementation of the model object '<em><b>MKJ Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MKJPaqueteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MKJPaqueteImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.impl.MKJPaqueteImpl#getPaquetes <em>Paquetes</em>}</li>
 *   <li>{@link concreta.impl.MKJPaqueteImpl#getClases <em>Clases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJPaqueteImpl extends EObjectImpl implements MKJPaquete {
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
	 * The cached value of the '{@link #getPaquetes() <em>Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJPaquete> paquetes;

	/**
	 * The cached value of the '{@link #getClases() <em>Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClases()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJClase> clases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJPaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MKJ_PAQUETE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_PAQUETE__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_PAQUETE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJPaquete> getPaquetes() {
		if (paquetes == null) {
			paquetes = new EObjectContainmentEList<MKJPaquete>(MKJPaquete.class, this, ConcretaPackage.MKJ_PAQUETE__PAQUETES);
		}
		return paquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJClase> getClases() {
		if (clases == null) {
			clases = new EObjectContainmentEList<MKJClase>(MKJClase.class, this, ConcretaPackage.MKJ_PAQUETE__CLASES);
		}
		return clases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.MKJ_PAQUETE__PAQUETES:
				return ((InternalEList<?>)getPaquetes()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_PAQUETE__CLASES:
				return ((InternalEList<?>)getClases()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.MKJ_PAQUETE__NOMBRE:
				return getNombre();
			case ConcretaPackage.MKJ_PAQUETE__RUTA:
				return getRuta();
			case ConcretaPackage.MKJ_PAQUETE__PAQUETES:
				return getPaquetes();
			case ConcretaPackage.MKJ_PAQUETE__CLASES:
				return getClases();
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
			case ConcretaPackage.MKJ_PAQUETE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MKJ_PAQUETE__RUTA:
				setRuta((String)newValue);
				return;
			case ConcretaPackage.MKJ_PAQUETE__PAQUETES:
				getPaquetes().clear();
				getPaquetes().addAll((Collection<? extends MKJPaquete>)newValue);
				return;
			case ConcretaPackage.MKJ_PAQUETE__CLASES:
				getClases().clear();
				getClases().addAll((Collection<? extends MKJClase>)newValue);
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
			case ConcretaPackage.MKJ_PAQUETE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_PAQUETE__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_PAQUETE__PAQUETES:
				getPaquetes().clear();
				return;
			case ConcretaPackage.MKJ_PAQUETE__CLASES:
				getClases().clear();
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
			case ConcretaPackage.MKJ_PAQUETE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MKJ_PAQUETE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case ConcretaPackage.MKJ_PAQUETE__PAQUETES:
				return paquetes != null && !paquetes.isEmpty();
			case ConcretaPackage.MKJ_PAQUETE__CLASES:
				return clases != null && !clases.isEmpty();
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

} //MKJPaqueteImpl
