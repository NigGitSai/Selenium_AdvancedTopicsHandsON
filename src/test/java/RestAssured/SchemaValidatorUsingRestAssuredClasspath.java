package RestAssured;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidatorUsingRestAssuredClasspath {

	
	@Test
	public void usingRestAssuredClassPathFunction()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		  
		File petStoreResponseJSON = new File("./src/test/resources/PetStore.json");
		RestAssured.
		given()
			.header("Content-Type","application/json")
			.when()
			.get("store/inventory")
			.then()
			.log()
			.all()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("PetStoreJSONSchema.json"))
			.assertThat()
			.statusCode(200);
			
	}
}
