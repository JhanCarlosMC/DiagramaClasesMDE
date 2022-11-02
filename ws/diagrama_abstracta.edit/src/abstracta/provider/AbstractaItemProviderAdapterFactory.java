/**
 */
package abstracta.provider;

import abstracta.util.AbstractaAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractaItemProviderAdapterFactory extends AbstractaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public AbstractaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.ModelFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryItemProvider modelFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.ModelFactory}.
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
	 * This keeps track of the one adapter used for all {@link abstracta.MKJPaquete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJPaqueteItemProvider mkjPaqueteItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJPaquete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJPaqueteAdapter() {
		if (mkjPaqueteItemProvider == null) {
			mkjPaqueteItemProvider = new MKJPaqueteItemProvider(this);
		}

		return mkjPaqueteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJClase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJClaseItemProvider mkjClaseItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJClase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJClaseAdapter() {
		if (mkjClaseItemProvider == null) {
			mkjClaseItemProvider = new MKJClaseItemProvider(this);
		}

		return mkjClaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJAtributo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJAtributoItemProvider mkjAtributoItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJAtributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJAtributoAdapter() {
		if (mkjAtributoItemProvider == null) {
			mkjAtributoItemProvider = new MKJAtributoItemProvider(this);
		}

		return mkjAtributoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJMetodo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJMetodoItemProvider mkjMetodoItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJMetodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJMetodoAdapter() {
		if (mkjMetodoItemProvider == null) {
			mkjMetodoItemProvider = new MKJMetodoItemProvider(this);
		}

		return mkjMetodoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJRelacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJRelacionItemProvider mkjRelacionItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJRelacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJRelacionAdapter() {
		if (mkjRelacionItemProvider == null) {
			mkjRelacionItemProvider = new MKJRelacionItemProvider(this);
		}

		return mkjRelacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJAsociacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJAsociacionItemProvider mkjAsociacionItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJAsociacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJAsociacionAdapter() {
		if (mkjAsociacionItemProvider == null) {
			mkjAsociacionItemProvider = new MKJAsociacionItemProvider(this);
		}

		return mkjAsociacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJContainment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJContainmentItemProvider mkjContainmentItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJContainmentAdapter() {
		if (mkjContainmentItemProvider == null) {
			mkjContainmentItemProvider = new MKJContainmentItemProvider(this);
		}

		return mkjContainmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJAgregacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJAgregacionItemProvider mkjAgregacionItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJAgregacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJAgregacionAdapter() {
		if (mkjAgregacionItemProvider == null) {
			mkjAgregacionItemProvider = new MKJAgregacionItemProvider(this);
		}

		return mkjAgregacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJHerencia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJHerenciaItemProvider mkjHerenciaItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJHerencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJHerenciaAdapter() {
		if (mkjHerenciaItemProvider == null) {
			mkjHerenciaItemProvider = new MKJHerenciaItemProvider(this);
		}

		return mkjHerenciaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstracta.MKJInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKJInterfaceItemProvider mkjInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link abstracta.MKJInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMKJInterfaceAdapter() {
		if (mkjInterfaceItemProvider == null) {
			mkjInterfaceItemProvider = new MKJInterfaceItemProvider(this);
		}

		return mkjInterfaceItemProvider;
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
		if (mkjPaqueteItemProvider != null) mkjPaqueteItemProvider.dispose();
		if (mkjClaseItemProvider != null) mkjClaseItemProvider.dispose();
		if (mkjAtributoItemProvider != null) mkjAtributoItemProvider.dispose();
		if (mkjMetodoItemProvider != null) mkjMetodoItemProvider.dispose();
		if (mkjRelacionItemProvider != null) mkjRelacionItemProvider.dispose();
		if (mkjAsociacionItemProvider != null) mkjAsociacionItemProvider.dispose();
		if (mkjContainmentItemProvider != null) mkjContainmentItemProvider.dispose();
		if (mkjAgregacionItemProvider != null) mkjAgregacionItemProvider.dispose();
		if (mkjHerenciaItemProvider != null) mkjHerenciaItemProvider.dispose();
		if (mkjInterfaceItemProvider != null) mkjInterfaceItemProvider.dispose();
	}

}
