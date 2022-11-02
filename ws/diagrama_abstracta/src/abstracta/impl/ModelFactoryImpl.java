/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MKJAgregacion;
import abstracta.MKJAsociacion;
import abstracta.MKJClase;
import abstracta.MKJContainment;
import abstracta.MKJHerencia;
import abstracta.MKJInterface;
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
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaAsociaciones <em>Lista Asociaciones</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaConteiments <em>Lista Conteiments</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaAgregaciones <em>Lista Agregaciones</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaHerencias <em>Lista Herencias</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaInterfaces <em>Lista Interfaces</em>}</li>
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
	 * The cached value of the '{@link #getListaAsociaciones() <em>Lista Asociaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAsociaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAsociacion> listaAsociaciones;

	/**
	 * The cached value of the '{@link #getListaConteiments() <em>Lista Conteiments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaConteiments()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJContainment> listaConteiments;

	/**
	 * The cached value of the '{@link #getListaAgregaciones() <em>Lista Agregaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAgregaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAgregacion> listaAgregaciones;

	/**
	 * The cached value of the '{@link #getListaHerencias() <em>Lista Herencias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaHerencias()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJHerencia> listaHerencias;

	/**
	 * The cached value of the '{@link #getListaInterfaces() <em>Lista Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJInterface> listaInterfaces;

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
	public EList<MKJAsociacion> getListaAsociaciones() {
		if (listaAsociaciones == null) {
			listaAsociaciones = new EObjectResolvingEList<MKJAsociacion>(MKJAsociacion.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_ASOCIACIONES);
		}
		return listaAsociaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJContainment> getListaConteiments() {
		if (listaConteiments == null) {
			listaConteiments = new EObjectResolvingEList<MKJContainment>(MKJContainment.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_CONTEIMENTS);
		}
		return listaConteiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJAgregacion> getListaAgregaciones() {
		if (listaAgregaciones == null) {
			listaAgregaciones = new EObjectResolvingEList<MKJAgregacion>(MKJAgregacion.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_AGREGACIONES);
		}
		return listaAgregaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJHerencia> getListaHerencias() {
		if (listaHerencias == null) {
			listaHerencias = new EObjectResolvingEList<MKJHerencia>(MKJHerencia.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_HERENCIAS);
		}
		return listaHerencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJInterface> getListaInterfaces() {
		if (listaInterfaces == null) {
			listaInterfaces = new EObjectResolvingEList<MKJInterface>(MKJInterface.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_INTERFACES);
		}
		return listaInterfaces;
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
			case AbstractaPackage.MODEL_FACTORY__LISTA_ASOCIACIONES:
				return getListaAsociaciones();
			case AbstractaPackage.MODEL_FACTORY__LISTA_CONTEIMENTS:
				return getListaConteiments();
			case AbstractaPackage.MODEL_FACTORY__LISTA_AGREGACIONES:
				return getListaAgregaciones();
			case AbstractaPackage.MODEL_FACTORY__LISTA_HERENCIAS:
				return getListaHerencias();
			case AbstractaPackage.MODEL_FACTORY__LISTA_INTERFACES:
				return getListaInterfaces();
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
			case AbstractaPackage.MODEL_FACTORY__LISTA_ASOCIACIONES:
				getListaAsociaciones().clear();
				getListaAsociaciones().addAll((Collection<? extends MKJAsociacion>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_CONTEIMENTS:
				getListaConteiments().clear();
				getListaConteiments().addAll((Collection<? extends MKJContainment>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_AGREGACIONES:
				getListaAgregaciones().clear();
				getListaAgregaciones().addAll((Collection<? extends MKJAgregacion>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_HERENCIAS:
				getListaHerencias().clear();
				getListaHerencias().addAll((Collection<? extends MKJHerencia>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_INTERFACES:
				getListaInterfaces().clear();
				getListaInterfaces().addAll((Collection<? extends MKJInterface>)newValue);
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
			case AbstractaPackage.MODEL_FACTORY__LISTA_ASOCIACIONES:
				getListaAsociaciones().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_CONTEIMENTS:
				getListaConteiments().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_AGREGACIONES:
				getListaAgregaciones().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_HERENCIAS:
				getListaHerencias().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_INTERFACES:
				getListaInterfaces().clear();
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
			case AbstractaPackage.MODEL_FACTORY__LISTA_ASOCIACIONES:
				return listaAsociaciones != null && !listaAsociaciones.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_CONTEIMENTS:
				return listaConteiments != null && !listaConteiments.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_AGREGACIONES:
				return listaAgregaciones != null && !listaAgregaciones.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_HERENCIAS:
				return listaHerencias != null && !listaHerencias.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_INTERFACES:
				return listaInterfaces != null && !listaInterfaces.isEmpty();
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
