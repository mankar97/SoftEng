import java.util.Date;

public class Krathsh {
	String nameAp;
	Date date;
	String locationAp;
	String descriptionAp;
	
	public Krathsh() {
		
	}
	
	public String getnameAp()
	{
		return this.nameAp;
	}
	
	public Date getdate()
	{
		return this.date;
	}
	
	public String getlocationAp()
	{
		return this.locationAp;
	}
	
	public String getdescriptionAp()
	{
		return this.descriptionAp;
	}
	
	public void reserve(String name,Date date,String location,String description)
	{
		this.nameAp=name;
		this.date=date;
		this.locationAp=location;
		this.descriptionAp=description;
	}
	
}
