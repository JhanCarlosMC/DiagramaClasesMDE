/**
 */
package abstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public interface AbstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaFactory eINSTANCE = abstracta.impl.AbstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MKJ Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Paquete</em>'.
	 * @generated
	 */
	MKJPaquete createMKJPaquete();

	/**
	 * Returns a new object of class '<em>MKJ Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Clase</em>'.
	 * @generated
	 */
	MKJClase createMKJClase();

	/**
	 * Returns a new object of class '<em>MKJ Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Atributo</em>'.
	 * @generated
	 */
	MKJAtributo createMKJAtributo();

	/**
	 * Returns a new object of class '<em>MK Jmetodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MK Jmetodo</em>'.
	 * @generated
	 */
	MKJmetodo createMKJmetodo();

	/**
	 * Returns a new object of class '<em>MKJ Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Relacion</em>'.
	 * @generated
	 */
	MKJRelacion createMKJRelacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractaPackage getAbstractaPackage();

} //AbstractaFactory
