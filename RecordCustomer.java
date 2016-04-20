package ServiceUSA;
import javax.swing.*;
public class RecordCustomer
{
	static final  int MAXRECORD=100;

	static int accounNumber=100;
	public static void main(String[] args)
	{
		
     Customer [] newCustomer= new Customer[MAXRECORD];
     int num =0;
     boolean quit =false;
     
     do
     {
    	 switch (menu()) 
    	 {
			case 1:  newCustomer [num] = addCustomer (); 
			num++;
			
			break;
			case 2:returningCustomer(newCustomer, num);
			break;
			case 3:  outPut(newCustomer, num);
            break;
			case 4:  numHVACUNIT(); 
			break;
			case 5:  calTotalApplianceCost();
			break;
			default:  quit = true;
		}
} while (!quit&&num<MAXRECORD);
    	 
     
     
	}// end of main
	
	
   
     
     public static Customer addCustomer ()
     {
    	 boolean check;
    	 
    	 Customer newCust= new Customer ();
    	 
    	 String name=JOptionPane.showInputDialog("Enter  Customer name");
    		
    	 String address=JOptionPane.showInputDialog("Enter Customer Address in the form of :\n 10-Court House-Sterling-Va- 20165");
    	 int  choice=Integer.parseInt(JOptionPane.showInputDialog("What Kind Of Customer Is SHE/HE ? \n 1.Appliance Customer or\n 2.HVAC Customer"));
         
         switch(choice)
         
         {
         case 1:
        	newCust= new ApplianceCustomer( name,  address);
         boolean appl;
         int numAppliance=0;
         do
         {
        	 String applianceMenu="";
        	if( ApplianceCustomer.appliances.length!=5)
        	 for(int i=0;i<ApplianceCustomer.appliances.length; i++)
        	 {
        		 applianceMenu+=ApplianceCustomer.appliances[i]+"\n";
        	 }
        	 
        	appl= ((ApplianceCustomer)newCust).setAppliance(JOptionPane.showInputDialog("Enter customer Appliance choice \n "+applianceMenu));
            if(appl)
            {
            	
            	String prompt;
            	 do
            	 {
            		 prompt=JOptionPane.showInputDialog("Enter 7_Character Model Number Plaese All Have to be Digits Or ALL Have to be Letters");
            	check=((ApplianceCustomer)newCust).setModelNumber(prompt);
            	 
            	 if(!check)
            	 {
            		 check=((ApplianceCustomer)newCust).checkModelletter(prompt); 
            		 	 
            		 
            	 }
            	 boolean cost;
            	 if(check)
            	 {
            		 
                 do
                       {
                cost=((ApplianceCustomer)newCust).setReplacementCost(Double.parseDouble(JOptionPane.showInputDialog("Enter Cost of Appliance B/n $ 400 and $ 8000")));
                	 
                         }while(!cost);
            	 }
            	 
            	 } while(!check);
            	
            }// if app
         
            
         
         }while(!appl&&numAppliance<10);
         
         break;
         
         case 2:
        	 // HVAC
        	 
        	 String vendorname= JOptionPane.showInputDialog("Enter Vendor Name");
        	newCust= new HvacCustomer( name,  address,  vendorname);
        	 break;
        
         }// Switch end of Appliance and HVAC choice
         
    	
    	
    			newCust.setaccountNum(accounNumber++);
    	 do
         {
    		
    		 check=newCust.setTelephoneNum(JOptionPane.showInputDialog("Enter Telephon Number"));  
        	 
         }while(!check);
         
         do
         {
        	 check=newCust.setZipCode(JOptionPane.showInputDialog("Enter Zip Code")); 
         }while(!check);
         
       
         
         return newCust;
     
     
         
     }
	public static void returningCustomer(Customer []newCustomer, int num)
	{
		
		
		 String telnum;
		 boolean found=false;
		 int index=0; ;
		 JOptionPane.showMessageDialog(null,num);
       
   		 telnum=JOptionPane.showInputDialog("Enter Telephon Number for returning customers"); 
   		 
   		 for(int i=0; i<num;i++)
   		 {
   			
   				 if(telnum.equalsIgnoreCase(newCustomer[i].getTel()))
   				 
   			 {
   				 found =true;
   				 index=i;
   				 
   			 }
   		 }
   		 
   		 if(found)
   		 {
   		boolean answer=JOptionPane.showConfirmDialog(null,"We have This customer do you want to add appliance?")==JOptionPane.YES_OPTION;
   		boolean applianc;	 
   		
   		if(answer && ((ApplianceCustomer)newCustomer[index]).numActualAppliance()<10 )
   			 {
   			
   			String applianceMenu="";
       	 for(int i=0;i<ApplianceCustomer.appliances.length; i++)
       	 {
       		 applianceMenu+=ApplianceCustomer.appliances[i]+"\n"+"";
       	 }
   			do
   			{
   			applianc= ((ApplianceCustomer)newCustomer[index]).setAppliance(JOptionPane.showInputDialog("Enter appliance:\n"+applianceMenu));
   			}while(!applianc);
   			 }
   			 else if(!answer)
   			 {
   				 JOptionPane.showMessageDialog(null, " Sorry Telephon number format is not correct");
   				 System.exit(0);
   			 }
   		
   			 else
   				 
   			 {
   				JOptionPane.showMessageDialog(null, " Sorry This Customer has alredy 10 appliance");
   				System.exit(0);
   			 }
   		 }
	}
	public static  int menu()
     {
    	int choice= Integer.parseInt(JOptionPane.showInputDialog("Enter Your  Chioce  \n 1.New Customer   \n 2. Returning Customer\n 3. List of all Current Customer" +
    			 "\n 4. Number Of HVAC Units Registerd" + "\n 5.Total Replacement Cost "+   "\n 6. Quit" ));
     return choice;
     }
	
	public static void outPut(Customer[] newCustomer,int num)
	
	{   
		String info="" ;
		
		for(int i=0; i<num;i++)
	     {
	        info+=newCustomer[i].toString()+"\n\n";
	     }
		
		JOptionPane.showMessageDialog(null,info);
	}
	
	
	public static void numHVACUNIT()
	
	{
		JOptionPane.showMessageDialog(null,"Number of HVAC UNIT IS"+ HvacCustomer.getHavcUnitRegistered());
		
	}
public static void calTotalApplianceCost()
	
	{
	JOptionPane.showMessageDialog(null, "Total replacement cost of all appliances: $"+ApplianceCustomer.gettotalCost());
		
	}
	
}
