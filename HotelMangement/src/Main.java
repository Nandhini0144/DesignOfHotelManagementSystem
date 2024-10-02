import Models.*;

import java.time.LocalDate;
import java.util.*;
import ServicesImplementation.*;
public class Main {
	  public static HotelServiceImplementation hotelInstance()
	  {
		  HotelServiceImplementation instance=HotelServiceImplementation.getInstance();
		  return instance;
	  }
	  public static RoomServiceImplementations roomInstance(Hotel hotel)
	  {
		  RoomServiceImplementations instance=RoomServiceImplementations.getInstance(hotel);
		  return instance;
	  }
	  public static UserServiceImplementation userInstance()
	  {
		  UserServiceImplementation instance=UserServiceImplementation.getInstance();
		  return instance;
	  }
	  public static ReservationServiceImplementation reservationInstance()
	  {
		  ReservationServiceImplementation instance=ReservationServiceImplementation.getInstance();
		  return instance;
	  }

      public static void main(String[] args) throws Exception
      {
    	  HotelServiceImplementation hotelInstance=hotelInstance();
   
    	  Address address=new Address("1","12th street","Chennipalayam","Chennai");
    	  Hotel hotel=new Hotel("12H01","Poorva",address);
    	  
    	  hotelInstance.createHotel(hotel);
    	  
     	  RoomServiceImplementations roomInstance=roomInstance(hotel);
    	  Room room1 =new Room("1",hotel.getId(),RoomType.DOUBLE,3,315);
    	  Room room2=new Room("2",hotel.getId(),RoomType.SINGLE,3,318);
    	  
    	  roomInstance.createRoom(room1);
    	  roomInstance.createRoom(room2);
    	  
    	  User user=new User("1","Raja","raja@gmail.com",993424243);
    	  
    	  ReservationServiceImplementation reservationInstance=ReservationServiceImplementation.getInstance();
    	  List<Room> lst=new ArrayList<>();
    	  lst.add(room1);
    	  Reservation reservation=new Reservation("12R01",user,hotel,lst,LocalDate.of(2024, 10, 1),LocalDate.of(2024, 11,5));
    	  reservationInstance.reserveRoom(reservation);
    	  
//    	  reservationInstance.reserveRoom(reservation);//error because the room specified here has already reserved
    	  
//    	  reservationInstance.cancelReservation(reservation);
    	  
//    	  reservationInstance.reserveRoom(reservation);
    	  
    	  List<Reservation> res=reservationInstance.getAllReservationByUserId("1");
    	  System.out.println(res.size());
    	  for(Reservation r:res)
    		  System.out.println(r.getId());
    	  
    	  
    	  
      }
}
