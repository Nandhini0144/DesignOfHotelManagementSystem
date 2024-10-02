package ServicesImplementation;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import Services.*;

public class ReservationServiceImplementation implements ReservationService{
	 Map<String,Reservation> reservations;
	 public ReservationServiceImplementation()
	 {
		 this.reservations=new ConcurrentHashMap<>();
	 }
	static ReservationServiceImplementation instance;
	 public static ReservationServiceImplementation getInstance()
	 {
		 if(instance==null)
		 {
			 instance=new ReservationServiceImplementation();
		 }
		 return instance;
	 }
	@Override
	public void reserveRoom(Reservation reservation) {
		Hotel hotel=reservation.getHotel();
		List<Room> rooms=reservation.getRooms();
		boolean flag=true;
		for(Room r:rooms)
		{
			try {
				RoomServiceImplementations.getInstance(hotel).bookRoom(r);
			} catch (Exception e) {
				flag=false;
				e.printStackTrace();
			}
		}
		if(flag)
		{
			System.out.println("Rooms reserved");
			reservations.put(reservation.getId(), reservation);
			reservation.setStatus(ReservationStatus.COMPLETED);
		}
		
	}
	
	@Override
	public Reservation getReservation(String resId) {
		
		return reservations.get(resId);
	}
	
	@Override
	public List<Reservation> getAllReservation() {
		List<Reservation> res=new ArrayList<>();
		for(Map.Entry<String,Reservation> ele:reservations.entrySet())
		{
			res.add(ele.getValue());
		}
		return res;
	}
	@Override
	public List<Reservation> getAllReservationByHotelId(String HotelId) {
		
		List<Reservation> res=new ArrayList<>();
		for(Map.Entry<String,Reservation> ele:reservations.entrySet())
		{
			if(ele.getValue().getHotel().getId().equals(HotelId))
				res.add(ele.getValue());
		}
		return res;
		
	}
	
	@Override
	public List<Reservation> getAllReservationByUserId(String UserId) {
		List<Reservation> res=new ArrayList<>();
		System.out.println(reservations.size());
		for(Map.Entry<String,Reservation> ele:reservations.entrySet())
		{
			System.out.println(ele.getValue().getUser().getId());
			if(ele.getValue().getUser().getId().equals(UserId))
				res.add(ele.getValue());
		}
		return res;
	}

	@Override
	public void cancelReservation(Reservation reservation) {
		
		try {
			RoomServiceImplementations.getInstance(reservation.getHotel()).cancelRoom(reservation.getRooms());
			reservation.setStatus(ReservationStatus.CANCELED);
			System.out.println("Reservation cancelled");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
