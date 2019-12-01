/**
 */
package org.drury.mo631.project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.drury.mo631.project.View#getText <em>Text</em>}</li>
 *   <li>{@link org.drury.mo631.project.View#getStart <em>Start</em>}</li>
 *   <li>{@link org.drury.mo631.project.View#getEnd <em>End</em>}</li>
 *   <li>{@link org.drury.mo631.project.View#getTop <em>Top</em>}</li>
 *   <li>{@link org.drury.mo631.project.View#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @see org.drury.mo631.project.projectPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.drury.mo631.project.projectPackage#getView_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.View#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Position)
	 * @see org.drury.mo631.project.projectPackage#getView_Start()
	 * @model containment="true"
	 * @generated
	 */
	Position getStart();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.View#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Position value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Position)
	 * @see org.drury.mo631.project.projectPackage#getView_End()
	 * @model containment="true"
	 * @generated
	 */
	Position getEnd();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.View#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Position value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference.
	 * @see #setTop(Position)
	 * @see org.drury.mo631.project.projectPackage#getView_Top()
	 * @model containment="true"
	 * @generated
	 */
	Position getTop();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.View#getTop <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' containment reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Position value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' containment reference.
	 * @see #setBottom(Position)
	 * @see org.drury.mo631.project.projectPackage#getView_Bottom()
	 * @model containment="true"
	 * @generated
	 */
	Position getBottom();

	/**
	 * Sets the value of the '{@link org.drury.mo631.project.View#getBottom <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' containment reference.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(Position value);

} // View
