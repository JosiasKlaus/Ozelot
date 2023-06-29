/**
 */
package ozelot;

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
 *   <li>{@link ozelot.Mod#getItems <em>Items</em>}</li>
 *   <li>{@link ozelot.Mod#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link ozelot.Mod#getModId <em>Mod Id</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getMod()
 * @model
 * @generated
 */
public interface Mod extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link ozelot.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see ozelot.OzelotPackage#getMod_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' reference list.
	 * The list contents are of type {@link ozelot.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' reference list.
	 * @see ozelot.OzelotPackage#getMod_Blocks()
	 * @model
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * Returns the value of the '<em><b>Mod Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Id</em>' attribute.
	 * @see #setModId(String)
	 * @see ozelot.OzelotPackage#getMod_ModId()
	 * @model
	 * @generated
	 */
	String getModId();

	/**
	 * Sets the value of the '{@link ozelot.Mod#getModId <em>Mod Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Id</em>' attribute.
	 * @see #getModId()
	 * @generated
	 */
	void setModId(String value);

} // Mod
