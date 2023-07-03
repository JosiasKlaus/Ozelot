/**
 */
package ozelot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ozelot.OnTickEffect;
import ozelot.OzelotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Tick Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.OnTickEffectImpl#isNeedsSelected <em>Needs Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnTickEffectImpl extends EffectImpl implements OnTickEffect {
	/**
	 * The default value of the '{@link #isNeedsSelected() <em>Needs Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsSelected() <em>Needs Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean needsSelected = NEEDS_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnTickEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.ON_TICK_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsSelected() {
		return needsSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsSelected(boolean newNeedsSelected) {
		boolean oldNeedsSelected = needsSelected;
		needsSelected = newNeedsSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.ON_TICK_EFFECT__NEEDS_SELECTED, oldNeedsSelected, needsSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.ON_TICK_EFFECT__NEEDS_SELECTED:
				return isNeedsSelected();
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
			case OzelotPackage.ON_TICK_EFFECT__NEEDS_SELECTED:
				setNeedsSelected((Boolean)newValue);
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
			case OzelotPackage.ON_TICK_EFFECT__NEEDS_SELECTED:
				setNeedsSelected(NEEDS_SELECTED_EDEFAULT);
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
			case OzelotPackage.ON_TICK_EFFECT__NEEDS_SELECTED:
				return needsSelected != NEEDS_SELECTED_EDEFAULT;
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
		result.append(" (needsSelected: ");
		result.append(needsSelected);
		result.append(')');
		return result.toString();
	}

} //OnTickEffectImpl
