package RestAssured;
import java.util.List;

import RestAssured.LocationPOJOForStoreJSON;

public class StorePOJO {

	private String name;
	
	private LocationPOJOForStoreJSON location;
	
	private List<ProductPOJOForStoreJSON> products;
	
	private List<String> staff;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocationPOJOForStoreJSON getLocation() {
		return location;
	}

	public void setLocation(LocationPOJOForStoreJSON location) {
		this.location = location;
	}

	public List<ProductPOJOForStoreJSON> getProducts() {
		return products;
	}

	public void setProducts(List<ProductPOJOForStoreJSON> products) {
		this.products = products;
	}

	public List<String> getStaff() {
		return staff;
	}

	public void setStaff(List<String> staff) {
		this.staff = staff;
	}
	
	
}
