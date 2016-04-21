package hotelReservation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// The purpose of this class is to handle the reservation process
//Assefa T letta
//04-28-12

public class RservationSystem
{

	// attributes
		private ReservationList  theReservation;	// all  customer reservation
			
		
		//
		//	RservationSystem
		//
		//	The purpose of this method is to initialize all attributes
		//
		//	Input:	none
		//	Return:	none
		//
		
		public RservationSystem()
		{
			
			
			theReservation = new ReservationList ();
		
			
		}// end RservationSystem constructor
		
		//
		//	setreservation
		//
		//	The purpose of this method is to modify the  reservation list 
		//
		//	Input:	res		reservation list
		//	REturn:	none
		//
		public void setReservation(ReservationList res)
		{
			theReservation = res;
		}// end setReservation
		
		// getReservation
		//
		// The purpose of this method is to return a copy of the reservation list
		//
		//Input: none
		//Return: reservation
		
		public ReservationList getReservation()
		{
			return(theReservation);
		}
		
		// toString
		
		// The purpose of this method is to create a string holding all attribute
		
		//Input: none
		//Return: res
		
		public String toString()
		{
			String res;
			StringBuffer buff;
			String resList;
			
			buff = new StringBuffer();
			
			// add the reservation list to the string
			resList=theReservation.toString();
			buff.append("Room Assignment List\r\n");
			buff.append(resList+ "\r\n");
			res= buff.toString();
			
			return(res);
		}// end tostring
		
		
		
		
		//	saveResults
	    //
	    //	The purpose of this method is to save the reservation result from the reservation
	    //	to a file.  
	    //
	    //	Input:	fileName		the name of the file in which to save the reservation result
	    //	Return:	none
	    //
	    
	    public void saveResults(String fileName)
	    {
			FileOutputStream outputStream;
		    PrintWriter  outputWriter;
		    
		    try
		    {
		    	// open the file for writing
	      		outputStream = new FileOutputStream(fileName);
	     		outputWriter = new PrintWriter(outputStream);
	           
	    		// close the file now that we have saved the results
	    		outputWriter.close();
	  	
		    }
	        catch (FileNotFoundException e)
	        {
	        	System.out.println("FileNotFoundException");
	        }
	        catch (Exception e)
	        {
	        	System.out.println("Unexpected Exception");
	        }   	
	    }// end saveResults

	    
		//
	    //	runReservation
	    //
	    //	the purpose of this method is to run an the reservation process
	    //
	    //	Input:	filename	the file name holding the reservation list
	    //			roomAssignmentFile  the file name in which the reservation
	    //	Return:	none
	    //
	    
	    public void runReservation(String filename, String roomAssignmentFile)
	    {
	       
	        String[] reservation;
	        
	       
	        theReservation.inputreservation(filename);
	        
	        
	        reservation = theReservation.captureCustomername();
	
	            
	     // save the results to assignment file
	        saveResults(roomAssignmentFile);
	        
	    } // end run reservation

		
		
		
		
}//RservationSystem
