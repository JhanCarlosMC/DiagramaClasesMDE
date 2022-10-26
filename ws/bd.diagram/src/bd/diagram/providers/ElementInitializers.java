/*
 * 
 */
package bd.diagram.providers;

import bd.diagram.part.BdDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = BdDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			BdDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
