package StreamsAPI_FunctionsPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Products {

	
	    String name;
	    LocalDate expiryDate;
	    
	    Products(String name, LocalDate expiryDate) {
	        this.name = name;
	        this.expiryDate = expiryDate;
	    }
	

	    
	public String getName() {
			return name;
		}



		public LocalDate getExpiryDate() {
			return expiryDate;
		}



		




	// Check if any product's expiryDate is before today

}
