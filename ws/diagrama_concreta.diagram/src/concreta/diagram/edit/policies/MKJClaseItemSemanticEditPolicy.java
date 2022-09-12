/*
* 
*/
package concreta.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import concreta.diagram.edit.commands.MKJAgregacionCreateCommand;
import concreta.diagram.edit.commands.MKJAgregacionReorientCommand;
import concreta.diagram.edit.commands.MKJAsociacionCreateCommand;
import concreta.diagram.edit.commands.MKJAsociacionReorientCommand;
import concreta.diagram.edit.commands.MKJConteinmentCreateCommand;
import concreta.diagram.edit.commands.MKJConteinmentReorientCommand;
import concreta.diagram.edit.commands.MKJHerenciaCreateCommand;
import concreta.diagram.edit.commands.MKJHerenciaReorientCommand;
import concreta.diagram.edit.commands.MKJInterfaceCreateCommand;
import concreta.diagram.edit.commands.MKJInterfaceReorientCommand;
import concreta.diagram.edit.parts.MKJAgregacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionEditPart;
import concreta.diagram.edit.parts.MKJAtributoEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJConteinmentEditPart;
import concreta.diagram.edit.parts.MKJHerenciaEditPart;
import concreta.diagram.edit.parts.MKJInterfaceEditPart;
import concreta.diagram.edit.parts.MKJMetodoEditPart;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MKJClaseItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MKJClaseItemSemanticEditPolicy() {
		super(ConcretaElementTypes.MKJClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ConcretaVisualIDRegistry.getVisualID(incomingLink) == MKJAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(incomingLink) == MKJConteinmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(incomingLink) == MKJAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(incomingLink) == MKJHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(incomingLink) == MKJInterfaceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ConcretaVisualIDRegistry.getVisualID(outgoingLink) == MKJAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(outgoingLink) == MKJConteinmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(outgoingLink) == MKJAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(outgoingLink) == MKJHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcretaVisualIDRegistry.getVisualID(outgoingLink) == MKJInterfaceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ConcretaVisualIDRegistry.getVisualID(node)) {
			case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcretaVisualIDRegistry.getVisualID(cnode)) {
					case MKJAtributoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcretaVisualIDRegistry.getVisualID(cnode)) {
					case MKJMetodoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcretaElementTypes.MKJAsociacion_4001 == req.getElementType()) {
			return getGEFWrapper(new MKJAsociacionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJConteinment_4002 == req.getElementType()) {
			return getGEFWrapper(new MKJConteinmentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJAgregacion_4003 == req.getElementType()) {
			return getGEFWrapper(new MKJAgregacionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJHerencia_4004 == req.getElementType()) {
			return getGEFWrapper(new MKJHerenciaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJInterface_4005 == req.getElementType()) {
			return getGEFWrapper(new MKJInterfaceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcretaElementTypes.MKJAsociacion_4001 == req.getElementType()) {
			return getGEFWrapper(new MKJAsociacionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJConteinment_4002 == req.getElementType()) {
			return getGEFWrapper(new MKJConteinmentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJAgregacion_4003 == req.getElementType()) {
			return getGEFWrapper(new MKJAgregacionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJHerencia_4004 == req.getElementType()) {
			return getGEFWrapper(new MKJHerenciaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcretaElementTypes.MKJInterface_4005 == req.getElementType()) {
			return getGEFWrapper(new MKJInterfaceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MKJAsociacionEditPart.VISUAL_ID:
			return getGEFWrapper(new MKJAsociacionReorientCommand(req));
		case MKJConteinmentEditPart.VISUAL_ID:
			return getGEFWrapper(new MKJConteinmentReorientCommand(req));
		case MKJAgregacionEditPart.VISUAL_ID:
			return getGEFWrapper(new MKJAgregacionReorientCommand(req));
		case MKJHerenciaEditPart.VISUAL_ID:
			return getGEFWrapper(new MKJHerenciaReorientCommand(req));
		case MKJInterfaceEditPart.VISUAL_ID:
			return getGEFWrapper(new MKJInterfaceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
