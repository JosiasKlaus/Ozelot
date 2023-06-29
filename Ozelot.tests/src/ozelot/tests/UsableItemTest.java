/**
 */
package ozelot.tests;

import junit.textui.TestRunner;

import ozelot.OzelotFactory;
import ozelot.UsableItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usable Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsableItemTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsableItemTest.class);
	}

	/**
	 * Constructs a new Usable Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsableItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usable Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsableItem getFixture() {
		return (UsableItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OzelotFactory.eINSTANCE.createUsableItem());
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

} //UsableItemTest
