package Services;
import Models.*;
import java.util.*;
public interface RoomService {
	public void createRoom(Room room) throws Exception;
	public Room getRoom(String id) throws Exception;
	public void deleteRoom(Room room);
	public void bookRoom(Room room) throws Exception;
	public void cancelRoom(List<Room> rooms) throws Exception;
}
