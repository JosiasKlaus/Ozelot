/**
 */
package ozelot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ozelot.OzelotFactory;
import ozelot.ToolProperty;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tool Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolPropertyTest extends TestCase {

	/**
	 * The fixture for this Tool Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolProperty fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToolPropertyTest.class);
	}

	/**
	 * Constructs a new Tool Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolPropertyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tool Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ToolProperty fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tool Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolProperty getFixture() {
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
		setFixture(OzelotFactory.eINSTANCE.createToolProperty());
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

} //ToolPropertyTest
