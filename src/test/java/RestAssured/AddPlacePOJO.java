package RestAssured;

import java.util.List;

public class AddPlacePOJO {

	private LocationPOJO location;
	private int accurancy;
	private String name;
	private String phoneNumber;
	
	private String address;
	private List types;
	private String website;
	private String language;
	
	public LocationPOJO getLocation()
	{
		return location;
	}
	
	public void setLocation(LocationPOJO location)
	{
		this.location = location;
	}
	
	public String gatName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAccurancy() {
		return accurancy;
	}

	public void setAccurancy(int accurancy) {
		this.accurancy = accurancy;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List getTypes() {
		return types;
	}

	public void setTypes(List types) {
		this.types = types;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
