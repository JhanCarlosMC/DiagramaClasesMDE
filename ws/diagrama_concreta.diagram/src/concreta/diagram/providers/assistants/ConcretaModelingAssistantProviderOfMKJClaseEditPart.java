/*
 * 
 */
package concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concreta.diagram.edit.parts.MKJClaseEditPart;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretaModelingAssistantProviderOfMKJClaseEditPart extends ConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.MKJAtributo_3001);
		types.add(ConcretaElementTypes.MKJMetodo_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MKJClaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(MKJClaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcretaElementTypes.MKJAsociacion_4001);
		types.add(ConcretaElementTypes.MKJConteinment_4002);
		types.add(ConcretaElementTypes.MKJAgregacion_4003);
		types.add(ConcretaElementTypes.MKJHerencia_4004);
		types.add(ConcretaElementTypes.MKJInterface_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((MKJClaseEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(MKJClaseEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MKJClaseEditPart) {
			types.add(ConcretaElementTypes.MKJAsociacion_4001);
		}
		if (targetEditPart instanceof MKJClaseEditPart) {
			types.add(ConcretaElementTypes.MKJConteinment_4002);
		}
		if (targetEditPart instanceof MKJClaseEditPart) {
			types.add(ConcretaElementTypes.MKJAgregacion_4003);
		}
		if (targetEditPart instanceof MKJClaseEditPart) {
			types.add(ConcretaElementTypes.MKJHerencia_4004);
		}
		if (targetEditPart instanceof MKJClaseEditPart) {
			types.add(ConcretaElementTypes.MKJInterface_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((MKJClaseEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(MKJClaseEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.MKJAsociacion_4001) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJConteinment_4002) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJAgregacion_4003) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJHerencia_4004) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJInterface_4005) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MKJClaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(MKJClaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcretaElementTypes.MKJAsociacion_4001);
		types.add(ConcretaElementTypes.MKJConteinment_4002);
		types.add(ConcretaElementTypes.MKJAgregacion_4003);
		types.add(ConcretaElementTypes.MKJHerencia_4004);
		types.add(ConcretaElementTypes.MKJInterface_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MKJClaseEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MKJClaseEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.MKJAsociacion_4001) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJConteinment_4002) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJAgregacion_4003) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJHerencia_4004) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		} else if (relationshipType == ConcretaElementTypes.MKJInterface_4005) {
			types.add(ConcretaElementTypes.MKJClase_2001);
		}
		return types;
	}

}
