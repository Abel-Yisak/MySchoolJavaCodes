package ServiceUSA;

public class ApplianceCustomer extends Customer
{

	public static String [] appliances={"Refrigerator","Stove","Microwave", "Dishwasher"};
	private String [] modelNumber =new String [10];
	private double replaceMentCost=0;
	public static double MinCost=400;
	public static double MaxCost=8000;
	private int MaxNumAppliance=10;
	public static double totalCost=0;
	private int num=0;
	private int numMode=0;
	public String [] CustomerAppliance= new String[10];
	
	
	public ApplianceCustomer(String name, String addr )
	{
		super(name,addr);
		
	}
	
	public boolean setModelNumber(String modeNum)
	
	{
		
		for(int i=0;i<modeNum.length();i++)
		
			if(!(Character.isDigit(modeNum.charAt(i)))||modeNum.length()!=7)//||(Character.isLetter(modeNum.charAt(i))))
				
			       {
				//checkModelletter(modeNum);	
					return false;
					}
	
		

				modelNumber[numMode++]=modeNum;
				return true;
		
	}
		public boolean checkModelletter(String modeNum)
		{
				  for(int j=0; j<modeNum.length();j++)
				  {
					  if(!(Character.isLetter(modeNum.charAt(j)))||modeNum.length()!=7)
							  {
					  
						  return false;
						 
							  }
				  }
				
					

						modelNumber[numMode++]=modeNum;
						
						return true;
					
			}
			
		
		
	
	
	
	public boolean setReplacementCost(double cost)
	
	{
		if(cost<MinCost||cost>MaxCost)
			return false;
		else
		{
		replaceMentCost+=cost;
		totalCost+=cost;
		return true;
		
		}
				
	}
	
	public boolean setAppliance(String appl)
	
	{
		for(int i=0; i<appliances.length;i++)
		{
			if((appl.equalsIgnoreCase(appliances[i]))&&( num<MaxNumAppliance))
			{
			//for(int j=0; j<num; j++)
		CustomerAppliance[num++] =appl;
			
				return true;
			}
		
		}
		return false;
}
	
	public static double gettotalCost()
	{
		return totalCost;
	}
	public int numActualAppliance()
	{
		return num;
	}
	public String toString()
	
	{
		String info="";
		
		info+="Our customers Are :\n"+ super.toString()+"\n Replacement cost For This Customer iS: "+replaceMentCost;
				
		return info;
	}
	
}
