package Services;
import java.util.*;

import Models.*;
public interface HotelService {
	  
	  
      public void createHotel(Hotel hotel);
      public List<Hotel> getAllHotels();
      public Hotel getHotel(String HotelId);
      public void deleteHotel(String id);
      public void updateHotel(String id,Hotel hotel);

      
      
}
