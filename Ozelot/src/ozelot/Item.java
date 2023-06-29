/**
 */
package ozelot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozelot.Item#getToolProperty <em>Tool Property</em>}</li>
 *   <li>{@link ozelot.Item#getOnTick <em>On Tick</em>}</li>
 *   <li>{@link ozelot.Item#getOnAttack <em>On Attack</em>}</li>
 *   <li>{@link ozelot.Item#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link ozelot.Item#isGlows <em>Glows</em>}</li>
 *   <li>{@link ozelot.Item#getMaxStackSize <em>Max Stack Size</em>}</li>
 *   <li>{@link ozelot.Item#isIsImmuneToFire <em>Is Immune To Fire</em>}</li>
 *   <li>{@link ozelot.Item#getItemId <em>Item Id</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Property</em>' reference.
	 * @see #setToolProperty(ToolProperty)
	 * @see ozelot.OzelotPackage#getItem_ToolProperty()
	 * @model
	 * @generated
	 */
	ToolProperty getToolProperty();

	/**
	 * Sets the value of the '{@link ozelot.Item#getToolProperty <em>Tool Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Property</em>' reference.
	 * @see #getToolProperty()
	 * @generated
	 */
	void setToolProperty(ToolProperty value);

	/**
	 * Returns the value of the '<em><b>On Tick</b></em>' reference list.
	 * The list contents are of type {@link ozelot.OnTickEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Tick</em>' reference list.
	 * @see ozelot.OzelotPackage#getItem_OnTick()
	 * @model
	 * @generated
	 */
	EList<OnTickEffect> getOnTick();

	/**
	 * Returns the value of the '<em><b>On Attack</b></em>' reference list.
	 * The list contents are of type {@link ozelot.SelfOtherEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Attack</em>' reference list.
	 * @see ozelot.OzelotPackage#getItem_OnAttack()
	 * @model
	 * @generated
	 */
	EList<SelfOtherEffect> getOnAttack();

	/**
	 * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Path</em>' attribute.
	 * @see #setIconPath(String)
	 * @see ozelot.OzelotPackage#getItem_IconPath()
	 * @model
	 * @generated
	 */
	String getIconPath();

	/**
	 * Sets the value of the '{@link ozelot.Item#getIconPath <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Path</em>' attribute.
	 * @see #getIconPath()
	 * @generated
	 */
	void setIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Glows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glows</em>' attribute.
	 * @see #setGlows(boolean)
	 * @see ozelot.OzelotPackage#getItem_Glows()
	 * @model
	 * @generated
	 */
	boolean isGlows();

	/**
	 * Sets the value of the '{@link ozelot.Item#isGlows <em>Glows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glows</em>' attribute.
	 * @see #isGlows()
	 * @generated
	 */
	void setGlows(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Stack Size</b></em>' attribute.
	 * The default value is <code>"64"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Stack Size</em>' attribute.
	 * @see #setMaxStackSize(int)
	 * @see ozelot.OzelotPackage#getItem_MaxStackSize()
	 * @model default="64"
	 * @generated
	 */
	int getMaxStackSize();

	/**
	 * Sets the value of the '{@link ozelot.Item#getMaxStackSize <em>Max Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Stack Size</em>' attribute.
	 * @see #getMaxStackSize()
	 * @generated
	 */
	void setMaxStackSize(int value);

	/**
	 * Returns the value of the '<em><b>Is Immune To Fire</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Immune To Fire</em>' attribute.
	 * @see #setIsImmuneToFire(boolean)
	 * @see ozelot.OzelotPackage#getItem_IsImmuneToFire()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsImmuneToFire();

	/**
	 * Sets the value of the '{@link ozelot.Item#isIsImmuneToFire <em>Is Immune To Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Immune To Fire</em>' attribute.
	 * @see #isIsImmuneToFire()
	 * @generated
	 */
	void setIsImmuneToFire(boolean value);

	/**
	 * Returns the value of the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Id</em>' attribute.
	 * @see #setItemId(String)
	 * @see ozelot.OzelotPackage#getItem_ItemId()
	 * @model
	 * @generated
	 */
	String getItemId();

	/**
	 * Sets the value of the '{@link ozelot.Item#getItemId <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Id</em>' attribute.
	 * @see #getItemId()
	 * @generated
	 */
	void setItemId(String value);

} // Item
