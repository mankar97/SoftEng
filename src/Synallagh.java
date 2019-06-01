import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Label;

import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;


public class Synallagh {

	protected Shell shell;
	private Text text;
	private Text txtUsername;
	private Text text_1;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Table table;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_12;
	


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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		shell.setSize(800, 520);
		shell.setText("SWT Application");
		
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
				shell.dispose();
				NeaZhthsh test4=new NeaZhthsh();
				test4.open();
				
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
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		button_3.setBounds(601, 61, 89, 25);
		button_3.setText("\u03A4\u03BF \u03BA\u03B1\u03BB\u03AC\u03B8\u03B9 \u03BC\u03BF\u03C5");
		button_3.setBackground(SWTResourceManager.getColor(255, 255, 153));
		
		Button btnNewButton_5 = new Button(shell, SWT.NONE);
		btnNewButton_5.setForeground(SWTResourceManager.getColor(0, 153, 255));
		btnNewButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Arxikh test0=new Arxikh();
				test0.open();
			}
		});
		btnNewButton_5.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.BOLD | SWT.ITALIC));
		btnNewButton_5.setBounds(10, 15, 157, 57);
		btnNewButton_5.setText("PHEXnet");
		btnNewButton_5.setBackground(white);
		
		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Eidopoihseis test12=new Eidopoihseis();
				test12.open();
			}
		});
		btnNewButton_6.setImage(SWTResourceManager.getImage("D:\\Luuul\\ddddddddddddddddddor.png"));
		btnNewButton_6.setBounds(567, 4, 26, 25);
	

		   
		    
			Table table_1 = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
			table_1.setBounds(180, 101, 106, 125);
			table_1.setLinesVisible(true);
			
			TableItem tableItem = new TableItem(table_1, SWT.NONE);
			tableItem.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			tableItem.setText("\u038C\u03BD\u03BF\u03BC\u03B1 ");
			
			TableItem tableItem_2 = new TableItem(table_1, SWT.NONE);
			tableItem_2.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			tableItem_2.setText("\u03A4\u03BF\u03C0\u03BF\u03B8\u03B5\u03C3\u03AF\u03B1");
			
			TableItem tableItem_3 = new TableItem(table_1, SWT.NONE);
			tableItem_3.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			tableItem_3.setText("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7");
			
			TableItem tableItem_4 = new TableItem(table_1, SWT.NONE);
			tableItem_4.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			tableItem_4.setText("\u03A4.\u039A.");
			
			TableItem tableItem_7 = new TableItem(table_1, 0);
			tableItem_7.setText("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC");
			tableItem_7.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			TableItem tableItem_8 = new TableItem(table_1, 0);
			tableItem_8.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
			tableItem_8.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			String[] info = Farmakeio.retInfo();
			
			Text text_2 = new Text(shell, SWT.BORDER);
			text_2.setText(info[0]);
			text_2.setBounds(300, 100, 123, 21);
			
			text_1 = new Text(shell, SWT.BORDER);
			text_1.setText(info[1]);
			text_1.setBounds(300, 121, 123, 21);
			
			text_3 = new Text(shell, SWT.BORDER);
			text_3.setText(info[2]);
			text_3.setBounds(300, 142, 123, 21);
			
			text_4 = new Text(shell, SWT.BORDER);
			text_4.setText(Logariasmos.stoixeia[3]);
			text_4.setBounds(300, 163, 123, 21);
			
			text_5 = new Text(shell, SWT.BORDER);
			text_5.setText(Logariasmos.stoixeia[4]);
			text_5.setBounds(300, 184, 123, 21);
			
			text_6 = new Text(shell, SWT.BORDER);
			text_6.setText(Logariasmos.stoixeia[5]);
			text_6.setBounds(300, 205, 123, 21);
			
			table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
			table.setLinesVisible(true);
			table.setVisible(false);
			table.setBounds(456, 220, 168, 83);
			
			TableItem tableItem_5 = new TableItem(table, 0);
			tableItem_5.setText("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 \u039A\u03AC\u03C1\u03C4\u03B1\u03C2");
			tableItem_5.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			TableItem tableItem_6 = new TableItem(table, 0);
			tableItem_6.setText("\u038C\u03BD\u03BF\u03BC\u03B1 \u039A\u03B1\u03C4\u03CC\u03C7\u03BF\u03C5");
			tableItem_6.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			TableItem tableItem_9 = new TableItem(table, 0);
			tableItem_9.setText("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u039B\u03AE\u03BE\u03B7\u03C2");
			tableItem_9.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			TableItem tableItem_10 = new TableItem(table, 0);
			tableItem_10.setText("CVV2");
			tableItem_10.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
			
			text_8 = new Text(shell, SWT.BORDER);
			text_8.setBounds(630, 220, 123, 21);
			text_8.setVisible(false);
			
			text_9 = new Text(shell, SWT.BORDER);
			text_9.setBounds(630, 241, 123, 21);
			text_9.setVisible(false);
			
			text_10 = new Text(shell, SWT.BORDER);
			text_10.setBounds(630, 262, 123, 21);
			text_10.setVisible(false);
			
			text_12 = new Text(shell, SWT.BORDER);
			text_12.setBounds(630, 283, 123, 21);
			text_12.setVisible(false);
			
			Label label = new Label(shell, SWT.NONE);
			label.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
			label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			label.setBounds(486, 101, 95, 21);
			label.setText("\u03A0\u03BB\u03B7\u03C1\u03C9\u03BC\u03AE \u03BC\u03B5:");
			
			Button button_5 = new Button(shell, SWT.RADIO);
			button_5.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					table.setVisible(false);
					text_8.setVisible(false);
					text_9.setVisible(false);
					text_10.setVisible(false);
					text_12.setVisible(false);
				}
			});
			button_5.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
			button_5.setBounds(486, 140, 116, 16);
			button_5.setText("\u0391\u03BD\u03C4\u03B9\u03BA\u03B1\u03C4\u03B1\u03B2\u03BF\u03BB\u03AE");
			button_5.setBackground(white);
			
			Button button_6 = new Button(shell, SWT.RADIO);
			button_6.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					table.setVisible(true);
					text_8.setVisible(true);
					text_9.setVisible(true);
					text_10.setVisible(true);
					text_12.setVisible(true);
				}
			});
			button_6.setText("\u03A0\u03B9\u03C3\u03C4\u03C9\u03C4\u03B9\u03BA\u03AE/\u03A7\u03C1\u03B5\u03C9\u03C3\u03C4\u03B9\u03BA\u03AE \u039A\u03AC\u03C1\u03C4\u03B1");
			button_6.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
			button_6.setBounds(486, 179, 219, 16);
			button_6.setBackground(white);
			
			 Button button_4 = new Button(shell, SWT.NONE);
			    button_4.setText("\u039F\u03BB\u03BF\u03BA\u03BB\u03AE\u03C1\u03C9\u03C3\u03B7 \u03C3\u03C5\u03BD\u03B1\u03BB\u03BB\u03B1\u03B3\u03AE\u03C2");
			    button_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
			    button_4.addSelectionListener(new SelectionAdapter() {
			    	@Override
			    	public void widgetSelected(SelectionEvent e) {
			    		if (button_5.getSelection() | button_6.getSelection() )
			    		{
			    			for(int k=0;k<Kalathi.bucket.size();k++) {
				    			Eidopoihsh ed = new Eidopoihsh();
				    			ed.setnotifPr(Kalathi.bucket.get(k).getnamePr());
								ed.settypeNotif("Πώληση");
								ed.setdescriptionNotif("Το προϊόν " + Kalathi.bucket.get(k).getnamePr() + " πουλήθηκε.");
								Eidopoihseis.Eidop.add(ed);
								for (int l=0;l<NeaPwlhsh.ListaPwlisisPr.size();l++)
							    {
				    				if(Kalathi.bucket.get(k).getnamePr().equals(NeaPwlhsh.ListaPwlisisPr.get(l).getnamePr()))
				    				{
				    					NeaPwlhsh.ListaPwlisisPr.remove(l);
				    					NeaPwlhsh.ListaPwlisisAg.remove(l);
				    				}
							    }
			    			}
			    			
			    			Kalathi.bucket.clear();
			    		
			    			shell.dispose();
			    			MynhmaParagelias mp = new MynhmaParagelias();
			    			mp.open();
			    		}
			    		else
			    		{
			    			shell.dispose();
			    			MynhmaSynallaghs syn = new MynhmaSynallaghs();
			    			syn.open();
			    		}
			    	}
			    });
			    button_4.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
			    button_4.setBounds(574, 342, 168, 25);
			    button_4.setBackground(white);
			
			Label lblNewLabel_6 = new Label(shell, SWT.BORDER);
			lblNewLabel_6.setAlignment(SWT.CENTER);
			lblNewLabel_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			lblNewLabel_6.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
			lblNewLabel_6.setBounds(173, 397, 26, 15);
			
			lblNewLabel_6.setText(Integer.toString(Arxikh.FarmakeiaMou.get(0).getupperBounder()));
			btnNewButton_6.setImage(SWTResourceManager.getImage("C:\\Users\\panag\\eclipse-workspace\\SoftEng\\ddddddddddddddddddor.png"));

	}
}
