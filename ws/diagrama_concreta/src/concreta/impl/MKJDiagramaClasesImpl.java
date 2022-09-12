/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJClase;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.MKJPaquete;
import concreta.MKJRelacion;

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
 * An implementation of the model object '<em><b>MKJ Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaAsociaciones <em>Lista Asociaciones</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaConteiments <em>Lista Conteiments</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaAgregaciones <em>Lista Agregaciones</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaHerencias <em>Lista Herencias</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaInterfaces <em>Lista Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJDiagramaClasesImpl extends EObjectImpl implements MKJDiagramaClases {
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
	 * The cached value of the '{@link #getListaClases() <em>Lista Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClases()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJClase> listaClases;

	/**
	 * The cached value of the '{@link #getListaPaquetes() <em>Lista Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJPaquete> listaPaquetes;

	/**
	 * The cached value of the '{@link #getListaAsociaciones() <em>Lista Asociaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAsociaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAsociacion> listaAsociaciones;

	/**
	 * The cached value of the '{@link #getListaConteiments() <em>Lista Conteiments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaConteiments()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJConteinment> listaConteiments;

	/**
	 * The cached value of the '{@link #getListaAgregaciones() <em>Lista Agregaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAgregaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAgregacion> listaAgregaciones;

	/**
	 * The cached value of the '{@link #getListaHerencias() <em>Lista Herencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaHerencias()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJHerencia> listaHerencias;

	/**
	 * The cached value of the '{@link #getListaInterfaces() <em>Lista Interfaces</em>}' containment reference list.
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
	protected MKJDiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MKJ_DIAGRAMA_CLASES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MKJ_DIAGRAMA_CLASES__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJClase> getListaClases() {
		if (listaClases == null) {
			listaClases = new EObjectContainmentEList<MKJClase>(MKJClase.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES);
		}
		return listaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJPaquete> getListaPaquetes() {
		if (listaPaquetes == null) {
			listaPaquetes = new EObjectContainmentEList<MKJPaquete>(MKJPaquete.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES);
		}
		return listaPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJAsociacion> getListaAsociaciones() {
		if (listaAsociaciones == null) {
			listaAsociaciones = new EObjectContainmentEList<MKJAsociacion>(MKJAsociacion.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES);
		}
		return listaAsociaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJConteinment> getListaConteiments() {
		if (listaConteiments == null) {
			listaConteiments = new EObjectContainmentEList<MKJConteinment>(MKJConteinment.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS);
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
			listaAgregaciones = new EObjectContainmentEList<MKJAgregacion>(MKJAgregacion.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES);
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
			listaHerencias = new EObjectContainmentEList<MKJHerencia>(MKJHerencia.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS);
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
			listaInterfaces = new EObjectContainmentEList<MKJInterface>(MKJInterface.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES);
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return ((InternalEList<?>)getListaClases()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return ((InternalEList<?>)getListaPaquetes()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES:
				return ((InternalEList<?>)getListaAsociaciones()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS:
				return ((InternalEList<?>)getListaConteiments()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES:
				return ((InternalEList<?>)getListaAgregaciones()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS:
				return ((InternalEList<?>)getListaHerencias()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES:
				return ((InternalEList<?>)getListaInterfaces()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__NOMBRE:
				return getNombre();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return getListaClases();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return getListaPaquetes();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES:
				return getListaAsociaciones();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS:
				return getListaConteiments();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES:
				return getListaAgregaciones();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS:
				return getListaHerencias();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES:
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				getListaClases().addAll((Collection<? extends MKJClase>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends MKJPaquete>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES:
				getListaAsociaciones().clear();
				getListaAsociaciones().addAll((Collection<? extends MKJAsociacion>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS:
				getListaConteiments().clear();
				getListaConteiments().addAll((Collection<? extends MKJConteinment>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES:
				getListaAgregaciones().clear();
				getListaAgregaciones().addAll((Collection<? extends MKJAgregacion>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS:
				getListaHerencias().clear();
				getListaHerencias().addAll((Collection<? extends MKJHerencia>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES:
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES:
				getListaAsociaciones().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS:
				getListaConteiments().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES:
				getListaAgregaciones().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS:
				getListaHerencias().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES:
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return listaClases != null && !listaClases.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_ASOCIACIONES:
				return listaAsociaciones != null && !listaAsociaciones.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CONTEIMENTS:
				return listaConteiments != null && !listaConteiments.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_AGREGACIONES:
				return listaAgregaciones != null && !listaAgregaciones.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_HERENCIAS:
				return listaHerencias != null && !listaHerencias.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_INTERFACES:
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
		result.append(')');
		return result.toString();
	}

} //MKJDiagramaClasesImpl
