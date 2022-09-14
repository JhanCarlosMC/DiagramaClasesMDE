/**
 */
package concreta.util;

import concreta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see concreta.ConcretaPackage
 * @generated
 */
public class ConcretaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcretaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConcretaPackage.MODEL_FACTORY: {
				ModelFactory modelFactory = (ModelFactory)theEObject;
				T result = caseModelFactory(modelFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_DIAGRAMA_CLASES: {
				MKJDiagramaClases mkjDiagramaClases = (MKJDiagramaClases)theEObject;
				T result = caseMKJDiagramaClases(mkjDiagramaClases);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_PAQUETE: {
				MKJPaquete mkjPaquete = (MKJPaquete)theEObject;
				T result = caseMKJPaquete(mkjPaquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_CLASE: {
				MKJClase mkjClase = (MKJClase)theEObject;
				T result = caseMKJClase(mkjClase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_ATRIBUTO: {
				MKJAtributo mkjAtributo = (MKJAtributo)theEObject;
				T result = caseMKJAtributo(mkjAtributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_METODO: {
				MKJMetodo mkjMetodo = (MKJMetodo)theEObject;
				T result = caseMKJMetodo(mkjMetodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_RELACION: {
				MKJRelacion mkjRelacion = (MKJRelacion)theEObject;
				T result = caseMKJRelacion(mkjRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_ASOCIACION: {
				MKJAsociacion mkjAsociacion = (MKJAsociacion)theEObject;
				T result = caseMKJAsociacion(mkjAsociacion);
				if (result == null) result = caseMKJRelacion(mkjAsociacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_CONTEINMENT: {
				MKJConteinment mkjConteinment = (MKJConteinment)theEObject;
				T result = caseMKJConteinment(mkjConteinment);
				if (result == null) result = caseMKJRelacion(mkjConteinment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_AGREGACION: {
				MKJAgregacion mkjAgregacion = (MKJAgregacion)theEObject;
				T result = caseMKJAgregacion(mkjAgregacion);
				if (result == null) result = caseMKJRelacion(mkjAgregacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_HERENCIA: {
				MKJHerencia mkjHerencia = (MKJHerencia)theEObject;
				T result = caseMKJHerencia(mkjHerencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.MKJ_INTERFACE: {
				MKJInterface mkjInterface = (MKJInterface)theEObject;
				T result = caseMKJInterface(mkjInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactory(ModelFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Diagrama Clases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Diagrama Clases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJDiagramaClases(MKJDiagramaClases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJPaquete(MKJPaquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJClase(MKJClase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJAtributo(MKJAtributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJMetodo(MKJMetodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJRelacion(MKJRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Asociacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJAsociacion(MKJAsociacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Conteinment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Conteinment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJConteinment(MKJConteinment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Agregacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJAgregacion(MKJAgregacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJHerencia(MKJHerencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MKJ Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MKJ Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMKJInterface(MKJInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConcretaSwitch
