import java.util.Date;

public class AggeliaZitisis extends Aggelia {
	private int necessity;
	private int counterNeed;
	private boolean sortByNeed;
	
	public void setNecessity(int ncs)
	{
		this.necessity=ncs;
	}
	public int getNecessity()
	{
		return this.necessity;
	}
	
	public void setcounterNeed(int cn)
	{
		this.counterNeed=cn;
	}
	public int getcounterNeed()
	{
		return this.counterNeed;
	}
	public static String[][] wantReq(){
		return retWantList();
	}
	
	public static String[][] retWantList() {
		String[][] wantList = new String[NeaZhthsh.ListaZitisisPr.size()][6];
		for (int loopIndex = 0; loopIndex < NeaZhthsh.ListaZitisisPr.size(); loopIndex++)
	    {	
			wantList[loopIndex][0] = NeaZhthsh.ListaZitisisPr.get(loopIndex).getnamePr();
			wantList[loopIndex][1] = Double.toString(NeaZhthsh.ListaZitisisPr.get(loopIndex).getquantityNeed());
			wantList[loopIndex][2] = NeaZhthsh.topothesies.get(loopIndex);
			wantList[loopIndex][3] = Double.toString(NeaZhthsh.ListaZitisisAg.get(loopIndex).getNecessity());   	
	    }
		
		return wantList;
	}
	
}
