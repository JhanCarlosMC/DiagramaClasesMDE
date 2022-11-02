/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.MKJAsociacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MKJ Asociacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKJAsociacionTest extends MKJRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MKJAsociacionTest.class);
	}

	/**
	 * Constructs a new MKJ Asociacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJAsociacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MKJ Asociacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MKJAsociacion getFixture() {
		return (MKJAsociacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createMKJAsociacion());
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

} //MKJAsociacionTest
