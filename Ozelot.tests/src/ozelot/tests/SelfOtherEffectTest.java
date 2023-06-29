/**
 */
package ozelot.tests;

import junit.textui.TestRunner;

import ozelot.OzelotFactory;
import ozelot.SelfOtherEffect;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Self Other Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfOtherEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfOtherEffectTest.class);
	}

	/**
	 * Constructs a new Self Other Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfOtherEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Self Other Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelfOtherEffect getFixture() {
		return (SelfOtherEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OzelotFactory.eINSTANCE.createSelfOtherEffect());
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

} //SelfOtherEffectTest
