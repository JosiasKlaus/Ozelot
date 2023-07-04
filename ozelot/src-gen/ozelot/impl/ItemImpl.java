/**
 */
package ozelot.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ozelot.CreativeModeTab;
import ozelot.Effect;
import ozelot.Item;
import ozelot.OnTickEffect;
import ozelot.OzelotPackage;
import ozelot.Rarity;
import ozelot.SelfOtherEffect;
import ozelot.ToolProperty;
import ozelot.Translation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.ItemImpl#getToolProperty <em>Tool Property</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#isGlows <em>Glows</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getMaxStackSize <em>Max Stack Size</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#isIsImmuneToFire <em>Is Immune To Fire</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getItemId <em>Item Id</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getCreativeModeTab <em>Creative Mode Tab</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getOnAttack <em>On Attack</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getOnTick <em>On Tick</em>}</li>
 *   <li>{@link ozelot.impl.ItemImpl#getOnUse <em>On Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getToolProperty() <em>Tool Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolProperty()
	 * @generated
	 * @ordered
	 */
	protected ToolProperty toolProperty;

	/**
	 * The default value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected String iconPath = ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isGlows() <em>Glows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlows()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlows() <em>Glows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlows()
	 * @generated
	 * @ordered
	 */
	protected boolean glows = GLOWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStackSize() <em>Max Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STACK_SIZE_EDEFAULT = 64;

	/**
	 * The cached value of the '{@link #getMaxStackSize() <em>Max Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStackSize()
	 * @generated
	 * @ordered
	 */
	protected int maxStackSize = MAX_STACK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsImmuneToFire() <em>Is Immune To Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmuneToFire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMMUNE_TO_FIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImmuneToFire() <em>Is Immune To Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmuneToFire()
	 * @generated
	 * @ordered
	 */
	protected boolean isImmuneToFire = IS_IMMUNE_TO_FIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemId() <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemId() <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemId()
	 * @generated
	 * @ordered
	 */
	protected String itemId = ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected static final Rarity RARITY_EDEFAULT = Rarity.COMMON;

	/**
	 * The cached value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected Rarity rarity = RARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreativeModeTab() <em>Creative Mode Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreativeModeTab()
	 * @generated
	 * @ordered
	 */
	protected static final CreativeModeTab CREATIVE_MODE_TAB_EDEFAULT = CreativeModeTab.BUILDING_BLOCKS;

	/**
	 * The cached value of the '{@link #getCreativeModeTab() <em>Creative Mode Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreativeModeTab()
	 * @generated
	 * @ordered
	 */
	protected CreativeModeTab creativeModeTab = CREATIVE_MODE_TAB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<Translation> translations;

	/**
	 * The cached value of the '{@link #getOnAttack() <em>On Attack</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAttack()
	 * @generated
	 * @ordered
	 */
	protected EList<SelfOtherEffect> onAttack;

	/**
	 * The cached value of the '{@link #getOnTick() <em>On Tick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTick()
	 * @generated
	 * @ordered
	 */
	protected EList<OnTickEffect> onTick;

	/**
	 * The cached value of the '{@link #getOnUse() <em>On Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> onUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolProperty getToolProperty() {
		if (toolProperty != null && toolProperty.eIsProxy()) {
			InternalEObject oldToolProperty = (InternalEObject) toolProperty;
			toolProperty = (ToolProperty) eResolveProxy(oldToolProperty);
			if (toolProperty != oldToolProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OzelotPackage.ITEM__TOOL_PROPERTY,
							oldToolProperty, toolProperty));
			}
		}
		return toolProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolProperty basicGetToolProperty() {
		return toolProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolProperty(ToolProperty newToolProperty) {
		ToolProperty oldToolProperty = toolProperty;
		toolProperty = newToolProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__TOOL_PROPERTY, oldToolProperty,
					toolProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconPath() {
		return iconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconPath(String newIconPath) {
		String oldIconPath = iconPath;
		iconPath = newIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__ICON_PATH, oldIconPath,
					iconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlows() {
		return glows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlows(boolean newGlows) {
		boolean oldGlows = glows;
		glows = newGlows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__GLOWS, oldGlows, glows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStackSize() {
		return maxStackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStackSize(int newMaxStackSize) {
		int oldMaxStackSize = maxStackSize;
		maxStackSize = newMaxStackSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__MAX_STACK_SIZE, oldMaxStackSize,
					maxStackSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImmuneToFire() {
		return isImmuneToFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmuneToFire(boolean newIsImmuneToFire) {
		boolean oldIsImmuneToFire = isImmuneToFire;
		isImmuneToFire = newIsImmuneToFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE,
					oldIsImmuneToFire, isImmuneToFire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemId(String newItemId) {
		String oldItemId = itemId;
		itemId = newItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__ITEM_ID, oldItemId, itemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rarity getRarity() {
		return rarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRarity(Rarity newRarity) {
		Rarity oldRarity = rarity;
		rarity = newRarity == null ? RARITY_EDEFAULT : newRarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreativeModeTab getCreativeModeTab() {
		return creativeModeTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreativeModeTab(CreativeModeTab newCreativeModeTab) {
		CreativeModeTab oldCreativeModeTab = creativeModeTab;
		creativeModeTab = newCreativeModeTab == null ? CREATIVE_MODE_TAB_EDEFAULT : newCreativeModeTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ITEM__CREATIVE_MODE_TAB,
					oldCreativeModeTab, creativeModeTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getTranslations() {
		if (translations == null) {
			translations = new EObjectContainmentEList<Translation>(Translation.class, this,
					OzelotPackage.ITEM__TRANSLATIONS);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelfOtherEffect> getOnAttack() {
		if (onAttack == null) {
			onAttack = new EObjectContainmentEList<SelfOtherEffect>(SelfOtherEffect.class, this,
					OzelotPackage.ITEM__ON_ATTACK);
		}
		return onAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnTickEffect> getOnTick() {
		if (onTick == null) {
			onTick = new EObjectContainmentEList<OnTickEffect>(OnTickEffect.class, this, OzelotPackage.ITEM__ON_TICK);
		}
		return onTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getOnUse() {
		if (onUse == null) {
			onUse = new EObjectContainmentEList<Effect>(Effect.class, this, OzelotPackage.ITEM__ON_USE);
		}
		return onUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OzelotPackage.ITEM__TRANSLATIONS:
			return ((InternalEList<?>) getTranslations()).basicRemove(otherEnd, msgs);
		case OzelotPackage.ITEM__ON_ATTACK:
			return ((InternalEList<?>) getOnAttack()).basicRemove(otherEnd, msgs);
		case OzelotPackage.ITEM__ON_TICK:
			return ((InternalEList<?>) getOnTick()).basicRemove(otherEnd, msgs);
		case OzelotPackage.ITEM__ON_USE:
			return ((InternalEList<?>) getOnUse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OzelotPackage.ITEM__TOOL_PROPERTY:
			if (resolve)
				return getToolProperty();
			return basicGetToolProperty();
		case OzelotPackage.ITEM__ICON_PATH:
			return getIconPath();
		case OzelotPackage.ITEM__GLOWS:
			return isGlows();
		case OzelotPackage.ITEM__MAX_STACK_SIZE:
			return getMaxStackSize();
		case OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE:
			return isIsImmuneToFire();
		case OzelotPackage.ITEM__ITEM_ID:
			return getItemId();
		case OzelotPackage.ITEM__RARITY:
			return getRarity();
		case OzelotPackage.ITEM__CREATIVE_MODE_TAB:
			return getCreativeModeTab();
		case OzelotPackage.ITEM__TRANSLATIONS:
			return getTranslations();
		case OzelotPackage.ITEM__ON_ATTACK:
			return getOnAttack();
		case OzelotPackage.ITEM__ON_TICK:
			return getOnTick();
		case OzelotPackage.ITEM__ON_USE:
			return getOnUse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OzelotPackage.ITEM__TOOL_PROPERTY:
			setToolProperty((ToolProperty) newValue);
			return;
		case OzelotPackage.ITEM__ICON_PATH:
			setIconPath((String) newValue);
			return;
		case OzelotPackage.ITEM__GLOWS:
			setGlows((Boolean) newValue);
			return;
		case OzelotPackage.ITEM__MAX_STACK_SIZE:
			setMaxStackSize((Integer) newValue);
			return;
		case OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE:
			setIsImmuneToFire((Boolean) newValue);
			return;
		case OzelotPackage.ITEM__ITEM_ID:
			setItemId((String) newValue);
			return;
		case OzelotPackage.ITEM__RARITY:
			setRarity((Rarity) newValue);
			return;
		case OzelotPackage.ITEM__CREATIVE_MODE_TAB:
			setCreativeModeTab((CreativeModeTab) newValue);
			return;
		case OzelotPackage.ITEM__TRANSLATIONS:
			getTranslations().clear();
			getTranslations().addAll((Collection<? extends Translation>) newValue);
			return;
		case OzelotPackage.ITEM__ON_ATTACK:
			getOnAttack().clear();
			getOnAttack().addAll((Collection<? extends SelfOtherEffect>) newValue);
			return;
		case OzelotPackage.ITEM__ON_TICK:
			getOnTick().clear();
			getOnTick().addAll((Collection<? extends OnTickEffect>) newValue);
			return;
		case OzelotPackage.ITEM__ON_USE:
			getOnUse().clear();
			getOnUse().addAll((Collection<? extends Effect>) newValue);
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
		case OzelotPackage.ITEM__TOOL_PROPERTY:
			setToolProperty((ToolProperty) null);
			return;
		case OzelotPackage.ITEM__ICON_PATH:
			setIconPath(ICON_PATH_EDEFAULT);
			return;
		case OzelotPackage.ITEM__GLOWS:
			setGlows(GLOWS_EDEFAULT);
			return;
		case OzelotPackage.ITEM__MAX_STACK_SIZE:
			setMaxStackSize(MAX_STACK_SIZE_EDEFAULT);
			return;
		case OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE:
			setIsImmuneToFire(IS_IMMUNE_TO_FIRE_EDEFAULT);
			return;
		case OzelotPackage.ITEM__ITEM_ID:
			setItemId(ITEM_ID_EDEFAULT);
			return;
		case OzelotPackage.ITEM__RARITY:
			setRarity(RARITY_EDEFAULT);
			return;
		case OzelotPackage.ITEM__CREATIVE_MODE_TAB:
			setCreativeModeTab(CREATIVE_MODE_TAB_EDEFAULT);
			return;
		case OzelotPackage.ITEM__TRANSLATIONS:
			getTranslations().clear();
			return;
		case OzelotPackage.ITEM__ON_ATTACK:
			getOnAttack().clear();
			return;
		case OzelotPackage.ITEM__ON_TICK:
			getOnTick().clear();
			return;
		case OzelotPackage.ITEM__ON_USE:
			getOnUse().clear();
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
		case OzelotPackage.ITEM__TOOL_PROPERTY:
			return toolProperty != null;
		case OzelotPackage.ITEM__ICON_PATH:
			return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
		case OzelotPackage.ITEM__GLOWS:
			return glows != GLOWS_EDEFAULT;
		case OzelotPackage.ITEM__MAX_STACK_SIZE:
			return maxStackSize != MAX_STACK_SIZE_EDEFAULT;
		case OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE:
			return isImmuneToFire != IS_IMMUNE_TO_FIRE_EDEFAULT;
		case OzelotPackage.ITEM__ITEM_ID:
			return ITEM_ID_EDEFAULT == null ? itemId != null : !ITEM_ID_EDEFAULT.equals(itemId);
		case OzelotPackage.ITEM__RARITY:
			return rarity != RARITY_EDEFAULT;
		case OzelotPackage.ITEM__CREATIVE_MODE_TAB:
			return creativeModeTab != CREATIVE_MODE_TAB_EDEFAULT;
		case OzelotPackage.ITEM__TRANSLATIONS:
			return translations != null && !translations.isEmpty();
		case OzelotPackage.ITEM__ON_ATTACK:
			return onAttack != null && !onAttack.isEmpty();
		case OzelotPackage.ITEM__ON_TICK:
			return onTick != null && !onTick.isEmpty();
		case OzelotPackage.ITEM__ON_USE:
			return onUse != null && !onUse.isEmpty();
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
		result.append(" (iconPath: ");
		result.append(iconPath);
		result.append(", glows: ");
		result.append(glows);
		result.append(", maxStackSize: ");
		result.append(maxStackSize);
		result.append(", isImmuneToFire: ");
		result.append(isImmuneToFire);
		result.append(", itemId: ");
		result.append(itemId);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", creativeModeTab: ");
		result.append(creativeModeTab);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
