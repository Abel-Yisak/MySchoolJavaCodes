package hotelReservation;

// The purpose of this class is to represent a single hotel
// Assefa T letta
// 04-28-12

public class Hotel
{
private Room theroom;
private int [] smokroomNonHandi;
private int [] nonSmokRoomNonHandi;
private int[] NonSmokinghadiRoom;
private int totalNumberOfrooms;


// constants

private final int TOTALSMOKINGHOTELROOMS=2;
private final int TOTALNONSMOKINGHOTELROOMS=5;
private final int TOTALHANDICAPEDROOMS=3;



//
//	Hotel
//
//	The purpose of this method is to initialize attributes
//
//	Input:	none
//	Return:	none
//

		public Hotel()
{
			theroom =new Room();
			smokroomNonHandi= new int[TOTALSMOKINGHOTELROOMS];
			nonSmokRoomNonHandi= new int[TOTALNONSMOKINGHOTELROOMS];
			NonSmokinghadiRoom=new int[TOTALHANDICAPEDROOMS];
			totalNumberOfrooms=0;
			
			
			
}

		
		
		//
		//	setSmokroomNonHandi
		//
		//	the purpose of this method is to input  smoking room
		//
		//	Input:	none	
		//	Return:	none
		//
		
		public void inputSmokroomNonHandi()
		{
			int n;
			int cntr;
			n=100;
					for(cntr=0; cntr<smokroomNonHandi.length; ++cntr)
						
					{
			 smokroomNonHandi[cntr]= n;
			 ++n;
					}

		}// end setSmokroomNonHandi
		

		//
		//	setNonSmokroomNonHandi
		//
		//	the purpose of this method is to input  the  non smoking room numbers
		//
		//	Input:	none	
		//	Return:	none
		//
		
		public void inputNonSmokroomNonHandi()
		{	int n;
			int cntr;
			n=102;
			
			for(cntr=0; cntr<nonSmokRoomNonHandi.length; ++cntr)
				
			{
				nonSmokRoomNonHandi[cntr]= n;
	 ++n;
			}

		}// end inputNonSmokroomNonHandi
		
		//
		//	setHandi
		//
		//	the purpose of this method is to input the  handicapped room numbers
		//
		//	Input:	none	 
		//	Return:	none
		//
		
		public void inputHandiRoom()
		{
			int n;
			int cntr;
			n=105;
			
			
			for(cntr=0; cntr<NonSmokinghadiRoom.length; ++cntr)
				
			{
				NonSmokinghadiRoom[cntr]= n;
	 ++n;
			}
		}// end inputHandiRoom
		
		//
		//	getSmokingRoomNumList
		//
		//	the purpose of this method is to return a copy of the smoking room number list
		//
		//	Input:	none
		//	REturn:	smokroomNonHandi
		//
		
		public int[] getSmokingRoomNumList()
		{
			return(smokroomNonHandi);
		}// end getSmokingRoomNumList
		//
		//	getNonSmokingRoomNumList
		//
		//	the purpose of this method is to return a copy of the none smoking room number list
		//
		//	Input:	none
		//	REturn:	smokroomNonHandi
		//
		
		public int[] getNonSmokingRoomNumList()
		{
			return(nonSmokRoomNonHandi);
		}// end getNonSmokingRoomNumList
		
		//
		//	getHandiRoomNumList
		//
		//	the purpose of this method is to return a copy of the handicapped room number list
		//
		//	Input:	none
		//	REturn:	NonSmokinghadiRoom
		//
		
		public int[] getHandiRoomNumList()
		{
			return(NonSmokinghadiRoom);
		}// end getHandiRoomNumList
		
		//
		//	getSmokingRoomNumListLength
		//
		//	The purpose of this method is to return the length
		//	of the the number of smoking room list.
		//
		//	Input:	none
		//	Return:	len			length of the list
		//
		
		public int getSmokingRoomNumListLength()
		{
			int len;
			len  = smokroomNonHandi.length;
			return(len);
			
		}// end getSmokingRoomNumListLength

		//
		//	getNonSmokingRoomNumListLength
		//
		//	The purpose of this method is to return the length
		//	of the the number of none smoking room list.
		//
		//	Input:	none
		//	Return:	len			length of the list
		//
		
		public int getNonSmokingRoomNumListLength()
		{
			int len;
			len  = nonSmokRoomNonHandi.length;
			return(len);
			
		}// end getNonSmokingRoomNumListLength
		
		
		//
		//	getHandiRoomNumListLength
		//
		//	The purpose of this method is to return the length
		//	of the the number of handicapped room list.
		//
		//	Input:	none
		//	Return:	len			length of the list
		//
		
		public int getHandiRoomNumListLength()
		{
			int len;
			len  = NonSmokinghadiRoom.length;
			return(len);
			
		}// end getHandiRoomNumListLength
		
		//
		//	getOneSmokingRoom
		//
		//	the purpose of this method is to return one smoking room from
		//	the list
		//
		//	Input:		index		the index of the smoking room in the list
		//	Return:		SRoom			the smoking room requested
		//
		
		public int getOneSmokingRoom(int index )
		{
			
			int n;
			n=0;
			
			if ((index >= 0) && (index < smokroomNonHandi.length))
			{
				n= smokroomNonHandi[index];
			}
			
			return(n);
			
		}// end getOneSmokingRoom
		
		
		
		//
		//	getOneNonSmokingRoom
		//
		//	the purpose of this method is to return one  none smoking room from
		//	the list
		//
		//	Input:		index		the index of the  none smoking room in the list
		//	Return:		NSRoom			the  none smoking room requested
		//
		
		
		
		public int getOneNonSmokingRoom(int index )
		{
			int n;
			n=-1;
			
			if ((index >= 0) && (index < nonSmokRoomNonHandi.length))
			{
				n= nonSmokRoomNonHandi[index];
			}
			return(n);
		}
		
		//
		//	getOneHandiRoom
		//
		//	the purpose of this method is to return one  handicapped room from
		//	the list
		//
		//	Input:		index		the index of the  handicapped room in the list
		//	Return:		HRoom			the  handicapped room requested
		//	
		public int getOneHandiRoom(int index )
		{
			int n=-1;
			
			if ((index >= 0) && (index < NonSmokinghadiRoom.length))
			{
				n=  NonSmokinghadiRoom[index];
			}
			return(n);
		}
		
		
		
		
		
		
		//
		//	toString
		//
		//	the purpose of this method is to create a string that includes
		//	all of the attributes in this class
		//
		//	Input:	none
		//	Return:	retStr		the complete string
		//
		
		public String toString()
		{
			int cntr;
			StringBuffer buff;
			int smokRoom;
			int nonSmokRoom;
			int handiRoom;
			String retStr;
			
			buff = new StringBuffer();
			
			for (cntr = 0; cntr < smokroomNonHandi.length;++cntr)
			{
				smokRoom = smokroomNonHandi[cntr];
				buff.append(smokRoom + "\r\n");
				
			}// end for Smoking room
			
			for (cntr = 0; cntr < nonSmokRoomNonHandi.length;++cntr)
			{
				nonSmokRoom = smokroomNonHandi[cntr];
				buff.append(nonSmokRoom + "\r\n");
				
			}// end for  none Smoking room
			
			for (cntr = 0; cntr < NonSmokinghadiRoom.length;++cntr)
			{
				handiRoom = NonSmokinghadiRoom[cntr];
				buff.append(handiRoom + "\r\n");
				
			}// end for  Handicapped room
			
			retStr = buff.toString();
			
			return(retStr);
		}// end toString	
		
		
		
		//
		//	getTotalHotelRoom
		//
		//	The purpose of this method is to return a copy of total number of rooms in the hotel
		//	of the the number of handicapped room list.
		//
		//	Input:	none
		//	Return:	len			length of the list
		//
		
		public int getTotalHotelRoom()
		{
			
			return(totalNumberOfrooms);
			
		}// end getTotalHotelRoom=TOTALSMOKINGHOTELROOMS+TOTALNONSMOKINGHOTELROOMS+TOTALHANDICAPEDROOMS
		public void totalHotelRoom()
		{
			totalNumberOfrooms= TOTALSMOKINGHOTELROOMS+TOTALNONSMOKINGHOTELROOMS+TOTALHANDICAPEDROOMS;
		}
		
		
		
		// TotalHotelBedRoom= TOTALSMOKINGHOTELROOMS+TOTALNONSMOKINGHOTELROOMS+TOTALHANDICAPEDROOMS
		// Where do i get the hotel numbers to put in
		// Hotel number will be one of the parameters to be in the reservation process
		
		// inputHotelInfo
		
		// The purpose of this method is to input hotel room number
		
		// input:none
		//return:none
		
		
		public void vacahotelRoom()
		{
			int cntr;
			for (cntr=0; cntr<smokroomNonHandi.length; ++cntr);
					{
						smokroomNonHandi[cntr]=0;
					}
		}
		
		
}// end Hotel
