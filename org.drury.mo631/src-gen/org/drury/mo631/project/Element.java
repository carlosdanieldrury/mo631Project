/**
 */
package org.drury.mo631.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.Element#getId <em>Id</em>}</li>
 *   <li>{@link org.drury.mo631.project.Element#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link org.drury.mo631.project.Element#getLayout_height <em>Layout height</em>}</li>
 * </ul>
 *
 * @see org.drury.mo631.project.projectPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.drury.mo631.project.projectPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout width</em>' attribute.
	 * @see #setLayout_width(String)
	 * @see org.drury.mo631.project.projectPackage#getElement_Layout_width()
	 * @model
	 * @generated
	 */
	String getLayout_width();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.Element#getLayout_width <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout width</em>' attribute.
	 * @see #getLayout_width()
	 * @generated
	 */
	void setLayout_width(String value);

	/**
	 * Returns the value of the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout height</em>' attribute.
	 * @see #setLayout_height(String)
	 * @see org.drury.mo631.project.projectPackage#getElement_Layout_height()
	 * @model
	 * @generated
	 */
	String getLayout_height();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.Element#getLayout_height <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout height</em>' attribute.
	 * @see #getLayout_height()
	 * @generated
	 */
	void setLayout_height(String value);

} // Element
