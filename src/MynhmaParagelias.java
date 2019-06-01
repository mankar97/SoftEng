import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class MynhmaParagelias {

	protected Shell shell;
	private Text text;

	

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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(800, 300);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		label.setBounds(202, 28, 339, 38);
		label.setText("\u0397 \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1 \u03C3\u03B1\u03C2 \u03BF\u03BB\u03BF\u03BA\u03BB\u03B7\u03C1\u03CE\u03B8\u03B7\u03BA\u03B5 \u03B5\u03C0\u03B9\u03C4\u03C5\u03C7\u03CE\u03C2.");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Arxikh arx = new Arxikh();
				arx.open();
			}
		});
		button.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		button.setBounds(324, 187, 75, 25);
		button.setText("\u039F\u039A");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("\u0395\u03BA\u03C4\u03B9\u03BC\u03CE\u03BC\u03B5\u03BD\u03B7 \u03B7\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03C0\u03B1\u03C1\u03B1\u03BB\u03B1\u03B2\u03AE\u03C2:");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		label_1.setBounds(65, 107, 296, 38);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(367, 107, 102, 25);
		lblNewLabel.setText("New Label");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		lblNewLabel.setText(dateFormat.format(Bucket.estimatedTime()));
	}
}
