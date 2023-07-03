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
 *   <li>{@link ozelot.Block#getOnStepOn <em>On Step On</em>}</li>
 *   <li>{@link ozelot.Block#getOnDestroyed <em>On Destroyed</em>}</li>
 *   <li>{@link ozelot.Block#getOnPlaced <em>On Placed</em>}</li>
 *   <li>{@link ozelot.Block#getBlockId <em>Block Id</em>}</li>
 * </ul>
 *
 * @see ozelot.OzelotPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>On Step On</b></em>' containment reference list.
	 * The list contents are of type {@link ozelot.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Step On</em>' containment reference list.
	 * @see ozelot.OzelotPackage#getBlock_OnStepOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getOnStepOn();

	/**
	 * Returns the value of the '<em><b>On Destroyed</b></em>' containment reference list.
	 * The list contents are of type {@link ozelot.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Destroyed</em>' containment reference list.
	 * @see ozelot.OzelotPackage#getBlock_OnDestroyed()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getOnDestroyed();

	/**
	 * Returns the value of the '<em><b>On Placed</b></em>' containment reference list.
	 * The list contents are of type {@link ozelot.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Placed</em>' containment reference list.
	 * @see ozelot.OzelotPackage#getBlock_OnPlaced()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getOnPlaced();

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

} // Block
