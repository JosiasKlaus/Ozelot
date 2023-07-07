/**
 */
package ozelot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Potion Effect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ozelot.OzelotPackage#getPotionEffect()
 * @model
 * @generated
 */
public enum PotionEffect implements Enumerator {
	/**
	 * The '<em><b>ABSORPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSORPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ABSORPTION(0, "ABSORPTION", "ABSORPTION"),

	/**
	 * The '<em><b>BAD OMEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_OMEN_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_OMEN(1, "BAD_OMEN", "BAD_OMEN"),
	/**
	 * The '<em><b>BLINDNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BLINDNESS_VALUE
	 * @generated
	 * @ordered
	 */
	BLINDNESS(2, "BLINDNESS", "BLINDNESS"),
	/**
	 * The '<em><b>CONDUIT POWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONDUIT_POWER_VALUE
	 * @generated
	 * @ordered
	 */
	CONDUIT_POWER(3, "CONDUIT_POWER", "CONDUIT_POWER"),
	/**
	 * The '<em><b>CONFUSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONFUSION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFUSION(4, "CONFUSION", "CONFUSION"),
	/**
	 * The '<em><b>DAMAGE BOOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DAMAGE_BOOST_VALUE
	 * @generated
	 * @ordered
	 */
	DAMAGE_BOOST(5, "DAMAGE_BOOST", "DAMAGE_BOOST"),
	/**
	 * The '<em><b>DAMAGE RESISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DAMAGE_RESISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DAMAGE_RESISTANCE(6, "DAMAGE_RESISTANCE", "DAMAGE_RESISTANCE"),
	/**
	 * The '<em><b>DIG SLOWDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DIG_SLOWDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DIG_SLOWDOWN(7, "DIG_SLOWDOWN", "DIG_SLOWDOWN"),
	/**
	 * The '<em><b>DIG SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DIG_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	DIG_SPEED(8, "DIG_SPEED", "DIG_SPEED"),
	/**
	 * The '<em><b>DOLPHINS GRACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DOLPHINS_GRACE_VALUE
	 * @generated
	 * @ordered
	 */
	DOLPHINS_GRACE(9, "DOLPHINS_GRACE", "DOLPHINS_GRACE"),
	/**
	 * The '<em><b>FIRE RESISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #FIRE_RESISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRE_RESISTANCE(10, "FIRE_RESISTANCE", "FIRE_RESISTANCE"),
	/**
	 * The '<em><b>GLOWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GLOWING_VALUE
	 * @generated
	 * @ordered
	 */
	GLOWING(11, "GLOWING", "GLOWING"),
	/**
	 * The '<em><b>HARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #HARM_VALUE
	 * @generated
	 * @ordered
	 */
	HARM(12, "HARM", "HARM"),
	/**
	 * The '<em><b>HEAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #HEAL_VALUE
	 * @generated
	 * @ordered
	 */
	HEAL(13, "HEAL", "HEAL"),
	/**
	 * The '<em><b>HEALTH BOOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #HEALTH_BOOST_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_BOOST(14, "HEALTH_BOOST", "HEALTH_BOOST"),
	/**
	 * The '<em><b>HUNGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #HUNGER_VALUE
	 * @generated
	 * @ordered
	 */
	HUNGER(15, "HUNGER", "HUNGER"),
	/**
	 * The '<em><b>INVISIBILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INVISIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	INVISIBILITY(16, "INVISIBILITY", "INVISIBILITY"),
	/**
	 * The '<em><b>JUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #JUMP_VALUE
	 * @generated
	 * @ordered
	 */
	JUMP(17, "JUMP", "JUMP"),
	/**
	 * The '<em><b>LEVITATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LEVITATION_VALUE
	 * @generated
	 * @ordered
	 */
	LEVITATION(18, "LEVITATION", "LEVITATION"),
	/**
	 * The '<em><b>LUCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LUCK_VALUE
	 * @generated
	 * @ordered
	 */
	LUCK(19, "LUCK", "LUCK"),
	/**
	 * The '<em><b>MOVEMENT SLOWDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOVEMENT_SLOWDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_SLOWDOWN(20, "MOVEMENT_SLOWDOWN", "MOVEMENT_SLOWDOWN"),
	/**
	 * The '<em><b>MOVEMENT SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOVEMENT_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_SPEED(21, "MOVEMENT_SPEED", "MOVEMENT_SPEED"),
	/**
	 * The '<em><b>NIGHT VISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NIGHT_VISION_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT_VISION(22, "NIGHT_VISION", "NIGHT_VISION"),
	/**
	 * The '<em><b>POISON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #POISON_VALUE
	 * @generated
	 * @ordered
	 */
	POISON(23, "POISON", "POISON"),
	/**
	 * The '<em><b>REGENERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #REGENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGENERATION(24, "REGENERATION", "REGENERATION"),
	/**
	 * The '<em><b>SATURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SATURATION_VALUE
	 * @generated
	 * @ordered
	 */
	SATURATION(25, "SATURATION", "SATURATION"),
	/**
	 * The '<em><b>SLOW FALLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SLOW_FALLING_VALUE
	 * @generated
	 * @ordered
	 */
	SLOW_FALLING(26, "SLOW_FALLING", "SLOW_FALLING"),
	/**
	 * The '<em><b>UNLUCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UNLUCK_VALUE
	 * @generated
	 * @ordered
	 */
	UNLUCK(27, "UNLUCK", "UNLUCK"),
	/**
	 * The '<em><b>WATER BREATHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WATER_BREATHING_VALUE
	 * @generated
	 * @ordered
	 */
	WATER_BREATHING(28, "WATER_BREATHING", "WATER_BREATHING"),
	/**
	 * The '<em><b>WEAKNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WEAKNESS_VALUE
	 * @generated
	 * @ordered
	 */
	WEAKNESS(29, "WEAKNESS", "WEAKNESS"),
	/**
	 * The '<em><b>WITHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #WITHER_VALUE
	 * @generated
	 * @ordered
	 */
	WITHER(30, "WITHER", "WITHER");

	/**
	 * The '<em><b>ABSORPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSORPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSORPTION_VALUE = 0;

	/**
	 * The '<em><b>BAD OMEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_OMEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_OMEN_VALUE = 1;

	/**
	 * The '<em><b>BLINDNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLINDNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLINDNESS_VALUE = 2;

	/**
	 * The '<em><b>CONDUIT POWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDUIT_POWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDUIT_POWER_VALUE = 3;

	/**
	 * The '<em><b>CONFUSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFUSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFUSION_VALUE = 4;

	/**
	 * The '<em><b>DAMAGE BOOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAMAGE_BOOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAMAGE_BOOST_VALUE = 5;

	/**
	 * The '<em><b>DAMAGE RESISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAMAGE_RESISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAMAGE_RESISTANCE_VALUE = 6;

	/**
	 * The '<em><b>DIG SLOWDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIG_SLOWDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIG_SLOWDOWN_VALUE = 7;

	/**
	 * The '<em><b>DIG SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIG_SPEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIG_SPEED_VALUE = 8;

	/**
	 * The '<em><b>DOLPHINS GRACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOLPHINS_GRACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOLPHINS_GRACE_VALUE = 9;

	/**
	 * The '<em><b>FIRE RESISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE_RESISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRE_RESISTANCE_VALUE = 10;

	/**
	 * The '<em><b>GLOWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOWING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLOWING_VALUE = 11;

	/**
	 * The '<em><b>HARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HARM_VALUE = 12;

	/**
	 * The '<em><b>HEAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAL_VALUE = 13;

	/**
	 * The '<em><b>HEALTH BOOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_BOOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_BOOST_VALUE = 14;

	/**
	 * The '<em><b>HUNGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUNGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUNGER_VALUE = 15;

	/**
	 * The '<em><b>INVISIBILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVISIBILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVISIBILITY_VALUE = 16;

	/**
	 * The '<em><b>JUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JUMP_VALUE = 17;

	/**
	 * The '<em><b>LEVITATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVITATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVITATION_VALUE = 18;

	/**
	 * The '<em><b>LUCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUCK_VALUE = 19;

	/**
	 * The '<em><b>MOVEMENT SLOWDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_SLOWDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_SLOWDOWN_VALUE = 20;

	/**
	 * The '<em><b>MOVEMENT SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_SPEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_SPEED_VALUE = 21;

	/**
	 * The '<em><b>NIGHT VISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_VISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_VISION_VALUE = 22;

	/**
	 * The '<em><b>POISON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POISON_VALUE = 23;

	/**
	 * The '<em><b>REGENERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGENERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGENERATION_VALUE = 24;

	/**
	 * The '<em><b>SATURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATURATION_VALUE = 25;

	/**
	 * The '<em><b>SLOW FALLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOW_FALLING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLOW_FALLING_VALUE = 26;

	/**
	 * The '<em><b>UNLUCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLUCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNLUCK_VALUE = 27;

	/**
	 * The '<em><b>WATER BREATHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_BREATHING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATER_BREATHING_VALUE = 28;

	/**
	 * The '<em><b>WEAKNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAKNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEAKNESS_VALUE = 29;

	/**
	 * The '<em><b>WITHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WITHER_VALUE = 30;

	/**
	 * An array of all the '<em><b>Potion Effect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PotionEffect[] VALUES_ARRAY = new PotionEffect[] { ABSORPTION, BAD_OMEN, BLINDNESS,
			CONDUIT_POWER, CONFUSION, DAMAGE_BOOST, DAMAGE_RESISTANCE, DIG_SLOWDOWN, DIG_SPEED, DOLPHINS_GRACE,
			FIRE_RESISTANCE, GLOWING, HARM, HEAL, HEALTH_BOOST, HUNGER, INVISIBILITY, JUMP, LEVITATION, LUCK,
			MOVEMENT_SLOWDOWN, MOVEMENT_SPEED, NIGHT_VISION, POISON, REGENERATION, SATURATION, SLOW_FALLING, UNLUCK,
			WATER_BREATHING, WEAKNESS, WITHER, };

	/**
	 * A public read-only list of all the '<em><b>Potion Effect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PotionEffect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Potion Effect</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PotionEffect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PotionEffect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Potion Effect</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PotionEffect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PotionEffect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Potion Effect</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PotionEffect get(int value) {
		switch (value) {
		case ABSORPTION_VALUE:
			return ABSORPTION;
		case BAD_OMEN_VALUE:
			return BAD_OMEN;
		case BLINDNESS_VALUE:
			return BLINDNESS;
		case CONDUIT_POWER_VALUE:
			return CONDUIT_POWER;
		case CONFUSION_VALUE:
			return CONFUSION;
		case DAMAGE_BOOST_VALUE:
			return DAMAGE_BOOST;
		case DAMAGE_RESISTANCE_VALUE:
			return DAMAGE_RESISTANCE;
		case DIG_SLOWDOWN_VALUE:
			return DIG_SLOWDOWN;
		case DIG_SPEED_VALUE:
			return DIG_SPEED;
		case DOLPHINS_GRACE_VALUE:
			return DOLPHINS_GRACE;
		case FIRE_RESISTANCE_VALUE:
			return FIRE_RESISTANCE;
		case GLOWING_VALUE:
			return GLOWING;
		case HARM_VALUE:
			return HARM;
		case HEAL_VALUE:
			return HEAL;
		case HEALTH_BOOST_VALUE:
			return HEALTH_BOOST;
		case HUNGER_VALUE:
			return HUNGER;
		case INVISIBILITY_VALUE:
			return INVISIBILITY;
		case JUMP_VALUE:
			return JUMP;
		case LEVITATION_VALUE:
			return LEVITATION;
		case LUCK_VALUE:
			return LUCK;
		case MOVEMENT_SLOWDOWN_VALUE:
			return MOVEMENT_SLOWDOWN;
		case MOVEMENT_SPEED_VALUE:
			return MOVEMENT_SPEED;
		case NIGHT_VISION_VALUE:
			return NIGHT_VISION;
		case POISON_VALUE:
			return POISON;
		case REGENERATION_VALUE:
			return REGENERATION;
		case SATURATION_VALUE:
			return SATURATION;
		case SLOW_FALLING_VALUE:
			return SLOW_FALLING;
		case UNLUCK_VALUE:
			return UNLUCK;
		case WATER_BREATHING_VALUE:
			return WATER_BREATHING;
		case WEAKNESS_VALUE:
			return WEAKNESS;
		case WITHER_VALUE:
			return WITHER;
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
	private PotionEffect(int value, String name, String literal) {
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

} //PotionEffect
