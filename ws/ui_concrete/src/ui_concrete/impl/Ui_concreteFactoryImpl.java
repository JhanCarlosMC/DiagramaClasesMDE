/**
 */
package ui_concrete.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ui_concrete.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui_concreteFactoryImpl extends EFactoryImpl implements Ui_concreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ui_concreteFactory init() {
		try {
			Ui_concreteFactory theUi_concreteFactory = (Ui_concreteFactory)EPackage.Registry.INSTANCE.getEFactory(Ui_concretePackage.eNS_URI);
			if (theUi_concreteFactory != null) {
				return theUi_concreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ui_concreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_concreteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ui_concretePackage.MODEL_FACTORY: return createModelFactory();
			case Ui_concretePackage.UI_DIAGRAM: return createUI_Diagram();
			case Ui_concretePackage.USER_INTERFACE: return createUserInterface();
			case Ui_concretePackage.MODEL_ELEMENT: return createModelElement();
			case Ui_concretePackage.GRAPHICAL_CONTAINER: return createGraphicalContainer();
			case Ui_concretePackage.GRAPHICAL_INDIVIDUAL: return createGraphicalIndividual();
			case Ui_concretePackage.GROUP: return createGroup();
			case Ui_concretePackage.BUTTON: return createButton();
			case Ui_concretePackage.LABEL: return createLabel();
			case Ui_concretePackage.CHECK_BOX: return createCheckBox();
			case Ui_concretePackage.TEXT_INPUT: return createTextInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI_Diagram createUI_Diagram() {
		UI_DiagramImpl uI_Diagram = new UI_DiagramImpl();
		return uI_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainer() {
		GraphicalContainerImpl graphicalContainer = new GraphicalContainerImpl();
		return graphicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividual createGraphicalIndividual() {
		GraphicalIndividualImpl graphicalIndividual = new GraphicalIndividualImpl();
		return graphicalIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_concretePackage getUi_concretePackage() {
		return (Ui_concretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ui_concretePackage getPackage() {
		return Ui_concretePackage.eINSTANCE;
	}

} //Ui_concreteFactoryImpl
