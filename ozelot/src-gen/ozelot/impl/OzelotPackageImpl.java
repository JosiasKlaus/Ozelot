/**
 */
package ozelot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ozelot.Block;
import ozelot.BlockMiningLevel;
import ozelot.CreativeModeTab;
import ozelot.Effect;
import ozelot.FoodItem;
import ozelot.Item;
import ozelot.MiningLevel;
import ozelot.MiningToolType;
import ozelot.Mod;
import ozelot.OnTickEffect;
import ozelot.OzelotFactory;
import ozelot.OzelotPackage;
import ozelot.PotionEffect;
import ozelot.Rarity;
import ozelot.SelfOtherEffect;
import ozelot.SoundType;
import ozelot.ToolItem;
import ozelot.ToolType;
import ozelot.Translation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OzelotPackageImpl extends EPackageImpl implements OzelotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfOtherEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onTickEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum potionEffectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rarityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum creativeModeTabEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum miningToolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum miningLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockMiningLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum soundTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ozelot.OzelotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OzelotPackageImpl() {
		super(eNS_URI, OzelotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OzelotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OzelotPackage init() {
		if (isInited)
			return (OzelotPackage) EPackage.Registry.INSTANCE.getEPackage(OzelotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOzelotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OzelotPackageImpl theOzelotPackage = registeredOzelotPackage instanceof OzelotPackageImpl
				? (OzelotPackageImpl) registeredOzelotPackage
				: new OzelotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOzelotPackage.createPackageContents();

		// Initialize created meta-data
		theOzelotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOzelotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OzelotPackage.eNS_URI, theOzelotPackage);
		return theOzelotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMod() {
		return modEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_ModId() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_Name() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_Description() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_Authors() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMod_Items() {
		return (EReference) modEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMod_Blocks() {
		return (EReference) modEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_IconPath() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_Version() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_ProjectPath() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMod_AutoStart() {
		return (EAttribute) modEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_IconPath() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Glows() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_MaxStackSize() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_IsImmuneToFire() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_ItemId() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Rarity() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_CreativeModeTab() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Translations() {
		return (EReference) itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_OnAttack() {
		return (EReference) itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_OnTick() {
		return (EReference) itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_OnUse() {
		return (EReference) itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolItem() {
		return toolItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_Type() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_MiningLevel() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_Durability() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_Speed() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_Damage() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolItem_EnchantmentValue() {
		return (EAttribute) toolItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolItem_RepairItem() {
		return (EReference) toolItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodItem() {
		return foodItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_Nutrition() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_Saturation() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_IsMeat() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodItem_IsAlwaysEdible() {
		return (EAttribute) foodItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoodItem_AfterEating() {
		return (EReference) foodItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BlockId() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_HasGravity() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_CreativeModeTab() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_SoundType() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Harddness() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_ExplosionResistance() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Luminance() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_RequiresCorrectToolForDrops() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_RedstoneSignal() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_CanWalkThrough() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Slipperiness() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_JumpFactor() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_SpeedFactor() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Translations() {
		return (EReference) blockEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_TexturePath() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_MiningTool() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_MiningLevel() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_PotionEffect() {
		return (EAttribute) effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Level() {
		return (EAttribute) effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Duration() {
		return (EAttribute) effectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Visible() {
		return (EAttribute) effectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfOtherEffect() {
		return selfOtherEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfOtherEffect_IsSelf() {
		return (EAttribute) selfOtherEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnTickEffect() {
		return onTickEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnTickEffect_NeedsSelected() {
		return (EAttribute) onTickEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Lang() {
		return (EAttribute) translationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Name() {
		return (EAttribute) translationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Description() {
		return (EAttribute) translationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPotionEffect() {
		return potionEffectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRarity() {
		return rarityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCreativeModeTab() {
		return creativeModeTabEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMiningToolType() {
		return miningToolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToolType() {
		return toolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMiningLevel() {
		return miningLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockMiningLevel() {
		return blockMiningLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSoundType() {
		return soundTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OzelotFactory getOzelotFactory() {
		return (OzelotFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modEClass = createEClass(MOD);
		createEAttribute(modEClass, MOD__MOD_ID);
		createEAttribute(modEClass, MOD__NAME);
		createEAttribute(modEClass, MOD__DESCRIPTION);
		createEAttribute(modEClass, MOD__AUTHORS);
		createEReference(modEClass, MOD__ITEMS);
		createEReference(modEClass, MOD__BLOCKS);
		createEAttribute(modEClass, MOD__ICON_PATH);
		createEAttribute(modEClass, MOD__VERSION);
		createEAttribute(modEClass, MOD__PROJECT_PATH);
		createEAttribute(modEClass, MOD__AUTO_START);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ITEM_ID);
		createEAttribute(itemEClass, ITEM__ICON_PATH);
		createEAttribute(itemEClass, ITEM__GLOWS);
		createEAttribute(itemEClass, ITEM__MAX_STACK_SIZE);
		createEAttribute(itemEClass, ITEM__IS_IMMUNE_TO_FIRE);
		createEAttribute(itemEClass, ITEM__RARITY);
		createEAttribute(itemEClass, ITEM__CREATIVE_MODE_TAB);
		createEReference(itemEClass, ITEM__TRANSLATIONS);
		createEReference(itemEClass, ITEM__ON_ATTACK);
		createEReference(itemEClass, ITEM__ON_TICK);
		createEReference(itemEClass, ITEM__ON_USE);

		toolItemEClass = createEClass(TOOL_ITEM);
		createEAttribute(toolItemEClass, TOOL_ITEM__TYPE);
		createEAttribute(toolItemEClass, TOOL_ITEM__MINING_LEVEL);
		createEAttribute(toolItemEClass, TOOL_ITEM__DURABILITY);
		createEAttribute(toolItemEClass, TOOL_ITEM__SPEED);
		createEAttribute(toolItemEClass, TOOL_ITEM__DAMAGE);
		createEAttribute(toolItemEClass, TOOL_ITEM__ENCHANTMENT_VALUE);
		createEReference(toolItemEClass, TOOL_ITEM__REPAIR_ITEM);

		foodItemEClass = createEClass(FOOD_ITEM);
		createEAttribute(foodItemEClass, FOOD_ITEM__NUTRITION);
		createEAttribute(foodItemEClass, FOOD_ITEM__SATURATION);
		createEAttribute(foodItemEClass, FOOD_ITEM__IS_MEAT);
		createEAttribute(foodItemEClass, FOOD_ITEM__IS_ALWAYS_EDIBLE);
		createEReference(foodItemEClass, FOOD_ITEM__AFTER_EATING);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__BLOCK_ID);
		createEAttribute(blockEClass, BLOCK__HAS_GRAVITY);
		createEAttribute(blockEClass, BLOCK__CREATIVE_MODE_TAB);
		createEAttribute(blockEClass, BLOCK__SOUND_TYPE);
		createEAttribute(blockEClass, BLOCK__HARDDNESS);
		createEAttribute(blockEClass, BLOCK__EXPLOSION_RESISTANCE);
		createEAttribute(blockEClass, BLOCK__LUMINANCE);
		createEAttribute(blockEClass, BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS);
		createEAttribute(blockEClass, BLOCK__REDSTONE_SIGNAL);
		createEAttribute(blockEClass, BLOCK__CAN_WALK_THROUGH);
		createEAttribute(blockEClass, BLOCK__SLIPPERINESS);
		createEAttribute(blockEClass, BLOCK__JUMP_FACTOR);
		createEAttribute(blockEClass, BLOCK__SPEED_FACTOR);
		createEReference(blockEClass, BLOCK__TRANSLATIONS);
		createEAttribute(blockEClass, BLOCK__TEXTURE_PATH);
		createEAttribute(blockEClass, BLOCK__MINING_TOOL);
		createEAttribute(blockEClass, BLOCK__MINING_LEVEL);

		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__POTION_EFFECT);
		createEAttribute(effectEClass, EFFECT__LEVEL);
		createEAttribute(effectEClass, EFFECT__DURATION);
		createEAttribute(effectEClass, EFFECT__VISIBLE);

		selfOtherEffectEClass = createEClass(SELF_OTHER_EFFECT);
		createEAttribute(selfOtherEffectEClass, SELF_OTHER_EFFECT__IS_SELF);

		onTickEffectEClass = createEClass(ON_TICK_EFFECT);
		createEAttribute(onTickEffectEClass, ON_TICK_EFFECT__NEEDS_SELECTED);

		translationEClass = createEClass(TRANSLATION);
		createEAttribute(translationEClass, TRANSLATION__NAME);
		createEAttribute(translationEClass, TRANSLATION__LANG);
		createEAttribute(translationEClass, TRANSLATION__DESCRIPTION);

		// Create enums
		potionEffectEEnum = createEEnum(POTION_EFFECT);
		rarityEEnum = createEEnum(RARITY);
		creativeModeTabEEnum = createEEnum(CREATIVE_MODE_TAB);
		miningToolTypeEEnum = createEEnum(MINING_TOOL_TYPE);
		toolTypeEEnum = createEEnum(TOOL_TYPE);
		miningLevelEEnum = createEEnum(MINING_LEVEL);
		blockMiningLevelEEnum = createEEnum(BLOCK_MINING_LEVEL);
		soundTypeEEnum = createEEnum(SOUND_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toolItemEClass.getESuperTypes().add(this.getItem());
		foodItemEClass.getESuperTypes().add(this.getItem());
		selfOtherEffectEClass.getESuperTypes().add(this.getEffect());
		onTickEffectEClass.getESuperTypes().add(this.getEffect());

		// Initialize classes, features, and operations; add parameters
		initEClass(modEClass, Mod.class, "Mod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMod_ModId(), ecorePackage.getEString(), "modId", null, 1, 1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_Name(), ecorePackage.getEString(), "name", null, 1, 1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_Description(), ecorePackage.getEString(), "description", null, 1, 1, Mod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_Authors(), ecorePackage.getEString(), "authors", null, 1, 1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMod_Items(), this.getItem(), null, "items", null, 0, -1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMod_Blocks(), this.getBlock(), null, "blocks", null, 0, -1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMod_IconPath(), ecorePackage.getEString(), "iconPath", null, 1, 1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_Version(), ecorePackage.getEString(), "version", null, 1, 1, Mod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_ProjectPath(), ecorePackage.getEString(), "projectPath", "", 1, 1, Mod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMod_AutoStart(), ecorePackage.getEBoolean(), "autoStart", "true", 1, 1, Mod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_ItemId(), ecorePackage.getEString(), "itemId", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IconPath(), ecorePackage.getEString(), "iconPath", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Glows(), ecorePackage.getEBoolean(), "glows", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_MaxStackSize(), ecorePackage.getEInt(), "maxStackSize", "64", 1, 1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IsImmuneToFire(), ecorePackage.getEBoolean(), "isImmuneToFire", "false", 1, 1,
				Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getItem_Rarity(), this.getRarity(), "rarity", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_CreativeModeTab(), this.getCreativeModeTab(), "creativeModeTab", null, 1, 1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Translations(), this.getTranslation(), null, "translations", null, 0, -1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_OnAttack(), this.getSelfOtherEffect(), null, "onAttack", null, 0, -1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_OnTick(), this.getOnTickEffect(), null, "onTick", null, 0, -1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getItem_OnUse(), this.getEffect(), null, "onUse", null, 0, -1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(toolItemEClass, ToolItem.class, "ToolItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolItem_Type(), this.getToolType(), "type", null, 1, 1, ToolItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_MiningLevel(), this.getMiningLevel(), "miningLevel", null, 1, 1, ToolItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_Durability(), ecorePackage.getEInt(), "durability", null, 1, 1, ToolItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_Speed(), ecorePackage.getEFloat(), "speed", null, 1, 1, ToolItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_Damage(), ecorePackage.getEFloat(), "damage", null, 1, 1, ToolItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_EnchantmentValue(), ecorePackage.getEInt(), "enchantmentValue", null, 1, 1,
				ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getToolItem_RepairItem(), this.getItem(), null, "repairItem", null, 1, 1, ToolItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodItemEClass, FoodItem.class, "FoodItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodItem_Nutrition(), ecorePackage.getEInt(), "nutrition", "4", 1, 1, FoodItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodItem_Saturation(), ecorePackage.getEFloat(), "saturation", "0.3", 1, 1, FoodItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodItem_IsMeat(), ecorePackage.getEBoolean(), "isMeat", null, 1, 1, FoodItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodItem_IsAlwaysEdible(), ecorePackage.getEBoolean(), "isAlwaysEdible", "true", 1, 1,
				FoodItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFoodItem_AfterEating(), this.getEffect(), null, "afterEating", null, 0, -1, FoodItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_BlockId(), ecorePackage.getEString(), "blockId", null, 1, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_HasGravity(), ecorePackage.getEBoolean(), "hasGravity", "false", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_CreativeModeTab(), this.getCreativeModeTab(), "creativeModeTab", null, 1, 1,
				Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBlock_SoundType(), this.getSoundType(), "soundType", null, 1, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Harddness(), ecorePackage.getEFloat(), "harddness", "1.0", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_ExplosionResistance(), ecorePackage.getEFloat(), "explosionResistance", "1.0", 1, 1,
				Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBlock_Luminance(), ecorePackage.getEInt(), "luminance", "0", 1, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_RequiresCorrectToolForDrops(), ecorePackage.getEBoolean(),
				"requiresCorrectToolForDrops", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_RedstoneSignal(), ecorePackage.getEInt(), "redstoneSignal", "0", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_CanWalkThrough(), ecorePackage.getEBoolean(), "canWalkThrough", "false", 1, 1,
				Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBlock_Slipperiness(), ecorePackage.getEFloat(), "slipperiness", "0.6", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_JumpFactor(), ecorePackage.getEFloat(), "jumpFactor", "1.0", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_SpeedFactor(), ecorePackage.getEFloat(), "speedFactor", "1.0", 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Translations(), this.getTranslation(), null, "translations", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_TexturePath(), ecorePackage.getEString(), "texturePath", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_MiningTool(), this.getMiningToolType(), "miningTool", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_MiningLevel(), this.getBlockMiningLevel(), "miningLevel", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_PotionEffect(), this.getPotionEffect(), "potionEffect", null, 1, 1, Effect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Level(), ecorePackage.getEInt(), "level", null, 1, 1, Effect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Duration(), ecorePackage.getEDouble(), "duration", null, 1, 1, Effect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Visible(), ecorePackage.getEBoolean(), "visible", "true", 1, 1, Effect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfOtherEffectEClass, SelfOtherEffect.class, "SelfOtherEffect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelfOtherEffect_IsSelf(), ecorePackage.getEBoolean(), "isSelf", null, 1, 1,
				SelfOtherEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(onTickEffectEClass, OnTickEffect.class, "OnTickEffect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnTickEffect_NeedsSelected(), ecorePackage.getEBoolean(), "needsSelected", null, 1, 1,
				OnTickEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(translationEClass, Translation.class, "Translation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Translation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_Lang(), ecorePackage.getEString(), "lang", "en_us", 1, 1, Translation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTranslation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(potionEffectEEnum, PotionEffect.class, "PotionEffect");
		addEEnumLiteral(potionEffectEEnum, PotionEffect.ABSORPTION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.BAD_OMEN);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.BLINDNESS);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.CONDUIT_POWER);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.CONFUSION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.DAMAGE_BOOST);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.DAMAGE_RESISTANCE);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.DIG_SLOWDOWN);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.DIG_SPEED);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.DOLPHINS_GRACE);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.FIRE_RESISTANCE);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.GLOWING);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.HARM);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.HEAL);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.HEALTH_BOOST);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.HUNGER);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.INVISIBILITY);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.JUMP);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.LEVITATION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.LUCK);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.MOVEMENT_SLOWDOWN);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.MOVEMENT_SPEED);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.NIGHT_VISION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.POISON);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.REGENERATION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.SATURATION);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.SLOW_FALLING);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.UNLUCK);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.WATER_BREATHING);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.WEAKNESS);
		addEEnumLiteral(potionEffectEEnum, PotionEffect.WITHER);

		initEEnum(rarityEEnum, Rarity.class, "Rarity");
		addEEnumLiteral(rarityEEnum, Rarity.COMMON);
		addEEnumLiteral(rarityEEnum, Rarity.UNCOMMON);
		addEEnumLiteral(rarityEEnum, Rarity.RARE);
		addEEnumLiteral(rarityEEnum, Rarity.EPIC);

		initEEnum(creativeModeTabEEnum, CreativeModeTab.class, "CreativeModeTab");
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.BREWING);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.BUILDING_BLOCKS);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.COMBAT);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.DECORATIONS);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.FOOD);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.MISC);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.REDSTONE);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.TOOLS);
		addEEnumLiteral(creativeModeTabEEnum, CreativeModeTab.TRANSPORTATION);

		initEEnum(miningToolTypeEEnum, MiningToolType.class, "MiningToolType");
		addEEnumLiteral(miningToolTypeEEnum, MiningToolType.AXE);
		addEEnumLiteral(miningToolTypeEEnum, MiningToolType.HOE);
		addEEnumLiteral(miningToolTypeEEnum, MiningToolType.PICKAXE);
		addEEnumLiteral(miningToolTypeEEnum, MiningToolType.SHOVEL);

		initEEnum(toolTypeEEnum, ToolType.class, "ToolType");
		addEEnumLiteral(toolTypeEEnum, ToolType.AXE);
		addEEnumLiteral(toolTypeEEnum, ToolType.HOE);
		addEEnumLiteral(toolTypeEEnum, ToolType.PICKAXE);
		addEEnumLiteral(toolTypeEEnum, ToolType.SHOVEL);
		addEEnumLiteral(toolTypeEEnum, ToolType.SWORD);

		initEEnum(miningLevelEEnum, MiningLevel.class, "MiningLevel");
		addEEnumLiteral(miningLevelEEnum, MiningLevel.WOOD);
		addEEnumLiteral(miningLevelEEnum, MiningLevel.STONE);
		addEEnumLiteral(miningLevelEEnum, MiningLevel.IRON);
		addEEnumLiteral(miningLevelEEnum, MiningLevel.DIAMOND);
		addEEnumLiteral(miningLevelEEnum, MiningLevel.NETHERITE);

		initEEnum(blockMiningLevelEEnum, BlockMiningLevel.class, "BlockMiningLevel");
		addEEnumLiteral(blockMiningLevelEEnum, BlockMiningLevel.NONE);
		addEEnumLiteral(blockMiningLevelEEnum, BlockMiningLevel.STONE);
		addEEnumLiteral(blockMiningLevelEEnum, BlockMiningLevel.IRON);
		addEEnumLiteral(blockMiningLevelEEnum, BlockMiningLevel.DIAMOND);

		initEEnum(soundTypeEEnum, SoundType.class, "SoundType");
		addEEnumLiteral(soundTypeEEnum, SoundType.AMETHYST);
		addEEnumLiteral(soundTypeEEnum, SoundType.CROP);
		addEEnumLiteral(soundTypeEEnum, SoundType.GLASS);
		addEEnumLiteral(soundTypeEEnum, SoundType.GRASS);
		addEEnumLiteral(soundTypeEEnum, SoundType.GRAVEL);
		addEEnumLiteral(soundTypeEEnum, SoundType.LADDER);
		addEEnumLiteral(soundTypeEEnum, SoundType.LANTERN);
		addEEnumLiteral(soundTypeEEnum, SoundType.LILY_PAD);
		addEEnumLiteral(soundTypeEEnum, SoundType.METAL);
		addEEnumLiteral(soundTypeEEnum, SoundType.NETHERRACK);
		addEEnumLiteral(soundTypeEEnum, SoundType.NETHER_ORE);
		addEEnumLiteral(soundTypeEEnum, SoundType.SAND);
		addEEnumLiteral(soundTypeEEnum, SoundType.SLIME_BLOCK);
		addEEnumLiteral(soundTypeEEnum, SoundType.SNOW);
		addEEnumLiteral(soundTypeEEnum, SoundType.SOUL_SAND);
		addEEnumLiteral(soundTypeEEnum, SoundType.STONE);
		addEEnumLiteral(soundTypeEEnum, SoundType.WET_GRASS);
		addEEnumLiteral(soundTypeEEnum, SoundType.WOOD);
		addEEnumLiteral(soundTypeEEnum, SoundType.WOOL);

		// Create resource
		createResource(eNS_URI);
	}

} //OzelotPackageImpl
