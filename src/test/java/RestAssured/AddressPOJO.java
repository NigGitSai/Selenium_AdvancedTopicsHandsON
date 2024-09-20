package RestAssured;

public class AddressPOJO {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	private CoordinatesPOJO coordinates;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public CoordinatesPOJO getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(CoordinatesPOJO coordinates) {
		this.coordinates = coordinates;
	}
	
	
	
}
