import com.ibm.icu.text.SimpleDateFormat;

public class AggeliaPwlisis extends Aggelia {
	private int quantitySell;
	
	public void setquantitySell(int qst)
	{
		this.quantitySell=qst;
	}
	public int getquantitySell()
	{
		return this.quantitySell;
	}
	
	public double priceSuggest(){
		double t=15.0;
		return t;
	}
	
	public static boolean availabilityCheck(String name,int posot) {
		return Apothiki.retAvailability(name,posot);	
	}
	public static String[][] saleReq(){
		return retSaleList();
	}
	
	public static String[][] retSaleList() {
		String[][] saleList = new String[NeaPwlhsh.ListaPwlisisPr.size()][6];
		for (int loopIndex = 0; loopIndex < NeaPwlhsh.ListaPwlisisPr.size(); loopIndex++)
	    {	
			saleList[loopIndex][0] = NeaPwlhsh.ListaPwlisisPr.get(loopIndex).getnamePr();
			saleList[loopIndex][1] = Long.toString(NeaPwlhsh.ListaPwlisisPr.get(loopIndex).getcodePr());
			saleList[loopIndex][2] = Double.toString(NeaPwlhsh.ListaPwlisisPr.get(loopIndex).getprice());
			saleList[loopIndex][3] = Integer.toString(NeaPwlhsh.ListaPwlisisPr.get(loopIndex).getquantitySell());
			saleList[loopIndex][4] = NeaPwlhsh.topoth1;
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			String date2 = null;
			date2 = sdf1.format(NeaPwlhsh.ListaPwlisisPr.get(loopIndex).getexpireDate());
			saleList[loopIndex][5] = date2;	    	
	    }
		
		return saleList;
	}
}
