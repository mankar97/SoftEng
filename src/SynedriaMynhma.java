import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

public class SynedriaMynhma {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(700, 360);
		shell.setText("SWT Application");
		
		Device device = Display.getCurrent ();
		Color white = new Color (device, 255, 255, 255);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setBounds(228, 137, 236, 37);
		lblNewLabel_1.setText("\u039C\u03B5\u03C4\u03AC\u03B2\u03B1\u03C3\u03B7 \u03C3\u03B5 :");
		
		Button btnNewButton = new Button(shell, SWT.WRAP | SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Enhmerwsh enhm=new Enhmerwsh();
				enhm.open();
				
			}
		});
		btnNewButton.setBounds(144, 199, 142, 52);
		btnNewButton.setText("\u0391\u03C1\u03C7\u03B9\u03BA\u03CC \u039C\u03B5\u03BD\u03BF\u03CD \u0395\u03BD\u03B7\u03BC\u03B5\u03C1\u03CE\u03C3\u03B5\u03C9\u03BD");
		btnNewButton.setBackground(white);
		
		Button btnNewButton_1 = new Button(shell, SWT.WRAP |SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Synedria lista=new Synedria();
				lista.open();
			}
		});
		btnNewButton_1.setBounds(451, 199, 142, 52);
		btnNewButton_1.setText("\u039B\u03AF\u03C3\u03C4\u03B1 \u03A3\u03C5\u03BD\u03B5\u03B4\u03C1\u03AF\u03C9\u03BD/\u03A3\u03B5\u03BC\u03B7\u03BD\u03B1\u03C1\u03AF\u03C9\u03BD");
		btnNewButton_1.setBackground(white);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel.setBounds(212, 25, 266, 37);
		lblNewLabel.setText("\u0397 \u03BA\u03C1\u03AC\u03C4\u03B7\u03C3\u03B7 \u03C3\u03B1\u03C2 \u03BF\u03BB\u03BF\u03BA\u03BB\u03B7\u03C1\u03CE\u03B8\u03B7\u03BA\u03B5.");
		
		Label lblNewLabel_6 = new Label(shell, SWT.BORDER);
		lblNewLabel_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		lblNewLabel_6.setBounds(173, 397, 26, 15);
	}
}
