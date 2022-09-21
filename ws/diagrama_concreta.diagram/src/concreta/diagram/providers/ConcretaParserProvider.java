/*
 * 
 */
package concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.MKJAtributoNameEditPart;
import concreta.diagram.edit.parts.MKJAtributoNombreEditPart;
import concreta.diagram.edit.parts.MKJClaseNameEditPart;
import concreta.diagram.edit.parts.MKJClaseNombreEditPart;
import concreta.diagram.edit.parts.MKJMetodoNameEditPart;
import concreta.diagram.edit.parts.MKJMetodoNombreEditPart;
import concreta.diagram.edit.parts.MKJPaqueteNombreEditPart;
import concreta.diagram.parsers.MessageFormatParser;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser mKJClaseNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getMKJClaseNombre_5003Parser() {
		if (mKJClaseNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMKJClase_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mKJClaseNombre_5003Parser = parser;
		}
		return mKJClaseNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser mKJPaqueteNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getMKJPaqueteNombre_5004Parser() {
		if (mKJPaqueteNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMKJPaquete_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mKJPaqueteNombre_5004Parser = parser;
		}
		return mKJPaqueteNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser mKJAtributoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getMKJAtributoNombre_5001Parser() {
		if (mKJAtributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMKJAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mKJAtributoNombre_5001Parser = parser;
		}
		return mKJAtributoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser mKJMetodoNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getMKJMetodoNombre_5002Parser() {
		if (mKJMetodoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMKJMetodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mKJMetodoNombre_5002Parser = parser;
		}
		return mKJMetodoNombre_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MKJClaseNombreEditPart.VISUAL_ID:
			return getMKJClaseNombre_5003Parser();
		case MKJPaqueteNombreEditPart.VISUAL_ID:
			return getMKJPaqueteNombre_5004Parser();
		case MKJAtributoNombreEditPart.VISUAL_ID:
			return getMKJAtributoNombre_5001Parser();
		case MKJMetodoNombreEditPart.VISUAL_ID:
			return getMKJMetodoNombre_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
