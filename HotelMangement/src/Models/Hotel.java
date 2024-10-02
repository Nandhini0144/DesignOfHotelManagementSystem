package Models;
import java.util.*;

public class Hotel {
     private String id;
     private String name;
     private Address address;
     private List<Room> rooms; 
     
    public Hotel(String id,String name,Address address,List<Room> rooms)
    {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.rooms=rooms;
    }
    public Hotel(String id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.rooms=new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	
	
	
     
}
