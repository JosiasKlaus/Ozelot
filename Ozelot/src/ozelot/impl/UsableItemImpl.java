/**
 */
package ozelot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ozelot.Effect;
import ozelot.FoodItem;
import ozelot.OzelotPackage;
import ozelot.UsableItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.UsableItemImpl#getFoodProperty <em>Food Property</em>}</li>
 *   <li>{@link ozelot.impl.UsableItemImpl#getOnUse <em>On Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsableItemImpl extends ItemImpl implements UsableItem {
	/**
	 * The cached value of the '{@link #getFoodProperty() <em>Food Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodProperty()
	 * @generated
	 * @ordered
	 */
	protected FoodItem foodProperty;

	/**
	 * The cached value of the '{@link #getOnUse() <em>On Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> onUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.USABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodItem getFoodProperty() {
		if (foodProperty != null && foodProperty.eIsProxy()) {
			InternalEObject oldFoodProperty = (InternalEObject)foodProperty;
			foodProperty = (FoodItem)eResolveProxy(oldFoodProperty);
			if (foodProperty != oldFoodProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OzelotPackage.USABLE_ITEM__FOOD_PROPERTY, oldFoodProperty, foodProperty));
			}
		}
		return foodProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodItem basicGetFoodProperty() {
		return foodProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodProperty(FoodItem newFoodProperty) {
		FoodItem oldFoodProperty = foodProperty;
		foodProperty = newFoodProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.USABLE_ITEM__FOOD_PROPERTY, oldFoodProperty, foodProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getOnUse() {
		if (onUse == null) {
			onUse = new EObjectResolvingEList<Effect>(Effect.class, this, OzelotPackage.USABLE_ITEM__ON_USE);
		}
		return onUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.USABLE_ITEM__FOOD_PROPERTY:
				if (resolve) return getFoodProperty();
				return basicGetFoodProperty();
			case OzelotPackage.USABLE_ITEM__ON_USE:
				return getOnUse();
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
			case OzelotPackage.USABLE_ITEM__FOOD_PROPERTY:
				setFoodProperty((FoodItem)newValue);
				return;
			case OzelotPackage.USABLE_ITEM__ON_USE:
				getOnUse().clear();
				getOnUse().addAll((Collection<? extends Effect>)newValue);
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
			case OzelotPackage.USABLE_ITEM__FOOD_PROPERTY:
				setFoodProperty((FoodItem)null);
				return;
			case OzelotPackage.USABLE_ITEM__ON_USE:
				getOnUse().clear();
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
			case OzelotPackage.USABLE_ITEM__FOOD_PROPERTY:
				return foodProperty != null;
			case OzelotPackage.USABLE_ITEM__ON_USE:
				return onUse != null && !onUse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsableItemImpl
