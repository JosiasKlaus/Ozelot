/**
 */
package ozelot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ozelot.Block;
import ozelot.Item;
import ozelot.Mod;
import ozelot.OzelotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozelot.impl.ModImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getModId <em>Mod Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModImpl extends MinimalEObjectImpl.Container implements Mod {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The default value of the '{@link #getModId() <em>Mod Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModId()
	 * @generated
	 * @ordered
	 */
	protected static final String MOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModId() <em>Mod Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModId()
	 * @generated
	 * @ordered
	 */
	protected String modId = MOD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OzelotPackage.Literals.MOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectResolvingEList<Item>(Item.class, this, OzelotPackage.MOD__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectResolvingEList<Block>(Block.class, this, OzelotPackage.MOD__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModId() {
		return modId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModId(String newModId) {
		String oldModId = modId;
		modId = newModId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__MOD_ID, oldModId, modId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OzelotPackage.MOD__ITEMS:
				return getItems();
			case OzelotPackage.MOD__BLOCKS:
				return getBlocks();
			case OzelotPackage.MOD__MOD_ID:
				return getModId();
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
			case OzelotPackage.MOD__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case OzelotPackage.MOD__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case OzelotPackage.MOD__MOD_ID:
				setModId((String)newValue);
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
			case OzelotPackage.MOD__ITEMS:
				getItems().clear();
				return;
			case OzelotPackage.MOD__BLOCKS:
				getBlocks().clear();
				return;
			case OzelotPackage.MOD__MOD_ID:
				setModId(MOD_ID_EDEFAULT);
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
			case OzelotPackage.MOD__ITEMS:
				return items != null && !items.isEmpty();
			case OzelotPackage.MOD__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case OzelotPackage.MOD__MOD_ID:
				return MOD_ID_EDEFAULT == null ? modId != null : !MOD_ID_EDEFAULT.equals(modId);
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
		result.append(" (modId: ");
		result.append(modId);
		result.append(')');
		return result.toString();
	}

} //ModImpl
