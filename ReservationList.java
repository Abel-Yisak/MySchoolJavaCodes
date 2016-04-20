package hotelReservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



//
//ReservationList
//
/// The purpose of this class is to represent  a list of customers  in hotel reservation

//
//Author:		Assefa T letta
//Date:		4-28-12


public class ReservationList
{
	// attributes
		private Reservation[] resertheList;
		private Hotel theHotel;
		
		//
		//	ReservationList
		//
		//	The purpose of this method is to initialize attributes
		//
		//	Input:	none
		//	Return:	none
		//
		
		public ReservationList()
		{
			// create an empty list
			resertheList = new Reservation[theHotel.getTotalHotelRoom()];
			
			
			// To put Customer information we need more array because each customer has many attributes
				
		}// end ReservationList constructor
		
		
		//
		//	setresertheList
		//
		//	the purpose of this method is to modify the list of reservation
		//
		//	Input:	rst		the new list of reservation
		//	Return:	none
		//
		
		public void setresertheList(Reservation[] rst)
		{
			resertheList = rst;

		}// end setresertheList
		
		
		
		//
		//	getresertheList
		//
		//	the purpose of this method is to return a copy of  the reservation list
		//
		//	Input:	none	
		//	Return:	resertheList       the  reservation list
		//
		
		public Reservation [] getresertheList()
		{
			return(resertheList);

		}// end getresertheList
		
		
		//
		//	getresertheListLength
		//
		//	The purpose of this method is to return the length
		//	of the reservation list.
		//
		//	Input:	none
		//	Return:	length		length of the list
		//
		
		// The reservation length could be hote room, the reservation fields
		public int getresertheListLength()
		{
			int length	;
			length	  = resertheList.length;
			return(length	);
			
		}// end getListLength

		//
		//	getOneReservation
		//	the purpose of this method is to return one reservation from
		//	the list
		//
		//	Input:		index		the index of the reservation in the list
		//	Return:		res			the  requested reservation
		//
		
		public Reservation getOneReservation(int index )
		{
			Reservation res;
			res = new Reservation();
			
			if ((index >= 0) && (index < resertheList.length))
			{
				res = resertheList[index];
			}
			return(res);
		}// end getOneReservation

		
		
		//
		//	toString
		//
		//	the purpose of this method is to create a string that includes
		//	all of the attributes in this class
		//
		//	Input:	none
		//	Return:	retStr		the complete string
		public String toString()
		{
			int cntr;
			StringBuffer buff;
			String resvStr;
			String retStr;
			
			buff = new StringBuffer();
			
			for (cntr = 0; cntr < resertheList.length;++cntr)
			{
				resvStr = resertheList[cntr].toString();
				buff.append(resvStr + "\r\n");
				
			}// end for each candidate
			
			retStr = buff.toString();
			
			return(retStr);
		}// end toString
		
		
		
		//
		//	inputreservation
		//
		//	the purpose of this method is to input all reservation from a file
		//	from a file
		//
		//	Input:	fn		the name of the file from which to input reservations
		//	Return:	none
		//
		
		public void inputreservation(String fn)
		{
			FileReader inputStream;
		    BufferedReader  inputReader;
		    Reservation res;
		    String fname;
		    String lname;
		    String phNum;
		    String smokStatus;
		    String handiStatus;
		    String payMethod;
		    
		    
		    try
		    {
				// try to fill all reservations
	            inputStream = new FileReader(fn);
	            inputReader = new BufferedReader(inputStream);
	 
	            // read candidate names from the file one at a time until
	            // the end of the file is reached (null)
	            do
	            {
	            	// create a new reservation object
	            	res = new Reservation ( );
	            	
	            	//read a reservation for one customer
	            	fname = inputReader.readLine();
	            	if(fname!=null)
	            	{
	            		res.setFName(fname);
	            	}
	            	lname = inputReader.readLine();
	            	if(lname!=null)
	            	{
	            		res.setLName(lname);
	            	}
	            	phNum = inputReader.readLine();
	            	if(phNum!=null)
	            	{
	            		res.setphone(phNum);
	            	}
	            	
	            	smokStatus=inputReader.readLine();
	            	if(smokStatus!=null)
	            	{
	            		res.setSmokingPref(smokStatus);
	            	}
	            	
	            	handiStatus=inputReader.readLine();
	            	if(handiStatus!=null)
	            	{
	       
	            		res.setHandPref(handiStatus);
	            		
	            	}
	            	payMethod=inputReader.readLine();
	            	if(payMethod!=null)
	            	{
	            		res.setpaymethod(payMethod);
	            	}
	            	
	            	expandReservationList(res);
	            }while (payMethod != null);
	            
	    		// close the file 
	    		inputReader.close();
	  	
		    }
	        catch (FileNotFoundException e)
	        {
	        	System.out.println("FileNotFoundException");
	        }
	        catch (IOException e)
	        {
	        	System.out.println("IOException");
	        }
	        catch (Exception e)
	        {
	        	System.out.println("Unexpected Exception");
	        }
		
		}// end inputreservation
		
		
		
		public void expandReservationList(Reservation reseLis)
		{
			int cntr;
			Reservation[] tmpList;
			int expandedSize;
			
			expandedSize = resertheList.length + 1;
			
			// create the temporary list
			tmpList = new Reservation[expandedSize];
			
			
			for (cntr =0; cntr < resertheList.length;++cntr)
			{
				tmpList[cntr] = resertheList[cntr];
			}// end for each existing reservation
			
			// create a new object for the new reservation to be filled
			tmpList[resertheList.length] = reseLis;
			
			// assign the temporary list to be the actual reservation list
			resertheList = tmpList;
		
		}// end expandCandidateList
		
		//roomAssing
		
		// The purpose of this method is to assign room for customer
		// Input: name   the name of the customer
		
		//Return: none
		public void roomAssing(String name)
		{
			int index;
			String n;
			
			
			
			// find the name of the customer in the list of reservation
			index= findcustomername(name);
			if((index>=0)&&(index<resertheList.length))
			{   
				n=resertheList[index].getSmokingPre();
				if(n.equalsIgnoreCase("Smoking"))
				{
					theHotel.getOneSmokingRoom(index);
				}
				
				else
				{
					theHotel.getOneNonSmokingRoom(index);
				}
			}
		}
			
			
			public void handiRoomAssing(String name)
			
			{
				
				int index;
				String n;
				
				index= findcustomername(name);
				n=resertheList[index].getHandiPre();
				
				if(n.equalsIgnoreCase("YES"))
				{
					theHotel.getOneHandiRoom(index);
				}
				
				else
				{
					theHotel.getOneHandiRoom(index);
				}
			
			}
			
			// findcustomername
			
			// The purpose of this method is to find the name of customer
			
			//input: fname   customer  first name
			//Return: none
		
			public int findcustomername(String fname)
			{
				int num;
		        int cntr;
		        String n;
		              
		        num = -1;		
		              
		        for (cntr = 0; cntr < resertheList.length;++cntr)
		        {
		            
		            n = resertheList[cntr].getFName();
		            
		            if (n.equalsIgnoreCase(fname) == true)
		            {
		                
		                num = cntr;
		                break;
		            }
		            
		        }
		        
		        return(num);

			}
			
			
			// captureRoomNum
			// The purpose of this method is to capture room  smoking number assignment
			// input: none
			//Return: rooms   list of Smoking rooms
			
			
			public int[] captureRoomNum()
			
			{
				int [] rooms;
				int cntr;
				rooms= new int[0];
				// array that will hold  assigned rooms 
				int n=theHotel.getSmokingRoomNumListLength();
				for (cntr=0; cntr<n;++cntr)
				{
					rooms[cntr]=theHotel.getOneSmokingRoom(cntr);
				}
				return(rooms);
			}
			
			// captureRoomNum
			// The purpose of this method is to capture room  smoking number assignment
			// input: none
			//Return: rooms   list of Smoking rooms
						
						
		public String[] captureCustomername()
						
		{
			String [] names;
			int cntr;
			names= new String [0];
			// array that will hold  assined customers name
			int n=resertheList.length;
			for (cntr=0; cntr<n;++cntr)
			{
				names[cntr]=resertheList[cntr].getFName(); 
			}
			return(names);
			}
						
			
}// end ReservationList
