package Models;
import java.util.*;
import java.time.*;
public class Reservation {
       private String id;
       private User user;
       private Hotel hotel;
       private List<Room> rooms;
       private ReservationStatus status; 
       private LocalDate startTime;
       private LocalDate endTime;
       public Reservation(String id,User user,Hotel hotel,List<Room> rooms,LocalDate st,LocalDate en)
       {
    	   this.id=id;
    	   this.user=user;
    	   this.hotel=hotel;
    	   this.rooms=rooms;
    	   this.startTime=st;
    	   this.endTime=en;
       }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public ReservationStatus getStatus() {
		return status;
	}
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	public LocalDate getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}
	public LocalDate getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}   
	
       
       
       
       
}
