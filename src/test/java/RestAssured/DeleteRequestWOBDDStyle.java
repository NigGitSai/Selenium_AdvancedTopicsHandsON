package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestWOBDDStyle {
	
	@Test
	public void deleteRequestWOBDDStyle()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type", "application/json").queryParam("petId", Long.parseLong("9222968140491042131"));
		
		Response response = requestSpecification.request(Method.DELETE,"/pet");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
	}

}
