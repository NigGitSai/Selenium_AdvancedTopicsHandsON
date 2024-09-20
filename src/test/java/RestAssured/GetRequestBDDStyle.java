package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequestBDDStyle {

	
	@Test
	public void getRequestBDDStyle()
	{
	RestAssured.
	given()
		.baseUri("https://petstore.swagger.io/v2/")
		.header("Content-Type","application/json")
		.queryParam("status", "available")
	.when()
		.get("pet/findByStatus")
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);
		
	}
}
