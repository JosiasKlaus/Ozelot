/**
 */
package ozelot.tests;

import junit.textui.TestRunner;

import ozelot.OnTickEffect;
import ozelot.OzelotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Tick Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnTickEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnTickEffectTest.class);
	}

	/**
	 * Constructs a new On Tick Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnTickEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this On Tick Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnTickEffect getFixture() {
		return (OnTickEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OzelotFactory.eINSTANCE.createOnTickEffect());
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

} //OnTickEffectTest
