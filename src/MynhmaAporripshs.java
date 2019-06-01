import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class MynhmaAporripshs {

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
        label.setBounds(183, 44, 433, 47);
        label.setText("\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BC\u03AF\u03B1 \u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u03B3\u03B9\u03B1 \u03BD\u03B1 \u03B5\u03BE\u03C5\u03C0\u03B7\u03C1\u03B5\u03C4\u03AE\u03C3\u03B5\u03C4\u03B5.");

        Button button = new Button(shell, SWT.NONE);
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                shell.dispose();
                Lista lista = new Lista();
                lista.open();
            }
        });
        button.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
        button.setBounds(358, 128, 75, 25);
        button.setText("\u039F\u039A");

    }
}