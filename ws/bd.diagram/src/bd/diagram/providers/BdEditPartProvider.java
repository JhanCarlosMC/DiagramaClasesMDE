/*
 * 
 */
package bd.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import bd.diagram.edit.parts.BdEditPartFactory;
import bd.diagram.edit.parts.SchemaEditPart;
import bd.diagram.part.BdVisualIDRegistry;

/**
 * @generated
 */
public class BdEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public BdEditPartProvider() {
		super(new BdEditPartFactory(), BdVisualIDRegistry.TYPED_INSTANCE, SchemaEditPart.MODEL_ID);
	}

}
