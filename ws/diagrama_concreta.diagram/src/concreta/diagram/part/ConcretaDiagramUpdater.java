/*
* 
*/
package concreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concreta.ConcretaPackage;
import concreta.MKJAgregacion;
import concreta.MKJAsociacion;
import concreta.MKJAtributo;
import concreta.MKJClase;
import concreta.MKJConteinment;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.MKJInterface;
import concreta.MKJMetodo;
import concreta.MKJPaquete;
import concreta.diagram.edit.parts.MKJAgregacionEditPart;
import concreta.diagram.edit.parts.MKJAsociacionEditPart;
import concreta.diagram.edit.parts.MKJAtributoEditPart;
import concreta.diagram.edit.parts.MKJClaseEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJClaseMKJClaseMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.MKJConteinmentEditPart;
import concreta.diagram.edit.parts.MKJDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MKJHerenciaEditPart;
import concreta.diagram.edit.parts.MKJInterfaceEditPart;
import concreta.diagram.edit.parts.MKJMetodoEditPart;
import concreta.diagram.edit.parts.MKJPaqueteEditPart;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return getMKJDiagramaClases_1000SemanticChildren(view);
		case MKJClaseMKJClaseAtributosCompartmentEditPart.VISUAL_ID:
			return getMKJClaseMKJClaseAtributosCompartment_7001SemanticChildren(view);
		case MKJClaseMKJClaseMetodosCompartmentEditPart.VISUAL_ID:
			return getMKJClaseMKJClaseMetodosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMKJDiagramaClases_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MKJDiagramaClases modelElement = (MKJDiagramaClases) view.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			MKJClase childElement = (MKJClase) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MKJClaseEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaPaquetes().iterator(); it.hasNext();) {
			MKJPaquete childElement = (MKJPaquete) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MKJPaqueteEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMKJClaseMKJClaseAtributosCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MKJClase modelElement = (MKJClase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			MKJAtributo childElement = (MKJAtributo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MKJAtributoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMKJClaseMKJClaseMetodosCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MKJClase modelElement = (MKJClase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMetodos().iterator(); it.hasNext();) {
			MKJMetodo childElement = (MKJMetodo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MKJMetodoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJDiagramaClasesEditPart.VISUAL_ID:
			return getMKJDiagramaClases_1000ContainedLinks(view);
		case MKJClaseEditPart.VISUAL_ID:
			return getMKJClase_2001ContainedLinks(view);
		case MKJPaqueteEditPart.VISUAL_ID:
			return getMKJPaquete_2002ContainedLinks(view);
		case MKJAtributoEditPart.VISUAL_ID:
			return getMKJAtributo_3001ContainedLinks(view);
		case MKJMetodoEditPart.VISUAL_ID:
			return getMKJMetodo_3002ContainedLinks(view);
		case MKJAsociacionEditPart.VISUAL_ID:
			return getMKJAsociacion_4001ContainedLinks(view);
		case MKJConteinmentEditPart.VISUAL_ID:
			return getMKJConteinment_4002ContainedLinks(view);
		case MKJAgregacionEditPart.VISUAL_ID:
			return getMKJAgregacion_4003ContainedLinks(view);
		case MKJHerenciaEditPart.VISUAL_ID:
			return getMKJHerencia_4004ContainedLinks(view);
		case MKJInterfaceEditPart.VISUAL_ID:
			return getMKJInterface_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJClaseEditPart.VISUAL_ID:
			return getMKJClase_2001IncomingLinks(view);
		case MKJPaqueteEditPart.VISUAL_ID:
			return getMKJPaquete_2002IncomingLinks(view);
		case MKJAtributoEditPart.VISUAL_ID:
			return getMKJAtributo_3001IncomingLinks(view);
		case MKJMetodoEditPart.VISUAL_ID:
			return getMKJMetodo_3002IncomingLinks(view);
		case MKJAsociacionEditPart.VISUAL_ID:
			return getMKJAsociacion_4001IncomingLinks(view);
		case MKJConteinmentEditPart.VISUAL_ID:
			return getMKJConteinment_4002IncomingLinks(view);
		case MKJAgregacionEditPart.VISUAL_ID:
			return getMKJAgregacion_4003IncomingLinks(view);
		case MKJHerenciaEditPart.VISUAL_ID:
			return getMKJHerencia_4004IncomingLinks(view);
		case MKJInterfaceEditPart.VISUAL_ID:
			return getMKJInterface_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MKJClaseEditPart.VISUAL_ID:
			return getMKJClase_2001OutgoingLinks(view);
		case MKJPaqueteEditPart.VISUAL_ID:
			return getMKJPaquete_2002OutgoingLinks(view);
		case MKJAtributoEditPart.VISUAL_ID:
			return getMKJAtributo_3001OutgoingLinks(view);
		case MKJMetodoEditPart.VISUAL_ID:
			return getMKJMetodo_3002OutgoingLinks(view);
		case MKJAsociacionEditPart.VISUAL_ID:
			return getMKJAsociacion_4001OutgoingLinks(view);
		case MKJConteinmentEditPart.VISUAL_ID:
			return getMKJConteinment_4002OutgoingLinks(view);
		case MKJAgregacionEditPart.VISUAL_ID:
			return getMKJAgregacion_4003OutgoingLinks(view);
		case MKJHerenciaEditPart.VISUAL_ID:
			return getMKJHerencia_4004OutgoingLinks(view);
		case MKJInterfaceEditPart.VISUAL_ID:
			return getMKJInterface_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJDiagramaClases_1000ContainedLinks(View view) {
		MKJDiagramaClases modelElement = (MKJDiagramaClases) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MKJAsociacion_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MKJConteinment_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MKJAgregacion_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MKJHerencia_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MKJInterface_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJClase_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJPaquete_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAtributo_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJMetodo_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAsociacion_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJConteinment_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAgregacion_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJHerencia_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJInterface_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJClase_2001IncomingLinks(View view) {
		MKJClase modelElement = (MKJClase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MKJAsociacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MKJConteinment_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MKJAgregacion_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MKJHerencia_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MKJInterface_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJPaquete_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAtributo_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJMetodo_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAsociacion_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJConteinment_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAgregacion_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJHerencia_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJInterface_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJClase_2001OutgoingLinks(View view) {
		MKJClase modelElement = (MKJClase) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MKJAsociacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MKJConteinment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MKJAgregacion_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MKJHerencia_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MKJInterface_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJPaquete_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAtributo_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJMetodo_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAsociacion_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJConteinment_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJAgregacion_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJHerencia_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMKJInterface_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MKJAsociacion_4001(
			MKJDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaAsociaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJAsociacion) {
				continue;
			}
			MKJAsociacion link = (MKJAsociacion) linkObject;
			if (MKJAsociacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJAsociacion_4001,
					MKJAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MKJConteinment_4002(
			MKJDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaConteiments().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJConteinment) {
				continue;
			}
			MKJConteinment link = (MKJConteinment) linkObject;
			if (MKJConteinmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJConteinment_4002,
					MKJConteinmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MKJAgregacion_4003(
			MKJDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaAgregaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJAgregacion) {
				continue;
			}
			MKJAgregacion link = (MKJAgregacion) linkObject;
			if (MKJAgregacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJAgregacion_4003,
					MKJAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MKJHerencia_4004(
			MKJDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaHerencias().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJHerencia) {
				continue;
			}
			MKJHerencia link = (MKJHerencia) linkObject;
			if (MKJHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJHerencia_4004,
					MKJHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MKJInterface_4005(
			MKJDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaInterfaces().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJInterface) {
				continue;
			}
			MKJInterface link = (MKJInterface) linkObject;
			if (MKJInterfaceEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJInterface_4005,
					MKJInterfaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MKJAsociacion_4001(MKJClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMKJAsociacion_Target()
					|| false == setting.getEObject() instanceof MKJAsociacion) {
				continue;
			}
			MKJAsociacion link = (MKJAsociacion) setting.getEObject();
			if (MKJAsociacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MKJAsociacion_4001,
					MKJAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MKJConteinment_4002(
			MKJClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMKJConteinment_Target()
					|| false == setting.getEObject() instanceof MKJConteinment) {
				continue;
			}
			MKJConteinment link = (MKJConteinment) setting.getEObject();
			if (MKJConteinmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MKJConteinment_4002,
					MKJConteinmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MKJAgregacion_4003(MKJClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMKJAgregacion_Target()
					|| false == setting.getEObject() instanceof MKJAgregacion) {
				continue;
			}
			MKJAgregacion link = (MKJAgregacion) setting.getEObject();
			if (MKJAgregacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MKJAgregacion_4003,
					MKJAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MKJHerencia_4004(MKJClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMKJHerencia_Target()
					|| false == setting.getEObject() instanceof MKJHerencia) {
				continue;
			}
			MKJHerencia link = (MKJHerencia) setting.getEObject();
			if (MKJHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MKJHerencia_4004,
					MKJHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MKJInterface_4005(MKJClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMKJInterface_Target()
					|| false == setting.getEObject() instanceof MKJInterface) {
				continue;
			}
			MKJInterface link = (MKJInterface) setting.getEObject();
			if (MKJInterfaceEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MKJInterface_4005,
					MKJInterfaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MKJAsociacion_4001(
			MKJClase source) {
		MKJDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MKJDiagramaClases) {
				container = (MKJDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaAsociaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJAsociacion) {
				continue;
			}
			MKJAsociacion link = (MKJAsociacion) linkObject;
			if (MKJAsociacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJAsociacion_4001,
					MKJAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MKJConteinment_4002(
			MKJClase source) {
		MKJDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MKJDiagramaClases) {
				container = (MKJDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaConteiments().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJConteinment) {
				continue;
			}
			MKJConteinment link = (MKJConteinment) linkObject;
			if (MKJConteinmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJConteinment_4002,
					MKJConteinmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MKJAgregacion_4003(
			MKJClase source) {
		MKJDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MKJDiagramaClases) {
				container = (MKJDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaAgregaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJAgregacion) {
				continue;
			}
			MKJAgregacion link = (MKJAgregacion) linkObject;
			if (MKJAgregacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJAgregacion_4003,
					MKJAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MKJHerencia_4004(MKJClase source) {
		MKJDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MKJDiagramaClases) {
				container = (MKJDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaHerencias().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJHerencia) {
				continue;
			}
			MKJHerencia link = (MKJHerencia) linkObject;
			if (MKJHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJHerencia_4004,
					MKJHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MKJInterface_4005(
			MKJClase source) {
		MKJDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MKJDiagramaClases) {
				container = (MKJDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaInterfaces().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MKJInterface) {
				continue;
			}
			MKJInterface link = (MKJInterface) linkObject;
			if (MKJInterfaceEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MKJClase dst = link.getTarget();
			MKJClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MKJInterface_4005,
					MKJInterfaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
			return ConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getContainedLinks(View view) {
			return ConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
			return ConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
