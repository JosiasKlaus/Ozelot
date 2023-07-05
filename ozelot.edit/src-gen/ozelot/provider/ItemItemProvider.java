/**
 */
package ozelot.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ozelot.Item;
import ozelot.OzelotFactory;
import ozelot.OzelotPackage;

/**
 * This is the item provider adapter for a {@link ozelot.Item} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIconPathPropertyDescriptor(object);
			addGlowsPropertyDescriptor(object);
			addMaxStackSizePropertyDescriptor(object);
			addIsImmuneToFirePropertyDescriptor(object);
			addItemIdPropertyDescriptor(object);
			addRarityPropertyDescriptor(object);
			addCreativeModeTabPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_iconPath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_iconPath_feature", "_UI_Item_type"),
						OzelotPackage.Literals.ITEM__ICON_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Glows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_glows_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_glows_feature", "_UI_Item_type"),
						OzelotPackage.Literals.ITEM__GLOWS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Stack Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxStackSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_maxStackSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_maxStackSize_feature",
								"_UI_Item_type"),
						OzelotPackage.Literals.ITEM__MAX_STACK_SIZE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Immune To Fire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsImmuneToFirePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_isImmuneToFire_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_isImmuneToFire_feature",
								"_UI_Item_type"),
						OzelotPackage.Literals.ITEM__IS_IMMUNE_TO_FIRE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Item Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_itemId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_itemId_feature", "_UI_Item_type"),
						OzelotPackage.Literals.ITEM__ITEM_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rarity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRarityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_rarity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_rarity_feature", "_UI_Item_type"),
						OzelotPackage.Literals.ITEM__RARITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creative Mode Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreativeModeTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Item_creativeModeTab_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Item_creativeModeTab_feature",
								"_UI_Item_type"),
						OzelotPackage.Literals.ITEM__CREATIVE_MODE_TAB, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OzelotPackage.Literals.ITEM__TRANSLATIONS);
			childrenFeatures.add(OzelotPackage.Literals.ITEM__ON_ATTACK);
			childrenFeatures.add(OzelotPackage.Literals.ITEM__ON_TICK);
			childrenFeatures.add(OzelotPackage.Literals.ITEM__ON_USE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Item.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Item"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Item) object).getIconPath();
		return label == null || label.length() == 0 ? getString("_UI_Item_type")
				: getString("_UI_Item_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Item.class)) {
		case OzelotPackage.ITEM__ICON_PATH:
		case OzelotPackage.ITEM__GLOWS:
		case OzelotPackage.ITEM__MAX_STACK_SIZE:
		case OzelotPackage.ITEM__IS_IMMUNE_TO_FIRE:
		case OzelotPackage.ITEM__ITEM_ID:
		case OzelotPackage.ITEM__RARITY:
		case OzelotPackage.ITEM__CREATIVE_MODE_TAB:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OzelotPackage.ITEM__TRANSLATIONS:
		case OzelotPackage.ITEM__ON_ATTACK:
		case OzelotPackage.ITEM__ON_TICK:
		case OzelotPackage.ITEM__ON_USE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.ITEM__TRANSLATIONS,
				OzelotFactory.eINSTANCE.createTranslation()));

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.ITEM__ON_ATTACK,
				OzelotFactory.eINSTANCE.createSelfOtherEffect()));

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.ITEM__ON_TICK,
				OzelotFactory.eINSTANCE.createOnTickEffect()));

		newChildDescriptors
				.add(createChildParameter(OzelotPackage.Literals.ITEM__ON_USE, OzelotFactory.eINSTANCE.createEffect()));

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.ITEM__ON_USE,
				OzelotFactory.eINSTANCE.createSelfOtherEffect()));

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.ITEM__ON_USE,
				OzelotFactory.eINSTANCE.createOnTickEffect()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == OzelotPackage.Literals.ITEM__ON_ATTACK
				|| childFeature == OzelotPackage.Literals.ITEM__ON_USE
				|| childFeature == OzelotPackage.Literals.ITEM__ON_TICK;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OzelotEditPlugin.INSTANCE;
	}

}
