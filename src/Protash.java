import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class Protash {

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
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(800, 300);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		label.setBounds(248, 39, 278, 47);
		label.setText("\u0395\u03C5\u03C7\u03B1\u03C1\u03B9\u03C3\u03C4\u03BF\u03CD\u03BC\u03B5 \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03B2\u03BF\u03AE\u03B8\u03B5\u03B9\u03AC \u03C3\u03B1\u03C2.");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Arxikh lista = new Arxikh();
				lista.open();
			}
		});
		button.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		button.setBounds(352, 166, 75, 25);
		button.setText("\u039F\u039A");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("\u0397 \u03BF\u03BC\u03AC\u03B4\u03B1 \u03BC\u03B1\u03C2 \u03B8\u03B1 \u03B5\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03AE\u03C3\u03B5\u03B9 \u03AC\u03BC\u03B5\u03C3\u03B1 \u03BC\u03B5 \u03C4\u03BF \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03AF\u03BF \u03C0\u03BF\u03C5 \u03BC\u03B1\u03C2 \u03C0\u03C1\u03BF\u03C4\u03B5\u03AF\u03BD\u03B1\u03C4\u03B5.");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		label_1.setBounds(105, 92, 603, 47);

	}

}
