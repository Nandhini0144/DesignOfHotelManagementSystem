package Models;

public class User {
	private String Id;
    private String name;
    private String Email;
    private long phoneNumber;
    
    public User(String id,String name,String email,long phone)
    {
    	this.Id=id;
    	this.name=name;
    	this.Email=email;
    	this.phoneNumber=phone;
    }
    
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
    
}
