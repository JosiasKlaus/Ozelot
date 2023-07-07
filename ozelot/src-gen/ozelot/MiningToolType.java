/**
 */
package ozelot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mining Tool Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ozelot.OzelotPackage#getMiningToolType()
 * @model
 * @generated
 */
public enum MiningToolType implements Enumerator {
	/**
	 * The '<em><b>AXE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AXE_VALUE
	 * @generated
	 * @ordered
	 */
	AXE(0, "AXE", "AXE"),

	/**
	 * The '<em><b>HOE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOE_VALUE
	 * @generated
	 * @ordered
	 */
	HOE(1, "HOE", "HOE"),

	/**
	 * The '<em><b>PICKAXE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICKAXE_VALUE
	 * @generated
	 * @ordered
	 */
	PICKAXE(2, "PICKAXE", "PICKAXE"),

	/**
	 * The '<em><b>SHOVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOVEL_VALUE
	 * @generated
	 * @ordered
	 */
	SHOVEL(3, "SHOVEL", "SHOVEL");

	/**
	 * The '<em><b>AXE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AXE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AXE_VALUE = 0;

	/**
	 * The '<em><b>HOE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOE_VALUE = 1;

	/**
	 * The '<em><b>PICKAXE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICKAXE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PICKAXE_VALUE = 2;

	/**
	 * The '<em><b>SHOVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHOVEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Mining Tool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MiningToolType[] VALUES_ARRAY = new MiningToolType[] { AXE, HOE, PICKAXE, SHOVEL, };

	/**
	 * A public read-only list of all the '<em><b>Mining Tool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MiningToolType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mining Tool Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MiningToolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MiningToolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mining Tool Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MiningToolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MiningToolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mining Tool Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MiningToolType get(int value) {
		switch (value) {
		case AXE_VALUE:
			return AXE;
		case HOE_VALUE:
			return HOE;
		case PICKAXE_VALUE:
			return PICKAXE;
		case SHOVEL_VALUE:
			return SHOVEL;
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
	private MiningToolType(int value, String name, String literal) {
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

} //MiningToolType
