/**
 */
package org.drury.mo631.project.impl;

import org.drury.mo631.project.Button;
import org.drury.mo631.project.EditText;
import org.drury.mo631.project.Element;
import org.drury.mo631.project.Position;
import org.drury.mo631.project.PositionKind;
import org.drury.mo631.project.TextView;
import org.drury.mo631.project.View;
import org.drury.mo631.project.projectFactory;
import org.drury.mo631.project.projectPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class projectPackageImpl extends EPackageImpl implements projectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.drury.mo631.project.projectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private projectPackageImpl() {
		super(eNS_URI, projectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link projectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static projectPackage init() {
		if (isInited)
			return (projectPackage) EPackage.Registry.INSTANCE.getEPackage(projectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredprojectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		projectPackageImpl theprojectPackage = registeredprojectPackage instanceof projectPackageImpl
				? (projectPackageImpl) registeredprojectPackage
				: new projectPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theprojectPackage.createPackageContents();

		// Initialize created meta-data
		theprojectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theprojectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(projectPackage.eNS_URI, theprojectPackage);
		return theprojectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewGroup() {
		return viewGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewGroup_Views() {
		return (EReference) viewGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Text() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Start() {
		return (EReference) viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_End() {
		return (EReference) viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Top() {
		return (EReference) viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Bottom() {
		return (EReference) viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextView() {
		return textViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditText() {
		return editTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Layout_width() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Layout_height() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_PositionDestination() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_View() {
		return (EReference) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPositionKind() {
		return positionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public projectFactory getprojectFactory() {
		return (projectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		viewGroupEClass = createEClass(VIEW_GROUP);
		createEReference(viewGroupEClass, VIEW_GROUP__VIEWS);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__TEXT);
		createEReference(viewEClass, VIEW__START);
		createEReference(viewEClass, VIEW__END);
		createEReference(viewEClass, VIEW__TOP);
		createEReference(viewEClass, VIEW__BOTTOM);

		buttonEClass = createEClass(BUTTON);

		textViewEClass = createEClass(TEXT_VIEW);

		editTextEClass = createEClass(EDIT_TEXT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__LAYOUT_WIDTH);
		createEAttribute(elementEClass, ELEMENT__LAYOUT_HEIGHT);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__POSITION_DESTINATION);
		createEReference(positionEClass, POSITION__VIEW);

		// Create enums
		positionKindEEnum = createEEnum(POSITION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewGroupEClass.getESuperTypes().add(this.getElement());
		viewEClass.getESuperTypes().add(this.getElement());
		buttonEClass.getESuperTypes().add(this.getView());
		textViewEClass.getESuperTypes().add(this.getView());
		editTextEClass.getESuperTypes().add(this.getView());

		// Initialize classes, features, and operations; add parameters
		initEClass(viewGroupEClass, null, "ViewGroup", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewGroup_Views(), this.getView(), null, "views", null, 0, -1, null, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Text(), ecorePackage.getEString(), "text", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Start(), this.getPosition(), null, "start", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_End(), this.getPosition(), null, "end", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Top(), this.getPosition(), null, "top", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Bottom(), this.getPosition(), null, "bottom", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Layout_width(), ecorePackage.getEString(), "layout_width", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Layout_height(), ecorePackage.getEString(), "layout_height", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_PositionDestination(), this.getPositionKind(), "positionDestination", null, 0, 1,
				Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_View(), this.getView(), null, "view", null, 0, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(positionKindEEnum, PositionKind.class, "PositionKind");
		addEEnumLiteral(positionKindEEnum, PositionKind.STARTOF);
		addEEnumLiteral(positionKindEEnum, PositionKind.ENDOF);
		addEEnumLiteral(positionKindEEnum, PositionKind.TOPOF);
		addEEnumLiteral(positionKindEEnum, PositionKind.BOTTOMOF);

		// Create resource
		createResource(eNS_URI);
	}

} //projectPackageImpl
