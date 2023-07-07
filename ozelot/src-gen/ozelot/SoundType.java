/**
 */
package ozelot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sound Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ozelot.OzelotPackage#getSoundType()
 * @model
 * @generated
 */
public enum SoundType implements Enumerator {
	/**
	 * The '<em><b>AMETHYST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMETHYST_VALUE
	 * @generated
	 * @ordered
	 */
	AMETHYST(0, "AMETHYST", "AMETHYST"),
	/**
	 * The '<em><b>CROP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CROP_VALUE
	 * @generated
	 * @ordered
	 */
	CROP(1, "CROP", "CROP"),
	/**
	 * The '<em><b>GLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	GLASS(2, "GLASS", "GLASS"),
	/**
	 * The '<em><b>GRASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GRASS_VALUE
	 * @generated
	 * @ordered
	 */
	GRASS(3, "GRASS", "GRASS"),
	/**
	 * The '<em><b>GRAVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GRAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	GRAVEL(4, "GRAVEL", "GRAVEL"),
	/**
	 * The '<em><b>LADDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LADDER_VALUE
	 * @generated
	 * @ordered
	 */
	LADDER(5, "LADDER", "LADDER"),
	/**
	 * The '<em><b>LANTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LANTERN_VALUE
	 * @generated
	 * @ordered
	 */
	LANTERN(6, "LANTERN", "LANTERN"),
	/**
	 * The '<em><b>LILY PAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LILY_PAD_VALUE
	 * @generated
	 * @ordered
	 */
	LILY_PAD(7, "LILY_PAD", "LILY_PAD"),
	/**
	 * The '<em><b>METAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #METAL_VALUE
	 * @generated
	 * @ordered
	 */
	METAL(8, "METAL", "METAL"),
	/**
	 * The '<em><b>NETHERRACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NETHERRACK_VALUE
	 * @generated
	 * @ordered
	 */
	NETHERRACK(9, "NETHERRACK", "NETHERRACK"),
	/**
	 * The '<em><b>NETHER ORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NETHER_ORE_VALUE
	 * @generated
	 * @ordered
	 */
	NETHER_ORE(10, "NETHER_ORE", "NETHER_ORE"),
	/**
	 * The '<em><b>SAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SAND_VALUE
	 * @generated
	 * @ordered
	 */
	SAND(11, "SAND", "SAND"),
	/**
	 * The '<em><b>SLIME BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SLIME_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	SLIME_BLOCK(12, "SLIME_BLOCK", "SLIME_BLOCK"),
	/**
	 * The '<em><b>SNOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SNOW_VALUE
	 * @generated
	 * @ordered
	 */
	SNOW(13, "SNOW", "SNOW"),
	/**
	 * The '<em><b>SOUL SAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SOUL_SAND_VALUE
	 * @generated
	 * @ordered
	 */
	SOUL_SAND(14, "SOUL_SAND", "SOUL_SAND"),
	/**
	 * The '<em><b>STONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #STONE_VALUE
	 * @generated
	 * @ordered
	 */
	STONE(15, "STONE", "STONE"),
	/**
	 * The '<em><b>WET GRASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WET_GRASS_VALUE
	 * @generated
	 * @ordered
	 */
	WET_GRASS(16, "WET_GRASS", "WET_GRASS"),
	/**
	 * The '<em><b>WOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WOOD_VALUE
	 * @generated
	 * @ordered
	 */
	WOOD(17, "WOOD", "WOOD"),
	/**
	 * The '<em><b>WOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WOOL_VALUE
	 * @generated
	 * @ordered
	 */
	WOOL(18, "WOOL", "WOOL");

	/**
	 * The '<em><b>AMETHYST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMETHYST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMETHYST_VALUE = 0;

	/**
	 * The '<em><b>CROP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CROP_VALUE = 1;

	/**
	 * The '<em><b>GLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLASS_VALUE = 2;

	/**
	 * The '<em><b>GRASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRASS_VALUE = 3;

	/**
	 * The '<em><b>GRAVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAVEL_VALUE = 4;

	/**
	 * The '<em><b>LADDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LADDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LADDER_VALUE = 5;

	/**
	 * The '<em><b>LANTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANTERN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANTERN_VALUE = 6;

	/**
	 * The '<em><b>LILY PAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LILY_PAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LILY_PAD_VALUE = 7;

	/**
	 * The '<em><b>METAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METAL_VALUE = 8;

	/**
	 * The '<em><b>NETHERRACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETHERRACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETHERRACK_VALUE = 9;

	/**
	 * The '<em><b>NETHER ORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETHER_ORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETHER_ORE_VALUE = 10;

	/**
	 * The '<em><b>SAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAND_VALUE = 11;

	/**
	 * The '<em><b>SLIME BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIME_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLIME_BLOCK_VALUE = 12;

	/**
	 * The '<em><b>SNOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNOW_VALUE = 13;

	/**
	 * The '<em><b>SOUL SAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUL_SAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUL_SAND_VALUE = 14;

	/**
	 * The '<em><b>STONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STONE_VALUE = 15;

	/**
	 * The '<em><b>WET GRASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WET_GRASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WET_GRASS_VALUE = 16;

	/**
	 * The '<em><b>WOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOOD_VALUE = 17;

	/**
	 * The '<em><b>WOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOOL_VALUE = 18;

	/**
	 * An array of all the '<em><b>Sound Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SoundType[] VALUES_ARRAY = new SoundType[] { AMETHYST, CROP, GLASS, GRASS, GRAVEL, LADDER,
			LANTERN, LILY_PAD, METAL, NETHERRACK, NETHER_ORE, SAND, SLIME_BLOCK, SNOW, SOUL_SAND, STONE, WET_GRASS,
			WOOD, WOOL, };

	/**
	 * A public read-only list of all the '<em><b>Sound Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SoundType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sound Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoundType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoundType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sound Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoundType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoundType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sound Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoundType get(int value) {
		switch (value) {
		case AMETHYST_VALUE:
			return AMETHYST;
		case CROP_VALUE:
			return CROP;
		case GLASS_VALUE:
			return GLASS;
		case GRASS_VALUE:
			return GRASS;
		case GRAVEL_VALUE:
			return GRAVEL;
		case LADDER_VALUE:
			return LADDER;
		case LANTERN_VALUE:
			return LANTERN;
		case LILY_PAD_VALUE:
			return LILY_PAD;
		case METAL_VALUE:
			return METAL;
		case NETHERRACK_VALUE:
			return NETHERRACK;
		case NETHER_ORE_VALUE:
			return NETHER_ORE;
		case SAND_VALUE:
			return SAND;
		case SLIME_BLOCK_VALUE:
			return SLIME_BLOCK;
		case SNOW_VALUE:
			return SNOW;
		case SOUL_SAND_VALUE:
			return SOUL_SAND;
		case STONE_VALUE:
			return STONE;
		case WET_GRASS_VALUE:
			return WET_GRASS;
		case WOOD_VALUE:
			return WOOD;
		case WOOL_VALUE:
			return WOOL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SoundType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SoundType
