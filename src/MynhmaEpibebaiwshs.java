

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

public class MynhmaEpibebaiwshs {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MynhmaEpibebaiwshs window = new MynhmaEpibebaiwshs();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
		lblNewLabel.setText("\u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE \u03A0\u03C1\u03BF\u03C3\u03C6\u03BF\u03C1\u03AC\u03C2 ;");
		lblNewLabel.setBounds(220, 42, 250, 53);
		
		Button cancelOffer = new Button(shell, SWT.NONE);
		cancelOffer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Eidopoihseis.Eidop.remove(Eidopoihseis.Eidop.size() - 1);
				shell.dispose();
				MynhmaAkyrwshs ak=new MynhmaAkyrwshs();
				ak.open();
				
			}
		});
		cancelOffer.setBounds(432, 144, 112, 37);
		cancelOffer.setText("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7");
		cancelOffer.setBackground(white);
		
		Button validOffer = new Button(shell, SWT.WRAP |SWT.NONE);
		validOffer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				shell.dispose();
	    		MynhmaListas mynhma=new MynhmaListas();
	    		mynhma.open();
			}
		});
		validOffer.setBounds(140, 144, 112, 37);
		validOffer.setText("\u0395\u03C0\u03B9\u03B2\u03B5\u03B2\u03B1\u03AF\u03C9\u03C3\u03B7");
		validOffer.setBackground(white);

	}
}
