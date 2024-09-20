package RestAssured;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetRequestBDDStyleWStaticImport {
	
	
	@Test
	public void  getRequestBDDStyleWStaticImport()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2/";
		given()
		
		
		.when()
		.get("store/inventory")
		
		.then()

		.log()
		.all()
		.assertThat()
		.statusCode(200)
		.header("content-type", "application/json");
		
		
	}

}
