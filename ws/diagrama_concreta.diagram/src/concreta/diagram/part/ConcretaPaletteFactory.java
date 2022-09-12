
/*
 * 
 */
package concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createMKJAtributo1CreationTool());
		paletteContainer.add(createMKJClase2CreationTool());
		paletteContainer.add(createMKJMetodo3CreationTool());
		paletteContainer.add(createMKJPaquete4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createMKJAgregacion1CreationTool());
		paletteContainer.add(createMKJAsociacion2CreationTool());
		paletteContainer.add(createMKJConteinment3CreationTool());
		paletteContainer.add(createMKJHerencia4CreationTool());
		paletteContainer.add(createMKJInterface5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MKJAtributo1CreationTool_title,
				Messages.MKJAtributo1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJAtributo_3001));
		entry.setId("createMKJAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJAtributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJClase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MKJClase2CreationTool_title,
				Messages.MKJClase2CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MKJClase_2001));
		entry.setId("createMKJClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJClase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MKJMetodo3CreationTool_title,
				Messages.MKJMetodo3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MKJMetodo_3002));
		entry.setId("createMKJMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJMetodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJPaquete4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MKJPaquete4CreationTool_title,
				Messages.MKJPaquete4CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MKJPaquete_2002));
		entry.setId("createMKJPaquete4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJPaquete_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJAgregacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MKJAgregacion1CreationTool_title,
				Messages.MKJAgregacion1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJAgregacion_4003));
		entry.setId("createMKJAgregacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJAgregacion_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJAsociacion2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MKJAsociacion2CreationTool_title,
				Messages.MKJAsociacion2CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJAsociacion_4001));
		entry.setId("createMKJAsociacion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJAsociacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJConteinment3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MKJConteinment3CreationTool_title,
				Messages.MKJConteinment3CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJConteinment_4002));
		entry.setId("createMKJConteinment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJConteinment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJHerencia4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MKJHerencia4CreationTool_title,
				Messages.MKJHerencia4CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJHerencia_4004));
		entry.setId("createMKJHerencia4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJHerencia_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMKJInterface5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MKJInterface5CreationTool_title,
				Messages.MKJInterface5CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MKJInterface_4005));
		entry.setId("createMKJInterface5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MKJInterface_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
