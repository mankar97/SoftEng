import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Proion {
	
	protected String namePr="";
	protected long codePr=0;
	protected double price=0.0;
	protected Date expireDate=null;
	
	public Proion() {}
	
	public Proion(long id,String name,double timi,Date date)
	{
		this.codePr=id;
		this.namePr=name;
		this.price=timi;
		this.expireDate=date;
	}
	
	public void setnamePr(String name)
	{
		this.namePr=name;
	}
	public String getnamePr()
	{
		return this.namePr;
	}
	public void setcodePr(long id)
	{
		this.codePr=id;
	}
	public long getcodePr()
	{
		return this.codePr;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public double getprice()
	{
		return this.price;
	}
	public void setexpireDate(Date date)
	{
		this.expireDate=date;
	}
	public Date getexpireDate()
	{
		return this.expireDate;
	}
	
	public boolean checkexpireDate()
	{
		Date shmerinh = new Date();


	    Date firstDate = shmerinh;
	    Date secondDate = this.getexpireDate();
	 
	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
	    if (diff<30) 
	    {
	    	return true;
	    }
	    else {
	    	return false;
	    	}
	    
	}
	
	public boolean checkquantity(int i)
	{
		if(Apothiki.Posotites.get(i)<4)
		{
			return true;
		}
		else return false;
	}
}
