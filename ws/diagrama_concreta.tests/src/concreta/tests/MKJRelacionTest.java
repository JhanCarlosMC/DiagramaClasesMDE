/**
 */
package concreta.tests;

import concreta.ConcretaFactory;
import concreta.MKJRelacion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MKJ Relacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKJRelacionTest extends TestCase {

	/**
	 * The fixture for this MKJ Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJRelacion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MKJRelacionTest.class);
	}

	/**
	 * Constructs a new MKJ Relacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKJRelacionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MKJ Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MKJRelacion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MKJ Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJRelacion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretaFactory.eINSTANCE.createMKJRelacion());
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

} //MKJRelacionTest
