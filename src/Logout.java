import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Logout {

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
		shell.setSize(800, 300);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		label.setBounds(290, 46, 221, 47);
		label.setText("\u0391\u03C0\u03BF\u03C3\u03C5\u03BD\u03B4\u03B5\u03B8\u03AE\u03BA\u03B1\u03C4\u03B5 \u0395\u03C0\u03B9\u03C4\u03C5\u03C7\u03CE\u03C2.");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
			}
		});
		button.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		button.setBounds(358, 128, 75, 25);
		button.setText("\u039F\u039A");

	}

}
