/**
 */
package ozelot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Food Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.FoodItem#getNutrition <em>Nutrition</em>}</li>
 *   <li>{@link ozelot.FoodItem#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link ozelot.FoodItem#isIsMeat <em>Is Meat</em>}</li>
 *   <li>{@link ozelot.FoodItem#isIsAlwaysEdible <em>Is Always Edible</em>}</li>
 *   <li>{@link ozelot.FoodItem#getAfterEating <em>After Eating</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getFoodItem()
 * @model
 * @generated
 */
public interface FoodItem extends Item {
	/**
	 * Returns the value of the '<em><b>Nutrition</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrition</em>' attribute.
	 * @see #setNutrition(int)
	 * @see ozelot.OzelotPackage#getFoodItem_Nutrition()
	 * @model default="4" required="true"
	 * @generated
	 */
	int getNutrition();

	/**
	 * Sets the value of the '{@link ozelot.FoodItem#getNutrition <em>Nutrition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition</em>' attribute.
	 * @see #getNutrition()
	 * @generated
	 */
	void setNutrition(int value);

	/**
	 * Returns the value of the '<em><b>Saturation</b></em>' attribute.
	 * The default value is <code>"0.3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturation</em>' attribute.
	 * @see #setSaturation(float)
	 * @see ozelot.OzelotPackage#getFoodItem_Saturation()
	 * @model default="0.3" required="true"
	 * @generated
	 */
	float getSaturation();

	/**
	 * Sets the value of the '{@link ozelot.FoodItem#getSaturation <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturation</em>' attribute.
	 * @see #getSaturation()
	 * @generated
	 */
	void setSaturation(float value);

	/**
	 * Returns the value of the '<em><b>Is Meat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Meat</em>' attribute.
	 * @see #setIsMeat(boolean)
	 * @see ozelot.OzelotPackage#getFoodItem_IsMeat()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMeat();

	/**
	 * Sets the value of the '{@link ozelot.FoodItem#isIsMeat <em>Is Meat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Meat</em>' attribute.
	 * @see #isIsMeat()
	 * @generated
	 */
	void setIsMeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Always Edible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Always Edible</em>' attribute.
	 * @see #setIsAlwaysEdible(boolean)
	 * @see ozelot.OzelotPackage#getFoodItem_IsAlwaysEdible()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsAlwaysEdible();

	/**
	 * Sets the value of the '{@link ozelot.FoodItem#isIsAlwaysEdible <em>Is Always Edible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Always Edible</em>' attribute.
	 * @see #isIsAlwaysEdible()
	 * @generated
	 */
	void setIsAlwaysEdible(boolean value);

	/**
	 * Returns the value of the '<em><b>After Eating</b></em>' containment reference list.
	 * The list contents are of type {@link ozelot.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Eating</em>' containment reference list.
	 * @see ozelot.OzelotPackage#getFoodItem_AfterEating()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getAfterEating();

} // FoodItem
