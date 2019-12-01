/**
 */
package org.drury.mo631.project.impl;

import org.drury.mo631.project.Position;
import org.drury.mo631.project.View;
import org.drury.mo631.project.projectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.impl.ViewImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ViewImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ViewImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ViewImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.drury.mo631.project.impl.ViewImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewImpl extends ElementImpl implements View {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Position start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Position end;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Position top;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Position bottom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return projectPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Position newStart, NotificationChain msgs) {
		Position oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__START,
					oldStart, newStart);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Position newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Position newEnd, NotificationChain msgs) {
		Position oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__END,
					oldEnd, newEnd);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Position newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject) end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__END,
						null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject) newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__END,
						null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(Position newTop, NotificationChain msgs) {
		Position oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__TOP,
					oldTop, newTop);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTop(Position newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject) top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__TOP,
						null, msgs);
			if (newTop != null)
				msgs = ((InternalEObject) newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__TOP,
						null, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottom(Position newBottom, NotificationChain msgs) {
		Position oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__BOTTOM,
					oldBottom, newBottom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottom(Position newBottom) {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject) bottom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__BOTTOM, null, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject) newBottom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - projectPackage.VIEW__BOTTOM, null, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, projectPackage.VIEW__BOTTOM, newBottom, newBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case projectPackage.VIEW__START:
			return basicSetStart(null, msgs);
		case projectPackage.VIEW__END:
			return basicSetEnd(null, msgs);
		case projectPackage.VIEW__TOP:
			return basicSetTop(null, msgs);
		case projectPackage.VIEW__BOTTOM:
			return basicSetBottom(null, msgs);
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
		case projectPackage.VIEW__TEXT:
			return getText();
		case projectPackage.VIEW__START:
			return getStart();
		case projectPackage.VIEW__END:
			return getEnd();
		case projectPackage.VIEW__TOP:
			return getTop();
		case projectPackage.VIEW__BOTTOM:
			return getBottom();
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
		case projectPackage.VIEW__TEXT:
			setText((String) newValue);
			return;
		case projectPackage.VIEW__START:
			setStart((Position) newValue);
			return;
		case projectPackage.VIEW__END:
			setEnd((Position) newValue);
			return;
		case projectPackage.VIEW__TOP:
			setTop((Position) newValue);
			return;
		case projectPackage.VIEW__BOTTOM:
			setBottom((Position) newValue);
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
		case projectPackage.VIEW__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case projectPackage.VIEW__START:
			setStart((Position) null);
			return;
		case projectPackage.VIEW__END:
			setEnd((Position) null);
			return;
		case projectPackage.VIEW__TOP:
			setTop((Position) null);
			return;
		case projectPackage.VIEW__BOTTOM:
			setBottom((Position) null);
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
		case projectPackage.VIEW__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case projectPackage.VIEW__START:
			return start != null;
		case projectPackage.VIEW__END:
			return end != null;
		case projectPackage.VIEW__TOP:
			return top != null;
		case projectPackage.VIEW__BOTTOM:
			return bottom != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
