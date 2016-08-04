/**
 */
package example.logo.model.logoASM.provider;

import example.logo.model.logoASM.util.LogoASMAdapterFactory;

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
public class LogoASMItemProviderAdapterFactory extends LogoASMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public LogoASMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Back} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackItemProvider backItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Back}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackAdapter() {
		if (backItemProvider == null) {
			backItemProvider = new BackItemProvider(this);
		}

		return backItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Forward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardItemProvider forwardItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Forward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForwardAdapter() {
		if (forwardItemProvider == null) {
			forwardItemProvider = new ForwardItemProvider(this);
		}

		return forwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Left} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftItemProvider leftItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeftAdapter() {
		if (leftItemProvider == null) {
			leftItemProvider = new LeftItemProvider(this);
		}

		return leftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Right} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightItemProvider rightItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRightAdapter() {
		if (rightItemProvider == null) {
			rightItemProvider = new RightItemProvider(this);
		}

		return rightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.PenDown} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenDownItemProvider penDownItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.PenDown}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPenDownAdapter() {
		if (penDownItemProvider == null) {
			penDownItemProvider = new PenDownItemProvider(this);
		}

		return penDownItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.PenUp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenUpItemProvider penUpItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.PenUp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPenUpAdapter() {
		if (penUpItemProvider == null) {
			penUpItemProvider = new PenUpItemProvider(this);
		}

		return penUpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Clear} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearItemProvider clearItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Clear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClearAdapter() {
		if (clearItemProvider == null) {
			clearItemProvider = new ClearItemProvider(this);
		}

		return clearItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.ProcCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcCallItemProvider procCallItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.ProcCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcCallAdapter() {
		if (procCallItemProvider == null) {
			procCallItemProvider = new ProcCallItemProvider(this);
		}

		return procCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.ProcDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcDeclarationItemProvider procDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.ProcDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcDeclarationAdapter() {
		if (procDeclarationItemProvider == null) {
			procDeclarationItemProvider = new ProcDeclarationItemProvider(this);
		}

		return procDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.ControlStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStructureItemProvider controlStructureItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlStructureAdapter() {
		if (controlStructureItemProvider == null) {
			controlStructureItemProvider = new ControlStructureItemProvider(this);
		}

		return controlStructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Repeat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatItemProvider repeatItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Repeat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatAdapter() {
		if (repeatItemProvider == null) {
			repeatItemProvider = new RepeatItemProvider(this);
		}

		return repeatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.While} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileItemProvider whileItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.While}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileAdapter() {
		if (whileItemProvider == null) {
			whileItemProvider = new WhileItemProvider(this);
		}

		return whileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.ParameterCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCallItemProvider parameterCallItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.ParameterCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterCallAdapter() {
		if (parameterCallItemProvider == null) {
			parameterCallItemProvider = new ParameterCallItemProvider(this);
		}

		return parameterCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Plus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusItemProvider plusItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Plus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusAdapter() {
		if (plusItemProvider == null) {
			plusItemProvider = new PlusItemProvider(this);
		}

		return plusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Minus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusItemProvider minusItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Minus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusAdapter() {
		if (minusItemProvider == null) {
			minusItemProvider = new MinusItemProvider(this);
		}

		return minusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Mult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultItemProvider multItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Mult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultAdapter() {
		if (multItemProvider == null) {
			multItemProvider = new MultItemProvider(this);
		}

		return multItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Div} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivItemProvider divItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivAdapter() {
		if (divItemProvider == null) {
			divItemProvider = new DivItemProvider(this);
		}

		return divItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Equals} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualsItemProvider equalsItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Equals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualsAdapter() {
		if (equalsItemProvider == null) {
			equalsItemProvider = new EqualsItemProvider(this);
		}

		return equalsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Greater} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterItemProvider greaterItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Greater}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterAdapter() {
		if (greaterItemProvider == null) {
			greaterItemProvider = new GreaterItemProvider(this);
		}

		return greaterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.Lower} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerItemProvider lowerItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.Lower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerAdapter() {
		if (lowerItemProvider == null) {
			lowerItemProvider = new LowerItemProvider(this);
		}

		return lowerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link example.logo.model.logoASM.LogoProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogoProgramItemProvider logoProgramItemProvider;

	/**
	 * This creates an adapter for a {@link example.logo.model.logoASM.LogoProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogoProgramAdapter() {
		if (logoProgramItemProvider == null) {
			logoProgramItemProvider = new LogoProgramItemProvider(this);
		}

		return logoProgramItemProvider;
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
		if (backItemProvider != null) backItemProvider.dispose();
		if (forwardItemProvider != null) forwardItemProvider.dispose();
		if (leftItemProvider != null) leftItemProvider.dispose();
		if (rightItemProvider != null) rightItemProvider.dispose();
		if (penDownItemProvider != null) penDownItemProvider.dispose();
		if (penUpItemProvider != null) penUpItemProvider.dispose();
		if (clearItemProvider != null) clearItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (procCallItemProvider != null) procCallItemProvider.dispose();
		if (procDeclarationItemProvider != null) procDeclarationItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (ifItemProvider != null) ifItemProvider.dispose();
		if (controlStructureItemProvider != null) controlStructureItemProvider.dispose();
		if (repeatItemProvider != null) repeatItemProvider.dispose();
		if (whileItemProvider != null) whileItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (parameterCallItemProvider != null) parameterCallItemProvider.dispose();
		if (plusItemProvider != null) plusItemProvider.dispose();
		if (minusItemProvider != null) minusItemProvider.dispose();
		if (multItemProvider != null) multItemProvider.dispose();
		if (divItemProvider != null) divItemProvider.dispose();
		if (equalsItemProvider != null) equalsItemProvider.dispose();
		if (greaterItemProvider != null) greaterItemProvider.dispose();
		if (lowerItemProvider != null) lowerItemProvider.dispose();
		if (logoProgramItemProvider != null) logoProgramItemProvider.dispose();
	}

}
