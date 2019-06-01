import java.util.Date;

public class Aggelia {
	protected long codeLis;
	protected Date dateMade;
	protected double priceLis;
	
	public void setcodeLis(long lis)
	{
		this.codeLis=lis;
	}
	public long getcodeLis()
	{
		return this.codeLis;
	}
	
	public void setdateMade(Date date)
	{
		this.dateMade=date;
	}
	public Date getdateMade()
	{
		return this.dateMade;
	}
	
	public void setpriceLis(double plis)
	{
		this.priceLis=plis;
	}
	public double getpriceLis()
	{
		return this.priceLis;
	}
	
	
}
