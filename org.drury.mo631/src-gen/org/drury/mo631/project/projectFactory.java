/**
 */
package org.drury.mo631.project;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.drury.mo631.project.projectPackage
 * @generated
 */
public interface projectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	projectFactory eINSTANCE = org.drury.mo631.project.impl.projectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Group</em>'.
	 * @generated
	 */
	Element createViewGroup();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text View</em>'.
	 * @generated
	 */
	TextView createTextView();

	/**
	 * Returns a new object of class '<em>Edit Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Text</em>'.
	 * @generated
	 */
	EditText createEditText();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	projectPackage getprojectPackage();

} //projectFactory
