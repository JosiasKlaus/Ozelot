/**
 */
package ozelot;

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
 * @see ozelot.OzelotFactory
 * @model kind="package"
 * @generated
 */
public interface OzelotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ozelot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thm.de/ozelot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ozelot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OzelotPackage eINSTANCE = ozelot.impl.OzelotPackageImpl.init();

	/**
	 * The meta object id for the '{@link ozelot.impl.ModImpl <em>Mod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.ModImpl
	 * @see ozelot.impl.OzelotPackageImpl#getMod()
	 * @generated
	 */
	int MOD = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Mod Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__MOD_ID = 2;

	/**
	 * The number of structural features of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.ItemImpl
	 * @see ozelot.impl.OzelotPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Tool Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TOOL_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ON_TICK = 1;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ON_ATTACK = 2;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICON_PATH = 3;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GLOWS = 4;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MAX_STACK_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_IMMUNE_TO_FIRE = 6;

	/**
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_ID = 7;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.UsableItemImpl <em>Usable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.UsableItemImpl
	 * @see ozelot.impl.OzelotPackageImpl#getUsableItem()
	 * @generated
	 */
	int USABLE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Tool Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__TOOL_PROPERTY = ITEM__TOOL_PROPERTY;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__ON_TICK = ITEM__ON_TICK;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__ON_ATTACK = ITEM__ON_ATTACK;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__ICON_PATH = ITEM__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__GLOWS = ITEM__GLOWS;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__MAX_STACK_SIZE = ITEM__MAX_STACK_SIZE;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__IS_IMMUNE_TO_FIRE = ITEM__IS_IMMUNE_TO_FIRE;

	/**
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__ITEM_ID = ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Food Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__FOOD_PROPERTY = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM__ON_USE = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Usable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.FoodItemImpl <em>Food Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.FoodItemImpl
	 * @see ozelot.impl.OzelotPackageImpl#getFoodItem()
	 * @generated
	 */
	int FOOD_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Tool Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__TOOL_PROPERTY = USABLE_ITEM__TOOL_PROPERTY;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_TICK = USABLE_ITEM__ON_TICK;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_ATTACK = USABLE_ITEM__ON_ATTACK;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ICON_PATH = USABLE_ITEM__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__GLOWS = USABLE_ITEM__GLOWS;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__MAX_STACK_SIZE = USABLE_ITEM__MAX_STACK_SIZE;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_IMMUNE_TO_FIRE = USABLE_ITEM__IS_IMMUNE_TO_FIRE;

	/**
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ITEM_ID = USABLE_ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Food Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__FOOD_PROPERTY = USABLE_ITEM__FOOD_PROPERTY;

	/**
	 * The feature id for the '<em><b>On Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_USE = USABLE_ITEM__ON_USE;

	/**
	 * The feature id for the '<em><b>Nutrition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__NUTRITION = USABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__SATURATION = USABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Meat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_MEAT = USABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Always Edible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_ALWAYS_EDIBLE = USABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_FEATURE_COUNT = USABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_OPERATION_COUNT = USABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.ToolPropertyImpl <em>Tool Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.ToolPropertyImpl
	 * @see ozelot.impl.OzelotPackageImpl#getToolProperty()
	 * @generated
	 */
	int TOOL_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Tool Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tool Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.BlockImpl
	 * @see ozelot.impl.OzelotPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>On Step On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ON_STEP_ON = 0;

	/**
	 * The feature id for the '<em><b>On Destroyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ON_DESTROYED = 1;

	/**
	 * The feature id for the '<em><b>On Placed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ON_PLACED = 2;

	/**
	 * The feature id for the '<em><b>Block Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_ID = 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.EffectImpl
	 * @see ozelot.impl.OzelotPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 6;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.SelfOtherEffectImpl <em>Self Other Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.SelfOtherEffectImpl
	 * @see ozelot.impl.OzelotPackageImpl#getSelfOtherEffect()
	 * @generated
	 */
	int SELF_OTHER_EFFECT = 7;

	/**
	 * The number of structural features of the '<em>Self Other Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Other Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.OnTickEffectImpl <em>On Tick Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.OnTickEffectImpl
	 * @see ozelot.impl.OzelotPackageImpl#getOnTickEffect()
	 * @generated
	 */
	int ON_TICK_EFFECT = 8;

	/**
	 * The number of structural features of the '<em>On Tick Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Tick Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ozelot.Mod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod</em>'.
	 * @see ozelot.Mod
	 * @generated
	 */
	EClass getMod();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Mod#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see ozelot.Mod#getItems()
	 * @see #getMod()
	 * @generated
	 */
	EReference getMod_Items();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Mod#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocks</em>'.
	 * @see ozelot.Mod#getBlocks()
	 * @see #getMod()
	 * @generated
	 */
	EReference getMod_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getModId <em>Mod Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod Id</em>'.
	 * @see ozelot.Mod#getModId()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_ModId();

	/**
	 * Returns the meta object for class '{@link ozelot.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see ozelot.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link ozelot.Item#getToolProperty <em>Tool Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Property</em>'.
	 * @see ozelot.Item#getToolProperty()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ToolProperty();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Item#getOnTick <em>On Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Tick</em>'.
	 * @see ozelot.Item#getOnTick()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OnTick();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Item#getOnAttack <em>On Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Attack</em>'.
	 * @see ozelot.Item#getOnAttack()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OnAttack();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see ozelot.Item#getIconPath()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IconPath();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#isGlows <em>Glows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glows</em>'.
	 * @see ozelot.Item#isGlows()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Glows();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#getMaxStackSize <em>Max Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Stack Size</em>'.
	 * @see ozelot.Item#getMaxStackSize()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_MaxStackSize();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#isIsImmuneToFire <em>Is Immune To Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immune To Fire</em>'.
	 * @see ozelot.Item#isIsImmuneToFire()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsImmuneToFire();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#getItemId <em>Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Id</em>'.
	 * @see ozelot.Item#getItemId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemId();

	/**
	 * Returns the meta object for class '{@link ozelot.UsableItem <em>Usable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usable Item</em>'.
	 * @see ozelot.UsableItem
	 * @generated
	 */
	EClass getUsableItem();

	/**
	 * Returns the meta object for the reference '{@link ozelot.UsableItem#getFoodProperty <em>Food Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Food Property</em>'.
	 * @see ozelot.UsableItem#getFoodProperty()
	 * @see #getUsableItem()
	 * @generated
	 */
	EReference getUsableItem_FoodProperty();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.UsableItem#getOnUse <em>On Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Use</em>'.
	 * @see ozelot.UsableItem#getOnUse()
	 * @see #getUsableItem()
	 * @generated
	 */
	EReference getUsableItem_OnUse();

	/**
	 * Returns the meta object for class '{@link ozelot.FoodItem <em>Food Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Item</em>'.
	 * @see ozelot.FoodItem
	 * @generated
	 */
	EClass getFoodItem();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.FoodItem#getNutrition <em>Nutrition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nutrition</em>'.
	 * @see ozelot.FoodItem#getNutrition()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_Nutrition();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.FoodItem#getSaturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturation</em>'.
	 * @see ozelot.FoodItem#getSaturation()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_Saturation();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.FoodItem#isIsMeat <em>Is Meat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Meat</em>'.
	 * @see ozelot.FoodItem#isIsMeat()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_IsMeat();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.FoodItem#isIsAlwaysEdible <em>Is Always Edible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Always Edible</em>'.
	 * @see ozelot.FoodItem#isIsAlwaysEdible()
	 * @see #getFoodItem()
	 * @generated
	 */
	EAttribute getFoodItem_IsAlwaysEdible();

	/**
	 * Returns the meta object for class '{@link ozelot.ToolProperty <em>Tool Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Property</em>'.
	 * @see ozelot.ToolProperty
	 * @generated
	 */
	EClass getToolProperty();

	/**
	 * Returns the meta object for class '{@link ozelot.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ozelot.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Block#getOnStepOn <em>On Step On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Step On</em>'.
	 * @see ozelot.Block#getOnStepOn()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OnStepOn();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Block#getOnDestroyed <em>On Destroyed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Destroyed</em>'.
	 * @see ozelot.Block#getOnDestroyed()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OnDestroyed();

	/**
	 * Returns the meta object for the reference list '{@link ozelot.Block#getOnPlaced <em>On Placed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Placed</em>'.
	 * @see ozelot.Block#getOnPlaced()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OnPlaced();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getBlockId <em>Block Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Id</em>'.
	 * @see ozelot.Block#getBlockId()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BlockId();

	/**
	 * Returns the meta object for class '{@link ozelot.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see ozelot.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for class '{@link ozelot.SelfOtherEffect <em>Self Other Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Other Effect</em>'.
	 * @see ozelot.SelfOtherEffect
	 * @generated
	 */
	EClass getSelfOtherEffect();

	/**
	 * Returns the meta object for class '{@link ozelot.OnTickEffect <em>On Tick Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Tick Effect</em>'.
	 * @see ozelot.OnTickEffect
	 * @generated
	 */
	EClass getOnTickEffect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OzelotFactory getOzelotFactory();

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
		 * The meta object literal for the '{@link ozelot.impl.ModImpl <em>Mod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.ModImpl
		 * @see ozelot.impl.OzelotPackageImpl#getMod()
		 * @generated
		 */
		EClass MOD = eINSTANCE.getMod();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD__ITEMS = eINSTANCE.getMod_Items();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD__BLOCKS = eINSTANCE.getMod_Blocks();

		/**
		 * The meta object literal for the '<em><b>Mod Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__MOD_ID = eINSTANCE.getMod_ModId();

		/**
		 * The meta object literal for the '{@link ozelot.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.ItemImpl
		 * @see ozelot.impl.OzelotPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Tool Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__TOOL_PROPERTY = eINSTANCE.getItem_ToolProperty();

		/**
		 * The meta object literal for the '<em><b>On Tick</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ON_TICK = eINSTANCE.getItem_OnTick();

		/**
		 * The meta object literal for the '<em><b>On Attack</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ON_ATTACK = eINSTANCE.getItem_OnAttack();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICON_PATH = eINSTANCE.getItem_IconPath();

		/**
		 * The meta object literal for the '<em><b>Glows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__GLOWS = eINSTANCE.getItem_Glows();

		/**
		 * The meta object literal for the '<em><b>Max Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__MAX_STACK_SIZE = eINSTANCE.getItem_MaxStackSize();

		/**
		 * The meta object literal for the '<em><b>Is Immune To Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_IMMUNE_TO_FIRE = eINSTANCE.getItem_IsImmuneToFire();

		/**
		 * The meta object literal for the '<em><b>Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_ID = eINSTANCE.getItem_ItemId();

		/**
		 * The meta object literal for the '{@link ozelot.impl.UsableItemImpl <em>Usable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.UsableItemImpl
		 * @see ozelot.impl.OzelotPackageImpl#getUsableItem()
		 * @generated
		 */
		EClass USABLE_ITEM = eINSTANCE.getUsableItem();

		/**
		 * The meta object literal for the '<em><b>Food Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABLE_ITEM__FOOD_PROPERTY = eINSTANCE.getUsableItem_FoodProperty();

		/**
		 * The meta object literal for the '<em><b>On Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABLE_ITEM__ON_USE = eINSTANCE.getUsableItem_OnUse();

		/**
		 * The meta object literal for the '{@link ozelot.impl.FoodItemImpl <em>Food Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.FoodItemImpl
		 * @see ozelot.impl.OzelotPackageImpl#getFoodItem()
		 * @generated
		 */
		EClass FOOD_ITEM = eINSTANCE.getFoodItem();

		/**
		 * The meta object literal for the '<em><b>Nutrition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__NUTRITION = eINSTANCE.getFoodItem_Nutrition();

		/**
		 * The meta object literal for the '<em><b>Saturation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__SATURATION = eINSTANCE.getFoodItem_Saturation();

		/**
		 * The meta object literal for the '<em><b>Is Meat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__IS_MEAT = eINSTANCE.getFoodItem_IsMeat();

		/**
		 * The meta object literal for the '<em><b>Is Always Edible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_ITEM__IS_ALWAYS_EDIBLE = eINSTANCE.getFoodItem_IsAlwaysEdible();

		/**
		 * The meta object literal for the '{@link ozelot.impl.ToolPropertyImpl <em>Tool Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.ToolPropertyImpl
		 * @see ozelot.impl.OzelotPackageImpl#getToolProperty()
		 * @generated
		 */
		EClass TOOL_PROPERTY = eINSTANCE.getToolProperty();

		/**
		 * The meta object literal for the '{@link ozelot.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.BlockImpl
		 * @see ozelot.impl.OzelotPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>On Step On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ON_STEP_ON = eINSTANCE.getBlock_OnStepOn();

		/**
		 * The meta object literal for the '<em><b>On Destroyed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ON_DESTROYED = eINSTANCE.getBlock_OnDestroyed();

		/**
		 * The meta object literal for the '<em><b>On Placed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ON_PLACED = eINSTANCE.getBlock_OnPlaced();

		/**
		 * The meta object literal for the '<em><b>Block Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_ID = eINSTANCE.getBlock_BlockId();

		/**
		 * The meta object literal for the '{@link ozelot.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.EffectImpl
		 * @see ozelot.impl.OzelotPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '{@link ozelot.impl.SelfOtherEffectImpl <em>Self Other Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.SelfOtherEffectImpl
		 * @see ozelot.impl.OzelotPackageImpl#getSelfOtherEffect()
		 * @generated
		 */
		EClass SELF_OTHER_EFFECT = eINSTANCE.getSelfOtherEffect();

		/**
		 * The meta object literal for the '{@link ozelot.impl.OnTickEffectImpl <em>On Tick Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.OnTickEffectImpl
		 * @see ozelot.impl.OzelotPackageImpl#getOnTickEffect()
		 * @generated
		 */
		EClass ON_TICK_EFFECT = eINSTANCE.getOnTickEffect();

	}

} //OzelotPackage
