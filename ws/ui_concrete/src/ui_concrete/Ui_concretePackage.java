/**
 */
package ui_concrete;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ui_concrete.Ui_concreteFactory
 * @model kind="package"
 * @generated
 */
public interface Ui_concretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui_concrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ui_concrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui_concrete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ui_concretePackage eINSTANCE = ui_concrete.impl.Ui_concretePackageImpl.init();

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ModelFactoryImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst UI Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_UI_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.UI_DiagramImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getUI_Diagram()
	 * @generated
	 */
	int UI_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__USER_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.UserInterfaceImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGTH = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT = 6;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Lst Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LST_MODEL_ELEMENTS = 8;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ModelElementImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGTH = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BACKGROUND_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT = 6;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT_SIZE = 7;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GraphicalContainerImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE = MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GraphicalIndividualImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalIndividual()
	 * @generated
	 */
	int GRAPHICAL_INDIVIDUAL = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE = MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Graphical Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GroupImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = GRAPHICAL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ButtonImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.LabelImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.CheckBoxImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.TextInputImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ui_concrete.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see ui_concrete.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst UI Diagrams</em>'.
	 * @see ui_concrete.ModelFactory#getLstUI_Diagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstUI_Diagrams();

	/**
	 * Returns the meta object for class '{@link ui_concrete.UI_Diagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see ui_concrete.UI_Diagram
	 * @generated
	 */
	EClass getUI_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Interface</em>'.
	 * @see ui_concrete.UI_Diagram#getUserInterface()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_UserInterface();

	/**
	 * Returns the meta object for class '{@link ui_concrete.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see ui_concrete.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ui_concrete.UserInterface#getTitle()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Title();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see ui_concrete.UserInterface#getPositionX()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see ui_concrete.UserInterface#getPositionY()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_concrete.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see ui_concrete.UserInterface#getHeigth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ui_concrete.UserInterface#getBackgroundColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see ui_concrete.UserInterface#getTitleFont()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see ui_concrete.UserInterface#getTitleFontSize()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFontSize();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.UserInterface#getLstModelElements <em>Lst Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Model Elements</em>'.
	 * @see ui_concrete.UserInterface#getLstModelElements()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LstModelElements();

	/**
	 * Returns the meta object for class '{@link ui_concrete.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see ui_concrete.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ui_concrete.ModelElement#getTitle()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Title();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see ui_concrete.ModelElement#getPositionX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see ui_concrete.ModelElement#getPositionY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_concrete.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see ui_concrete.ModelElement#getHeigth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ui_concrete.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see ui_concrete.ModelElement#getTitleFont()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see ui_concrete.ModelElement#getTitleFontSize()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFontSize();

	/**
	 * Returns the meta object for class '{@link ui_concrete.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see ui_concrete.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Model Elements</em>'.
	 * @see ui_concrete.GraphicalContainer#getLstChildModelElements()
	 * @see #getGraphicalContainer()
	 * @generated
	 */
	EReference getGraphicalContainer_LstChildModelElements();

	/**
	 * Returns the meta object for class '{@link ui_concrete.GraphicalIndividual <em>Graphical Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Individual</em>'.
	 * @see ui_concrete.GraphicalIndividual
	 * @generated
	 */
	EClass getGraphicalIndividual();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ui_concrete.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see ui_concrete.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see ui_concrete.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link ui_concrete.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see ui_concrete.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link ui_concrete.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see ui_concrete.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ui_concreteFactory getUi_concreteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ModelFactoryImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst UI Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_UI_DIAGRAMS = eINSTANCE.getModelFactory_LstUI_Diagrams();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.UI_DiagramImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getUI_Diagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUI_Diagram();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__USER_INTERFACE = eINSTANCE.getUI_Diagram_UserInterface();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.UserInterfaceImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE = eINSTANCE.getUserInterface_Title();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_X = eINSTANCE.getUserInterface_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_Y = eINSTANCE.getUserInterface_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGTH = eINSTANCE.getUserInterface_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__BACKGROUND_COLOR = eINSTANCE.getUserInterface_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT = eINSTANCE.getUserInterface_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT_SIZE = eINSTANCE.getUserInterface_TitleFontSize();

		/**
		 * The meta object literal for the '<em><b>Lst Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LST_MODEL_ELEMENTS = eINSTANCE.getUserInterface_LstModelElements();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ModelElementImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE = eINSTANCE.getModelElement_Title();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_X = eINSTANCE.getModelElement_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_Y = eINSTANCE.getModelElement_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WIDTH = eINSTANCE.getModelElement_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGTH = eINSTANCE.getModelElement_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT = eINSTANCE.getModelElement_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT_SIZE = eINSTANCE.getModelElement_TitleFontSize();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GraphicalContainerImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EClass GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Lst Child Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = eINSTANCE.getGraphicalContainer_LstChildModelElements();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GraphicalIndividualImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalIndividual()
		 * @generated
		 */
		EClass GRAPHICAL_INDIVIDUAL = eINSTANCE.getGraphicalIndividual();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GroupImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ButtonImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.LabelImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.CheckBoxImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.TextInputImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

	}

} //Ui_concretePackage