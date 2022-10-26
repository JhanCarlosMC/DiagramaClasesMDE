/*
* 
*/
package concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concreta.ConcretaPackage;
import concreta.MKJDiagramaClases;
import concreta.diagram.edit.parts.MKJAgregacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionMultiplicidad1EditPart;
import concreta.diagram.edit.parts.MKJAsociacionMultiplicidad2EditPart;
import concreta.diagram.edit.parts.MKJAsociacionRol1EditPart;
import concreta.diagram.edit.parts.MKJAsociacionRol2EditPart;
import concreta.diagram.edit.parts.MKJAtributoEditPart;
import concreta.diagram.edit.parts.MKJAtributoNombreEditPart;
import concreta.diagram.edit.parts.MKJClaseEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJClaseNombreEditPart;
import concreta.diagram.edit.parts.MKJConteinmentEditPart;
import concreta.diagram.edit.parts.MKJDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MKJHerenciaEditPart;
import concreta.diagram.edit.parts.MKJInterfaceEditPart;
import concreta.diagram.edit.parts.MKJMetodoEditPart;
import concreta.diagram.edit.parts.MKJMetodoNombreEditPart;
import concreta.diagram.edit.parts.MKJPaqueteEditPart;
import concreta.diagram.edit.parts.MKJPaqueteNombreEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "diagrama_concreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MKJDiagramaClasesEditPart.MODEL_ID.equals(view.getType())) {
				return MKJDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getMKJDiagramaClases().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((MKJDiagramaClases) domainElement)) {
			return MKJDiagramaClasesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!MKJDiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MKJDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MKJDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMKJClase().isSuperTypeOf(domainElement.eClass())) {
				return MKJClaseEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getMKJPaquete().isSuperTypeOf(domainElement.eClass())) {
				return MKJPaqueteEditPart.VISUAL_ID;
			}
			break;
		case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMKJAtributo().isSuperTypeOf(domainElement.eClass())) {
				return MKJAtributoEditPart.VISUAL_ID;
			}
			break;
		case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMKJMetodo().isSuperTypeOf(domainElement.eClass())) {
				return MKJMetodoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!MKJDiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MKJDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MKJDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			if (MKJClaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJPaqueteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJClaseEditPart.VISUAL_ID:
			if (MKJClaseNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJPaqueteEditPart.VISUAL_ID:
			if (MKJPaqueteNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJAtributoEditPart.VISUAL_ID:
			if (MKJAtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJMetodoEditPart.VISUAL_ID:
			if (MKJMetodoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (MKJAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (MKJMetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MKJAsociacionEditPart.VISUAL_ID:
			if (MKJAsociacionRol1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJAsociacionRol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJAsociacionMultiplicidad1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MKJAsociacionMultiplicidad2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getMKJAsociacion().isSuperTypeOf(domainElement.eClass())) {
			return MKJAsociacionEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMKJConteinment().isSuperTypeOf(domainElement.eClass())) {
			return MKJConteinmentEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMKJAgregacion().isSuperTypeOf(domainElement.eClass())) {
			return MKJAgregacionEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMKJHerencia().isSuperTypeOf(domainElement.eClass())) {
			return MKJHerenciaEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMKJInterface().isSuperTypeOf(domainElement.eClass())) {
			return MKJInterfaceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(MKJDiagramaClases element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
		case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return false;
		case MKJPaqueteEditPart.VISUAL_ID:
		case MKJAtributoEditPart.VISUAL_ID:
		case MKJMetodoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
