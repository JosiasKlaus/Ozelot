/**
 */
package ozelot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ozelot.Effect;
import ozelot.OzelotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.EffectImpl#getPotionEffects <em>Potion Effects</em>}</li>
 *   <li>{@link ozelot.impl.EffectImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ozelot.impl.EffectImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ozelot.impl.EffectImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect {
	/**
	 * The default value of the '{@link #getPotionEffects() <em>Potion Effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotionEffects()
	 * @generated
	 * @ordered
	 */
	protected static final String POTION_EFFECTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPotionEffects() <em>Potion Effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotionEffects()
	 * @generated
	 * @ordered
	 */
	protected String potionEffects = POTION_EFFECTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPotionEffects() {
		return potionEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotionEffects(String newPotionEffects) {
		String oldPotionEffects = potionEffects;
		potionEffects = newPotionEffects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.EFFECT__POTION_EFFECTS, oldPotionEffects, potionEffects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.EFFECT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.EFFECT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.EFFECT__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.EFFECT__POTION_EFFECTS:
				return getPotionEffects();
			case OzelotPackage.EFFECT__LEVEL:
				return getLevel();
			case OzelotPackage.EFFECT__DURATION:
				return getDuration();
			case OzelotPackage.EFFECT__VISIBLE:
				return isVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OzelotPackage.EFFECT__POTION_EFFECTS:
				setPotionEffects((String)newValue);
				return;
			case OzelotPackage.EFFECT__LEVEL:
				setLevel((Integer)newValue);
				return;
			case OzelotPackage.EFFECT__DURATION:
				setDuration((Double)newValue);
				return;
			case OzelotPackage.EFFECT__VISIBLE:
				setVisible((Boolean)newValue);
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
			case OzelotPackage.EFFECT__POTION_EFFECTS:
				setPotionEffects(POTION_EFFECTS_EDEFAULT);
				return;
			case OzelotPackage.EFFECT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case OzelotPackage.EFFECT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case OzelotPackage.EFFECT__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case OzelotPackage.EFFECT__POTION_EFFECTS:
				return POTION_EFFECTS_EDEFAULT == null ? potionEffects != null : !POTION_EFFECTS_EDEFAULT.equals(potionEffects);
			case OzelotPackage.EFFECT__LEVEL:
				return level != LEVEL_EDEFAULT;
			case OzelotPackage.EFFECT__DURATION:
				return duration != DURATION_EDEFAULT;
			case OzelotPackage.EFFECT__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
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
		result.append(" (potionEffects: ");
		result.append(potionEffects);
		result.append(", level: ");
		result.append(level);
		result.append(", duration: ");
		result.append(duration);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //EffectImpl
