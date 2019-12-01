/**
 */
package org.drury.mo631.project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.drury.mo631.project.projectFactory
 * @model kind="package"
 * @generated
 */
public interface projectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.drury.mo631/druryMO631";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	projectPackage eINSTANCE = org.drury.mo631.project.impl.projectPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.ElementImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LAYOUT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LAYOUT_HEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.ViewGroupImpl <em>View Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.ViewGroupImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getViewGroup()
	 * @generated
	 */
	int VIEW_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__LAYOUT_WIDTH = ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__LAYOUT_HEIGHT = ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__VIEWS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.ViewImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_WIDTH = ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_HEIGHT = ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__START = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__END = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TOP = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BOTTOM = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.ButtonImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_WIDTH = VIEW__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_HEIGHT = VIEW__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = VIEW__TEXT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__START = VIEW__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__END = VIEW__END;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOP = VIEW__TOP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BOTTOM = VIEW__BOTTOM;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.TextViewImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LAYOUT_WIDTH = VIEW__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LAYOUT_HEIGHT = VIEW__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT = VIEW__TEXT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__START = VIEW__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__END = VIEW__END;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TOP = VIEW__TOP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__BOTTOM = VIEW__BOTTOM;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.EditTextImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getEditText()
	 * @generated
	 */
	int EDIT_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LAYOUT_WIDTH = VIEW__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LAYOUT_HEIGHT = VIEW__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT = VIEW__TEXT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__START = VIEW__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__END = VIEW__END;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TOP = VIEW__TOP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__BOTTOM = VIEW__BOTTOM;

	/**
	 * The number of structural features of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.impl.PositionImpl
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 6;

	/**
	 * The feature id for the '<em><b>Position Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__POSITION_DESTINATION = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__VIEW = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.drury.mo631.project.PositionKind <em>Position Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.drury.mo631.project.PositionKind
	 * @see org.drury.mo631.project.impl.projectPackageImpl#getPositionKind()
	 * @generated
	 */
	int POSITION_KIND = 7;

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.Element <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Group</em>'.
	 * @see org.drury.mo631.project.Element
	 * @model
	 * @generated
	 */
	EClass getViewGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.drury.mo631.project.Element#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.drury.mo631.project.Element#getViews()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Views();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.drury.mo631.project.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.drury.mo631.project.View#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.drury.mo631.project.View#getText()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.drury.mo631.project.View#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.drury.mo631.project.View#getStart()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.drury.mo631.project.View#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.drury.mo631.project.View#getEnd()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_End();

	/**
	 * Returns the meta object for the containment reference '{@link org.drury.mo631.project.View#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see org.drury.mo631.project.View#getTop()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Top();

	/**
	 * Returns the meta object for the containment reference '{@link org.drury.mo631.project.View#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom</em>'.
	 * @see org.drury.mo631.project.View#getBottom()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Bottom();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.drury.mo631.project.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see org.drury.mo631.project.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see org.drury.mo631.project.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.drury.mo631.project.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.drury.mo631.project.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.drury.mo631.project.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.drury.mo631.project.Element#getLayout_width <em>Layout width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout width</em>'.
	 * @see org.drury.mo631.project.Element#getLayout_width()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Layout_width();

	/**
	 * Returns the meta object for the attribute '{@link org.drury.mo631.project.Element#getLayout_height <em>Layout height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout height</em>'.
	 * @see org.drury.mo631.project.Element#getLayout_height()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Layout_height();

	/**
	 * Returns the meta object for class '{@link org.drury.mo631.project.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.drury.mo631.project.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.drury.mo631.project.Position#getPositionDestination <em>Position Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Destination</em>'.
	 * @see org.drury.mo631.project.Position#getPositionDestination()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_PositionDestination();

	/**
	 * Returns the meta object for the reference '{@link org.drury.mo631.project.Position#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.drury.mo631.project.Position#getView()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_View();

	/**
	 * Returns the meta object for enum '{@link org.drury.mo631.project.PositionKind <em>Position Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Kind</em>'.
	 * @see org.drury.mo631.project.PositionKind
	 * @generated
	 */
	EEnum getPositionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	projectFactory getprojectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.ViewGroupImpl <em>View Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.ViewGroupImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getViewGroup()
		 * @generated
		 */
		EClass VIEW_GROUP = eINSTANCE.getViewGroup();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__VIEWS = eINSTANCE.getViewGroup_Views();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.ViewImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__TEXT = eINSTANCE.getView_Text();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__START = eINSTANCE.getView_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__END = eINSTANCE.getView_End();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__TOP = eINSTANCE.getView_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BOTTOM = eINSTANCE.getView_Bottom();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.ButtonImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.TextViewImpl <em>Text View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.TextViewImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getTextView()
		 * @generated
		 */
		EClass TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.EditTextImpl <em>Edit Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.EditTextImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getEditText()
		 * @generated
		 */
		EClass EDIT_TEXT = eINSTANCE.getEditText();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.ElementImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Layout width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LAYOUT_WIDTH = eINSTANCE.getElement_Layout_width();

		/**
		 * The meta object literal for the '<em><b>Layout height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LAYOUT_HEIGHT = eINSTANCE.getElement_Layout_height();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.impl.PositionImpl
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Position Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__POSITION_DESTINATION = eINSTANCE.getPosition_PositionDestination();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__VIEW = eINSTANCE.getPosition_View();

		/**
		 * The meta object literal for the '{@link org.drury.mo631.project.PositionKind <em>Position Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.drury.mo631.project.PositionKind
		 * @see org.drury.mo631.project.impl.projectPackageImpl#getPositionKind()
		 * @generated
		 */
		EEnum POSITION_KIND = eINSTANCE.getPositionKind();

	}

} //projectPackage
