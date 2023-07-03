/**
 */
package de.thm.zdh.mdd.olt.Ozp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.zdh.mdd.olt.Ozp.Mod#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.thm.zdh.mdd.olt.Ozp.OzpPackage#getMod()
 * @model
 * @generated
 */
public interface Mod extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.thm.zdh.mdd.olt.Ozp.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.thm.zdh.mdd.olt.Ozp.OzpPackage#getMod_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Mod
