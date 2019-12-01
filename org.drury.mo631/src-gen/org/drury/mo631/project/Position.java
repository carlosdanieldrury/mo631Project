/**
 */
package org.drury.mo631.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.Position#getPositionDestination <em>Position Destination</em>}</li>
 *   <li>{@link org.drury.mo631.project.Position#getView <em>View</em>}</li>
 * </ul>
 *
 * @see org.drury.mo631.project.projectPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Destination</b></em>' attribute.
	 * The literals are from the enumeration {@link org.drury.mo631.project.PositionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Destination</em>' attribute.
	 * @see org.drury.mo631.project.PositionKind
	 * @see #setPositionDestination(PositionKind)
	 * @see org.drury.mo631.project.projectPackage#getPosition_PositionDestination()
	 * @model
	 * @generated
	 */
	PositionKind getPositionDestination();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.Position#getPositionDestination <em>Position Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Destination</em>' attribute.
	 * @see org.drury.mo631.project.PositionKind
	 * @see #getPositionDestination()
	 * @generated
	 */
	void setPositionDestination(PositionKind value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see org.drury.mo631.project.projectPackage#getPosition_View()
	 * @model
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.Position#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // Position
