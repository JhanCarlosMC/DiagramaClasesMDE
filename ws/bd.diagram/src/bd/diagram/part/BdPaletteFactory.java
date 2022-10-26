
/*
 * 
 */
package bd.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import bd.diagram.providers.BdElementTypes;

/**
 * @generated
 */
public class BdPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createColumn1CreationTool());
		paletteContainer.add(createForeignKey2CreationTool());
		paletteContainer.add(createIndex3CreationTool());
		paletteContainer.add(createPrimaryKey4CreationTool());
		paletteContainer.add(createRelation5CreationTool());
		paletteContainer.add(createTable6CreationTool());
		paletteContainer.add(createTrigger7CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Column1CreationTool_title, Messages.Column1CreationTool_desc, null,
				null) {
		};
		entry.setId("createColumn1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForeignKey2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ForeignKey2CreationTool_title, Messages.ForeignKey2CreationTool_desc,
				null, null) {
		};
		entry.setId("createForeignKey2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndex3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Index3CreationTool_title, Messages.Index3CreationTool_desc, null,
				null) {
		};
		entry.setId("createIndex3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimaryKey4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.PrimaryKey4CreationTool_title, Messages.PrimaryKey4CreationTool_desc,
				null, null) {
		};
		entry.setId("createPrimaryKey4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelation5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Relation5CreationTool_title, Messages.Relation5CreationTool_desc, null,
				null) {
		};
		entry.setId("createRelation5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table6CreationTool_title,
				Messages.Table6CreationTool_desc, Collections.singletonList(BdElementTypes.Table_2001));
		entry.setId("createTable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BdElementTypes.getImageDescriptor(BdElementTypes.Table_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTrigger7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Trigger7CreationTool_title, Messages.Trigger7CreationTool_desc, null,
				null) {
		};
		entry.setId("createTrigger7CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
