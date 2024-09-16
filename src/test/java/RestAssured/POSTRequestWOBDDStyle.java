package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTRequestWOBDDStyle {

	@Test
	public void postRequestWOBDDStyle()
	{
		RestAssured.baseURI= "https://petstore.swagger.io/v2/";
		
		
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type", "application/json").body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}");
		
		Response response = requestSpecification.request(Method.POST,"pet");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
		
		
		
	}
}
