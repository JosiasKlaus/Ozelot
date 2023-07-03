/**
 */
package ozelot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Tick Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.OnTickEffect#isNeedsSelected <em>Needs Selected</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getOnTickEffect()
 * @model
 * @generated
 */
public interface OnTickEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Needs Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Selected</em>' attribute.
	 * @see #setNeedsSelected(boolean)
	 * @see ozelot.OzelotPackage#getOnTickEffect_NeedsSelected()
	 * @model required="true"
	 * @generated
	 */
	boolean isNeedsSelected();

	/**
	 * Sets the value of the '{@link ozelot.OnTickEffect#isNeedsSelected <em>Needs Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Selected</em>' attribute.
	 * @see #isNeedsSelected()
	 * @generated
	 */
	void setNeedsSelected(boolean value);

} // OnTickEffect
