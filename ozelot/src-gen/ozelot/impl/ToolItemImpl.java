/**
 */
package ozelot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ozelot.Item;
import ozelot.MiningLevel;
import ozelot.OzelotPackage;
import ozelot.ToolItem;
import ozelot.ToolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.ToolItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getMiningLevel <em>Mining Level</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getDurability <em>Durability</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getDamage <em>Damage</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getEnchantmentValue <em>Enchantment Value</em>}</li>
 *   <li>{@link ozelot.impl.ToolItemImpl#getRepairItem <em>Repair Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolItemImpl extends ItemImpl implements ToolItem {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ToolType TYPE_EDEFAULT = ToolType.SWORD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ToolType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningLevel() <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningLevel()
	 * @generated
	 * @ordered
	 */
	protected static final MiningLevel MINING_LEVEL_EDEFAULT = MiningLevel.WOOD;

	/**
	 * The cached value of the '{@link #getMiningLevel() <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningLevel()
	 * @generated
	 * @ordered
	 */
	protected MiningLevel miningLevel = MINING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected static final int DURABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected int durability = DURABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected float speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamage()
	 * @generated
	 * @ordered
	 */
	protected static final float DAMAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamage()
	 * @generated
	 * @ordered
	 */
	protected float damage = DAMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnchantmentValue() <em>Enchantment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnchantmentValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ENCHANTMENT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnchantmentValue() <em>Enchantment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnchantmentValue()
	 * @generated
	 * @ordered
	 */
	protected int enchantmentValue = ENCHANTMENT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepairItem() <em>Repair Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairItem()
	 * @generated
	 * @ordered
	 */
	protected Item repairItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.TOOL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ToolType newType) {
		ToolType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningLevel getMiningLevel() {
		return miningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningLevel(MiningLevel newMiningLevel) {
		MiningLevel oldMiningLevel = miningLevel;
		miningLevel = newMiningLevel == null ? MINING_LEVEL_EDEFAULT : newMiningLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__MINING_LEVEL, oldMiningLevel,
					miningLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurability() {
		return durability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurability(int newDurability) {
		int oldDurability = durability;
		durability = newDurability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__DURABILITY, oldDurability,
					durability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		float oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDamage() {
		return damage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamage(float newDamage) {
		float oldDamage = damage;
		damage = newDamage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__DAMAGE, oldDamage, damage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnchantmentValue(int newEnchantmentValue) {
		int oldEnchantmentValue = enchantmentValue;
		enchantmentValue = newEnchantmentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__ENCHANTMENT_VALUE,
					oldEnchantmentValue, enchantmentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getRepairItem() {
		if (repairItem != null && repairItem.eIsProxy()) {
			InternalEObject oldRepairItem = (InternalEObject) repairItem;
			repairItem = (Item) eResolveProxy(oldRepairItem);
			if (repairItem != oldRepairItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OzelotPackage.TOOL_ITEM__REPAIR_ITEM,
							oldRepairItem, repairItem));
			}
		}
		return repairItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetRepairItem() {
		return repairItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepairItem(Item newRepairItem) {
		Item oldRepairItem = repairItem;
		repairItem = newRepairItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.TOOL_ITEM__REPAIR_ITEM, oldRepairItem,
					repairItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OzelotPackage.TOOL_ITEM__TYPE:
			return getType();
		case OzelotPackage.TOOL_ITEM__MINING_LEVEL:
			return getMiningLevel();
		case OzelotPackage.TOOL_ITEM__DURABILITY:
			return getDurability();
		case OzelotPackage.TOOL_ITEM__SPEED:
			return getSpeed();
		case OzelotPackage.TOOL_ITEM__DAMAGE:
			return getDamage();
		case OzelotPackage.TOOL_ITEM__ENCHANTMENT_VALUE:
			return getEnchantmentValue();
		case OzelotPackage.TOOL_ITEM__REPAIR_ITEM:
			if (resolve)
				return getRepairItem();
			return basicGetRepairItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OzelotPackage.TOOL_ITEM__TYPE:
			setType((ToolType) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__MINING_LEVEL:
			setMiningLevel((MiningLevel) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__DURABILITY:
			setDurability((Integer) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__SPEED:
			setSpeed((Float) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__DAMAGE:
			setDamage((Float) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__ENCHANTMENT_VALUE:
			setEnchantmentValue((Integer) newValue);
			return;
		case OzelotPackage.TOOL_ITEM__REPAIR_ITEM:
			setRepairItem((Item) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OzelotPackage.TOOL_ITEM__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__MINING_LEVEL:
			setMiningLevel(MINING_LEVEL_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__DURABILITY:
			setDurability(DURABILITY_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__SPEED:
			setSpeed(SPEED_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__DAMAGE:
			setDamage(DAMAGE_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__ENCHANTMENT_VALUE:
			setEnchantmentValue(ENCHANTMENT_VALUE_EDEFAULT);
			return;
		case OzelotPackage.TOOL_ITEM__REPAIR_ITEM:
			setRepairItem((Item) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OzelotPackage.TOOL_ITEM__TYPE:
			return type != TYPE_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__MINING_LEVEL:
			return miningLevel != MINING_LEVEL_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__DURABILITY:
			return durability != DURABILITY_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__SPEED:
			return speed != SPEED_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__DAMAGE:
			return damage != DAMAGE_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__ENCHANTMENT_VALUE:
			return enchantmentValue != ENCHANTMENT_VALUE_EDEFAULT;
		case OzelotPackage.TOOL_ITEM__REPAIR_ITEM:
			return repairItem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", miningLevel: ");
		result.append(miningLevel);
		result.append(", durability: ");
		result.append(durability);
		result.append(", speed: ");
		result.append(speed);
		result.append(", damage: ");
		result.append(damage);
		result.append(", enchantmentValue: ");
		result.append(enchantmentValue);
		result.append(')');
		return result.toString();
	}

} //ToolItemImpl
