/*
 * 
 */
package bd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import bd.diagram.providers.BdElementTypes;
import bd.diagram.providers.BdModelingAssistantProvider;

/**
 * @generated
 */
public class BdModelingAssistantProviderOfSchemaEditPart extends BdModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(BdElementTypes.Table_2001);
		return types;
	}

}
