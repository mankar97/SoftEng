import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Label;

import java.text.ParseException;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.eclipse.swt.events.SelectionListener;
import java.util.function.Consumer;

public class Apothiki {

	protected Shell shell;
	private Text text;
	private Text txtUsername;
	private Text txtPhexnet;
	public static ArrayList<Proion> ListaMou = new ArrayList<Proion>();
	public static ArrayList<Integer> Posotites = new ArrayList<Integer>();
	
	private boolean choice;
	private boolean sortBy;
	private int quantitySt;
	
	
	public void initialize()
	{	
		Long L;
		
		for (int i=0;i<10;i++)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date yourDate = null;
			Date yourDate2 = null;
			Date yourDate3 = null;
			Date yourDate4 = null;
			try {
				yourDate = sdf.parse("01/12/2019");
				yourDate2 = sdf.parse("03/07/2019");
				yourDate3 = sdf.parse("01/11/2019");
				yourDate4 = sdf.parse("16/06/2019");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			Proion Pr = new Proion();
			Pr.setnamePr("Προϊόν"+i);
			L=Long.valueOf(i+1);
			Pr.setcodePr(L);
			Pr.setprice((i+10.0));
			int randomquantity = ThreadLocalRandom.current().nextInt(1, 10+1);
			Posotites.add(randomquantity);
			Pr.setexpireDate(yourDate);
			if (i==3)
			{
				Pr.setexpireDate(yourDate3);
			}
			if (i==5)
			{
				Pr.setexpireDate(yourDate4);
			}
			if (i>7)
			{
			Pr.setexpireDate(yourDate2);
			}
			ListaMou.add(Pr);
			
			int twriniposotita=0;
			for(int k=0;k<Apothiki.Posotites.size();k++)
			{
				if(Apothiki.ListaMou.get(k).getnamePr().equals(Pr.getnamePr()))
				{
					twriniposotita = Apothiki.Posotites.get(k);
				}
			}
			
			if(Pr.checkquantity(i))
			{
				Eidopoihsh ed = new Eidopoihsh();
				ed.setnotifPr(Pr.getnamePr());
				ed.settypeNotif("Έλλειψη Προϊόντος");
				ed.setdescriptionNotif("Παρουσιάζεται έλλειψη του προϊόντος " + Pr.getnamePr() + ". \nΤωρινή ποσότητα: " + twriniposotita );
				Eidopoihseis.Eidop.add(ed);
			}
					
				
				    
			
			
			if(Pr.checkexpireDate() && Posotites.get(i)<4)
			{
				Eidopoihsh ed = new Eidopoihsh();
				ed.setnotifPr(Pr.getnamePr());
				ed.settypeNotif("Λήξη");
				ed.setdescriptionNotif("Το προϊόν " + Pr.getnamePr() + " πλησιάζει την ημερομηνία λήξης του και εμφανίζει ελλιπής ποσότητα. \nΤωρινή ποσότητα: " + twriniposotita);
				Eidopoihseis.Eidop.add(ed);
				
			} else if(Pr.checkexpireDate()){
				Eidopoihsh ed = new Eidopoihsh();
				ed.setnotifPr(Pr.getnamePr());
				ed.settypeNotif("Λήξη");
				ed.setdescriptionNotif("Το προϊόν " + Pr.getnamePr() + " πλησιάζει την ημερομηνία λήξης του.");
				Eidopoihseis.Eidop.add(ed);
			}
			
		}	
	}
	
	
	public void setquantitySt(int qst)
	{
		this.quantitySt=qst;
	}
	
	public static String[] getProdInfo(int i) {
		return retProdInfo(0);
	}
	
	public static String[] retProdInfo(int i) {
		String[] prodInfo = new String[5];
		prodInfo[0] = ListaMou.get(i).getnamePr();
		prodInfo[1] = Integer.toString(Posotites.get(i));
		prodInfo[2] = Double.toString(ListaMou.get(i).getprice());
		prodInfo[3] = "Πάτρα";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		prodInfo[4] = sdf1.format(ListaMou.get(i).getexpireDate());
		return prodInfo;		
	}
	
	public static boolean retAvailability(String name, int posot) {
		for (int i=0;i<Apothiki.ListaMou.size();i++){
			if (Apothiki.ListaMou.get(i).getnamePr().equals(name))
			{
				if (Apothiki.Posotites.get(i)>=posot)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}
	
	private static ArrayList<Proion> prodReq(){
		return retProdList();
	}
	private static ArrayList<Proion> retProdList(){
		return Apothiki.ListaMou;
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
		shell.setSize(800, 520);
		shell.setText("SWT Application");
		
		Device device = Display.getCurrent ();
		Color popi = new Color (device, 0, 255, 204);
		Color white = new Color (device, 255, 255, 255);
		Color blue = new Color (device, 210, 100, 80);
		Color pink = new Color (device, 255, 255, 255);
		
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

			}
		});
		btnNewButton_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnNewButton_3.setBounds(10, 260, 157, 40);
		btnNewButton_3.setText("\u0397 \u0391\u03A0\u039F\u0398\u0397\u039A\u0397 \u039C\u039F\u03A5");
		btnNewButton_3.setBackground(SWTResourceManager.getColor(102, 153, 255));
		
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
		
		
		Label label = new Label(shell, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setBounds(251, 41, 120, 25);
		label.setText("\u03A4\u03B1\u03BE\u03B9\u03BD\u03CC\u03BC\u03B7\u03C3\u03B7 \u039A\u03B1\u03C4\u03AC :");
		
		Table table = new Table(shell, SWT.BORDER);
		    table.setHeaderVisible(true);
		    String[] titles = {"Όνομα Προϊόντος", "Ποσότητα Προϊόντος", "Ημερομηνία Λήξης", };

		    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      TableColumn column = new TableColumn(table, SWT.NULL);
		      column.setText(titles[loopIndex]);
		    }
		    Proion temp;
        	int temp2;
        	for (int k=0;k<ListaMou.size();k++)
	    	{
	    		for (int j=1;j<ListaMou.size()-k;j++)
	    		{	
	    			
	    			if (ListaMou.get(j-1).getexpireDate().compareTo(ListaMou.get(j).getexpireDate()) > 0)
	    			{
	    				
	    				temp=ListaMou.get(j-1);
	    				ListaMou.set(j-1,ListaMou.get(j));
	    				ListaMou.set(j,temp);
	    				
	    				temp2=Posotites.get(j-1);
	    				Posotites.set(j-1, Posotites.get(j));
	    				Posotites.set(j, temp2);
	    				
	    			}
	    		}
	    	}
		    ArrayList<Proion> prodList = prodReq();
		    for (int loopIndex = 0; loopIndex < ListaMou.size(); loopIndex++) {
			      TableItem item = new TableItem(table, SWT.NULL);
			      item.setText(0, prodList.get(loopIndex).getnamePr() );
			      item.setText(1, Integer.toString(Posotites.get(loopIndex)));
			      SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
				  String date2 = null;
				  date2 = sdf1.format(prodList.get(loopIndex).getexpireDate());
				  item.setText(2, date2);
			    }

		    

		    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
		      table.getColumn(loopIndex).pack();
		    }

		    table.setBounds(173, 100, 379, 240);
		    
		    Label label_1 = new Label(shell, SWT.NONE);
		    label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		    label_1.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		    label_1.setAlignment(SWT.CENTER);
		    label_1.setBounds(637, 100, 75, 25);
		    label_1.setText("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AD\u03C2 :");
		    
		    Button btnNewButton_7 = new Button(shell, SWT.NONE);
		    btnNewButton_7.addSelectionListener(new SelectionAdapter() {
		    	@Override
		    	public void widgetSelected(SelectionEvent e) {
		    		shell.dispose();
		    		MynhmaPwlhshs sell= new MynhmaPwlhshs();
		    		sell.open();
		    		
		    		
		    	}
		    });
		    btnNewButton_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		    btnNewButton_7.setBounds(577, 155, 75, 25);
		    btnNewButton_7.setText("\u03A0\u03CE\u03BB\u03B7\u03C3\u03B7");
		    btnNewButton_7.setBackground(SWTResourceManager.getColor(102, 153, 255));
		    
		    Button btnNewButton_8 = new Button(shell, SWT.NONE);
		    btnNewButton_8.addSelectionListener(new SelectionAdapter() {
		    	@Override
		    	public void widgetSelected(SelectionEvent e) {
		    		shell.dispose();
		    		MynhmaZhthshs want=new MynhmaZhthshs();
		    		want.open();
		    	}
		    });
		    btnNewButton_8.setBounds(699, 155, 75, 25);
		    btnNewButton_8.setText("\u0396\u03AE\u03C4\u03B7\u03C3\u03B7");
		    btnNewButton_8.setBackground(SWTResourceManager.getColor(255, 153, 255));
		    
		    Button button_4 = new Button(shell, SWT.NONE);
		    button_4.addSelectionListener(new SelectionAdapter() {
		    	@Override
		    	public void widgetSelected(SelectionEvent e) {
		    		
		    		shell.dispose();
		    		Apothiki apothiki=new Apothiki();
		    		apothiki.open();
		    	}
		    });
		    button_4.setForeground(SWTResourceManager.getColor(204, 51, 204));
		    button_4.setBounds(650, 315, 75, 25);
		    button_4.setText("\u0391\u03BD\u03B1\u03BD\u03AD\u03C9\u03C3\u03B7");
		    button_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		    
			Label lblNewLabel_6 = new Label(shell, SWT.BORDER);
			lblNewLabel_6.setAlignment(SWT.CENTER);
			lblNewLabel_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			lblNewLabel_6.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
			lblNewLabel_6.setBounds(173, 397, 26, 15);

			Button button_5 = new Button(shell, SWT.RADIO);
			
	        button_5.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	Proion temp;
	            	int temp2;
	            	
	            	for (int k=0;k<ListaMou.size();k++)
			    	{
			    		for (int j=1;j<ListaMou.size()-k;j++)
			    		{	
			    			
			    			if (ListaMou.get(j-1).getexpireDate().compareTo(ListaMou.get(j).getexpireDate()) > 0)
			    			{
			    				
			    				temp=ListaMou.get(j-1);
			    				ListaMou.set(j-1,ListaMou.get(j));
			    				ListaMou.set(j,temp);
			    				
			    				temp2=Posotites.get(j-1);
			    				Posotites.set(j-1, Posotites.get(j));
			    				Posotites.set(j, temp2);
			    				
			    			}
			    		}
			    	}
	            	
	            	table.setItemCount(0);
	            	
	            	for (int loopIndex = 0; loopIndex < ListaMou.size(); loopIndex++) {
	  			      TableItem item = new TableItem(table, SWT.NULL);
	  			      item.setText(0, ListaMou.get(loopIndex).getnamePr() );
	  			      int randomquantity = ThreadLocalRandom.current().nextInt(1, 10+1);
	  			      item.setText(1, Integer.toString(Posotites.get(loopIndex)));
	  			      SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	  				  String date2 = null;
	  				  date2 = sdf1.format(ListaMou.get(loopIndex).getexpireDate());
	  				  item.setText(2, date2);
	  			    }

	            	
	            	
	            	
	            }
	        	
	        });
	        button_5.setBounds(398, 34, 141, 16);
	        button_5.setText("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u039B\u03AE\u03BE\u03B7\u03C2");
	        button_5.setSelection(true);
	        button_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
	        
	        Button button_6 = new Button(shell, SWT.RADIO);
	        button_6.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	Proion temp;
	            	int temp2;
	            	
	            	for (int k=0;k<ListaMou.size();k++)
			    	{
			    		for (int j=1;j<ListaMou.size()-k;j++)
			    		{	
			    			
			    			if (Posotites.get(j-1) > Posotites.get(j))
			    			{
			    				
			    				temp=ListaMou.get(j-1);
			    				ListaMou.set(j-1,ListaMou.get(j));
			    				ListaMou.set(j,temp);
			    				
			    				temp2=Posotites.get(j-1);
			    				Posotites.set(j-1, Posotites.get(j));
			    				Posotites.set(j, temp2);
			    				
			    			}
			    		}
			    	}
	            	
	            	table.setItemCount(0);
	            	
	            	for (int loopIndex = 0; loopIndex < ListaMou.size(); loopIndex++) {
		  			      TableItem item = new TableItem(table, SWT.NULL);
		  			      item.setText(0, ListaMou.get(loopIndex).getnamePr() );
		  			      int randomquantity = ThreadLocalRandom.current().nextInt(1, 10+1);
		  			      item.setText(1, Integer.toString(Posotites.get(loopIndex)));
		  			      SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		  				  String date2 = null;
		  				  date2 = sdf1.format(ListaMou.get(loopIndex).getexpireDate());
		  				  item.setText(2, date2);
		  			    }
	            	
	            	
	            }
	        });
	        button_6.setBounds(398, 64, 90, 16);
	        button_6.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1");
	        button_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
	        
	        lblNewLabel_6.setText(Integer.toString(Arxikh.FarmakeiaMou.get(0).getupperBounder()));
	        btnNewButton_6.setImage(SWTResourceManager.getImage("C:\\Users\\panag\\eclipse-workspace\\SoftEng\\ddddddddddddddddddor.png"));

	}
}
