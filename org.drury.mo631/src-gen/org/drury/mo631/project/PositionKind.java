/**
 */
package org.drury.mo631.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.drury.mo631.project.projectPackage#getPositionKind()
 * @model
 * @generated
 */
public enum PositionKind implements Enumerator {
	/**
	 * The '<em><b>STARTOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTOF_VALUE
	 * @generated
	 * @ordered
	 */
	STARTOF(0, "STARTOF", "STARTOF"),

	/**
	 * The '<em><b>ENDOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDOF_VALUE
	 * @generated
	 * @ordered
	 */
	ENDOF(1, "ENDOF", "ENDOF"),

	/**
	 * The '<em><b>TOPOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOPOF_VALUE
	 * @generated
	 * @ordered
	 */
	TOPOF(2, "TOPOF", "TOPOF"),

	/**
	 * The '<em><b>BOTTOMOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOMOF_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOMOF(3, "BOTTOMOF", "BOTTOMOF");

	/**
	 * The '<em><b>STARTOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTOF_VALUE = 0;

	/**
	 * The '<em><b>ENDOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDOF_VALUE = 1;

	/**
	 * The '<em><b>TOPOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOPOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOPOF_VALUE = 2;

	/**
	 * The '<em><b>BOTTOMOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOMOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOMOF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Position Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionKind[] VALUES_ARRAY = new PositionKind[] { STARTOF, ENDOF, TOPOF, BOTTOMOF, };

	/**
	 * A public read-only list of all the '<em><b>Position Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionKind get(int value) {
		switch (value) {
		case STARTOF_VALUE:
			return STARTOF;
		case ENDOF_VALUE:
			return ENDOF;
		case TOPOF_VALUE:
			return TOPOF;
		case BOTTOMOF_VALUE:
			return BOTTOMOF;
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
	private PositionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //PositionKind
