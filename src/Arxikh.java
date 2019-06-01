import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;


public class Arxikh {

	protected Shell shell;
	private Text text;
	private Text txtUsername;
	private Text txtPhexnet;
	public static ArrayList<Farmakeio> FarmakeiaMou = new ArrayList<Farmakeio>();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Arxikh window = new Arxikh();
			Apothiki ApothikiMou= new Apothiki();
			ApothikiMou.initialize();
			
			
			Farmakeio Ph= new Farmakeio();
			Ph.initialize();
			FarmakeiaMou.add(Ph);
			
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		shell.setSize(800, 520);
		shell.setText("SWT Application");
		
		Label lblPhexnet = new Label(shell, SWT.WRAP | SWT.CENTER);
		lblPhexnet.setForeground(SWTResourceManager.getColor(0, 153, 255));
		lblPhexnet.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblPhexnet.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.BOLD | SWT.ITALIC));
		lblPhexnet.setBounds(38, 23, 110, 42);
		lblPhexnet.setText("PHEXnet");
		
		Device device = Display.getCurrent ();
		Color popi = new Color (device, 0, 255, 204);
		Color white = new Color (device, 255, 255, 255);
		
		Button button = new Button(shell, SWT.CENTER);
		
		
		
		
		//////////////////// Ανακατεύθυνση
		
		
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(NeaPwlhsh.ListaPwlisisAg.size()>0)
				{			
					shell.dispose();
					Diathesima test1=new Diathesima();
					test1.open();
				} else 
				{
					KanenaDiathesimo kd=new KanenaDiathesimo();
					kd.open();
				}
						
			}
		});
		
		

		
		button.setTouchEnabled(true);
		button.setBounds(10, 100, 157, 40);
		button.setText("\u0394\u0399\u0391\u0398\u0395\u03A3\u0399\u039C\u0391 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u0391");
		button.setBackground(popi);
		
		Button btnNewButton_1 = new Button(shell, SWT.WRAP | SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				NeaPwlhsh test3=new NeaPwlhsh();
				test3.open();
			}
		});
		btnNewButton_1.setTouchEnabled(true);
		btnNewButton_1.setBounds(10, 180, 157, 40);
		btnNewButton_1.setText("\u03A0\u03A1\u039F\u03A3\u0398\u0397\u039A\u0397 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u03A9\u039D \u03A0\u03A1\u039F\u03A3 \u03A0\u03A9\u039B\u0397\u03A3\u0397");
		btnNewButton_1.setBackground(popi);
		
		Button btnNewButton = new Button(shell, SWT.WRAP | SWT.CENTER);
		btnNewButton.setTouchEnabled(true);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Lista test2=new Lista();
				test2.open();
			}
		});
		btnNewButton.setBounds(10, 140, 157, 40);
		btnNewButton.setText("\u039B\u0399\u03A3\u03A4\u0391 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u03A9\u039D \u03A0\u03A1\u039F\u03A3 \u0396\u0397\u03A4\u0397\u03A3\u0397");
		btnNewButton.setBackground(popi);
		
		Button btnNewButton_2 = new Button(shell,SWT.WRAP |  SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(Arxikh.FarmakeiaMou.get(0).getupperBounder()<2) {
					shell.dispose();
					NeaZhthsh test4=new NeaZhthsh();
					test4.open();
				}else {
					shell.dispose();
					MhnymaMetrhth mm=new MhnymaMetrhth();
					mm.open();
				}
			}
		});
		btnNewButton_2.setBounds(10, 220, 157, 40);
		btnNewButton_2.setText("\u03A0\u03A1\u039F\u03A3\u0398\u0397\u039A\u0397 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u03A9\u039D \u03A0\u03A1\u039F\u03A3 \u0396\u0397\u03A4\u0397\u03A3\u0397");
		btnNewButton_2.setBackground(popi);
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Apothiki test5=new Apothiki();
				test5.open();
			}
		});
		btnNewButton_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnNewButton_3.setBounds(10, 260, 157, 40);
		btnNewButton_3.setText("\u0397 \u0391\u03A0\u039F\u0398\u0397\u039A\u0397 \u039C\u039F\u03A5");
		btnNewButton_3.setBackground(popi);
		
		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Enhmerwsh test6=new Enhmerwsh();
				test6.open();
			}
		});
		btnNewButton_4.setBounds(10, 300, 157, 40);
		btnNewButton_4.setText("\u0395\u039D\u0397\u039C\u0395\u03A1\u03A9\u03A3\u0397");
		btnNewButton_4.setBackground(popi);
		
		text = new Text(shell, SWT.CENTER);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.BOLD));
		text.setText("\u039C\u0395\u03A4\u03A1\u0397\u03A4\u0397\u03A3 \u0396\u0397\u03A4\u0397\u03A3\u0397\u03A3 \u03A6\u0391\u03A1\u039C\u0391\u039A\u03A9\u039D ");
		text.setBounds(10, 397, 157, 21);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Logariasmos test9=new Logariasmos();
				test9.open();
			}
		});
		button_1.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		button_1.setBounds(601, 30, 141, 25);
		button_1.setText("\u03A1\u03C5\u03B8\u03BC\u03AF\u03C3\u03B5\u03B9\u03C2 \u03BB\u03BF\u03B3\u03B1\u03C1\u03B9\u03B1\u03C3\u03BC\u03BF\u03CD");
		button_1.setBackground(white);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Bohtheia test7=new Bohtheia();
				test7.open();
			}
		});
		button_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		button_2.setBounds(21, 442, 75, 25);
		button_2.setText("\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1");
		button_2.setBackground(white);
		
		Button btnPhxnet = new Button(shell, SWT.NONE);
		btnPhxnet.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Farmakeia test8=new Farmakeia();
				test8.open();
			}
		});
		btnPhxnet.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		btnPhxnet.setBounds(345, 442, 131, 25);
		btnPhxnet.setText("\u03A6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03AF\u03B1 PHXnet");
		btnPhxnet.setBackground(white);
		
		txtUsername = new Text(shell, SWT.READ_ONLY | SWT.CENTER);
		txtUsername.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		txtUsername.setText("Username");
		txtUsername.setBounds(601, 9, 76, 15);
		
		Button btnLogout = new Button(shell, SWT.NONE);
		btnLogout.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Logout test11=new Logout();
				test11.open();
			}
		});
		btnLogout.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnLogout.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		btnLogout.setBounds(683, 7, 57, 21);
		btnLogout.setText("Logout");
		btnLogout.setBackground(white);
		
		txtPhexnet = new Text(shell, SWT.BORDER | SWT.WRAP);
		txtPhexnet.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		txtPhexnet.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		txtPhexnet.setText("   \u03A4\u03BF PHEXnet \u03B1\u03C0\u03BF\u03C4\u03B5\u03BB\u03B5\u03AF \u03BC\u03AF\u03B1 \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u03BC\u03AD\u03C3\u03C9 \u03C4\u03B7\u03C2 \u03BF\u03C0\u03BF\u03AF\u03B1\u03C2 \u03B9\u03B4\u03B9\u03BF\u03BA\u03C4\u03AE\u03C4\u03B5\u03C2 \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03AF\u03C9\u03BD, \u03AD\u03C7\u03BF\u03C5\u03BD \u03C4\u03B7\u03BD \u03B4\u03C5\u03BD\u03B1\u03C4\u03CC\u03C4\u03B7\u03C4\u03B1 \u03B5\u03CD\u03C1\u03B5\u03C3\u03B7\u03C2 \u03C6\u03B1\u03C1\u03BC\u03AC\u03BA\u03C9\u03BD \u03C3\u03C4\u03B1 \u03BF\u03C0\u03BF\u03AF\u03B1 \u03AD\u03C7\u03BF\u03C5\u03BD \u03AD\u03BB\u03BB\u03B5\u03B9\u03C8\u03B7. \u03A3\u03C5\u03B3\u03BA\u03B5\u03BA\u03C1\u03B9\u03BC\u03AD\u03BD\u03B1, \u03BA\u03AC\u03B8\u03B5 \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03AF\u03BF \u03B8\u03B1 \u03BC\u03C0\u03BF\u03C1\u03B5\u03AF \u03BC\u03AD\u03C3\u03C9 \u03C4\u03B7\u03C2 \u03C0\u03BB\u03B1\u03C4\u03C6\u03CC\u03C1\u03BC\u03B1\u03C2 \u03BD\u03B1 \u03B3\u03BD\u03C9\u03C3\u03C4\u03BF\u03C0\u03BF\u03B9\u03B5\u03AF \u03C4\u03B1 \u03C6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1, \u03C4\u03B1 \u03BF\u03C0\u03BF\u03AF\u03B1 \u03AD\u03C7\u03B5\u03B9 \u03AC\u03BC\u03B5\u03C3\u03B7 \u03B1\u03BD\u03AC\u03B3\u03BA\u03B7 \u03BD\u03B1 \u03C0\u03C1\u03BF\u03BC\u03B7\u03B8\u03B5\u03C5\u03C4\u03B5\u03AF, \u03CE\u03C3\u03C4\u03B5 \u03BD\u03B1 \u03B5\u03BE\u03C5\u03C0\u03B7\u03C1\u03B5\u03C4\u03B5\u03AF \u03C4\u03BF\u03C5\u03C2 \u03C0\u03B5\u03BB\u03AC\u03C4\u03B5\u03C2 \u03C4\u03BF\u03C5. \u03A4\u03BF \u03C3\u03CD\u03C3\u03C4\u03B7\u03BC\u03B1 \u03B5\u03BD\u03B7\u03BC\u03B5\u03C1\u03CE\u03BD\u03B5\u03B9 \u03C4\u03BF\u03BD \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03BF\u03C0\u03BF\u03B9\u03CC \u03CC\u03C4\u03B9 \u03AD\u03BD\u03B1 \u03C6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF \u03B5\u03BC\u03C6\u03B1\u03BD\u03AF\u03B6\u03B5\u03B9 \u03B5\u03BB\u03BB\u03B9\u03C0\u03AE \u03C0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1, \u03CE\u03C3\u03C4\u03B5 \u03BF \u03C0\u03C1\u03CE\u03C4\u03BF\u03C2 \u03BD\u03B1 \u03B5\u03BA\u03C6\u03C1\u03AC\u03C3\u03B5\u03B9 \u03C4\u03B7\u03BD \u03B1\u03C0\u03B1\u03B9\u03C4\u03BF\u03CD\u03BC\u03B5\u03BD\u03AE \u03C4\u03BF\u03C5 \u03B1\u03BD\u03AC\u03B3\u03BA\u03B7.         \u0395\u03C0\u03B9\u03C0\u03BB\u03AD\u03BF\u03BD, \u03CC\u03C4\u03B1\u03BD \u03BA\u03AC\u03C0\u03BF\u03B9\u03B1 \u03C6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1 \u03B5\u03AF\u03C4\u03B5 \u03C0\u03BB\u03B7\u03C3\u03B9\u03AC\u03B6\u03BF\u03C5\u03BD \u03C3\u03C4\u03B7\u03BD \u03B7\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03BB\u03AE\u03BE\u03B7\u03C2 \u03C4\u03BF\u03C5\u03C2 \u03B5\u03AF\u03C4\u03B5 \u03B4\u03B5\u03BD \u03AD\u03C7\u03BF\u03C5\u03BD \u03C4\u03B7\u03BD \u03B1\u03BD\u03B1\u03BC\u03B5\u03BD\u03CC\u03BC\u03B5\u03BD\u03B7 \u03B6\u03AE\u03C4\u03B7\u03C3\u03B7, \u03BF \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03BF\u03C0\u03BF\u03B9\u03CC\u03C2 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C3\u03B5 \u03B8\u03AD\u03C3\u03B7 \u03BD\u03B1 \u03C4\u03B1 \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B5\u03B9 \u03C0\u03C1\u03BF\u03C2 \u03C0\u03CE\u03BB\u03B7\u03C3\u03B7 \u03C3\u03B5 \u03AC\u03BB\u03BB\u03B1 \u03C6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03AF\u03B1, \u03C0\u03BF\u03C5 \u03C4\u03B1 \u03C7\u03C1\u03B5\u03B9\u03AC\u03B6\u03BF\u03BD\u03C4\u03B1\u03B9.");
		txtPhexnet.setBounds(220, 100, 446, 251);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Kalathi test10=new Kalathi();
				test10.open();
			}
		});
		button_3.setBounds(601, 60, 89, 25);
		button_3.setText("\u03A4\u03BF \u03BA\u03B1\u03BB\u03AC\u03B8\u03B9 \u03BC\u03BF\u03C5");
		button_3.setBackground(white);
		
		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Eidopoihseis test12=new Eidopoihseis();
				test12.open();
			}
		});
		btnNewButton_6.setBounds(567, 4, 26, 25);
		btnNewButton_6.setImage(SWTResourceManager.getImage("C:\\Users\\panag\\eclipse-workspace\\SoftEng\\ddddddddddddddddddor.png"));
		btnNewButton_6.setBackground(white);
		
		Label lblNewLabel_6 = new Label(shell, SWT.BORDER | SWT.CENTER);
		lblNewLabel_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		lblNewLabel_6.setBounds(173, 397, 26, 15);
		lblNewLabel_6.setText(Integer.toString(Arxikh.FarmakeiaMou.get(0).getupperBounder()));
	}
}
