package diagrama.view.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GeneratorView extends ViewPart {
	public GeneratorView() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "diagrama.view.views.GeneratorView";

	public void createPartControl(Composite parent) {
		parent.setLayout(null);

		Group grpGeneracionDeModelo = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo.setText("Generacion de Modelo a Modelo");
		grpGeneracionDeModelo.setBounds(10, 0, 692, 184);

		Button btnGenerarMm = new Button(grpGeneracionDeModelo, SWT.NONE);
		btnGenerarMm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarM2M();
			}
		});
		btnGenerarMm.setBounds(161, 85, 372, 38);
		btnGenerarMm.setText("Generar M2M");

		Group grpGeneracionDeModelo_2 = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo_2.setText("Generacion de Modelo a Texto\r\n");
		grpGeneracionDeModelo_2.setBounds(10, 203, 692, 184);

		Button btnGenerarMt = new Button(grpGeneracionDeModelo_2, SWT.NONE);
		btnGenerarMt.setText("Generar M2T");
		btnGenerarMt.setBounds(161, 73, 372, 38);
	}

	@Override
	public void setFocus() {

	}
}
