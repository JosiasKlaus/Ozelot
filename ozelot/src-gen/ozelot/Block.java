/**
 */
package ozelot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.Block#getBlockId <em>Block Id</em>}</li>
 *   <li>{@link ozelot.Block#isHasGravity <em>Has Gravity</em>}</li>
 *   <li>{@link ozelot.Block#getCreativeModeTab <em>Creative Mode Tab</em>}</li>
 *   <li>{@link ozelot.Block#getSoundType <em>Sound Type</em>}</li>
 *   <li>{@link ozelot.Block#getHarddness <em>Harddness</em>}</li>
 *   <li>{@link ozelot.Block#getExplosionResistance <em>Explosion Resistance</em>}</li>
 *   <li>{@link ozelot.Block#getLuminance <em>Luminance</em>}</li>
 *   <li>{@link ozelot.Block#isRequiresCorrectToolForDrops <em>Requires Correct Tool For Drops</em>}</li>
 *   <li>{@link ozelot.Block#getRedstoneSignal <em>Redstone Signal</em>}</li>
 *   <li>{@link ozelot.Block#isCanWalkThrough <em>Can Walk Through</em>}</li>
 *   <li>{@link ozelot.Block#getSlipperiness <em>Slipperiness</em>}</li>
 *   <li>{@link ozelot.Block#getJumpFactor <em>Jump Factor</em>}</li>
 *   <li>{@link ozelot.Block#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link ozelot.Block#getTranslations <em>Translations</em>}</li>
 *   <li>{@link ozelot.Block#getTexturePath <em>Texture Path</em>}</li>
 *   <li>{@link ozelot.Block#getMiningTool <em>Mining Tool</em>}</li>
 *   <li>{@link ozelot.Block#getMiningLevel <em>Mining Level</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Id</em>' attribute.
	 * @see #setBlockId(String)
	 * @see ozelot.OzelotPackage#getBlock_BlockId()
	 * @model required="true"
	 * @generated
	 */
	String getBlockId();

	/**
	 * Sets the value of the '{@link ozelot.Block#getBlockId <em>Block Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Id</em>' attribute.
	 * @see #getBlockId()
	 * @generated
	 */
	void setBlockId(String value);

	/**
	 * Returns the value of the '<em><b>Has Gravity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Gravity</em>' attribute.
	 * @see #setHasGravity(boolean)
	 * @see ozelot.OzelotPackage#getBlock_HasGravity()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHasGravity();

	/**
	 * Sets the value of the '{@link ozelot.Block#isHasGravity <em>Has Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Gravity</em>' attribute.
	 * @see #isHasGravity()
	 * @generated
	 */
	void setHasGravity(boolean value);

	/**
	 * Returns the value of the '<em><b>Creative Mode Tab</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.CreativeModeTab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creative Mode Tab</em>' attribute.
	 * @see ozelot.CreativeModeTab
	 * @see #setCreativeModeTab(CreativeModeTab)
	 * @see ozelot.OzelotPackage#getBlock_CreativeModeTab()
	 * @model required="true"
	 * @generated
	 */
	CreativeModeTab getCreativeModeTab();

	/**
	 * Sets the value of the '{@link ozelot.Block#getCreativeModeTab <em>Creative Mode Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creative Mode Tab</em>' attribute.
	 * @see ozelot.CreativeModeTab
	 * @see #getCreativeModeTab()
	 * @generated
	 */
	void setCreativeModeTab(CreativeModeTab value);

	/**
	 * Returns the value of the '<em><b>Sound Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.SoundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Type</em>' attribute.
	 * @see ozelot.SoundType
	 * @see #setSoundType(SoundType)
	 * @see ozelot.OzelotPackage#getBlock_SoundType()
	 * @model required="true"
	 * @generated
	 */
	SoundType getSoundType();

	/**
	 * Sets the value of the '{@link ozelot.Block#getSoundType <em>Sound Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Type</em>' attribute.
	 * @see ozelot.SoundType
	 * @see #getSoundType()
	 * @generated
	 */
	void setSoundType(SoundType value);

	/**
	 * Returns the value of the '<em><b>Harddness</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Harddness</em>' attribute.
	 * @see #setHarddness(float)
	 * @see ozelot.OzelotPackage#getBlock_Harddness()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getHarddness();

	/**
	 * Sets the value of the '{@link ozelot.Block#getHarddness <em>Harddness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harddness</em>' attribute.
	 * @see #getHarddness()
	 * @generated
	 */
	void setHarddness(float value);

	/**
	 * Returns the value of the '<em><b>Explosion Resistance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explosion Resistance</em>' attribute.
	 * @see #setExplosionResistance(float)
	 * @see ozelot.OzelotPackage#getBlock_ExplosionResistance()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getExplosionResistance();

	/**
	 * Sets the value of the '{@link ozelot.Block#getExplosionResistance <em>Explosion Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explosion Resistance</em>' attribute.
	 * @see #getExplosionResistance()
	 * @generated
	 */
	void setExplosionResistance(float value);

	/**
	 * Returns the value of the '<em><b>Luminance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminance</em>' attribute.
	 * @see #setLuminance(int)
	 * @see ozelot.OzelotPackage#getBlock_Luminance()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLuminance();

	/**
	 * Sets the value of the '{@link ozelot.Block#getLuminance <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminance</em>' attribute.
	 * @see #getLuminance()
	 * @generated
	 */
	void setLuminance(int value);

	/**
	 * Returns the value of the '<em><b>Requires Correct Tool For Drops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Correct Tool For Drops</em>' attribute.
	 * @see #setRequiresCorrectToolForDrops(boolean)
	 * @see ozelot.OzelotPackage#getBlock_RequiresCorrectToolForDrops()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequiresCorrectToolForDrops();

	/**
	 * Sets the value of the '{@link ozelot.Block#isRequiresCorrectToolForDrops <em>Requires Correct Tool For Drops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Correct Tool For Drops</em>' attribute.
	 * @see #isRequiresCorrectToolForDrops()
	 * @generated
	 */
	void setRequiresCorrectToolForDrops(boolean value);

	/**
	 * Returns the value of the '<em><b>Redstone Signal</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redstone Signal</em>' attribute.
	 * @see #setRedstoneSignal(int)
	 * @see ozelot.OzelotPackage#getBlock_RedstoneSignal()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getRedstoneSignal();

	/**
	 * Sets the value of the '{@link ozelot.Block#getRedstoneSignal <em>Redstone Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redstone Signal</em>' attribute.
	 * @see #getRedstoneSignal()
	 * @generated
	 */
	void setRedstoneSignal(int value);

	/**
	 * Returns the value of the '<em><b>Can Walk Through</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Walk Through</em>' attribute.
	 * @see #setCanWalkThrough(boolean)
	 * @see ozelot.OzelotPackage#getBlock_CanWalkThrough()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCanWalkThrough();

	/**
	 * Sets the value of the '{@link ozelot.Block#isCanWalkThrough <em>Can Walk Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Walk Through</em>' attribute.
	 * @see #isCanWalkThrough()
	 * @generated
	 */
	void setCanWalkThrough(boolean value);

	/**
	 * Returns the value of the '<em><b>Slipperiness</b></em>' attribute.
	 * The default value is <code>"0.6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slipperiness</em>' attribute.
	 * @see #setSlipperiness(float)
	 * @see ozelot.OzelotPackage#getBlock_Slipperiness()
	 * @model default="0.6" required="true"
	 * @generated
	 */
	float getSlipperiness();

	/**
	 * Sets the value of the '{@link ozelot.Block#getSlipperiness <em>Slipperiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slipperiness</em>' attribute.
	 * @see #getSlipperiness()
	 * @generated
	 */
	void setSlipperiness(float value);

	/**
	 * Returns the value of the '<em><b>Jump Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump Factor</em>' attribute.
	 * @see #setJumpFactor(float)
	 * @see ozelot.OzelotPackage#getBlock_JumpFactor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getJumpFactor();

	/**
	 * Sets the value of the '{@link ozelot.Block#getJumpFactor <em>Jump Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump Factor</em>' attribute.
	 * @see #getJumpFactor()
	 * @generated
	 */
	void setJumpFactor(float value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(float)
	 * @see ozelot.OzelotPackage#getBlock_SpeedFactor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link ozelot.Block#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
	 * The list contents are of type {@link ozelot.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference list.
	 * @see ozelot.OzelotPackage#getBlock_Translations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Translation> getTranslations();

	/**
	 * Returns the value of the '<em><b>Texture Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Path</em>' attribute.
	 * @see #setTexturePath(String)
	 * @see ozelot.OzelotPackage#getBlock_TexturePath()
	 * @model required="true"
	 * @generated
	 */
	String getTexturePath();

	/**
	 * Sets the value of the '{@link ozelot.Block#getTexturePath <em>Texture Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Path</em>' attribute.
	 * @see #getTexturePath()
	 * @generated
	 */
	void setTexturePath(String value);

	/**
	 * Returns the value of the '<em><b>Mining Tool</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.MiningToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Tool</em>' attribute.
	 * @see ozelot.MiningToolType
	 * @see #setMiningTool(MiningToolType)
	 * @see ozelot.OzelotPackage#getBlock_MiningTool()
	 * @model required="true"
	 * @generated
	 */
	MiningToolType getMiningTool();

	/**
	 * Sets the value of the '{@link ozelot.Block#getMiningTool <em>Mining Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Tool</em>' attribute.
	 * @see ozelot.MiningToolType
	 * @see #getMiningTool()
	 * @generated
	 */
	void setMiningTool(MiningToolType value);

	/**
	 * Returns the value of the '<em><b>Mining Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ozelot.BlockMiningLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Level</em>' attribute.
	 * @see ozelot.BlockMiningLevel
	 * @see #setMiningLevel(BlockMiningLevel)
	 * @see ozelot.OzelotPackage#getBlock_MiningLevel()
	 * @model required="true"
	 * @generated
	 */
	BlockMiningLevel getMiningLevel();

	/**
	 * Sets the value of the '{@link ozelot.Block#getMiningLevel <em>Mining Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Level</em>' attribute.
	 * @see ozelot.BlockMiningLevel
	 * @see #getMiningLevel()
	 * @generated
	 */
	void setMiningLevel(BlockMiningLevel value);

} // Block
