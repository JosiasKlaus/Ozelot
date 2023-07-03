/**
 */
package ozelot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Other Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.SelfOtherEffect#isIsSelf <em>Is Self</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getSelfOtherEffect()
 * @model
 * @generated
 */
public interface SelfOtherEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Is Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Self</em>' attribute.
	 * @see #setIsSelf(boolean)
	 * @see ozelot.OzelotPackage#getSelfOtherEffect_IsSelf()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSelf();

	/**
	 * Sets the value of the '{@link ozelot.SelfOtherEffect#isIsSelf <em>Is Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Self</em>' attribute.
	 * @see #isIsSelf()
	 * @generated
	 */
	void setIsSelf(boolean value);

} // SelfOtherEffect
