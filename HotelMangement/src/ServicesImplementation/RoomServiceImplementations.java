package ServicesImplementation;
import java.util.*;


import Models.Hotel;
import Models.Room;
import Services.RoomService;
public class RoomServiceImplementations implements RoomService {
	
	HotelServiceImplementation instance=HotelServiceImplementation.getInstance();
	List<Room> rooms;
	public RoomServiceImplementations(Hotel hotel)
	{
		this.rooms=hotel.getRooms();
	}
	private static RoomServiceImplementations inst;
	public static RoomServiceImplementations getInstance(Hotel hotel)
	{
		if(inst==null)
			inst=new RoomServiceImplementations(hotel);
		return inst;
	}
	
	@Override
	public void createRoom(Room room) throws Exception{
		for(int i=0;i<rooms.size();i++)
		{
			if(rooms.get(i).getId().equals(room.getId()))
				throw new IllegalStateException("Already the room has been created");
		}
		rooms.add(room);
	}
	
	@Override
	public Room getRoom(String roomId) throws Exception{
		for(Room room:rooms)
		{
			if(room.getId().equals(roomId))
				return room;
		}
		throw new IllegalStateException("No room is available that you  have mentioned");
	}
	
	@Override
	public void deleteRoom(Room room)
	{
	       Hotel hotel=instance.getHotel(room.getHotelId());
	       hotel.getRooms().remove(room);
	}

	@Override
	public void bookRoom(Room room) throws Exception{
		if(!room.isAvailable())
			throw new IllegalStateException("Room"+room.getRoomNumber()+" is not Available");
		room.setAvailable(false);
		
	}
	
	public void cancelRoom(List<Room> rooms) throws Exception
	{
		for(Room room:rooms)
		{
		if(room.isAvailable())
			throw new IllegalStateException("Room"+room.getRoomNumber()+" is not yet booked");
		room.setAvailable(true);
		}
	}




	
}
