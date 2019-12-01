/**
 */
package org.drury.mo631.project.impl;

import org.drury.mo631.project.Position;
import org.drury.mo631.project.PositionKind;
import org.drury.mo631.project.View;
import org.drury.mo631.project.projectPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.impl.PositionImpl#getPositionDestination <em>Position Destination</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.PositionImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getPositionDestination() <em>Position Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionDestination()
	 * @generated
	 * @ordered
	 */
	protected static final PositionKind POSITION_DESTINATION_EDEFAULT = PositionKind.STARTOF;

	/**
	 * The cached value of the '{@link #getPositionDestination() <em>Position Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionDestination()
	 * @generated
	 * @ordered
	 */
	protected PositionKind positionDestination = POSITION_DESTINATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return projectPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionKind getPositionDestination() {
		return positionDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionDestination(PositionKind newPositionDestination) {
		PositionKind oldPositionDestination = positionDestination;
		positionDestination = newPositionDestination == null ? POSITION_DESTINATION_EDEFAULT : newPositionDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.POSITION__POSITION_DESTINATION,
					oldPositionDestination, positionDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject) view;
			view = (View) eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, projectPackage.POSITION__VIEW, oldView,
							view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setView(View newView) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.POSITION__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case projectPackage.POSITION__POSITION_DESTINATION:
			return getPositionDestination();
		case projectPackage.POSITION__VIEW:
			if (resolve)
				return getView();
			return basicGetView();
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
		case projectPackage.POSITION__POSITION_DESTINATION:
			setPositionDestination((PositionKind) newValue);
			return;
		case projectPackage.POSITION__VIEW:
			setView((View) newValue);
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
		case projectPackage.POSITION__POSITION_DESTINATION:
			setPositionDestination(POSITION_DESTINATION_EDEFAULT);
			return;
		case projectPackage.POSITION__VIEW:
			setView((View) null);
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
		case projectPackage.POSITION__POSITION_DESTINATION:
			return positionDestination != POSITION_DESTINATION_EDEFAULT;
		case projectPackage.POSITION__VIEW:
			return view != null;
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
		result.append(" (positionDestination: ");
		result.append(positionDestination);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
