/*
 * 
 */
package concreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concreta.MKJClase;
import concreta.MKJDiagramaClases;
import concreta.MKJHerencia;
import concreta.diagram.edit.policies.ConcretaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MKJHerenciaReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public MKJHerenciaReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MKJHerencia) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MKJClase && newEnd instanceof MKJClase)) {
			return false;
		}
		MKJClase target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MKJDiagramaClases)) {
			return false;
		}
		MKJDiagramaClases container = (MKJDiagramaClases) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistMKJHerencia_4004(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MKJClase && newEnd instanceof MKJClase)) {
			return false;
		}
		MKJClase source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MKJDiagramaClases)) {
			return false;
		}
		MKJDiagramaClases container = (MKJDiagramaClases) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistMKJHerencia_4004(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected MKJHerencia getLink() {
		return (MKJHerencia) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected MKJClase getOldSource() {
		return (MKJClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected MKJClase getNewSource() {
		return (MKJClase) newEnd;
	}

	/**
	* @generated
	*/
	protected MKJClase getOldTarget() {
		return (MKJClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected MKJClase getNewTarget() {
		return (MKJClase) newEnd;
	}
}