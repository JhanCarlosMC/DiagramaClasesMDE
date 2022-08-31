/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MKJAtributo;
import abstracta.MKJmetodo;

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
 * An implementation of the model object '<em><b>MK Jmetodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MKJmetodoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MKJmetodoImpl#isRetorno <em>Retorno</em>}</li>
 *   <li>{@link abstracta.impl.MKJmetodoImpl#getListaParametros <em>Lista Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKJmetodoImpl extends EObjectImpl implements MKJmetodo {
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
	 * The default value of the '{@link #isRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETORNO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetorno()
	 * @generated
	 * @ordered
	 */
	protected boolean retorno = RETORNO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaParametros() <em>Lista Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<MKJAtributo> listaParametros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJmetodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MK_JMETODO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MK_JMETODO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(boolean newRetorno) {
		boolean oldRetorno = retorno;
		retorno = newRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MK_JMETODO__RETORNO, oldRetorno, retorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MKJAtributo> getListaParametros() {
		if (listaParametros == null) {
			listaParametros = new EObjectContainmentEList<MKJAtributo>(MKJAtributo.class, this, AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS);
		}
		return listaParametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS:
				return ((InternalEList<?>)getListaParametros()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.MK_JMETODO__NOMBRE:
				return getNombre();
			case AbstractaPackage.MK_JMETODO__RETORNO:
				return isRetorno();
			case AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS:
				return getListaParametros();
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
			case AbstractaPackage.MK_JMETODO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MK_JMETODO__RETORNO:
				setRetorno((Boolean)newValue);
				return;
			case AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS:
				getListaParametros().clear();
				getListaParametros().addAll((Collection<? extends MKJAtributo>)newValue);
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
			case AbstractaPackage.MK_JMETODO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MK_JMETODO__RETORNO:
				setRetorno(RETORNO_EDEFAULT);
				return;
			case AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS:
				getListaParametros().clear();
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
			case AbstractaPackage.MK_JMETODO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MK_JMETODO__RETORNO:
				return retorno != RETORNO_EDEFAULT;
			case AbstractaPackage.MK_JMETODO__LISTA_PARAMETROS:
				return listaParametros != null && !listaParametros.isEmpty();
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
		result.append(", retorno: ");
		result.append(retorno);
		result.append(')');
		return result.toString();
	}

} //MKJmetodoImpl
