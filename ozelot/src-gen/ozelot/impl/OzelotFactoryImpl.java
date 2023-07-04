/**
 */
package ozelot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ozelot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OzelotFactoryImpl extends EFactoryImpl implements OzelotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OzelotFactory init() {
		try {
			OzelotFactory theOzelotFactory = (OzelotFactory) EPackage.Registry.INSTANCE
					.getEFactory(OzelotPackage.eNS_URI);
			if (theOzelotFactory != null) {
				return theOzelotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OzelotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OzelotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OzelotPackage.MOD:
			return createMod();
		case OzelotPackage.ITEM:
			return createItem();
		case OzelotPackage.FOOD_ITEM:
			return createFoodItem();
		case OzelotPackage.TOOL_PROPERTY:
			return createToolProperty();
		case OzelotPackage.BLOCK:
			return createBlock();
		case OzelotPackage.EFFECT:
			return createEffect();
		case OzelotPackage.SELF_OTHER_EFFECT:
			return createSelfOtherEffect();
		case OzelotPackage.ON_TICK_EFFECT:
			return createOnTickEffect();
		case OzelotPackage.TRANSLATION:
			return createTranslation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case OzelotPackage.POTION_EFFECT:
			return createPotionEffectFromString(eDataType, initialValue);
		case OzelotPackage.RARITY:
			return createRarityFromString(eDataType, initialValue);
		case OzelotPackage.CREATIVE_MODE_TAB:
			return createCreativeModeTabFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case OzelotPackage.POTION_EFFECT:
			return convertPotionEffectToString(eDataType, instanceValue);
		case OzelotPackage.RARITY:
			return convertRarityToString(eDataType, instanceValue);
		case OzelotPackage.CREATIVE_MODE_TAB:
			return convertCreativeModeTabToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mod createMod() {
		ModImpl mod = new ModImpl();
		return mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodItem createFoodItem() {
		FoodItemImpl foodItem = new FoodItemImpl();
		return foodItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolProperty createToolProperty() {
		ToolPropertyImpl toolProperty = new ToolPropertyImpl();
		return toolProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffect() {
		EffectImpl effect = new EffectImpl();
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfOtherEffect createSelfOtherEffect() {
		SelfOtherEffectImpl selfOtherEffect = new SelfOtherEffectImpl();
		return selfOtherEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnTickEffect createOnTickEffect() {
		OnTickEffectImpl onTickEffect = new OnTickEffectImpl();
		return onTickEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotionEffect createPotionEffectFromString(EDataType eDataType, String initialValue) {
		PotionEffect result = PotionEffect.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPotionEffectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rarity createRarityFromString(EDataType eDataType, String initialValue) {
		Rarity result = Rarity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRarityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreativeModeTab createCreativeModeTabFromString(EDataType eDataType, String initialValue) {
		CreativeModeTab result = CreativeModeTab.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreativeModeTabToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OzelotPackage getOzelotPackage() {
		return (OzelotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OzelotPackage getPackage() {
		return OzelotPackage.eINSTANCE;
	}

} //OzelotFactoryImpl
