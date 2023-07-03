/**
 */
package ozelot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ozelot.Block;
import ozelot.Effect;
import ozelot.OzelotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.BlockImpl#getOnStepOn <em>On Step On</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getOnDestroyed <em>On Destroyed</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getOnPlaced <em>On Placed</em>}</li>
 *   <li>{@link ozelot.impl.BlockImpl#getBlockId <em>Block Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getOnStepOn() <em>On Step On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStepOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> onStepOn;

	/**
	 * The cached value of the '{@link #getOnDestroyed() <em>On Destroyed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDestroyed()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> onDestroyed;

	/**
	 * The cached value of the '{@link #getOnPlaced() <em>On Placed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPlaced()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> onPlaced;

	/**
	 * The default value of the '{@link #getBlockId() <em>Block Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockId()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockId() <em>Block Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockId()
	 * @generated
	 * @ordered
	 */
	protected String blockId = BLOCK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getOnStepOn() {
		if (onStepOn == null) {
			onStepOn = new EObjectContainmentEList<Effect>(Effect.class, this, OzelotPackage.BLOCK__ON_STEP_ON);
		}
		return onStepOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getOnDestroyed() {
		if (onDestroyed == null) {
			onDestroyed = new EObjectContainmentEList<Effect>(Effect.class, this, OzelotPackage.BLOCK__ON_DESTROYED);
		}
		return onDestroyed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getOnPlaced() {
		if (onPlaced == null) {
			onPlaced = new EObjectContainmentEList<Effect>(Effect.class, this, OzelotPackage.BLOCK__ON_PLACED);
		}
		return onPlaced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockId() {
		return blockId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockId(String newBlockId) {
		String oldBlockId = blockId;
		blockId = newBlockId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.BLOCK__BLOCK_ID, oldBlockId, blockId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OzelotPackage.BLOCK__ON_STEP_ON:
				return ((InternalEList<?>)getOnStepOn()).basicRemove(otherEnd, msgs);
			case OzelotPackage.BLOCK__ON_DESTROYED:
				return ((InternalEList<?>)getOnDestroyed()).basicRemove(otherEnd, msgs);
			case OzelotPackage.BLOCK__ON_PLACED:
				return ((InternalEList<?>)getOnPlaced()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.BLOCK__ON_STEP_ON:
				return getOnStepOn();
			case OzelotPackage.BLOCK__ON_DESTROYED:
				return getOnDestroyed();
			case OzelotPackage.BLOCK__ON_PLACED:
				return getOnPlaced();
			case OzelotPackage.BLOCK__BLOCK_ID:
				return getBlockId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OzelotPackage.BLOCK__ON_STEP_ON:
				getOnStepOn().clear();
				getOnStepOn().addAll((Collection<? extends Effect>)newValue);
				return;
			case OzelotPackage.BLOCK__ON_DESTROYED:
				getOnDestroyed().clear();
				getOnDestroyed().addAll((Collection<? extends Effect>)newValue);
				return;
			case OzelotPackage.BLOCK__ON_PLACED:
				getOnPlaced().clear();
				getOnPlaced().addAll((Collection<? extends Effect>)newValue);
				return;
			case OzelotPackage.BLOCK__BLOCK_ID:
				setBlockId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OzelotPackage.BLOCK__ON_STEP_ON:
				getOnStepOn().clear();
				return;
			case OzelotPackage.BLOCK__ON_DESTROYED:
				getOnDestroyed().clear();
				return;
			case OzelotPackage.BLOCK__ON_PLACED:
				getOnPlaced().clear();
				return;
			case OzelotPackage.BLOCK__BLOCK_ID:
				setBlockId(BLOCK_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OzelotPackage.BLOCK__ON_STEP_ON:
				return onStepOn != null && !onStepOn.isEmpty();
			case OzelotPackage.BLOCK__ON_DESTROYED:
				return onDestroyed != null && !onDestroyed.isEmpty();
			case OzelotPackage.BLOCK__ON_PLACED:
				return onPlaced != null && !onPlaced.isEmpty();
			case OzelotPackage.BLOCK__BLOCK_ID:
				return BLOCK_ID_EDEFAULT == null ? blockId != null : !BLOCK_ID_EDEFAULT.equals(blockId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (blockId: ");
		result.append(blockId);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
