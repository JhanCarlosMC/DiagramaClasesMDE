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
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

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
	 * Returns a new object of class '<em>MKJ Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Metodo</em>'.
	 * @generated
	 */
	MKJMetodo createMKJMetodo();

	/**
	 * Returns a new object of class '<em>MKJ Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Relacion</em>'.
	 * @generated
	 */
	MKJRelacion createMKJRelacion();

	/**
	 * Returns a new object of class '<em>MHJ Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MHJ Asociacion</em>'.
	 * @generated
	 */
	MHJAsociacion createMHJAsociacion();

	/**
	 * Returns a new object of class '<em>MKJ Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Containment</em>'.
	 * @generated
	 */
	MKJContainment createMKJContainment();

	/**
	 * Returns a new object of class '<em>MKJ Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Agregacion</em>'.
	 * @generated
	 */
	MKJAgregacion createMKJAgregacion();

	/**
	 * Returns a new object of class '<em>MKJ Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Herencia</em>'.
	 * @generated
	 */
	MKJHerencia createMKJHerencia();

	/**
	 * Returns a new object of class '<em>MKJ Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MKJ Interface</em>'.
	 * @generated
	 */
	MKJInterface createMKJInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractaPackage getAbstractaPackage();

} //AbstractaFactory
