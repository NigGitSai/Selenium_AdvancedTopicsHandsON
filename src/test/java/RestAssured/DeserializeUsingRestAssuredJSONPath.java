package RestAssured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class DeserializeUsingRestAssuredJSONPath {
	
	@Test
	public void deserialize()
	{
		File storeJson = new File("./src/test/resources/Store.json");
		JsonPath jsonPath = 	JsonPath.from(storeJson);
		
		RootPOJOForStoreJSON storeJsonValues = 	jsonPath.getObject("$",RootPOJOForStoreJSON.class);
		
		String name = storeJsonValues.getStore().getName();
		
		System.out.println("Name is :"+name);
	}
}
