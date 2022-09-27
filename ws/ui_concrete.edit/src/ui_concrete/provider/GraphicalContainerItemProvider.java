/**
 */
package ui_concrete.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ui_concrete.GraphicalContainer;
import ui_concrete.Ui_concreteFactory;
import ui_concrete.Ui_concretePackage;

/**
 * This is the item provider adapter for a {@link ui_concrete.GraphicalContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalContainerItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GraphicalContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicalContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicalContainer)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicalContainer_type") :
			getString("_UI_GraphicalContainer_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GraphicalContainer.class)) {
			case Ui_concretePackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGraphicalContainer()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGraphicalIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createTextInput()));
	}

}
