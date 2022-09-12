/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretaVisualIDRegistry.getVisualID(view)) {

			case MKJDiagramaClasesEditPart.VISUAL_ID:
				return new MKJDiagramaClasesEditPart(view);

			case MKJClaseEditPart.VISUAL_ID:
				return new MKJClaseEditPart(view);

			case MKJClaseNameEditPart.VISUAL_ID:
				return new MKJClaseNameEditPart(view);

			case MKJPaqueteEditPart.VISUAL_ID:
				return new MKJPaqueteEditPart(view);

			case MKJPaqueteNombreEditPart.VISUAL_ID:
				return new MKJPaqueteNombreEditPart(view);

			case MKJAtributoEditPart.VISUAL_ID:
				return new MKJAtributoEditPart(view);

			case MKJAtributoNameEditPart.VISUAL_ID:
				return new MKJAtributoNameEditPart(view);

			case MKJMetodoEditPart.VISUAL_ID:
				return new MKJMetodoEditPart(view);

			case MKJMetodoNameEditPart.VISUAL_ID:
				return new MKJMetodoNameEditPart(view);

			case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
				return new MKJClaseMKJClaseAtributosCompartmentEditPart(view);

			case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
				return new MKJClaseMKJClaseMetodosCompartmentEditPart(view);

			case MKJAsociacionEditPart.VISUAL_ID:
				return new MKJAsociacionEditPart(view);

			case MKJConteinmentEditPart.VISUAL_ID:
				return new MKJConteinmentEditPart(view);

			case MKJAgregacionEditPart.VISUAL_ID:
				return new MKJAgregacionEditPart(view);

			case MKJHerenciaEditPart.VISUAL_ID:
				return new MKJHerenciaEditPart(view);

			case MKJInterfaceEditPart.VISUAL_ID:
				return new MKJInterfaceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
