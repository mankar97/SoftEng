import java.util.ArrayList;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.ibm.icu.text.SimpleDateFormat;

public class DiathesimaProionta extends Proion{
	
	private int quantitySell;
	
	public DiathesimaProionta() {}
	
	public DiathesimaProionta(long id,String name,double timi,Date date) {
		super(id,name,timi,date);
	}
	
	public void setquantitySell(int qst)
	{
		this.quantitySell=qst;
	}
	public int getquantitySell()
	{
		return this.quantitySell;
	}
	public void addToCart()
	{
		 Kalathi.bucket.add(this);
	}
	
}
