import java.util.Calendar;
import java.util.Date;

public class Bucket {
	
	private double price;
	
	public Bucket() {}
	
	public void proceed(Proion Pr)
	{
		Synallagh synal = new Synallagh();
		synal.open();
	}
	
	public boolean payMethod(String method)
	{
		if (method.equals("Αντικαταβολή"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Date estimatedTime()
	{
		Calendar cal = Calendar.getInstance();
		Date datenow = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		Date estimateddate=cal.getTime();
		return estimateddate;
	}
	
}
