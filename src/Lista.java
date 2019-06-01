import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Label;

import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;


public class Lista {

	protected Shell shell;
	private Text text;
	private Text txtUsername;
	private Text txtPhexnet;
	private int brethike;
	
	
	public void emfanisilistas() {
		
	}
	
	
	
	
	public int timibrethike()
	{
		return brethike;
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		shell.setSize(766, 520);
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

			}
		});
		btnNewButton.setBounds(10, 140, 157, 40);
		btnNewButton.setText("\u039B\u0399\u03A3\u03A4\u0391 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u03A9\u039D \u03A0\u03A1\u039F\u03A3 \u0396\u0397\u03A4\u0397\u03A3\u0397");
		btnNewButton.setBackground(SWTResourceManager.getColor(102, 153, 255));
		
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
				shell.dispose();
				Kalathi test10=new Kalathi();
				test10.open();
			}
		});
		button_3.setBounds(601, 60, 89, 25);
		button_3.setText("\u03A4\u03BF \u03BA\u03B1\u03BB\u03AC\u03B8\u03B9 \u03BC\u03BF\u03C5");
		button_3.setBackground(white);
		
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
		
        
		Table table = new Table(shell,SWT.CHECK | SWT.BORDER);
		    table.setHeaderVisible(true);
		    String[] titles = {"Όνομα Προϊόντος", "Ζητούμενη Ποσότητα","Τοποθεσία Φαρμακείου","Βαθμός Αναγκαιότητας" };

		    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      TableColumn column = new TableColumn(table, SWT.NULL);
		      column.setText(titles[loopIndex]);
		    }
		    
		    
		    ZitoumenaProionta temp1;
		    AggeliaZitisis temp2;
		    String temp3;
	    	for (int k=0;k<NeaZhthsh.ListaZitisisPr.size();k++)
	    	{
	    		for (int j=1;j<NeaZhthsh.ListaZitisisPr.size()-k;j++)
	    		{	
	    			if (NeaZhthsh.ListaZitisisAg.get(j-1).getNecessity() < NeaZhthsh.ListaZitisisAg.get(j).getNecessity())
	    			{
	    				
	    				temp2=NeaZhthsh.ListaZitisisAg.get(j-1);
	    				NeaZhthsh.ListaZitisisAg.set(j-1,NeaZhthsh.ListaZitisisAg.get(j));
	    				NeaZhthsh.ListaZitisisAg.set(j,temp2);
	    				
	    				temp1=NeaZhthsh.ListaZitisisPr.get(j-1);
	    				NeaZhthsh.ListaZitisisPr.set(j-1,NeaZhthsh.ListaZitisisPr.get(j));
	    				NeaZhthsh.ListaZitisisPr.set(j,temp1);
	    				
	    				temp3=NeaZhthsh.topothesies.get(j-1);
	    				NeaZhthsh.topothesies.set(j-1,NeaZhthsh.topothesies.get(j));
	    				NeaZhthsh.topothesies.set(j,temp3);
	    				
	    			}
	    		}
	    	}
	    	
	    	
	    	
	    	String[][] wlist = AggeliaZitisis.wantReq();
		    for (int loopIndex = 0; loopIndex < NeaZhthsh.ListaZitisisPr.size(); loopIndex++)
		    {
		    	TableItem item = new TableItem(table, SWT.NULL);
		    	item.setText(0, wlist[loopIndex][0]);
		    	item.setText(1, wlist[loopIndex][1]);
		    	item.setText(2, wlist[loopIndex][2]);
		    	item.setText(3, wlist[loopIndex][3]);
		    }
		    
		    
		    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      table.getColumn(loopIndex).pack();
		    }

		    table.setBounds(173, 100, 549, 240);
		    
		    Button button_5 = new Button(shell, SWT.RADIO);
			button_5.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					
					
					 
				    ZitoumenaProionta temp1;
				    AggeliaZitisis temp2;
				    String temp3;
			    	for (int k=0;k<NeaZhthsh.ListaZitisisPr.size();k++)
			    	{
			    		for (int j=1;j<NeaZhthsh.ListaZitisisPr.size()-k;j++)
			    		{	
			    		
			    			if (NeaZhthsh.ListaZitisisAg.get(j-1).getNecessity() < NeaZhthsh.ListaZitisisAg.get(j).getNecessity())
			    			{
			    				
			    				temp2=NeaZhthsh.ListaZitisisAg.get(j-1);
			    				NeaZhthsh.ListaZitisisAg.set(j-1,NeaZhthsh.ListaZitisisAg.get(j));
			    				NeaZhthsh.ListaZitisisAg.set(j,temp2);
			    				
			    				temp1=NeaZhthsh.ListaZitisisPr.get(j-1);
			    				NeaZhthsh.ListaZitisisPr.set(j-1,NeaZhthsh.ListaZitisisPr.get(j));
			    				NeaZhthsh.ListaZitisisPr.set(j,temp1);
			    				
			    				temp3=NeaZhthsh.topothesies.get(j-1);
			    				NeaZhthsh.topothesies.set(j-1,NeaZhthsh.topothesies.get(j));
			    				NeaZhthsh.topothesies.set(j,temp3);
			    				
			    			}
			    		}
			    	}
			    	
			    	table.setItemCount(0);
			    	
				    for (int loopIndex = 0; loopIndex < NeaZhthsh.ListaZitisisPr.size(); loopIndex++)
				    {
				    	TableItem item = new TableItem(table, SWT.NULL);
				    	item.setText(0, NeaZhthsh.ListaZitisisPr.get(loopIndex).getnamePr());
				    	item.setText(1, Integer.toString(NeaZhthsh.ListaZitisisAg.get(loopIndex).getcounterNeed()));
				    	item.setText(2, NeaZhthsh.topothesies.get(loopIndex));
				    	item.setText(3, Integer.toString(NeaZhthsh.ListaZitisisAg.get(loopIndex).getNecessity()));
				    }
				}
			});
	        button_5.setBounds(415, 39, 141, 16);
	        button_5.setText("\u0392\u03B1\u03B8\u03BC\u03CC \u0391\u03BD\u03B1\u03B3\u03BA\u03B1\u03B9\u03CC\u03C4\u03B7\u03C4\u03B1\u03C2");
	        button_5.setSelection(true);
	        button_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

	        Button button_6 = new Button(shell, SWT.RADIO);
	        button_6.addSelectionListener(new SelectionAdapter() {
	        	@Override
	        	public void widgetSelected(SelectionEvent e) {
	        		ZitoumenaProionta temp1;
				    AggeliaZitisis temp2;
				    String temp3;
			    	for (int k=0;k<NeaZhthsh.topothesies.size();k++)
			    	{
			    		for (int j=k+1;j<NeaZhthsh.topothesies.size();j++)
			    		{	
			    			
			    			if (NeaZhthsh.topothesies.get(k).compareTo(NeaZhthsh.topothesies.get(j))>0)
			    			{
			    				
			    				temp2=NeaZhthsh.ListaZitisisAg.get(k);
			    				NeaZhthsh.ListaZitisisAg.set(k,NeaZhthsh.ListaZitisisAg.get(j));
			    				NeaZhthsh.ListaZitisisAg.set(j,temp2);
			    				
			    				temp1=NeaZhthsh.ListaZitisisPr.get(k);
			    				NeaZhthsh.ListaZitisisPr.set(k,NeaZhthsh.ListaZitisisPr.get(j));
			    				NeaZhthsh.ListaZitisisPr.set(j,temp1);
			    				
			    				temp3=NeaZhthsh.topothesies.get(k);
			    				NeaZhthsh.topothesies.set(k,NeaZhthsh.topothesies.get(j));
			    				NeaZhthsh.topothesies.set(j,temp3);
			    				
			    			}
			    		}
			    	}
					
			    	table.setItemCount(0);
					for (int loopIndex = 0; loopIndex < NeaZhthsh.ListaZitisisPr.size(); loopIndex++)
				    {
				    	TableItem item = new TableItem(table, SWT.NULL);
				    	item.setText(0, NeaZhthsh.ListaZitisisPr.get(loopIndex).getnamePr());
				    	item.setText(1, Integer.toString(NeaZhthsh.ListaZitisisAg.get(loopIndex).getcounterNeed()));
				    	item.setText(2, NeaZhthsh.topothesies.get(loopIndex));
				    	item.setText(3, Integer.toString(NeaZhthsh.ListaZitisisAg.get(loopIndex).getNecessity()));
				    }
	        	}
	        });
	        button_6.setBounds(415, 60, 90, 16);
	        button_6.setText("\u03A4\u03BF\u03C0\u03BF\u03B8\u03B5\u03C3\u03AF\u03B1");
	        button_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			
		    
		    Button button_4 = new Button(shell, SWT.NONE);
		    button_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		    button_4.addSelectionListener(new SelectionAdapter() {
		    			    	
		    	int flag=0;
		    	public void widgetSelected(SelectionEvent e) {
		    		for (int i=0; i<table.getItemCount(); i++) {
			               TableItem tableItem = table.getItem(i);
			               if(tableItem.getChecked()==true)
			               {
			            	   brethike=i;
			            	   flag++;
			               }
			               
		    		}
		    		
		    		shell.dispose();
		    		if (flag!=1)
		    		{
		    			MynhmaAporripshs mynhmaz = new MynhmaAporripshs();
		    			mynhmaz.open();
		    		}
		    		else {		    			
			    			Eidopoihsh ed = new Eidopoihsh();
			    			ed.setnotifPr(NeaZhthsh.ListaZitisisPr.get(brethike).getnamePr());
							ed.settypeNotif("Ζήτηση");
							ed.setdescriptionNotif("Βρέθηκε πωλητής για το προϊόν " + NeaZhthsh.ListaZitisisPr.get(brethike).getnamePr() + " που ζητήσατε.");
							Eidopoihseis.Eidop.add(ed);		    				
		    				
							MynhmaEpibebaiwshs mynhma=new MynhmaEpibebaiwshs();
		    				mynhma.open();
		    		}
		    	}
		    });
		    button_4.setBounds(626, 360, 96, 25);
		    button_4.setText("\u0395\u03BE\u03C5\u03C0\u03B7\u03C1\u03AD\u03C4\u03B7\u03C3\u03B7");
		    button_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			
			Label label = new Label(shell, SWT.NONE);
			label.setAlignment(SWT.CENTER);
			label.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
			label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			label.setBounds(251, 41, 120, 25);
			label.setText("\u03A4\u03B1\u03BE\u03B9\u03BD\u03CC\u03BC\u03B7\u03C3\u03B7 \u039A\u03B1\u03C4\u03AC :");
			
			Label lblNewLabel_6 = new Label(shell, SWT.BORDER);
			lblNewLabel_6.setAlignment(SWT.CENTER);
			lblNewLabel_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			lblNewLabel_6.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
			lblNewLabel_6.setBounds(173, 397, 26, 15);

			lblNewLabel_6.setText(Integer.toString(Arxikh.FarmakeiaMou.get(0).getupperBounder()));
			btnNewButton_6.setImage(SWTResourceManager.getImage("C:\\Users\\panag\\eclipse-workspace\\SoftEng\\ddddddddddddddddddor.png"));
	}
}
