/*
* 
*/
package bd.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import bd.diagram.part.BdVisualIDRegistry;

/**
 * @generated
 */
public class BdNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 2002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof BdNavigatorItem) {
			BdNavigatorItem item = (BdNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return BdVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
