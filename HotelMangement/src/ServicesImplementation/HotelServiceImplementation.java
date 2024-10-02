package ServicesImplementation;
import Models.*;
import Services.HotelService;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HotelServiceImplementation implements HotelService {
	Map<String,Hotel> hotels;
	
	
	
	public HotelServiceImplementation()
	{
	   this.hotels=new ConcurrentHashMap<>();
	}
	 private static HotelServiceImplementation instance=null;
	 public static HotelServiceImplementation getInstance()
	 {
		 if(instance==null)
			 instance=new HotelServiceImplementation();
		 return instance;
	 }
	 	 
	 @Override
	 public void createHotel(Hotel hotel) {
		 hotels.put(hotel.getId(),hotel);
	 }
	 @Override
	 public List<Hotel> getAllHotels()
	 {
		 List<Hotel> res=new ArrayList<>();
		 for(Map.Entry<String,Hotel> ele:hotels.entrySet())
		 {
			 res.add(ele.getValue());
		 }
		 return res;
	 }
	 @Override
	 public Hotel getHotel(String HotelId) {
		 return hotels.get(HotelId);
	 }
	 @Override
	 public void deleteHotel(String id) {
		hotels.remove(id); 
	 }
	 @Override
	 public void updateHotel(String id,Hotel hotel)
	 {
		 hotels.put(id, hotel);
	 }
	
}
