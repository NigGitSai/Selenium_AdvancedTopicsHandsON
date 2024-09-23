package RestAssured;

public class LocationPOJOForStoreJSON {
	
	
	private String street;
	private String city;
	private String postalCode;
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getStreet()
	{
		return street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
