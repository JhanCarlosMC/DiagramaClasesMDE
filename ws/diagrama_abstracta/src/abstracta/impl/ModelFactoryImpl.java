/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MKJClase;
import abstracta.MKJPaquete;
import abstracta.ModelFactory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getPaquetes <em>Paquetes</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaTodasLasClases <em>Lista Todas Las Clases</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaTodosLosPaquetes <em>Lista Todos Los Paquetes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
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
	 * The cached value of the '{@link #getListaTodasLasClases() <em>Lista Todas Las Clases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaTodasLasClases()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJClase> listaTodasLasClases;

	/**
	 * The cached value of the '{@link #getListaTodosLosPaquetes() <em>Lista Todos Los Paquetes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaTodosLosPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJPaquete> listaTodosLosPaquetes;

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
		return AbstractaPackage.Literals.MODEL_FACTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJPaquete> getPaquetes() {
		if (paquetes == null) {
			paquetes = new EObjectContainmentEList<MKJPaquete>(MKJPaquete.class, this, AbstractaPackage.MODEL_FACTORY__PAQUETES);
		}
		return paquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJClase> getListaTodasLasClases() {
		if (listaTodasLasClases == null) {
			listaTodasLasClases = new EObjectResolvingEList<MKJClase>(MKJClase.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_LAS_CLASES);
		}
		return listaTodasLasClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJPaquete> getListaTodosLosPaquetes() {
		if (listaTodosLosPaquetes == null) {
			listaTodosLosPaquetes = new EObjectResolvingEList<MKJPaquete>(MKJPaquete.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES);
		}
		return listaTodosLosPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MODEL_FACTORY__PAQUETES:
				return ((InternalEList<?>)getPaquetes()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				return getNombre();
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				return getRuta();
			case AbstractaPackage.MODEL_FACTORY__PAQUETES:
				return getPaquetes();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_LAS_CLASES:
				return getListaTodasLasClases();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES:
				return getListaTodosLosPaquetes();
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__PAQUETES:
				getPaquetes().clear();
				getPaquetes().addAll((Collection<? extends MKJPaquete>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_LAS_CLASES:
				getListaTodasLasClases().clear();
				getListaTodasLasClases().addAll((Collection<? extends MKJClase>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES:
				getListaTodosLosPaquetes().clear();
				getListaTodosLosPaquetes().addAll((Collection<? extends MKJPaquete>)newValue);
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MODEL_FACTORY__PAQUETES:
				getPaquetes().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_LAS_CLASES:
				getListaTodasLasClases().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES:
				getListaTodosLosPaquetes().clear();
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MODEL_FACTORY__PAQUETES:
				return paquetes != null && !paquetes.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_LAS_CLASES:
				return listaTodasLasClases != null && !listaTodasLasClases.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_LOS_PAQUETES:
				return listaTodosLosPaquetes != null && !listaTodosLosPaquetes.isEmpty();
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

} //ModelFactoryImpl
