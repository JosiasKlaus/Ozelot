/**
 */
package ozelot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rarity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ozelot.OzelotPackage#getRarity()
 * @model
 * @generated
 */
public enum Rarity implements Enumerator {
	/**
	 * The '<em><b>COMMON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMON_VALUE
	 * @generated
	 * @ordered
	 */
	COMMON(0, "COMMON", "COMMON"),

	/**
	 * The '<em><b>UNCOMMON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCOMMON_VALUE
	 * @generated
	 * @ordered
	 */
	UNCOMMON(1, "UNCOMMON", "UNCOMMON"),

	/**
	 * The '<em><b>RARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RARE_VALUE
	 * @generated
	 * @ordered
	 */
	RARE(2, "RARE", "RARE"),

	/**
	 * The '<em><b>EPIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIC_VALUE
	 * @generated
	 * @ordered
	 */
	EPIC(3, "EPIC", "EPIC");

	/**
	 * The '<em><b>COMMON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMON_VALUE = 0;

	/**
	 * The '<em><b>UNCOMMON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCOMMON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNCOMMON_VALUE = 1;

	/**
	 * The '<em><b>RARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RARE_VALUE = 2;

	/**
	 * The '<em><b>EPIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EPIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Rarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Rarity[] VALUES_ARRAY = new Rarity[] { COMMON, UNCOMMON, RARE, EPIC, };

	/**
	 * A public read-only list of all the '<em><b>Rarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Rarity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rarity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Rarity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Rarity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rarity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Rarity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Rarity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rarity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Rarity get(int value) {
		switch (value) {
		case COMMON_VALUE:
			return COMMON;
		case UNCOMMON_VALUE:
			return UNCOMMON;
		case RARE_VALUE:
			return RARE;
		case EPIC_VALUE:
			return EPIC;
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
	private Rarity(int value, String name, String literal) {
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

} //Rarity
