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

import ozelot.Block;
import ozelot.OzelotFactory;
import ozelot.OzelotPackage;

/**
 * This is the item provider adapter for a {@link ozelot.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
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

			addBlockIdPropertyDescriptor(object);
			addHasGravityPropertyDescriptor(object);
			addCreativeModeTabPropertyDescriptor(object);
			addSoundTypePropertyDescriptor(object);
			addHarddnessPropertyDescriptor(object);
			addExplosionResistancePropertyDescriptor(object);
			addLuminancePropertyDescriptor(object);
			addRequiresCorrectToolForDropsPropertyDescriptor(object);
			addRedstoneSignalPropertyDescriptor(object);
			addCanWalkThroughPropertyDescriptor(object);
			addSlipperinessPropertyDescriptor(object);
			addJumpFactorPropertyDescriptor(object);
			addSpeedFactorPropertyDescriptor(object);
			addTexturePathPropertyDescriptor(object);
			addMiningToolPropertyDescriptor(object);
			addMiningLevelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Block Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_blockId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_blockId_feature", "_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__BLOCK_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Gravity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasGravityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_hasGravity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_hasGravity_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__HAS_GRAVITY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Block_creativeModeTab_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_creativeModeTab_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__CREATIVE_MODE_TAB, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sound Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoundTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_soundType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_soundType_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__SOUND_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Harddness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHarddnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_harddness_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_harddness_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__HARDDNESS, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Explosion Resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExplosionResistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_explosionResistance_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_explosionResistance_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__EXPLOSION_RESISTANCE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Luminance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_luminance_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_luminance_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__LUMINANCE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Requires Correct Tool For Drops feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresCorrectToolForDropsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_requiresCorrectToolForDrops_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_requiresCorrectToolForDrops_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Redstone Signal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedstoneSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_redstoneSignal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_redstoneSignal_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__REDSTONE_SIGNAL, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Can Walk Through feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanWalkThroughPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_canWalkThrough_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_canWalkThrough_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__CAN_WALK_THROUGH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Slipperiness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlipperinessPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_slipperiness_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_slipperiness_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__SLIPPERINESS, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Jump Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJumpFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_jumpFactor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_jumpFactor_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__JUMP_FACTOR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Speed Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_speedFactor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_speedFactor_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__SPEED_FACTOR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Texture Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTexturePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_texturePath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_texturePath_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__TEXTURE_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mining Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiningToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_miningTool_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_miningTool_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__MINING_TOOL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mining Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiningLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_miningLevel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_miningLevel_feature",
								"_UI_Block_type"),
						OzelotPackage.Literals.BLOCK__MINING_LEVEL, true, false, false,
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
			childrenFeatures.add(OzelotPackage.Literals.BLOCK__TRANSLATIONS);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
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
		String label = ((Block) object).getBlockId();
		return label == null || label.length() == 0 ? getString("_UI_Block_type")
				: getString("_UI_Block_type") + " " + label;
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

		switch (notification.getFeatureID(Block.class)) {
		case OzelotPackage.BLOCK__BLOCK_ID:
		case OzelotPackage.BLOCK__HAS_GRAVITY:
		case OzelotPackage.BLOCK__CREATIVE_MODE_TAB:
		case OzelotPackage.BLOCK__SOUND_TYPE:
		case OzelotPackage.BLOCK__HARDDNESS:
		case OzelotPackage.BLOCK__EXPLOSION_RESISTANCE:
		case OzelotPackage.BLOCK__LUMINANCE:
		case OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS:
		case OzelotPackage.BLOCK__REDSTONE_SIGNAL:
		case OzelotPackage.BLOCK__CAN_WALK_THROUGH:
		case OzelotPackage.BLOCK__SLIPPERINESS:
		case OzelotPackage.BLOCK__JUMP_FACTOR:
		case OzelotPackage.BLOCK__SPEED_FACTOR:
		case OzelotPackage.BLOCK__TEXTURE_PATH:
		case OzelotPackage.BLOCK__MINING_TOOL:
		case OzelotPackage.BLOCK__MINING_LEVEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OzelotPackage.BLOCK__TRANSLATIONS:
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

		newChildDescriptors.add(createChildParameter(OzelotPackage.Literals.BLOCK__TRANSLATIONS,
				OzelotFactory.eINSTANCE.createTranslation()));
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
