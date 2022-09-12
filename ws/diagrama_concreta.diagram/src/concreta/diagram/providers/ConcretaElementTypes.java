/*
 * 
 */
package concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.MKJAgregacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionEditPart;
import concreta.diagram.edit.parts.MKJAtributoEditPart;
import concreta.diagram.edit.parts.MKJClaseEditPart;
import concreta.diagram.edit.parts.MKJConteinmentEditPart;
import concreta.diagram.edit.parts.MKJDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MKJHerenciaEditPart;
import concreta.diagram.edit.parts.MKJInterfaceEditPart;
import concreta.diagram.edit.parts.MKJMetodoEditPart;
import concreta.diagram.edit.parts.MKJPaqueteEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcretaElementTypes {

	/**
	* @generated
	*/
	private ConcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType MKJDiagramaClases_1000 = getElementType(
			"diagrama_concreta.diagram.MKJDiagramaClases_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJClase_2001 = getElementType("diagrama_concreta.diagram.MKJClase_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJPaquete_2002 = getElementType("diagrama_concreta.diagram.MKJPaquete_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJAtributo_3001 = getElementType("diagrama_concreta.diagram.MKJAtributo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJMetodo_3002 = getElementType("diagrama_concreta.diagram.MKJMetodo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJAsociacion_4001 = getElementType(
			"diagrama_concreta.diagram.MKJAsociacion_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJConteinment_4002 = getElementType(
			"diagrama_concreta.diagram.MKJConteinment_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJAgregacion_4003 = getElementType(
			"diagrama_concreta.diagram.MKJAgregacion_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJHerencia_4004 = getElementType("diagrama_concreta.diagram.MKJHerencia_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MKJInterface_4005 = getElementType("diagrama_concreta.diagram.MKJInterface_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MKJDiagramaClases_1000, ConcretaPackage.eINSTANCE.getMKJDiagramaClases());

			elements.put(MKJClase_2001, ConcretaPackage.eINSTANCE.getMKJClase());

			elements.put(MKJPaquete_2002, ConcretaPackage.eINSTANCE.getMKJPaquete());

			elements.put(MKJAtributo_3001, ConcretaPackage.eINSTANCE.getMKJAtributo());

			elements.put(MKJMetodo_3002, ConcretaPackage.eINSTANCE.getMKJMetodo());

			elements.put(MKJAsociacion_4001, ConcretaPackage.eINSTANCE.getMKJAsociacion());

			elements.put(MKJConteinment_4002, ConcretaPackage.eINSTANCE.getMKJConteinment());

			elements.put(MKJAgregacion_4003, ConcretaPackage.eINSTANCE.getMKJAgregacion());

			elements.put(MKJHerencia_4004, ConcretaPackage.eINSTANCE.getMKJHerencia());

			elements.put(MKJInterface_4005, ConcretaPackage.eINSTANCE.getMKJInterface());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MKJDiagramaClases_1000);
			KNOWN_ELEMENT_TYPES.add(MKJClase_2001);
			KNOWN_ELEMENT_TYPES.add(MKJPaquete_2002);
			KNOWN_ELEMENT_TYPES.add(MKJAtributo_3001);
			KNOWN_ELEMENT_TYPES.add(MKJMetodo_3002);
			KNOWN_ELEMENT_TYPES.add(MKJAsociacion_4001);
			KNOWN_ELEMENT_TYPES.add(MKJConteinment_4002);
			KNOWN_ELEMENT_TYPES.add(MKJAgregacion_4003);
			KNOWN_ELEMENT_TYPES.add(MKJHerencia_4004);
			KNOWN_ELEMENT_TYPES.add(MKJInterface_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return MKJDiagramaClases_1000;
		case MKJClaseEditPart.VISUAL_ID:
			return MKJClase_2001;
		case MKJPaqueteEditPart.VISUAL_ID:
			return MKJPaquete_2002;
		case MKJAtributoEditPart.VISUAL_ID:
			return MKJAtributo_3001;
		case MKJMetodoEditPart.VISUAL_ID:
			return MKJMetodo_3002;
		case MKJAsociacionEditPart.VISUAL_ID:
			return MKJAsociacion_4001;
		case MKJConteinmentEditPart.VISUAL_ID:
			return MKJConteinment_4002;
		case MKJAgregacionEditPart.VISUAL_ID:
			return MKJAgregacion_4003;
		case MKJHerenciaEditPart.VISUAL_ID:
			return MKJHerencia_4004;
		case MKJInterfaceEditPart.VISUAL_ID:
			return MKJInterface_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concreta.diagram.providers.ConcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concreta.diagram.providers.ConcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concreta.diagram.providers.ConcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
