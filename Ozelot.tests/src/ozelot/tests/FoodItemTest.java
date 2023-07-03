/**
 */
package ozelot.tests;

import junit.textui.TestRunner;

import ozelot.FoodItem;
import ozelot.OzelotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Food Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoodItemTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FoodItemTest.class);
	}

	/**
	 * Constructs a new Food Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Food Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FoodItem getFixture() {
		return (FoodItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OzelotFactory.eINSTANCE.createFoodItem());
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

} //FoodItemTest
