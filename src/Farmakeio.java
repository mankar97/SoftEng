import java.util.ArrayList;

public class Farmakeio {
	private String namePh;
	private String locationPh;
	private String address;
	private double ratePh=0;
	private int upperBounder=0;
	private double sumrates=0;
	private int counterofrates=0;
	
	public void setnamePh(String namePh)
	{
		this.namePh=namePh;
	}
	public String getnamePh()
	{
		return this.namePh;
	}
	
	public void setlocationPh(String locationPh)
	{
		this.locationPh=locationPh;
	}
	public String getlocationPh()
	{
		return this.locationPh;
	}
	
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return this.address;
	}
	
	public void setratePh(double ratePh)
	{
		this.ratePh=ratePh;
	}
	public double getratePh()
	{
		return this.ratePh;
	}
	
	public void setupperBounder(int upperBounder)
	{
		this.upperBounder=upperBounder;
	}
	public int getupperBounder()
	{
		return this.upperBounder;
	}
	
	public void calcrates(double individualrate)
	{
		counterofrates++;
		sumrates+=individualrate;
		ratePh=sumrates/counterofrates;
		this.setratePh(ratePh);
	}
	
	public void initialize()
	{
		this.setnamePh("CEID");
		this.setlocationPh("Ρίο-Πάτρα");
		this.setaddress("Πάτρα");
		
	}
	
	public int increaseUpperBounder()
	{
		return this.upperBounder+=1;
	}
	
	public static String[] retInfo() {
		String[] info = new String[3];
		info[0] = Logariasmos.stoixeia[0];
		info[1] = Logariasmos.stoixeia[1];
		info[2] = Logariasmos.stoixeia[2];		
		return info;
	}
}
