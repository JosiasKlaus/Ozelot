/**
 */
package ozelot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.Effect#getPotionEffects <em>Potion Effects</em>}</li>
 *   <li>{@link ozelot.Effect#getLevel <em>Level</em>}</li>
 *   <li>{@link ozelot.Effect#getDuration <em>Duration</em>}</li>
 *   <li>{@link ozelot.Effect#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject {
	/**
	 * Returns the value of the '<em><b>Potion Effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potion Effects</em>' attribute.
	 * @see #setPotionEffects(String)
	 * @see ozelot.OzelotPackage#getEffect_PotionEffects()
	 * @model required="true"
	 * @generated
	 */
	String getPotionEffects();

	/**
	 * Sets the value of the '{@link ozelot.Effect#getPotionEffects <em>Potion Effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potion Effects</em>' attribute.
	 * @see #getPotionEffects()
	 * @generated
	 */
	void setPotionEffects(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see ozelot.OzelotPackage#getEffect_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link ozelot.Effect#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see ozelot.OzelotPackage#getEffect_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link ozelot.Effect#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see ozelot.OzelotPackage#getEffect_Visible()
	 * @model required="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link ozelot.Effect#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // Effect
