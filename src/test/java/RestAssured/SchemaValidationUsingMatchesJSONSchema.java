package RestAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidationUsingMatchesJSONSchema {

	@Test
	public void schemaValidationUsingMatchesJSONSchema() throws FileNotFoundException
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		  
		
		InputStream ip = new FileInputStream("./SchemaJSON/PetStoreJSONSchema1.json");
		RestAssured.
		given()
			.header("Content-Type","application/json")
			.when()
			.get("store/inventory")
			.then()
			.log()
			.all()
			.body(JsonSchemaValidator.matchesJsonSchema(ip))
			
			.assertThat()
			.statusCode(200);
			
	}
}
