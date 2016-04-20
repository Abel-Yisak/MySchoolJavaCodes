package hotelReservation;

// The purpose of this class is to represent a single customer reservation

//Assefa T letta
//04-28-12

public class Reservation
{
private Hotel thehotel;	
private String customerFName;
private String customerLName;
private String customerPhoneNum;
private String smokingPrefer;
private String handiPrefer;
private String payMethod;
private String[] res;



//
//	Reservation
//
//	The purpose of this method is to initialize all attributes
//
//	Input:	none
//	Return:	none
//

public Reservation()

{	thehotel= new Hotel();
	customerFName = "NO NAME YET";
	customerLName = "NO NAME YET";
	customerPhoneNum="No number Yet";
	payMethod="Not Yet";
	smokingPrefer="Not Yet";
	handiPrefer= "No";
	
}// end Reservation constructor



//
//	Reservation
//
//	The purpose of this method is to initialize all attributes
//
//	Input:	fname			first name for the customer
//		 :  lname           last name for the customer	
//       :  phonNum         customer phone number
//       :  payMet          customer payment method
//       :  Smok            customer smoking preference
//       :  handi           customer handicap status
//	Return:	none
//

public Reservation(String fname, String lname, String phonNum , String payMet, String Smok, String handi )
{
	customerFName = fname;
	customerLName = lname;
	customerPhoneNum=phonNum;
	payMethod=payMet;
	smokingPrefer=Smok;
	handiPrefer=handi;
}// end reservation overload constructor

//
//	setFName
//
//	the purpose of this method is to modify the  first name of the customer
//
//	Input:	fname			the first name of  new customer
//	Return:	none
//

public void setFName(String name)
{
	customerFName = name;
}// end setLName

//
//setLName
//
//the purpose of this method is to modify the  last name of the customer
//
//Input:	lname			the last name of  new customer
//Return:	none
//

public void setLName(String lname)
{
	customerLName = lname;
}// end setLNam


//
//setphone
//
//the purpose of this method is to modify the  phone number  of the customer
//
//Input:	phonenum			the phone number for the customer
//Return:	none
//

public void setphone(String phonenum)
{
	customerPhoneNum = phonenum;
}// end setphone



//
//setpaymethod
//
//the purpose of this method is to modify the  paymethod  of the customer
//
//Input:	paym			customer pay method
//Return:	none
//

public void setpaymethod(String paym)
{
	payMethod = paym;
}// end setpaymethod


//
//setSmokingPref
//
//the purpose of this method is to modify the  smoking preference of the customer
//
//Input:	smokPre			customer smoking preference 
//Return:	none
//

public void setSmokingPref(String smokPre)
{
	smokingPrefer = smokPre;
}// end setSmokingPref


//
//setHandPref
//
//the purpose of this method is to modify the  handicape  preference of the customer
//
//Input:	handiPre			customer handicap preference 
//Return:	none
//

public void setHandPref(String handiPre)
{
	handiPrefer = handiPre;
}// end setHandPref

//
//	getFName
//
//	the purpose of this method is to return a copy of the first name attribute
//
//	Input:	none
//	return:	customerFName
//

public String getFName( )
{
	return(customerFName);
}//end getFName

//
//getLName
//
//the purpose of this method is to return a copy of the last name attribute
//
//Input:	none
//return:	customerLName
//

public String getLName( )
{
return(customerLName);
}//end getLName


//
//getPhonNum
//
//the purpose of this method is to return a copy of the phone number 
//
//Input:	none
//return:	customerLName
//

public String getPhonNum( )
{
return(customerPhoneNum);
}//end getPhonNum


//getSmokingPre
//
//the purpose of this method is to return a copy of customer smoking preference
//
//Input:	none
//return:	smokingPrefer
//

public String getSmokingPre( )
{
return(smokingPrefer);
}//end getSmokingPre

//getHandiPre
//
//the purpose of this method is to return a copy of customer Handicapped preference
//
//Input:	none
//return:	getHandiPre
//

public String getHandiPre( )
{
return(handiPrefer);
}//end getHandiPre


//getPayMethod
//
//the purpose of this method is to return a copy of customer's payment method 
//
//Input:	none
//return:	payMethod
//

public String getPayMethod( )
{
return(payMethod);
}//end getPayMethod


//
//	toString
//
//	the purpose of this method is to create a string including
//	all attributes in the class.
//
//	Input:	none
//	Return:	retStr		the complete string to print 
//
public String toString()
{
    String retStr;
    StringBuffer buff;
    
    buff = new StringBuffer();
    
    buff.append("Customer first name \t\t" + customerFName + "\r\n");
    buff.append("Customer last name\t\t" + customerLName + "\r\n");
    buff.append(" Customer phone number \t\t" + customerPhoneNum + "\r\n");
    buff.append(" Customer Smoking preference\t\t" + smokingPrefer + "\r\n");
    buff.append(" Customer Handicapped preference\t\t" + handiPrefer + "\r\n");
    buff.append(" Customer payment method\t\t" + payMethod + "\r\n");
    
    retStr = buff.toString();
    
    return(retStr);
    
}// end toString


//Vacant room Check?
// Customer Assignment to Hotel??
// 




}// end Reservation
