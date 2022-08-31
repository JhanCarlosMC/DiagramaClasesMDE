/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MKJClase;
import concreta.MKJDiagramaClases;
import concreta.MKJPaquete;
import concreta.MKJRelacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link concreta.impl.MKJDiagramaClasesImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJDiagramaClasesImpl extends EObjectImpl implements MKJDiagramaClases {
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
	 * The cached value of the '{@link #getListaRelaciones() <em>Lista Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJRelacion> listaRelaciones;

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
	public EList<MKJRelacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<MKJRelacion>(MKJRelacion.class, this, ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES);
		}
		return listaRelaciones;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return ((InternalEList<?>)getListaClases()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return ((InternalEList<?>)getListaRelaciones()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return ((InternalEList<?>)getListaPaquetes()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return getListaClases();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return getListaRelaciones();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return getListaPaquetes();
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				getListaClases().addAll((Collection<? extends MKJClase>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends MKJRelacion>)newValue);
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends MKJPaquete>)newValue);
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				return;
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
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
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_CLASES:
				return listaClases != null && !listaClases.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MKJDiagramaClasesImpl
