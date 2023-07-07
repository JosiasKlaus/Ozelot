/**
 */
package ozelot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Mod Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__MOD_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__AUTHORS = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__BLOCKS = 5;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__ICON_PATH = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICON_PATH = 1;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GLOWS = 2;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MAX_STACK_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_IMMUNE_TO_FIRE = 4;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RARITY = 5;

	/**
	 * The feature id for the '<em><b>Creative Mode Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATIVE_MODE_TAB = 6;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TRANSLATIONS = 7;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ON_ATTACK = 8;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ON_TICK = 9;

	/**
	 * The feature id for the '<em><b>On Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ON_USE = 10;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.ToolItemImpl <em>Tool Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.ToolItemImpl
	 * @see ozelot.impl.OzelotPackageImpl#getToolItem()
	 * @generated
	 */
	int TOOL_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ITEM_ID = ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ICON_PATH = ITEM__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__GLOWS = ITEM__GLOWS;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__MAX_STACK_SIZE = ITEM__MAX_STACK_SIZE;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__IS_IMMUNE_TO_FIRE = ITEM__IS_IMMUNE_TO_FIRE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__RARITY = ITEM__RARITY;

	/**
	 * The feature id for the '<em><b>Creative Mode Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__CREATIVE_MODE_TAB = ITEM__CREATIVE_MODE_TAB;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__TRANSLATIONS = ITEM__TRANSLATIONS;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ON_ATTACK = ITEM__ON_ATTACK;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ON_TICK = ITEM__ON_TICK;

	/**
	 * The feature id for the '<em><b>On Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ON_USE = ITEM__ON_USE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__TYPE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mining Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__MINING_LEVEL = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__DURABILITY = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__SPEED = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__DAMAGE = ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enchantment Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__ENCHANTMENT_VALUE = ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Repair Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM__REPAIR_ITEM = ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tool Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tool Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ITEM_ID = ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ICON_PATH = ITEM__ICON_PATH;

	/**
	 * The feature id for the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__GLOWS = ITEM__GLOWS;

	/**
	 * The feature id for the '<em><b>Max Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__MAX_STACK_SIZE = ITEM__MAX_STACK_SIZE;

	/**
	 * The feature id for the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_IMMUNE_TO_FIRE = ITEM__IS_IMMUNE_TO_FIRE;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__RARITY = ITEM__RARITY;

	/**
	 * The feature id for the '<em><b>Creative Mode Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__CREATIVE_MODE_TAB = ITEM__CREATIVE_MODE_TAB;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__TRANSLATIONS = ITEM__TRANSLATIONS;

	/**
	 * The feature id for the '<em><b>On Attack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_ATTACK = ITEM__ON_ATTACK;

	/**
	 * The feature id for the '<em><b>On Tick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_TICK = ITEM__ON_TICK;

	/**
	 * The feature id for the '<em><b>On Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__ON_USE = ITEM__ON_USE;

	/**
	 * The feature id for the '<em><b>Nutrition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__NUTRITION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__SATURATION = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Meat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_MEAT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Always Edible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__IS_ALWAYS_EDIBLE = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>After Eating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM__AFTER_EATING = ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Food Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.BlockImpl
	 * @see ozelot.impl.OzelotPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Block Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_ID = 0;

	/**
	 * The feature id for the '<em><b>Has Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HAS_GRAVITY = 1;

	/**
	 * The feature id for the '<em><b>Creative Mode Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CREATIVE_MODE_TAB = 2;

	/**
	 * The feature id for the '<em><b>Sound Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SOUND_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Harddness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HARDDNESS = 4;

	/**
	 * The feature id for the '<em><b>Explosion Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXPLOSION_RESISTANCE = 5;

	/**
	 * The feature id for the '<em><b>Luminance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LUMINANCE = 6;

	/**
	 * The feature id for the '<em><b>Requires Correct Tool For Drops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS = 7;

	/**
	 * The feature id for the '<em><b>Redstone Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REDSTONE_SIGNAL = 8;

	/**
	 * The feature id for the '<em><b>Can Walk Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CAN_WALK_THROUGH = 9;

	/**
	 * The feature id for the '<em><b>Slipperiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SLIPPERINESS = 10;

	/**
	 * The feature id for the '<em><b>Jump Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__JUMP_FACTOR = 11;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SPEED_FACTOR = 12;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRANSLATIONS = 13;

	/**
	 * The feature id for the '<em><b>Texture Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TEXTURE_PATH = 14;

	/**
	 * The feature id for the '<em><b>Mining Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MINING_TOOL = 15;

	/**
	 * The feature id for the '<em><b>Mining Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MINING_LEVEL = 16;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 17;

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
	int EFFECT = 5;

	/**
	 * The feature id for the '<em><b>Potion Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__POTION_EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__VISIBLE = 3;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 4;

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
	int SELF_OTHER_EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Potion Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT__POTION_EFFECT = EFFECT__POTION_EFFECT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT__LEVEL = EFFECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT__VISIBLE = EFFECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT__IS_SELF = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Self Other Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OTHER_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

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
	int ON_TICK_EFFECT = 7;

	/**
	 * The feature id for the '<em><b>Potion Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT__POTION_EFFECT = EFFECT__POTION_EFFECT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT__LEVEL = EFFECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT__VISIBLE = EFFECT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Needs Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT__NEEDS_SELECTED = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Tick Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Tick Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_TICK_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ozelot.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.impl.TranslationImpl
	 * @see ozelot.impl.OzelotPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANG = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ozelot.PotionEffect <em>Potion Effect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.PotionEffect
	 * @see ozelot.impl.OzelotPackageImpl#getPotionEffect()
	 * @generated
	 */
	int POTION_EFFECT = 9;

	/**
	 * The meta object id for the '{@link ozelot.Rarity <em>Rarity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.Rarity
	 * @see ozelot.impl.OzelotPackageImpl#getRarity()
	 * @generated
	 */
	int RARITY = 10;

	/**
	 * The meta object id for the '{@link ozelot.CreativeModeTab <em>Creative Mode Tab</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.CreativeModeTab
	 * @see ozelot.impl.OzelotPackageImpl#getCreativeModeTab()
	 * @generated
	 */
	int CREATIVE_MODE_TAB = 11;

	/**
	 * The meta object id for the '{@link ozelot.MiningToolType <em>Mining Tool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.MiningToolType
	 * @see ozelot.impl.OzelotPackageImpl#getMiningToolType()
	 * @generated
	 */
	int MINING_TOOL_TYPE = 12;

	/**
	 * The meta object id for the '{@link ozelot.ToolType <em>Tool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.ToolType
	 * @see ozelot.impl.OzelotPackageImpl#getToolType()
	 * @generated
	 */
	int TOOL_TYPE = 13;

	/**
	 * The meta object id for the '{@link ozelot.MiningLevel <em>Mining Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.MiningLevel
	 * @see ozelot.impl.OzelotPackageImpl#getMiningLevel()
	 * @generated
	 */
	int MINING_LEVEL = 14;

	/**
	 * The meta object id for the '{@link ozelot.BlockMiningLevel <em>Block Mining Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.BlockMiningLevel
	 * @see ozelot.impl.OzelotPackageImpl#getBlockMiningLevel()
	 * @generated
	 */
	int BLOCK_MINING_LEVEL = 15;

	/**
	 * The meta object id for the '{@link ozelot.SoundType <em>Sound Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ozelot.SoundType
	 * @see ozelot.impl.OzelotPackageImpl#getSoundType()
	 * @generated
	 */
	int SOUND_TYPE = 16;

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
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ozelot.Mod#getName()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_Name();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ozelot.Mod#getDescription()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_Description();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authors</em>'.
	 * @see ozelot.Mod#getAuthors()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_Authors();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Mod#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ozelot.Mod#getItems()
	 * @see #getMod()
	 * @generated
	 */
	EReference getMod_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Mod#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see ozelot.Mod#getBlocks()
	 * @see #getMod()
	 * @generated
	 */
	EReference getMod_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see ozelot.Mod#getIconPath()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_IconPath();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Mod#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ozelot.Mod#getVersion()
	 * @see #getMod()
	 * @generated
	 */
	EAttribute getMod_Version();

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
	 * Returns the meta object for the attribute '{@link ozelot.Item#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see ozelot.Item#getRarity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Item#getCreativeModeTab <em>Creative Mode Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creative Mode Tab</em>'.
	 * @see ozelot.Item#getCreativeModeTab()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_CreativeModeTab();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Item#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see ozelot.Item#getTranslations()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Translations();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Item#getOnAttack <em>On Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Attack</em>'.
	 * @see ozelot.Item#getOnAttack()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OnAttack();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Item#getOnTick <em>On Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Tick</em>'.
	 * @see ozelot.Item#getOnTick()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OnTick();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Item#getOnUse <em>On Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Use</em>'.
	 * @see ozelot.Item#getOnUse()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OnUse();

	/**
	 * Returns the meta object for class '{@link ozelot.ToolItem <em>Tool Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Item</em>'.
	 * @see ozelot.ToolItem
	 * @generated
	 */
	EClass getToolItem();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ozelot.ToolItem#getType()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getMiningLevel <em>Mining Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mining Level</em>'.
	 * @see ozelot.ToolItem#getMiningLevel()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_MiningLevel();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getDurability <em>Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durability</em>'.
	 * @see ozelot.ToolItem#getDurability()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_Durability();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see ozelot.ToolItem#getSpeed()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_Speed();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see ozelot.ToolItem#getDamage()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_Damage();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.ToolItem#getEnchantmentValue <em>Enchantment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enchantment Value</em>'.
	 * @see ozelot.ToolItem#getEnchantmentValue()
	 * @see #getToolItem()
	 * @generated
	 */
	EAttribute getToolItem_EnchantmentValue();

	/**
	 * Returns the meta object for the reference '{@link ozelot.ToolItem#getRepairItem <em>Repair Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Item</em>'.
	 * @see ozelot.ToolItem#getRepairItem()
	 * @see #getToolItem()
	 * @generated
	 */
	EReference getToolItem_RepairItem();

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
	 * Returns the meta object for the containment reference list '{@link ozelot.FoodItem#getAfterEating <em>After Eating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Eating</em>'.
	 * @see ozelot.FoodItem#getAfterEating()
	 * @see #getFoodItem()
	 * @generated
	 */
	EReference getFoodItem_AfterEating();

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
	 * Returns the meta object for the attribute '{@link ozelot.Block#isHasGravity <em>Has Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Gravity</em>'.
	 * @see ozelot.Block#isHasGravity()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_HasGravity();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getCreativeModeTab <em>Creative Mode Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creative Mode Tab</em>'.
	 * @see ozelot.Block#getCreativeModeTab()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_CreativeModeTab();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getSoundType <em>Sound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Type</em>'.
	 * @see ozelot.Block#getSoundType()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_SoundType();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getHarddness <em>Harddness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Harddness</em>'.
	 * @see ozelot.Block#getHarddness()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Harddness();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getExplosionResistance <em>Explosion Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explosion Resistance</em>'.
	 * @see ozelot.Block#getExplosionResistance()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_ExplosionResistance();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getLuminance <em>Luminance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminance</em>'.
	 * @see ozelot.Block#getLuminance()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Luminance();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#isRequiresCorrectToolForDrops <em>Requires Correct Tool For Drops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Correct Tool For Drops</em>'.
	 * @see ozelot.Block#isRequiresCorrectToolForDrops()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_RequiresCorrectToolForDrops();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getRedstoneSignal <em>Redstone Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redstone Signal</em>'.
	 * @see ozelot.Block#getRedstoneSignal()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_RedstoneSignal();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#isCanWalkThrough <em>Can Walk Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Walk Through</em>'.
	 * @see ozelot.Block#isCanWalkThrough()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_CanWalkThrough();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getSlipperiness <em>Slipperiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slipperiness</em>'.
	 * @see ozelot.Block#getSlipperiness()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Slipperiness();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getJumpFactor <em>Jump Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Factor</em>'.
	 * @see ozelot.Block#getJumpFactor()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_JumpFactor();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see ozelot.Block#getSpeedFactor()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_SpeedFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link ozelot.Block#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see ozelot.Block#getTranslations()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Translations();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getTexturePath <em>Texture Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Path</em>'.
	 * @see ozelot.Block#getTexturePath()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_TexturePath();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getMiningTool <em>Mining Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mining Tool</em>'.
	 * @see ozelot.Block#getMiningTool()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_MiningTool();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Block#getMiningLevel <em>Mining Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mining Level</em>'.
	 * @see ozelot.Block#getMiningLevel()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_MiningLevel();

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
	 * Returns the meta object for the attribute '{@link ozelot.Effect#getPotionEffect <em>Potion Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potion Effect</em>'.
	 * @see ozelot.Effect#getPotionEffect()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_PotionEffect();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Effect#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ozelot.Effect#getLevel()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Level();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Effect#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ozelot.Effect#getDuration()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Duration();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Effect#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ozelot.Effect#isVisible()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Visible();

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
	 * Returns the meta object for the attribute '{@link ozelot.SelfOtherEffect#isIsSelf <em>Is Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Self</em>'.
	 * @see ozelot.SelfOtherEffect#isIsSelf()
	 * @see #getSelfOtherEffect()
	 * @generated
	 */
	EAttribute getSelfOtherEffect_IsSelf();

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
	 * Returns the meta object for the attribute '{@link ozelot.OnTickEffect#isNeedsSelected <em>Needs Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Selected</em>'.
	 * @see ozelot.OnTickEffect#isNeedsSelected()
	 * @see #getOnTickEffect()
	 * @generated
	 */
	EAttribute getOnTickEffect_NeedsSelected();

	/**
	 * Returns the meta object for class '{@link ozelot.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see ozelot.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Translation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see ozelot.Translation#getLang()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Translation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ozelot.Translation#getName()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ozelot.Translation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ozelot.Translation#getDescription()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Description();

	/**
	 * Returns the meta object for enum '{@link ozelot.PotionEffect <em>Potion Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Potion Effect</em>'.
	 * @see ozelot.PotionEffect
	 * @generated
	 */
	EEnum getPotionEffect();

	/**
	 * Returns the meta object for enum '{@link ozelot.Rarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rarity</em>'.
	 * @see ozelot.Rarity
	 * @generated
	 */
	EEnum getRarity();

	/**
	 * Returns the meta object for enum '{@link ozelot.CreativeModeTab <em>Creative Mode Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Creative Mode Tab</em>'.
	 * @see ozelot.CreativeModeTab
	 * @generated
	 */
	EEnum getCreativeModeTab();

	/**
	 * Returns the meta object for enum '{@link ozelot.MiningToolType <em>Mining Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mining Tool Type</em>'.
	 * @see ozelot.MiningToolType
	 * @generated
	 */
	EEnum getMiningToolType();

	/**
	 * Returns the meta object for enum '{@link ozelot.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tool Type</em>'.
	 * @see ozelot.ToolType
	 * @generated
	 */
	EEnum getToolType();

	/**
	 * Returns the meta object for enum '{@link ozelot.MiningLevel <em>Mining Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mining Level</em>'.
	 * @see ozelot.MiningLevel
	 * @generated
	 */
	EEnum getMiningLevel();

	/**
	 * Returns the meta object for enum '{@link ozelot.BlockMiningLevel <em>Block Mining Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Mining Level</em>'.
	 * @see ozelot.BlockMiningLevel
	 * @generated
	 */
	EEnum getBlockMiningLevel();

	/**
	 * Returns the meta object for enum '{@link ozelot.SoundType <em>Sound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sound Type</em>'.
	 * @see ozelot.SoundType
	 * @generated
	 */
	EEnum getSoundType();

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
		 * The meta object literal for the '<em><b>Mod Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__MOD_ID = eINSTANCE.getMod_ModId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__NAME = eINSTANCE.getMod_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__DESCRIPTION = eINSTANCE.getMod_Description();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__AUTHORS = eINSTANCE.getMod_Authors();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD__ITEMS = eINSTANCE.getMod_Items();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD__BLOCKS = eINSTANCE.getMod_Blocks();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__ICON_PATH = eINSTANCE.getMod_IconPath();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD__VERSION = eINSTANCE.getMod_Version();

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
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__RARITY = eINSTANCE.getItem_Rarity();

		/**
		 * The meta object literal for the '<em><b>Creative Mode Tab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CREATIVE_MODE_TAB = eINSTANCE.getItem_CreativeModeTab();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__TRANSLATIONS = eINSTANCE.getItem_Translations();

		/**
		 * The meta object literal for the '<em><b>On Attack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ON_ATTACK = eINSTANCE.getItem_OnAttack();

		/**
		 * The meta object literal for the '<em><b>On Tick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ON_TICK = eINSTANCE.getItem_OnTick();

		/**
		 * The meta object literal for the '<em><b>On Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ON_USE = eINSTANCE.getItem_OnUse();

		/**
		 * The meta object literal for the '{@link ozelot.impl.ToolItemImpl <em>Tool Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.ToolItemImpl
		 * @see ozelot.impl.OzelotPackageImpl#getToolItem()
		 * @generated
		 */
		EClass TOOL_ITEM = eINSTANCE.getToolItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__TYPE = eINSTANCE.getToolItem_Type();

		/**
		 * The meta object literal for the '<em><b>Mining Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__MINING_LEVEL = eINSTANCE.getToolItem_MiningLevel();

		/**
		 * The meta object literal for the '<em><b>Durability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__DURABILITY = eINSTANCE.getToolItem_Durability();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__SPEED = eINSTANCE.getToolItem_Speed();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__DAMAGE = eINSTANCE.getToolItem_Damage();

		/**
		 * The meta object literal for the '<em><b>Enchantment Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ITEM__ENCHANTMENT_VALUE = eINSTANCE.getToolItem_EnchantmentValue();

		/**
		 * The meta object literal for the '<em><b>Repair Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_ITEM__REPAIR_ITEM = eINSTANCE.getToolItem_RepairItem();

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
		 * The meta object literal for the '<em><b>After Eating</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOD_ITEM__AFTER_EATING = eINSTANCE.getFoodItem_AfterEating();

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
		 * The meta object literal for the '<em><b>Block Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_ID = eINSTANCE.getBlock_BlockId();

		/**
		 * The meta object literal for the '<em><b>Has Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__HAS_GRAVITY = eINSTANCE.getBlock_HasGravity();

		/**
		 * The meta object literal for the '<em><b>Creative Mode Tab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__CREATIVE_MODE_TAB = eINSTANCE.getBlock_CreativeModeTab();

		/**
		 * The meta object literal for the '<em><b>Sound Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__SOUND_TYPE = eINSTANCE.getBlock_SoundType();

		/**
		 * The meta object literal for the '<em><b>Harddness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__HARDDNESS = eINSTANCE.getBlock_Harddness();

		/**
		 * The meta object literal for the '<em><b>Explosion Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__EXPLOSION_RESISTANCE = eINSTANCE.getBlock_ExplosionResistance();

		/**
		 * The meta object literal for the '<em><b>Luminance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__LUMINANCE = eINSTANCE.getBlock_Luminance();

		/**
		 * The meta object literal for the '<em><b>Requires Correct Tool For Drops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS = eINSTANCE.getBlock_RequiresCorrectToolForDrops();

		/**
		 * The meta object literal for the '<em><b>Redstone Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__REDSTONE_SIGNAL = eINSTANCE.getBlock_RedstoneSignal();

		/**
		 * The meta object literal for the '<em><b>Can Walk Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__CAN_WALK_THROUGH = eINSTANCE.getBlock_CanWalkThrough();

		/**
		 * The meta object literal for the '<em><b>Slipperiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__SLIPPERINESS = eINSTANCE.getBlock_Slipperiness();

		/**
		 * The meta object literal for the '<em><b>Jump Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__JUMP_FACTOR = eINSTANCE.getBlock_JumpFactor();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__SPEED_FACTOR = eINSTANCE.getBlock_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRANSLATIONS = eINSTANCE.getBlock_Translations();

		/**
		 * The meta object literal for the '<em><b>Texture Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__TEXTURE_PATH = eINSTANCE.getBlock_TexturePath();

		/**
		 * The meta object literal for the '<em><b>Mining Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__MINING_TOOL = eINSTANCE.getBlock_MiningTool();

		/**
		 * The meta object literal for the '<em><b>Mining Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__MINING_LEVEL = eINSTANCE.getBlock_MiningLevel();

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
		 * The meta object literal for the '<em><b>Potion Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__POTION_EFFECT = eINSTANCE.getEffect_PotionEffect();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__LEVEL = eINSTANCE.getEffect_Level();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DURATION = eINSTANCE.getEffect_Duration();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__VISIBLE = eINSTANCE.getEffect_Visible();

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
		 * The meta object literal for the '<em><b>Is Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_OTHER_EFFECT__IS_SELF = eINSTANCE.getSelfOtherEffect_IsSelf();

		/**
		 * The meta object literal for the '{@link ozelot.impl.OnTickEffectImpl <em>On Tick Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.OnTickEffectImpl
		 * @see ozelot.impl.OzelotPackageImpl#getOnTickEffect()
		 * @generated
		 */
		EClass ON_TICK_EFFECT = eINSTANCE.getOnTickEffect();

		/**
		 * The meta object literal for the '<em><b>Needs Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_TICK_EFFECT__NEEDS_SELECTED = eINSTANCE.getOnTickEffect_NeedsSelected();

		/**
		 * The meta object literal for the '{@link ozelot.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.impl.TranslationImpl
		 * @see ozelot.impl.OzelotPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__LANG = eINSTANCE.getTranslation_Lang();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__NAME = eINSTANCE.getTranslation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__DESCRIPTION = eINSTANCE.getTranslation_Description();

		/**
		 * The meta object literal for the '{@link ozelot.PotionEffect <em>Potion Effect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.PotionEffect
		 * @see ozelot.impl.OzelotPackageImpl#getPotionEffect()
		 * @generated
		 */
		EEnum POTION_EFFECT = eINSTANCE.getPotionEffect();

		/**
		 * The meta object literal for the '{@link ozelot.Rarity <em>Rarity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.Rarity
		 * @see ozelot.impl.OzelotPackageImpl#getRarity()
		 * @generated
		 */
		EEnum RARITY = eINSTANCE.getRarity();

		/**
		 * The meta object literal for the '{@link ozelot.CreativeModeTab <em>Creative Mode Tab</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.CreativeModeTab
		 * @see ozelot.impl.OzelotPackageImpl#getCreativeModeTab()
		 * @generated
		 */
		EEnum CREATIVE_MODE_TAB = eINSTANCE.getCreativeModeTab();

		/**
		 * The meta object literal for the '{@link ozelot.MiningToolType <em>Mining Tool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.MiningToolType
		 * @see ozelot.impl.OzelotPackageImpl#getMiningToolType()
		 * @generated
		 */
		EEnum MINING_TOOL_TYPE = eINSTANCE.getMiningToolType();

		/**
		 * The meta object literal for the '{@link ozelot.ToolType <em>Tool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.ToolType
		 * @see ozelot.impl.OzelotPackageImpl#getToolType()
		 * @generated
		 */
		EEnum TOOL_TYPE = eINSTANCE.getToolType();

		/**
		 * The meta object literal for the '{@link ozelot.MiningLevel <em>Mining Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.MiningLevel
		 * @see ozelot.impl.OzelotPackageImpl#getMiningLevel()
		 * @generated
		 */
		EEnum MINING_LEVEL = eINSTANCE.getMiningLevel();

		/**
		 * The meta object literal for the '{@link ozelot.BlockMiningLevel <em>Block Mining Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.BlockMiningLevel
		 * @see ozelot.impl.OzelotPackageImpl#getBlockMiningLevel()
		 * @generated
		 */
		EEnum BLOCK_MINING_LEVEL = eINSTANCE.getBlockMiningLevel();

		/**
		 * The meta object literal for the '{@link ozelot.SoundType <em>Sound Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ozelot.SoundType
		 * @see ozelot.impl.OzelotPackageImpl#getSoundType()
		 * @generated
		 */
		EEnum SOUND_TYPE = eINSTANCE.getSoundType();

	}

} //OzelotPackage
