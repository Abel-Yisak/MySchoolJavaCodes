package ServiceUSA;

public class Customer
{
	private String firstName;// Customer name
    private String address;// Customer address
    private String phoneNumber;
    private static int numCustomer=0;
    private String arrangedPhoneNumber="";
    private String zipDigit;
    private int accountNum;
    
    
    public Customer (String name, String addr)
    {
    	
    	this.firstName=name;
    	this.address=addr;
    	//numCustomer++;
    }
    
    
    public Customer()
    {
    	numCustomer++;
    }
    public void setFirstName(String fname)

    {
  
     firstName=fname;
    }
    
    public void setAddress(String add)

    {
  
     address=add;
    }
    
    public boolean setTelephoneNum(String Tel)

    {
    	for(int i=0;i<Tel.length();i++)
    	{
    		if(!Character.isDigit(Tel.charAt(i))||(Tel.length()!=10))
    			return false;
    	}
    	
    	
  
    	phoneNumber=Tel;
    	arrangeTelNumber(phoneNumber);
    	return true;
    }
    
    public boolean setZipCode(String zip)
    
    {
    	for( int i=0; i<zip.length();i++)
    	{
    		
    		if(!Character.isDigit(zip.charAt(i))||(zip.length()!=5))
    			return false;
    	}
    	
    	zipDigit=zip;
    	return true;
    }
    public String arrangeTelNumber(String telnumber)
    {
    	
    	arrangedPhoneNumber+=(telnumber.substring(0, 3));
    	arrangedPhoneNumber+="-";
    	arrangedPhoneNumber+=(telnumber.substring(3,6));
    	arrangedPhoneNumber+="-";
    	arrangedPhoneNumber+=(telnumber.substring(6,10));
    	
    	return arrangedPhoneNumber;
    }
    
    public String getTelNumber()
    {
    	return arrangedPhoneNumber;
    }
    
    public String getTel()
    {
    	return phoneNumber;
    }
    public String getZipCode()
    {
    	return zipDigit;
    }
    
    public String getfirstName()
    {
    	return firstName;
    }
    
    public String getaddress()
    {
    	return address;
    }
    public void setaccountNum( int account)
    {
    	 accountNum=account;
    }
    public int getaccountNum()
    {
    	return accountNum;
    }
    
    public static int getNumCustomer()
    {
    	return numCustomer;
    }
    public String toString()
    
    {
    	String info=" ";
    	
    	info+= "List Of All Customers:  "+firstName+"\n" + "Customer Address Is: "+address+"\n"+
    	 "Customer Tel Number IS:"+getTelNumber() +"\n"+ "Customer Zip Code IS:  "+getZipCode()+"\n"+
    	" Customer Account Number Is:  "+ getaccountNum();
    	
    	return info;
    			
    }
    
}
