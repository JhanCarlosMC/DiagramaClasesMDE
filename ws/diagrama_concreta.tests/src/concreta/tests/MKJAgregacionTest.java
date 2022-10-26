/**
 */
package concreta.tests;

import concreta.ConcretaFactory;
import concreta.MKJAgregacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MKJ Agregacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKJAgregacionTest extends MKJRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MKJAgregacionTest.class);
	}

	/**
	 * Constructs a new MKJ Agregacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJAgregacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MKJ Agregacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MKJAgregacion getFixture() {
		return (MKJAgregacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretaFactory.eINSTANCE.createMKJAgregacion());
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

} //MKJAgregacionTest
