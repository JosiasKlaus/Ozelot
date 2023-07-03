/**
 */
package ozelot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ozelot.OzelotPackage;
import ozelot.SelfOtherEffect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Other Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.SelfOtherEffectImpl#isIsSelf <em>Is Self</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfOtherEffectImpl extends EffectImpl implements SelfOtherEffect {
	/**
	 * The default value of the '{@link #isIsSelf() <em>Is Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELF_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSelf() <em>Is Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelf()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelf = IS_SELF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfOtherEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.SELF_OTHER_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelf() {
		return isSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelf(boolean newIsSelf) {
		boolean oldIsSelf = isSelf;
		isSelf = newIsSelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.SELF_OTHER_EFFECT__IS_SELF, oldIsSelf, isSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.SELF_OTHER_EFFECT__IS_SELF:
				return isIsSelf();
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
			case OzelotPackage.SELF_OTHER_EFFECT__IS_SELF:
				setIsSelf((Boolean)newValue);
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
			case OzelotPackage.SELF_OTHER_EFFECT__IS_SELF:
				setIsSelf(IS_SELF_EDEFAULT);
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
			case OzelotPackage.SELF_OTHER_EFFECT__IS_SELF:
				return isSelf != IS_SELF_EDEFAULT;
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
		result.append(" (isSelf: ");
		result.append(isSelf);
		result.append(')');
		return result.toString();
	}

} //SelfOtherEffectImpl
