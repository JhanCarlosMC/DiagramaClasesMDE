/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.graphics.Color;
import concreta.diagram.edit.policies.MKJAsociacionItemSemanticEditPolicy;

/**
 * @generated
 */
public class MKJAsociacionEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4001;

	/**
	* @generated
	*/
	public MKJAsociacionEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MKJAsociacionItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new MKJAsociacionFigure();
	}

	/**
	* @generated
	*/
	public MKJAsociacionFigure getPrimaryShape() {
		return (MKJAsociacionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class MKJAsociacionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public MKJAsociacionFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	* @generated
	*/
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
