package RestAssured;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class JSONUsingMap {
	
	@Test
  public void passingJSONUsingMap()
  {
	  HashMap<String,Object> jsonbody = new HashMap<String,Object>();
	  jsonbody.put("accuracy", 69);
	  jsonbody.put("name", "Wedfaf house");
	  jsonbody.put("phone_number", "(+91) 232 232 3937");
	  jsonbody.put("address", "29, side lane, asff 09");
	  
	  
	  ArrayList<String> list = new ArrayList<String>();
	  
	  list.add("shoe park");
	  list.add("shop");
	  
	  jsonbody.put("types", list);
	  
	  HashMap<String,Object> locationMap = new HashMap<String,Object>();
	  
	  locationMap.put("lat", -384500);
	  locationMap.put("lng", 33.427365);
	  
	  jsonbody.put("location", locationMap);
	  jsonbody.put("website", "http://google.com");
	  jsonbody.put("language", "ENGLISH-IN");
	  
	  System.out.println(jsonbody);
	  
	  
	  RestAssured.baseURI = "https://rahulshettyacademy.com/maps";
	  
	  given()
	  	.header("Content-Type", "application/json")
	  	.queryParam("key", "qaclick123")
	  	.body(jsonbody)
	  	.log()
	  	.all().
	 when()
	 	.post("/api/place/add/json")
	 	.then()
	 	.log()
	 	.all()
	 	.assertThat()
	 	.statusCode(200);
	  	
	  
	  
  }

}
