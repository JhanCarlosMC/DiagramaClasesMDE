/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MKJMetodoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MKJClaseMKJClaseMetodosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MKJClaseMKJClaseMetodosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.MKJClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.MKJMetodo_3002 == req.getElementType()) {
			return getGEFWrapper(new MKJMetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
