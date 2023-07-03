/**
 */
package de.thm.zdh.mdd.olt.Ozp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.thm.zdh.mdd.olt.Ozp.OzpPackage
 * @generated
 */
public interface OzpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OzpFactory eINSTANCE = de.thm.zdh.mdd.olt.Ozp.impl.OzpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mod</em>'.
	 * @generated
	 */
	Mod createMod();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OzpPackage getOzpPackage();

} //OzpFactory
