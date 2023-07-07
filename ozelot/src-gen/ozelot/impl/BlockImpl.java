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
import ozelot.Block;
import ozelot.BlockMiningLevel;
import ozelot.CreativeModeTab;
import ozelot.MiningToolType;
import ozelot.OzelotPackage;
import ozelot.SoundType;
import ozelot.Translation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.BlockImpl#getBlockId <em>Block Id</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#isHasGravity <em>Has Gravity</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getCreativeModeTab <em>Creative Mode Tab</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getSoundType <em>Sound Type</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getHarddness <em>Harddness</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getExplosionResistance <em>Explosion Resistance</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getLuminance <em>Luminance</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#isRequiresCorrectToolForDrops <em>Requires Correct Tool For Drops</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getRedstoneSignal <em>Redstone Signal</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#isCanWalkThrough <em>Can Walk Through</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getSlipperiness <em>Slipperiness</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getJumpFactor <em>Jump Factor</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getTexturePath <em>Texture Path</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getMiningTool <em>Mining Tool</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getMiningLevel <em>Mining Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The default value of the '{@link #getBlockId() <em>Block Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockId()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockId() <em>Block Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockId()
	 * @generated
	 * @ordered
	 */
	protected String blockId = BLOCK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasGravity() <em>Has Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasGravity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_GRAVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasGravity() <em>Has Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasGravity()
	 * @generated
	 * @ordered
	 */
	protected boolean hasGravity = HAS_GRAVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreativeModeTab() <em>Creative Mode Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreativeModeTab()
	 * @generated
	 * @ordered
	 */
	protected static final CreativeModeTab CREATIVE_MODE_TAB_EDEFAULT = CreativeModeTab.BREWING;

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
	 * The default value of the '{@link #getSoundType() <em>Sound Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundType()
	 * @generated
	 * @ordered
	 */
	protected static final SoundType SOUND_TYPE_EDEFAULT = SoundType.AMETHYST;

	/**
	 * The cached value of the '{@link #getSoundType() <em>Sound Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundType()
	 * @generated
	 * @ordered
	 */
	protected SoundType soundType = SOUND_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHarddness() <em>Harddness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarddness()
	 * @generated
	 * @ordered
	 */
	protected static final float HARDDNESS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHarddness() <em>Harddness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarddness()
	 * @generated
	 * @ordered
	 */
	protected float harddness = HARDDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplosionResistance() <em>Explosion Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplosionResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float EXPLOSION_RESISTANCE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getExplosionResistance() <em>Explosion Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplosionResistance()
	 * @generated
	 * @ordered
	 */
	protected float explosionResistance = EXPLOSION_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminance() <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminance()
	 * @generated
	 * @ordered
	 */
	protected static final int LUMINANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLuminance() <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminance()
	 * @generated
	 * @ordered
	 */
	protected int luminance = LUMINANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresCorrectToolForDrops() <em>Requires Correct Tool For Drops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresCorrectToolForDrops()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_CORRECT_TOOL_FOR_DROPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresCorrectToolForDrops() <em>Requires Correct Tool For Drops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresCorrectToolForDrops()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresCorrectToolForDrops = REQUIRES_CORRECT_TOOL_FOR_DROPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedstoneSignal() <em>Redstone Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedstoneSignal()
	 * @generated
	 * @ordered
	 */
	protected static final int REDSTONE_SIGNAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRedstoneSignal() <em>Redstone Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedstoneSignal()
	 * @generated
	 * @ordered
	 */
	protected int redstoneSignal = REDSTONE_SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanWalkThrough() <em>Can Walk Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWalkThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_WALK_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanWalkThrough() <em>Can Walk Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWalkThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean canWalkThrough = CAN_WALK_THROUGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlipperiness() <em>Slipperiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlipperiness()
	 * @generated
	 * @ordered
	 */
	protected static final float SLIPPERINESS_EDEFAULT = 0.6F;

	/**
	 * The cached value of the '{@link #getSlipperiness() <em>Slipperiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlipperiness()
	 * @generated
	 * @ordered
	 */
	protected float slipperiness = SLIPPERINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJumpFactor() <em>Jump Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float JUMP_FACTOR_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getJumpFactor() <em>Jump Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpFactor()
	 * @generated
	 * @ordered
	 */
	protected float jumpFactor = JUMP_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_FACTOR_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected float speedFactor = SPEED_FACTOR_EDEFAULT;

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
	 * The default value of the '{@link #getTexturePath() <em>Texture Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturePath()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTURE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexturePath() <em>Texture Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturePath()
	 * @generated
	 * @ordered
	 */
	protected String texturePath = TEXTURE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningTool() <em>Mining Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTool()
	 * @generated
	 * @ordered
	 */
	protected static final MiningToolType MINING_TOOL_EDEFAULT = MiningToolType.AXE;

	/**
	 * The cached value of the '{@link #getMiningTool() <em>Mining Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTool()
	 * @generated
	 * @ordered
	 */
	protected MiningToolType miningTool = MINING_TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningLevel() <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BlockMiningLevel MINING_LEVEL_EDEFAULT = BlockMiningLevel.NONE;

	/**
	 * The cached value of the '{@link #getMiningLevel() <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningLevel()
	 * @generated
	 * @ordered
	 */
	protected BlockMiningLevel miningLevel = MINING_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockId() {
		return blockId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockId(String newBlockId) {
		String oldBlockId = blockId;
		blockId = newBlockId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__BLOCK_ID, oldBlockId, blockId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasGravity() {
		return hasGravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasGravity(boolean newHasGravity) {
		boolean oldHasGravity = hasGravity;
		hasGravity = newHasGravity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__HAS_GRAVITY, oldHasGravity,
					hasGravity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__CREATIVE_MODE_TAB,
					oldCreativeModeTab, creativeModeTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundType getSoundType() {
		return soundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundType(SoundType newSoundType) {
		SoundType oldSoundType = soundType;
		soundType = newSoundType == null ? SOUND_TYPE_EDEFAULT : newSoundType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__SOUND_TYPE, oldSoundType,
					soundType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHarddness() {
		return harddness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHarddness(float newHarddness) {
		float oldHarddness = harddness;
		harddness = newHarddness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__HARDDNESS, oldHarddness,
					harddness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExplosionResistance() {
		return explosionResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplosionResistance(float newExplosionResistance) {
		float oldExplosionResistance = explosionResistance;
		explosionResistance = newExplosionResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__EXPLOSION_RESISTANCE,
					oldExplosionResistance, explosionResistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLuminance() {
		return luminance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminance(int newLuminance) {
		int oldLuminance = luminance;
		luminance = newLuminance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__LUMINANCE, oldLuminance,
					luminance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresCorrectToolForDrops() {
		return requiresCorrectToolForDrops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresCorrectToolForDrops(boolean newRequiresCorrectToolForDrops) {
		boolean oldRequiresCorrectToolForDrops = requiresCorrectToolForDrops;
		requiresCorrectToolForDrops = newRequiresCorrectToolForDrops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS,
					oldRequiresCorrectToolForDrops, requiresCorrectToolForDrops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRedstoneSignal() {
		return redstoneSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedstoneSignal(int newRedstoneSignal) {
		int oldRedstoneSignal = redstoneSignal;
		redstoneSignal = newRedstoneSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__REDSTONE_SIGNAL,
					oldRedstoneSignal, redstoneSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanWalkThrough() {
		return canWalkThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanWalkThrough(boolean newCanWalkThrough) {
		boolean oldCanWalkThrough = canWalkThrough;
		canWalkThrough = newCanWalkThrough;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__CAN_WALK_THROUGH,
					oldCanWalkThrough, canWalkThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlipperiness() {
		return slipperiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlipperiness(float newSlipperiness) {
		float oldSlipperiness = slipperiness;
		slipperiness = newSlipperiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__SLIPPERINESS, oldSlipperiness,
					slipperiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getJumpFactor() {
		return jumpFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpFactor(float newJumpFactor) {
		float oldJumpFactor = jumpFactor;
		jumpFactor = newJumpFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__JUMP_FACTOR, oldJumpFactor,
					jumpFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(float newSpeedFactor) {
		float oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__SPEED_FACTOR, oldSpeedFactor,
					speedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getTranslations() {
		if (translations == null) {
			translations = new EObjectContainmentEList<Translation>(Translation.class, this,
					OzelotPackage.BLOCK__TRANSLATIONS);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexturePath() {
		return texturePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexturePath(String newTexturePath) {
		String oldTexturePath = texturePath;
		texturePath = newTexturePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__TEXTURE_PATH, oldTexturePath,
					texturePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningToolType getMiningTool() {
		return miningTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningTool(MiningToolType newMiningTool) {
		MiningToolType oldMiningTool = miningTool;
		miningTool = newMiningTool == null ? MINING_TOOL_EDEFAULT : newMiningTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__MINING_TOOL, oldMiningTool,
					miningTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockMiningLevel getMiningLevel() {
		return miningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningLevel(BlockMiningLevel newMiningLevel) {
		BlockMiningLevel oldMiningLevel = miningLevel;
		miningLevel = newMiningLevel == null ? MINING_LEVEL_EDEFAULT : newMiningLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__MINING_LEVEL, oldMiningLevel,
					miningLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OzelotPackage.BLOCK__TRANSLATIONS:
			return ((InternalEList<?>) getTranslations()).basicRemove(otherEnd, msgs);
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
		case OzelotPackage.BLOCK__BLOCK_ID:
			return getBlockId();
		case OzelotPackage.BLOCK__HAS_GRAVITY:
			return isHasGravity();
		case OzelotPackage.BLOCK__CREATIVE_MODE_TAB:
			return getCreativeModeTab();
		case OzelotPackage.BLOCK__SOUND_TYPE:
			return getSoundType();
		case OzelotPackage.BLOCK__HARDDNESS:
			return getHarddness();
		case OzelotPackage.BLOCK__EXPLOSION_RESISTANCE:
			return getExplosionResistance();
		case OzelotPackage.BLOCK__LUMINANCE:
			return getLuminance();
		case OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS:
			return isRequiresCorrectToolForDrops();
		case OzelotPackage.BLOCK__REDSTONE_SIGNAL:
			return getRedstoneSignal();
		case OzelotPackage.BLOCK__CAN_WALK_THROUGH:
			return isCanWalkThrough();
		case OzelotPackage.BLOCK__SLIPPERINESS:
			return getSlipperiness();
		case OzelotPackage.BLOCK__JUMP_FACTOR:
			return getJumpFactor();
		case OzelotPackage.BLOCK__SPEED_FACTOR:
			return getSpeedFactor();
		case OzelotPackage.BLOCK__TRANSLATIONS:
			return getTranslations();
		case OzelotPackage.BLOCK__TEXTURE_PATH:
			return getTexturePath();
		case OzelotPackage.BLOCK__MINING_TOOL:
			return getMiningTool();
		case OzelotPackage.BLOCK__MINING_LEVEL:
			return getMiningLevel();
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
		case OzelotPackage.BLOCK__BLOCK_ID:
			setBlockId((String) newValue);
			return;
		case OzelotPackage.BLOCK__HAS_GRAVITY:
			setHasGravity((Boolean) newValue);
			return;
		case OzelotPackage.BLOCK__CREATIVE_MODE_TAB:
			setCreativeModeTab((CreativeModeTab) newValue);
			return;
		case OzelotPackage.BLOCK__SOUND_TYPE:
			setSoundType((SoundType) newValue);
			return;
		case OzelotPackage.BLOCK__HARDDNESS:
			setHarddness((Float) newValue);
			return;
		case OzelotPackage.BLOCK__EXPLOSION_RESISTANCE:
			setExplosionResistance((Float) newValue);
			return;
		case OzelotPackage.BLOCK__LUMINANCE:
			setLuminance((Integer) newValue);
			return;
		case OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS:
			setRequiresCorrectToolForDrops((Boolean) newValue);
			return;
		case OzelotPackage.BLOCK__REDSTONE_SIGNAL:
			setRedstoneSignal((Integer) newValue);
			return;
		case OzelotPackage.BLOCK__CAN_WALK_THROUGH:
			setCanWalkThrough((Boolean) newValue);
			return;
		case OzelotPackage.BLOCK__SLIPPERINESS:
			setSlipperiness((Float) newValue);
			return;
		case OzelotPackage.BLOCK__JUMP_FACTOR:
			setJumpFactor((Float) newValue);
			return;
		case OzelotPackage.BLOCK__SPEED_FACTOR:
			setSpeedFactor((Float) newValue);
			return;
		case OzelotPackage.BLOCK__TRANSLATIONS:
			getTranslations().clear();
			getTranslations().addAll((Collection<? extends Translation>) newValue);
			return;
		case OzelotPackage.BLOCK__TEXTURE_PATH:
			setTexturePath((String) newValue);
			return;
		case OzelotPackage.BLOCK__MINING_TOOL:
			setMiningTool((MiningToolType) newValue);
			return;
		case OzelotPackage.BLOCK__MINING_LEVEL:
			setMiningLevel((BlockMiningLevel) newValue);
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
		case OzelotPackage.BLOCK__BLOCK_ID:
			setBlockId(BLOCK_ID_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__HAS_GRAVITY:
			setHasGravity(HAS_GRAVITY_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__CREATIVE_MODE_TAB:
			setCreativeModeTab(CREATIVE_MODE_TAB_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__SOUND_TYPE:
			setSoundType(SOUND_TYPE_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__HARDDNESS:
			setHarddness(HARDDNESS_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__EXPLOSION_RESISTANCE:
			setExplosionResistance(EXPLOSION_RESISTANCE_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__LUMINANCE:
			setLuminance(LUMINANCE_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS:
			setRequiresCorrectToolForDrops(REQUIRES_CORRECT_TOOL_FOR_DROPS_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__REDSTONE_SIGNAL:
			setRedstoneSignal(REDSTONE_SIGNAL_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__CAN_WALK_THROUGH:
			setCanWalkThrough(CAN_WALK_THROUGH_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__SLIPPERINESS:
			setSlipperiness(SLIPPERINESS_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__JUMP_FACTOR:
			setJumpFactor(JUMP_FACTOR_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__SPEED_FACTOR:
			setSpeedFactor(SPEED_FACTOR_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__TRANSLATIONS:
			getTranslations().clear();
			return;
		case OzelotPackage.BLOCK__TEXTURE_PATH:
			setTexturePath(TEXTURE_PATH_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__MINING_TOOL:
			setMiningTool(MINING_TOOL_EDEFAULT);
			return;
		case OzelotPackage.BLOCK__MINING_LEVEL:
			setMiningLevel(MINING_LEVEL_EDEFAULT);
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
		case OzelotPackage.BLOCK__BLOCK_ID:
			return BLOCK_ID_EDEFAULT == null ? blockId != null : !BLOCK_ID_EDEFAULT.equals(blockId);
		case OzelotPackage.BLOCK__HAS_GRAVITY:
			return hasGravity != HAS_GRAVITY_EDEFAULT;
		case OzelotPackage.BLOCK__CREATIVE_MODE_TAB:
			return creativeModeTab != CREATIVE_MODE_TAB_EDEFAULT;
		case OzelotPackage.BLOCK__SOUND_TYPE:
			return soundType != SOUND_TYPE_EDEFAULT;
		case OzelotPackage.BLOCK__HARDDNESS:
			return harddness != HARDDNESS_EDEFAULT;
		case OzelotPackage.BLOCK__EXPLOSION_RESISTANCE:
			return explosionResistance != EXPLOSION_RESISTANCE_EDEFAULT;
		case OzelotPackage.BLOCK__LUMINANCE:
			return luminance != LUMINANCE_EDEFAULT;
		case OzelotPackage.BLOCK__REQUIRES_CORRECT_TOOL_FOR_DROPS:
			return requiresCorrectToolForDrops != REQUIRES_CORRECT_TOOL_FOR_DROPS_EDEFAULT;
		case OzelotPackage.BLOCK__REDSTONE_SIGNAL:
			return redstoneSignal != REDSTONE_SIGNAL_EDEFAULT;
		case OzelotPackage.BLOCK__CAN_WALK_THROUGH:
			return canWalkThrough != CAN_WALK_THROUGH_EDEFAULT;
		case OzelotPackage.BLOCK__SLIPPERINESS:
			return slipperiness != SLIPPERINESS_EDEFAULT;
		case OzelotPackage.BLOCK__JUMP_FACTOR:
			return jumpFactor != JUMP_FACTOR_EDEFAULT;
		case OzelotPackage.BLOCK__SPEED_FACTOR:
			return speedFactor != SPEED_FACTOR_EDEFAULT;
		case OzelotPackage.BLOCK__TRANSLATIONS:
			return translations != null && !translations.isEmpty();
		case OzelotPackage.BLOCK__TEXTURE_PATH:
			return TEXTURE_PATH_EDEFAULT == null ? texturePath != null : !TEXTURE_PATH_EDEFAULT.equals(texturePath);
		case OzelotPackage.BLOCK__MINING_TOOL:
			return miningTool != MINING_TOOL_EDEFAULT;
		case OzelotPackage.BLOCK__MINING_LEVEL:
			return miningLevel != MINING_LEVEL_EDEFAULT;
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
		result.append(" (blockId: ");
		result.append(blockId);
		result.append(", hasGravity: ");
		result.append(hasGravity);
		result.append(", creativeModeTab: ");
		result.append(creativeModeTab);
		result.append(", soundType: ");
		result.append(soundType);
		result.append(", harddness: ");
		result.append(harddness);
		result.append(", explosionResistance: ");
		result.append(explosionResistance);
		result.append(", luminance: ");
		result.append(luminance);
		result.append(", requiresCorrectToolForDrops: ");
		result.append(requiresCorrectToolForDrops);
		result.append(", redstoneSignal: ");
		result.append(redstoneSignal);
		result.append(", canWalkThrough: ");
		result.append(canWalkThrough);
		result.append(", slipperiness: ");
		result.append(slipperiness);
		result.append(", jumpFactor: ");
		result.append(jumpFactor);
		result.append(", speedFactor: ");
		result.append(speedFactor);
		result.append(", texturePath: ");
		result.append(texturePath);
		result.append(", miningTool: ");
		result.append(miningTool);
		result.append(", miningLevel: ");
		result.append(miningLevel);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
