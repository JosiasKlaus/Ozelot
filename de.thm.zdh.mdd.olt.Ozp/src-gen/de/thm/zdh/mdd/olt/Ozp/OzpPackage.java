/**
 */
package de.thm.zdh.mdd.olt.Ozp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.thm.zdh.mdd.olt.Ozp.OzpFactory
 * @model kind="package"
 * @generated
 */
public interface OzpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ozp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Ozp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ozp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OzpPackage eINSTANCE = de.thm.zdh.mdd.olt.Ozp.impl.OzpPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.thm.zdh.mdd.olt.Ozp.impl.ModImpl <em>Mod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.thm.zdh.mdd.olt.Ozp.impl.ModImpl
	 * @see de.thm.zdh.mdd.olt.Ozp.impl.OzpPackageImpl#getMod()
	 * @generated
	 */
	int MOD = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.thm.zdh.mdd.olt.Ozp.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.thm.zdh.mdd.olt.Ozp.impl.ItemImpl
	 * @see de.thm.zdh.mdd.olt.Ozp.impl.OzpPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.thm.zdh.mdd.olt.Ozp.Mod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod</em>'.
	 * @see de.thm.zdh.mdd.olt.Ozp.Mod
	 * @generated
	 */
	EClass getMod();

	/**
	 * Returns the meta object for the containment reference list '{@link de.thm.zdh.mdd.olt.Ozp.Mod#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.thm.zdh.mdd.olt.Ozp.Mod#getItems()
	 * @see #getMod()
	 * @generated
	 */
	EReference getMod_Items();

	/**
	 * Returns the meta object for class '{@link de.thm.zdh.mdd.olt.Ozp.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see de.thm.zdh.mdd.olt.Ozp.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link de.thm.zdh.mdd.olt.Ozp.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.thm.zdh.mdd.olt.Ozp.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OzpFactory getOzpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.thm.zdh.mdd.olt.Ozp.impl.ModImpl <em>Mod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.thm.zdh.mdd.olt.Ozp.impl.ModImpl
		 * @see de.thm.zdh.mdd.olt.Ozp.impl.OzpPackageImpl#getMod()
		 * @generated
		 */
		EClass MOD = eINSTANCE.getMod();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD__ITEMS = eINSTANCE.getMod_Items();

		/**
		 * The meta object literal for the '{@link de.thm.zdh.mdd.olt.Ozp.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.thm.zdh.mdd.olt.Ozp.impl.ItemImpl
		 * @see de.thm.zdh.mdd.olt.Ozp.impl.OzpPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

	}

} //OzpPackage
