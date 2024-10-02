package Services;
import Models.*;
import java.util.*;

public interface ReservationService {
       
	public void reserveRoom(Reservation reservation);
	public Reservation getReservation(String resId);
	public List<Reservation> getAllReservation();
	public List<Reservation> getAllReservationByHotelId(String HotelId);
	public List<Reservation> getAllReservationByUserId(String UserId);
	public void cancelReservation(Reservation reservation);
	
}
