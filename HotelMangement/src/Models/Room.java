package Models;

public class Room {
    private String id;
    private String hotelId;
    private RoomType type;
    private boolean isAvailable;
    private int floorNumber;
    private int roomNumber;
    
    public Room(String id,String hotelId,RoomType type,int floor,int rno)
    {
    	this.id=id;
    	this.hotelId=hotelId;
    	this.type=type;
    	this.isAvailable=true;
    	this.floorNumber=floor;
    	this.roomNumber=rno;
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
    
    
}
