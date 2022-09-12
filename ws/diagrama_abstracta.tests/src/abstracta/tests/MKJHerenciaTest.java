/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.MKJHerencia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MKJ Herencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKJHerenciaTest extends MKJRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MKJHerenciaTest.class);
	}

	/**
	 * Constructs a new MKJ Herencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJHerenciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MKJ Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MKJHerencia getFixture() {
		return (MKJHerencia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createMKJHerencia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MKJHerenciaTest
