import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

public class Eidopoihsh {
	
	private String typeNotif;
	private String descriptionNotif;
	private String notifPr;
	private int counterMess;
	private double rate;
	private boolean notifRated=false;
	
	public Eidopoihsh() {

	}
	
	public void setnotifPr(String np)
	{
		this.notifPr=np;
	}
	public String getnotifPr()
	{
		return this.notifPr;
	}
	
	public void settypeNotif(String tn)
	{
		this.typeNotif=tn;
	}
	public String gettypeNotif()
	{
		return this.typeNotif;
	}
	
	public void setdescriptionNotif(String dn)
	{
		this.descriptionNotif=dn;
	}
	public String getdescriptionNotif()
	{
		return this.descriptionNotif;
	}
	
	public void setcounterMess(int cm)
	{
		this.counterMess=cm;
	}
	public int getcounterMess()
	{
		return this.counterMess;
	}
	
	public void setrate(double rate)
	{
		this.rate=rate;
	}
	public double getrate()
	{
		return this.rate;
	}
	
	public void setnotifRated(boolean r)
	{
		this.notifRated=r;
	}
	public boolean getnotifRated()
	{
		return this.notifRated;
	}
	
	public static String[] retNotifList() {
		String[] notifList = new String[Eidopoihseis.Eidop.size()];
		for (int loopIndex = 0; loopIndex < Eidopoihseis.Eidop.size(); loopIndex++) {
		      notifList[loopIndex] = Eidopoihseis.Eidop.get(loopIndex).getnotifPr();
		}
		return notifList;
	}
	
	public void statAnalysis(Date date)
	{
		
	}
	
}
