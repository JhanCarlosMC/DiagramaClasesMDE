/*
* 
*/
package bd.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import bd.Schema;
import bd.Table;
import bd.diagram.edit.parts.SchemaEditPart;
import bd.diagram.edit.parts.TableEditPart;

/**
 * @generated
 */
public class BdDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<BdNodeDescriptor> getSemanticChildren(View view) {
		switch (BdVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<BdNodeDescriptor> getSchema_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) view.getElement();
		LinkedList<BdNodeDescriptor> result = new LinkedList<BdNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTables().iterator(); it.hasNext();) {
			Table childElement = (Table) it.next();
			int visualID = BdVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new BdNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<BdLinkDescriptor> getContainedLinks(View view) {
		switch (BdVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<BdLinkDescriptor> getIncomingLinks(View view) {
		switch (BdVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<BdLinkDescriptor> getOutgoingLinks(View view) {
		switch (BdVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BdLinkDescriptor> getSchema_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BdLinkDescriptor> getTable_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BdLinkDescriptor> getTable_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BdLinkDescriptor> getTable_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<BdNodeDescriptor> getSemanticChildren(View view) {
			return BdDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BdLinkDescriptor> getContainedLinks(View view) {
			return BdDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BdLinkDescriptor> getIncomingLinks(View view) {
			return BdDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<BdLinkDescriptor> getOutgoingLinks(View view) {
			return BdDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
