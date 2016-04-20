package ServiceUSA;

public class HvacCustomer extends Customer
{
private String vedorName;
public static int numHvacUnit=0;


  public HvacCustomer(String name, String addr, String zipVendorName)
  {
	  super(name,addr);
	  this.vedorName= zipVendorName;
	  numHvacUnit++;
	  
  }


  public String getVendorsName()
  {
	  return vedorName;
  }

  public static int getHavcUnitRegistered()
  
  {
	  return numHvacUnit;
  }
  
  public String toString()
	
	{
		String info="";
		
		info+="Our customers Are :\n"+ super.toString()+"\n Vendor name for this Customer is: "+getVendorsName();
				
		return info;
	}
}
