package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWOBDDStyle {

	@Test
	public void getRequestWOBDDStyle()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		RequestSpecification requestSpecification =  RestAssured.given().contentType("application/json").queryParam("status", "available");
	
		Response response =  requestSpecification.request(Method.GET,"pet/findByStatus");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	}
}
