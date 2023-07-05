/**
 */
package ozelot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.ToolItem#getType <em>Type</em>}</li>
 *   <li>{@link ozelot.ToolItem#getMiningLevel <em>Mining Level</em>}</li>
 *   <li>{@link ozelot.ToolItem#getDurability <em>Durability</em>}</li>
 *   <li>{@link ozelot.ToolItem#getSpeed <em>Speed</em>}</li>
 *   <li>{@link ozelot.ToolItem#getDamage <em>Damage</em>}</li>
 *   <li>{@link ozelot.ToolItem#getEnchantmentValue <em>Enchantment Value</em>}</li>
 *   <li>{@link ozelot.ToolItem#getRepairItem <em>Repair Item</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getToolItem()
 * @model
 * @generated
 */
public interface ToolItem extends Item {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.ToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ozelot.ToolType
	 * @see #setType(ToolType)
	 * @see ozelot.OzelotPackage#getToolItem_Type()
	 * @model required="true"
	 * @generated
	 */
	ToolType getType();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ozelot.ToolType
	 * @see #getType()
	 * @generated
	 */
	void setType(ToolType value);

	/**
	 * Returns the value of the '<em><b>Mining Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.MiningLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Level</em>' attribute.
	 * @see ozelot.MiningLevel
	 * @see #setMiningLevel(MiningLevel)
	 * @see ozelot.OzelotPackage#getToolItem_MiningLevel()
	 * @model required="true"
	 * @generated
	 */
	MiningLevel getMiningLevel();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getMiningLevel <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Level</em>' attribute.
	 * @see ozelot.MiningLevel
	 * @see #getMiningLevel()
	 * @generated
	 */
	void setMiningLevel(MiningLevel value);

	/**
	 * Returns the value of the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durability</em>' attribute.
	 * @see #setDurability(int)
	 * @see ozelot.OzelotPackage#getToolItem_Durability()
	 * @model required="true"
	 * @generated
	 */
	int getDurability();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getDurability <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability</em>' attribute.
	 * @see #getDurability()
	 * @generated
	 */
	void setDurability(int value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see ozelot.OzelotPackage#getToolItem_Speed()
	 * @model required="true"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see #setDamage(float)
	 * @see ozelot.OzelotPackage#getToolItem_Damage()
	 * @model required="true"
	 * @generated
	 */
	float getDamage();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage</em>' attribute.
	 * @see #getDamage()
	 * @generated
	 */
	void setDamage(float value);

	/**
	 * Returns the value of the '<em><b>Enchantment Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enchantment Value</em>' attribute.
	 * @see #setEnchantmentValue(int)
	 * @see ozelot.OzelotPackage#getToolItem_EnchantmentValue()
	 * @model required="true"
	 * @generated
	 */
	int getEnchantmentValue();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getEnchantmentValue <em>Enchantment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enchantment Value</em>' attribute.
	 * @see #getEnchantmentValue()
	 * @generated
	 */
	void setEnchantmentValue(int value);

	/**
	 * Returns the value of the '<em><b>Repair Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Item</em>' reference.
	 * @see #setRepairItem(Item)
	 * @see ozelot.OzelotPackage#getToolItem_RepairItem()
	 * @model required="true"
	 * @generated
	 */
	Item getRepairItem();

	/**
	 * Sets the value of the '{@link ozelot.ToolItem#getRepairItem <em>Repair Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Item</em>' reference.
	 * @see #getRepairItem()
	 * @generated
	 */
	void setRepairItem(Item value);

} // ToolItem
