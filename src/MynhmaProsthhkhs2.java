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

public class MynhmaProsthhkhs2 {

	protected Shell shell;

	
	/**
	 * Open the window.
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
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(700, 360);
		shell.setText("SWT Application");
		
		Device device = Display.getCurrent ();
		Color white = new Color (device, 255, 255, 255);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel.setText("\u0397 \u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1 \u03C3\u03B1\u03C2 \u03C0\u03C1\u03BF\u03C3\u03C4\u03AD\u03B8\u03B7\u03BA\u03B5 \u03BC\u03B5 \u03B5\u03C0\u03B9\u03C4\u03C5\u03C7\u03AF\u03B1.");
		lblNewLabel.setBounds(220, 42, 250, 56);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setBounds(220, 114, 236, 37);
		lblNewLabel_1.setText("\u039C\u03B5\u03C4\u03AC\u03B2\u03B1\u03C3\u03B7 \u03C3\u03B5 :");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Arxikh arxiko=new Arxikh();
				arxiko.open();
				
			}
		});
		btnNewButton.setBounds(144, 199, 130, 49);
		btnNewButton.setText("\u0391\u03C1\u03C7\u03B9\u03BA\u03CC \u039C\u03B5\u03BD\u03BF\u03CD");
		btnNewButton.setBackground(white);
		
		Button btnNewButton_1 = new Button(shell, SWT.WRAP |SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				NeaPwlhsh lista=new NeaPwlhsh();
				lista.open();
			}
		});
		btnNewButton_1.setBounds(451, 199, 130, 49);
		btnNewButton_1.setText("\u039D\u03B5\u03B1 \u03C0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03A0\u03C1\u03BF\u03AF\u03CC\u03BD\u03C4\u03BF\u03C2 \u03C0\u03C1\u03BF\u03C2 \u03A0\u03CE\u03BB\u03B7\u03C3\u03B7");
		btnNewButton_1.setBackground(white);

	}
}
