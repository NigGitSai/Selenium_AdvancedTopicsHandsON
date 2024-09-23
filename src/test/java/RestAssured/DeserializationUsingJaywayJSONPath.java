package RestAssured;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class DeserializationUsingJaywayJSONPath {

	
	@Test
	public void deserializeUsingJaywayJSONPath() throws IOException
	{
		File storeJson = new File("./src/test/resources/Store.json");
		
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		
		Configuration configuration = Configuration
		.builder()
		.mappingProvider(mappingProvider)
		.build();
		
		RootPOJOForStoreJSON rootPojoForStoreJSON = JsonPath
		.using(configuration)
		.parse(storeJson)
		.read("$",RootPOJOForStoreJSON.class);
		
		
		String city = rootPojoForStoreJSON.getStore().getLocation().getCity();
		
		System.out.println("City is "+city);
		
		String productName = rootPojoForStoreJSON.getStore().getProducts().get(1).getName();
		
		System.out.println("Product Name is "+productName);
		
		double price = rootPojoForStoreJSON.getStore().getProducts().get(2).getPrice();
		
		System.out.println("Product price is :"+price);
		
		String staffName = rootPojoForStoreJSON.getStore().getStaff().get(0);
		
		System.out.println("Staff name :"+staffName);
		
	}
}
