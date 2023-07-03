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
 *   <li>{@link ozelot.impl.ModImpl#getModId <em>Mod Id</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getName <em>Name</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getIconPath <em>Icon Path</em>}</li>
 *   <li>{@link ozelot.impl.ModImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModImpl extends MinimalEObjectImpl.Container implements Mod {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected String authors = AUTHORS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The default value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected String iconPath = ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
			items = new EObjectContainmentEList<Item>(Item.class, this, OzelotPackage.MOD__ITEMS);
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
			blocks = new EObjectContainmentEList<Block>(Block.class, this, OzelotPackage.MOD__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconPath() {
		return iconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconPath(String newIconPath) {
		String oldIconPath = iconPath;
		iconPath = newIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__ICON_PATH, oldIconPath, iconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__VERSION, oldVersion, version));
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthors(String newAuthors) {
		String oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OzelotPackage.MOD__AUTHORS, oldAuthors, authors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OzelotPackage.MOD__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case OzelotPackage.MOD__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
			case OzelotPackage.MOD__MOD_ID:
				return getModId();
			case OzelotPackage.MOD__NAME:
				return getName();
			case OzelotPackage.MOD__DESCRIPTION:
				return getDescription();
			case OzelotPackage.MOD__AUTHORS:
				return getAuthors();
			case OzelotPackage.MOD__ITEMS:
				return getItems();
			case OzelotPackage.MOD__BLOCKS:
				return getBlocks();
			case OzelotPackage.MOD__ICON_PATH:
				return getIconPath();
			case OzelotPackage.MOD__VERSION:
				return getVersion();
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
			case OzelotPackage.MOD__MOD_ID:
				setModId((String)newValue);
				return;
			case OzelotPackage.MOD__NAME:
				setName((String)newValue);
				return;
			case OzelotPackage.MOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OzelotPackage.MOD__AUTHORS:
				setAuthors((String)newValue);
				return;
			case OzelotPackage.MOD__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case OzelotPackage.MOD__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case OzelotPackage.MOD__ICON_PATH:
				setIconPath((String)newValue);
				return;
			case OzelotPackage.MOD__VERSION:
				setVersion((String)newValue);
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
			case OzelotPackage.MOD__MOD_ID:
				setModId(MOD_ID_EDEFAULT);
				return;
			case OzelotPackage.MOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OzelotPackage.MOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OzelotPackage.MOD__AUTHORS:
				setAuthors(AUTHORS_EDEFAULT);
				return;
			case OzelotPackage.MOD__ITEMS:
				getItems().clear();
				return;
			case OzelotPackage.MOD__BLOCKS:
				getBlocks().clear();
				return;
			case OzelotPackage.MOD__ICON_PATH:
				setIconPath(ICON_PATH_EDEFAULT);
				return;
			case OzelotPackage.MOD__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case OzelotPackage.MOD__MOD_ID:
				return MOD_ID_EDEFAULT == null ? modId != null : !MOD_ID_EDEFAULT.equals(modId);
			case OzelotPackage.MOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OzelotPackage.MOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OzelotPackage.MOD__AUTHORS:
				return AUTHORS_EDEFAULT == null ? authors != null : !AUTHORS_EDEFAULT.equals(authors);
			case OzelotPackage.MOD__ITEMS:
				return items != null && !items.isEmpty();
			case OzelotPackage.MOD__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case OzelotPackage.MOD__ICON_PATH:
				return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
			case OzelotPackage.MOD__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", authors: ");
		result.append(authors);
		result.append(", iconPath: ");
		result.append(iconPath);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ModImpl
