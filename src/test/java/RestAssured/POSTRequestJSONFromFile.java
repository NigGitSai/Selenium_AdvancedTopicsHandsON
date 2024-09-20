package RestAssured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class POSTRequestJSONFromFile {
	
	
	@Test
	public void postRequestJSONFromFile()
	{
		File file = new File("./src/test/resources/Data.json");
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		
		given()
		.header("Content-Type", "application/json")
		.body(file)
		.when()
		.post("pet")
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);
		
	}

}
