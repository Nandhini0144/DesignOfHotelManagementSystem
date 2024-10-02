package Models;

public class Address {
     private String id;
     private String street;
     private String city;
     private String zipcode;
     
    public Address(String id,String street,String city,String zipCode)
    {
    	this.id=id;
    	this.street=street;
    	this.city=city;
    	this.zipcode=zipCode;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
     
     
}
