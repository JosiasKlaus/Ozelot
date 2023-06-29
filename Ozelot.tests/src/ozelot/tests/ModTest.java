/**
 */
package ozelot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ozelot.Mod;
import ozelot.OzelotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mod</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModTest extends TestCase {

	/**
	 * The fixture for this Mod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mod fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModTest.class);
	}

	/**
	 * Constructs a new Mod test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Mod fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mod getFixture() {
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
		setFixture(OzelotFactory.eINSTANCE.createMod());
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

} //ModTest
