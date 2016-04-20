package hotelReservation;

// The purpose of this class is to represent a single room

// Assefa T letta

// Date 04-26-2012

public class Room
{
	private int roomType;
	private int roomNum;
	private boolean isRoomvacant;
	

	
	// constants
	private final int NOROOMTYPE = 0;	// initial value  used to represent no preference of room type
	private final int SMOKINGROOMNONHAND=2;
	private final int NONSMOKINGROOMNONHANDI=1;
	private final int NONSMOKINGHANDICAPROOM=3;
	
	
	
	
	
	// Room
	//
	// The purpose of this method is to initialize all attributes of the room
	//
	// Input: none
	// Return: none
	
	public Room()
	{
		roomType=NOROOMTYPE;
		roomNum=0;
		isRoomvacant=true;
		
	}// end room constructor
	//
	//	Room
	//
	//	The purpose of this method is to initialize all attributes
	//
	//	Input:	roomType				This is a kind of room  the customer looking for
	//       :  roomNum;				initial value for room number
	//		 :	V						initial value for the room is vacant 
	//	Return:	none
	//
	
	public Room(int n, int rn, boolean V)
	{
		roomType=n;
		roomNum=rn;
		isRoomvacant=V;
	}// end room constructor
	
	
						// SET METHODS
	
	
	//	setroomType
	//
	//	the purpose of this method is to modify the roomType of the room
	//
	//	Input:	rT		the room type
	//	Return:	none
	//
	
	public void setRoomType(int rT)
	{
		roomType = rT;
	}// end setroomType
	
	// SET METHODS
	
		//
		//	setRoomNum
		//
		//	the purpose of this method is to modify the roomNum attribute
		//
		//	Input:	rNum		new value for roomNum
		//
		//	Return:	none
		//
		
		public void setRoomNum(int rNum)
		{
			roomNum = rNum;
		}// end setRoomNum
		
		
		
		//
		//	setIsRoomVacant
		//
		//	the purpose of this method is to modify the the status of the room availability attribute
		//
		//	Input:	Vc		new value for room availability 
		//
		//	Return:	none
		//
		
		public void setIsRoomVacant(boolean Vc)
		{
			isRoomvacant = Vc;
		}// end setIsRoomVacant
		
		
													// Get methods
		// getroomType
		//
		//	the purpose of this method is to return the roomType of the room
		//
		//	Input:	none		
		//	Return:	roomType
		//
		
		public int getRoomType()
		{
			return(roomType);
		}// end getroomType
		
		
		
		// getroomType
		//
		//	the purpose of this method is to return the roomNum of the room
		//
		//	Input:	none		
		//	Return:	roomNum
		//
				
		public int getRoomNum()
		{
			return(roomNum);
		}// end getroomType
		
		
		//
		//	getIsRoomVacant
		//
		//	the purpose of this method is to return the the status of the room availability 
		//
		//	Input:			
		//
		//	Return:	isRoomvacant
		//		
		public boolean setIsRoomVacant()
		{
			return(isRoomvacant); 
		}// end getIsRoomVacant
		
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
	        buff.append("Room number\t\t" + roomNum + "\r\n");
	        
	        
	        if (roomType==3)
	        {
	        buff.append("Type of Room  is non-smoking and handicaped acessible\t" );
	        }
	        else if(roomType==2)
	        {
	        	buff.append("Type of Room  is smoking but not hadicaped accessible \t" );
	        }
	        else if(roomType==1)
	        {
	        	buff.append("Type of Room  is non-smoking  and not hadicaped acessible \t" );
	        }
	        else
	        {
	        	buff.append("Invalid Room Type");
	        }
	         
	        
	        retStr = buff.toString();
	        
	        return(retStr);
	        
	    }// end toString

}
