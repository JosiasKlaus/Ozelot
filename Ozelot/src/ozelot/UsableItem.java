/**
 */
package ozelot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.UsableItem#getFoodProperty <em>Food Property</em>}</li>
 *   <li>{@link ozelot.UsableItem#getOnUse <em>On Use</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getUsableItem()
 * @model
 * @generated
 */
public interface UsableItem extends Item {
	/**
	 * Returns the value of the '<em><b>Food Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Property</em>' reference.
	 * @see #setFoodProperty(FoodItem)
	 * @see ozelot.OzelotPackage#getUsableItem_FoodProperty()
	 * @model
	 * @generated
	 */
	FoodItem getFoodProperty();

	/**
	 * Sets the value of the '{@link ozelot.UsableItem#getFoodProperty <em>Food Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Property</em>' reference.
	 * @see #getFoodProperty()
	 * @generated
	 */
	void setFoodProperty(FoodItem value);

	/**
	 * Returns the value of the '<em><b>On Use</b></em>' reference list.
	 * The list contents are of type {@link ozelot.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Use</em>' reference list.
	 * @see ozelot.OzelotPackage#getUsableItem_OnUse()
	 * @model
	 * @generated
	 */
	EList<Effect> getOnUse();

} // UsableItem
