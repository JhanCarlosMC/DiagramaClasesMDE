/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MKJAtributoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MKJClaseMKJClaseAtributosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MKJClaseMKJClaseAtributosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.MKJClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.MKJAtributo_3001 == req.getElementType()) {
			return getGEFWrapper(new MKJAtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
