/**
 */
package org.drury.mo631.project.impl;

import org.drury.mo631.project.Element;
import org.drury.mo631.project.projectPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ElementImpl#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ElementImpl#getLayout_height <em>Layout height</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_width() <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_width()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout_width() <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_width()
	 * @generated
	 * @ordered
	 */
	protected String layout_width = LAYOUT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_height() <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_height()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout_height() <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_height()
	 * @generated
	 * @ordered
	 */
	protected String layout_height = LAYOUT_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return projectPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayout_width() {
		return layout_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout_width(String newLayout_width) {
		String oldLayout_width = layout_width;
		layout_width = newLayout_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.ELEMENT__LAYOUT_WIDTH, oldLayout_width,
					layout_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayout_height() {
		return layout_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout_height(String newLayout_height) {
		String oldLayout_height = layout_height;
		layout_height = newLayout_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.ELEMENT__LAYOUT_HEIGHT,
					oldLayout_height, layout_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case projectPackage.ELEMENT__ID:
			return getId();
		case projectPackage.ELEMENT__LAYOUT_WIDTH:
			return getLayout_width();
		case projectPackage.ELEMENT__LAYOUT_HEIGHT:
			return getLayout_height();
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
		case projectPackage.ELEMENT__ID:
			setId((String) newValue);
			return;
		case projectPackage.ELEMENT__LAYOUT_WIDTH:
			setLayout_width((String) newValue);
			return;
		case projectPackage.ELEMENT__LAYOUT_HEIGHT:
			setLayout_height((String) newValue);
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
		case projectPackage.ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case projectPackage.ELEMENT__LAYOUT_WIDTH:
			setLayout_width(LAYOUT_WIDTH_EDEFAULT);
			return;
		case projectPackage.ELEMENT__LAYOUT_HEIGHT:
			setLayout_height(LAYOUT_HEIGHT_EDEFAULT);
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
		case projectPackage.ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case projectPackage.ELEMENT__LAYOUT_WIDTH:
			return LAYOUT_WIDTH_EDEFAULT == null ? layout_width != null : !LAYOUT_WIDTH_EDEFAULT.equals(layout_width);
		case projectPackage.ELEMENT__LAYOUT_HEIGHT:
			return LAYOUT_HEIGHT_EDEFAULT == null ? layout_height != null
					: !LAYOUT_HEIGHT_EDEFAULT.equals(layout_height);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", layout_width: ");
		result.append(layout_width);
		result.append(", layout_height: ");
		result.append(layout_height);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
