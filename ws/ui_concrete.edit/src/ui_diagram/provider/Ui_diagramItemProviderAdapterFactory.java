/**
 */
package ui_diagram.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ui_diagram.util.Ui_diagramAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui_diagramItemProviderAdapterFactory extends Ui_diagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_diagramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.ModelFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryItemProvider modelFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.ModelFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelFactoryAdapter() {
		if (modelFactoryItemProvider == null) {
			modelFactoryItemProvider = new ModelFactoryItemProvider(this);
		}

		return modelFactoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.UI_Diagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UI_DiagramItemProvider uI_DiagramItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.UI_Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUI_DiagramAdapter() {
		if (uI_DiagramItemProvider == null) {
			uI_DiagramItemProvider = new UI_DiagramItemProvider(this);
		}

		return uI_DiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.UserInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterfaceItemProvider userInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.UserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserInterfaceAdapter() {
		if (userInterfaceItemProvider == null) {
			userInterfaceItemProvider = new UserInterfaceItemProvider(this);
		}

		return userInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.ModelElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementItemProvider modelElementItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementAdapter() {
		if (modelElementItemProvider == null) {
			modelElementItemProvider = new ModelElementItemProvider(this);
		}

		return modelElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.GraphicalContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalContainerItemProvider graphicalContainerItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.GraphicalContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicalContainerAdapter() {
		if (graphicalContainerItemProvider == null) {
			graphicalContainerItemProvider = new GraphicalContainerItemProvider(this);
		}

		return graphicalContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.GraphicalIndividual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalIndividualItemProvider graphicalIndividualItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.GraphicalIndividual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicalIndividualAdapter() {
		if (graphicalIndividualItemProvider == null) {
			graphicalIndividualItemProvider = new GraphicalIndividualItemProvider(this);
		}

		return graphicalIndividualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.Label} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelItemProvider labelItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelAdapter() {
		if (labelItemProvider == null) {
			labelItemProvider = new LabelItemProvider(this);
		}

		return labelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.CheckBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckBoxItemProvider checkBoxItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.CheckBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckBoxAdapter() {
		if (checkBoxItemProvider == null) {
			checkBoxItemProvider = new CheckBoxItemProvider(this);
		}

		return checkBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ui_diagram.TextInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputItemProvider textInputItemProvider;

	/**
	 * This creates an adapter for a {@link ui_diagram.TextInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextInputAdapter() {
		if (textInputItemProvider == null) {
			textInputItemProvider = new TextInputItemProvider(this);
		}

		return textInputItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelFactoryItemProvider != null) modelFactoryItemProvider.dispose();
		if (uI_DiagramItemProvider != null) uI_DiagramItemProvider.dispose();
		if (userInterfaceItemProvider != null) userInterfaceItemProvider.dispose();
		if (modelElementItemProvider != null) modelElementItemProvider.dispose();
		if (graphicalContainerItemProvider != null) graphicalContainerItemProvider.dispose();
		if (graphicalIndividualItemProvider != null) graphicalIndividualItemProvider.dispose();
		if (groupItemProvider != null) groupItemProvider.dispose();
		if (buttonItemProvider != null) buttonItemProvider.dispose();
		if (labelItemProvider != null) labelItemProvider.dispose();
		if (checkBoxItemProvider != null) checkBoxItemProvider.dispose();
		if (textInputItemProvider != null) textInputItemProvider.dispose();
	}

}
