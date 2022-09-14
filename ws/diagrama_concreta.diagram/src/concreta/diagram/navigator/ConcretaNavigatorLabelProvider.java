/*
* 
*/
package concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.diagram.edit.parts.MKJAgregacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionEditPart;
import concreta.diagram.edit.parts.MKJAtributoEditPart;
import concreta.diagram.edit.parts.MKJAtributoNameEditPart;
import concreta.diagram.edit.parts.MKJClaseEditPart;
import concreta.diagram.edit.parts.MKJClaseNameEditPart;
import concreta.diagram.edit.parts.MKJConteinmentEditPart;
import concreta.diagram.edit.parts.MKJDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MKJHerenciaEditPart;
import concreta.diagram.edit.parts.MKJInterfaceEditPart;
import concreta.diagram.edit.parts.MKJMetodoEditPart;
import concreta.diagram.edit.parts.MKJMetodoNameEditPart;
import concreta.diagram.edit.parts.MKJPaqueteEditPart;
import concreta.diagram.edit.parts.MKJPaqueteNombreEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaParserProvider;

/**
 * @generated
 */
public class ConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretaNavigatorItem && !isOwnView(((ConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return ConcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concreta?MKJDiagramaClases", //$NON-NLS-1$
					ConcretaElementTypes.MKJDiagramaClases_1000);
		case MKJClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?MKJClase", ConcretaElementTypes.MKJClase_2001); //$NON-NLS-1$
		case MKJPaqueteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?MKJPaquete", ConcretaElementTypes.MKJPaquete_2002); //$NON-NLS-1$
		case MKJAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?MKJAtributo", ConcretaElementTypes.MKJAtributo_3001); //$NON-NLS-1$
		case MKJMetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?MKJMetodo", ConcretaElementTypes.MKJMetodo_3002); //$NON-NLS-1$
		case MKJAsociacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MKJAsociacion", ConcretaElementTypes.MKJAsociacion_4001); //$NON-NLS-1$
		case MKJConteinmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MKJConteinment", ConcretaElementTypes.MKJConteinment_4002); //$NON-NLS-1$
		case MKJAgregacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MKJAgregacion", ConcretaElementTypes.MKJAgregacion_4003); //$NON-NLS-1$
		case MKJHerenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MKJHerencia", ConcretaElementTypes.MKJHerencia_4004); //$NON-NLS-1$
		case MKJInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MKJInterface", ConcretaElementTypes.MKJInterface_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretaElementTypes.isKnownElementType(elementType)) {
			image = ConcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return getMKJDiagramaClases_1000Text(view);
		case MKJClaseEditPart.VISUAL_ID:
			return getMKJClase_2001Text(view);
		case MKJPaqueteEditPart.VISUAL_ID:
			return getMKJPaquete_2002Text(view);
		case MKJAtributoEditPart.VISUAL_ID:
			return getMKJAtributo_3001Text(view);
		case MKJMetodoEditPart.VISUAL_ID:
			return getMKJMetodo_3002Text(view);
		case MKJAsociacionEditPart.VISUAL_ID:
			return getMKJAsociacion_4001Text(view);
		case MKJConteinmentEditPart.VISUAL_ID:
			return getMKJConteinment_4002Text(view);
		case MKJAgregacionEditPart.VISUAL_ID:
			return getMKJAgregacion_4003Text(view);
		case MKJHerenciaEditPart.VISUAL_ID:
			return getMKJHerencia_4004Text(view);
		case MKJInterfaceEditPart.VISUAL_ID:
			return getMKJInterface_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMKJDiagramaClases_1000Text(View view) {
		MKJDiagramaClases domainModelElement = (MKJDiagramaClases) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJClase_2001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MKJClase_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MKJClaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJPaquete_2002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MKJPaquete_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MKJPaqueteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJAtributo_3001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MKJAtributo_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MKJAtributoNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJMetodo_3002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MKJMetodo_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MKJMetodoNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJAsociacion_4001Text(View view) {
		MKJAsociacion domainModelElement = (MKJAsociacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJConteinment_4002Text(View view) {
		MKJConteinment domainModelElement = (MKJConteinment) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJAgregacion_4003Text(View view) {
		MKJAgregacion domainModelElement = (MKJAgregacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMKJHerencia_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getMKJInterface_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return MKJDiagramaClasesEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

}
