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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ozelot.Effect;
import ozelot.FoodItem;
import ozelot.OzelotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Food Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.FoodItemImpl#getNutrition <em>Nutrition</em>}</li>
 *   <li>{@link ozelot.impl.FoodItemImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link ozelot.impl.FoodItemImpl#isIsMeat <em>Is Meat</em>}</li>
 *   <li>{@link ozelot.impl.FoodItemImpl#isIsAlwaysEdible <em>Is Always Edible</em>}</li>
 *   <li>{@link ozelot.impl.FoodItemImpl#getAfterEating <em>After Eating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoodItemImpl extends ItemImpl implements FoodItem {
	/**
	 * The default value of the '{@link #getNutrition() <em>Nutrition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrition()
	 * @generated
	 * @ordered
	 */
	protected static final int NUTRITION_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getNutrition() <em>Nutrition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrition()
	 * @generated
	 * @ordered
	 */
	protected int nutrition = NUTRITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturation()
	 * @generated
	 * @ordered
	 */
	protected static final float SATURATION_EDEFAULT = 0.3F;

	/**
	 * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturation()
	 * @generated
	 * @ordered
	 */
	protected float saturation = SATURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMeat() <em>Is Meat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMeat() <em>Is Meat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMeat()
	 * @generated
	 * @ordered
	 */
	protected boolean isMeat = IS_MEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAlwaysEdible() <em>Is Always Edible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAlwaysEdible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALWAYS_EDIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsAlwaysEdible() <em>Is Always Edible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAlwaysEdible()
	 * @generated
	 * @ordered
	 */
	protected boolean isAlwaysEdible = IS_ALWAYS_EDIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAfterEating() <em>After Eating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterEating()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> afterEating;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.FOOD_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNutrition() {
		return nutrition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutrition(int newNutrition) {
		int oldNutrition = nutrition;
		nutrition = newNutrition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.FOOD_ITEM__NUTRITION, oldNutrition,
					nutrition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSaturation() {
		return saturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaturation(float newSaturation) {
		float oldSaturation = saturation;
		saturation = newSaturation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.FOOD_ITEM__SATURATION, oldSaturation,
					saturation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMeat() {
		return isMeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMeat(boolean newIsMeat) {
		boolean oldIsMeat = isMeat;
		isMeat = newIsMeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.FOOD_ITEM__IS_MEAT, oldIsMeat, isMeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAlwaysEdible() {
		return isAlwaysEdible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAlwaysEdible(boolean newIsAlwaysEdible) {
		boolean oldIsAlwaysEdible = isAlwaysEdible;
		isAlwaysEdible = newIsAlwaysEdible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.FOOD_ITEM__IS_ALWAYS_EDIBLE,
					oldIsAlwaysEdible, isAlwaysEdible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getAfterEating() {
		if (afterEating == null) {
			afterEating = new EObjectContainmentEList<Effect>(Effect.class, this,
					OzelotPackage.FOOD_ITEM__AFTER_EATING);
		}
		return afterEating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OzelotPackage.FOOD_ITEM__AFTER_EATING:
			return ((InternalEList<?>) getAfterEating()).basicRemove(otherEnd, msgs);
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
		case OzelotPackage.FOOD_ITEM__NUTRITION:
			return getNutrition();
		case OzelotPackage.FOOD_ITEM__SATURATION:
			return getSaturation();
		case OzelotPackage.FOOD_ITEM__IS_MEAT:
			return isIsMeat();
		case OzelotPackage.FOOD_ITEM__IS_ALWAYS_EDIBLE:
			return isIsAlwaysEdible();
		case OzelotPackage.FOOD_ITEM__AFTER_EATING:
			return getAfterEating();
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
		case OzelotPackage.FOOD_ITEM__NUTRITION:
			setNutrition((Integer) newValue);
			return;
		case OzelotPackage.FOOD_ITEM__SATURATION:
			setSaturation((Float) newValue);
			return;
		case OzelotPackage.FOOD_ITEM__IS_MEAT:
			setIsMeat((Boolean) newValue);
			return;
		case OzelotPackage.FOOD_ITEM__IS_ALWAYS_EDIBLE:
			setIsAlwaysEdible((Boolean) newValue);
			return;
		case OzelotPackage.FOOD_ITEM__AFTER_EATING:
			getAfterEating().clear();
			getAfterEating().addAll((Collection<? extends Effect>) newValue);
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
		case OzelotPackage.FOOD_ITEM__NUTRITION:
			setNutrition(NUTRITION_EDEFAULT);
			return;
		case OzelotPackage.FOOD_ITEM__SATURATION:
			setSaturation(SATURATION_EDEFAULT);
			return;
		case OzelotPackage.FOOD_ITEM__IS_MEAT:
			setIsMeat(IS_MEAT_EDEFAULT);
			return;
		case OzelotPackage.FOOD_ITEM__IS_ALWAYS_EDIBLE:
			setIsAlwaysEdible(IS_ALWAYS_EDIBLE_EDEFAULT);
			return;
		case OzelotPackage.FOOD_ITEM__AFTER_EATING:
			getAfterEating().clear();
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
		case OzelotPackage.FOOD_ITEM__NUTRITION:
			return nutrition != NUTRITION_EDEFAULT;
		case OzelotPackage.FOOD_ITEM__SATURATION:
			return saturation != SATURATION_EDEFAULT;
		case OzelotPackage.FOOD_ITEM__IS_MEAT:
			return isMeat != IS_MEAT_EDEFAULT;
		case OzelotPackage.FOOD_ITEM__IS_ALWAYS_EDIBLE:
			return isAlwaysEdible != IS_ALWAYS_EDIBLE_EDEFAULT;
		case OzelotPackage.FOOD_ITEM__AFTER_EATING:
			return afterEating != null && !afterEating.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nutrition: ");
		result.append(nutrition);
		result.append(", saturation: ");
		result.append(saturation);
		result.append(", isMeat: ");
		result.append(isMeat);
		result.append(", isAlwaysEdible: ");
		result.append(isAlwaysEdible);
		result.append(')');
		return result.toString();
	}

} //FoodItemImpl
