package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class ReadJSONParametersUsingJaywayJSON {
	
	
	@Test
	public void verifyJSONParameterUsingJaywayJSONPath() throws IOException
	{
		File json = new File("./src/test/resources/SimpleJSON.json");
		
		//Get the person's name:
		String name = JsonPath.read(json, "$.person.name");
		
		System.out.println("Person Name :"+name);
		
		//Get the person's age
		int age = JsonPath.read(json,"$.person.age");
		
		System.out.println("Person's age :"+age);
		
		//Check if the person is active:
		
		boolean isActive = JsonPath.read(json, "$.person.isActive");
		
		System.out.println("Person active status :"+isActive);
		
		//Retrieve the person's city:

		String city = JsonPath.read(json, "$.person.address.city");
		
		System.out.println("Person city :"+city);
		
		//	5) Get the work phone number:
		List<Object> numbers = JsonPath.read(json, "$.person.phoneNumbers[?(@.type=='work')].number");
		
		for(Object number:numbers)
		{
			System.out.println("Work number "+number);
		}
		
		//What is the home phone number
		
		List<Object> homeNumbers = JsonPath.read(json, "$.person.phoneNumbers[?(@.type=='home')].number");
		
		for(Object number:homeNumbers)
		{
			System.out.println("Home number "+number);
		}
		
		//Check if the person lives in New York.
		try
		{
			List<Object> address = JsonPath.read(json, "$.person.address[?(@.city=='New York')]");
			
			if(address.size()>0)
			{
				System.out.println("The person lives in New York");
			}
			else
			{
				System.out.println("The person does not live in New York");
			}
		}
		catch(Exception e)
		{
			System.out.println("The person does not live in New York");
		}
		
		try
		{
		//Check if the postal code starts with "100".
		
		List<Object> address1 = JsonPath.read(json, "$.person.address[?(@.postalCode=~/.*100.*/)]");
		
			if(address1.size()>0)
			{
				System.out.println("Postal code starts with 100");
			}
			else
			{
				System.out.println("Postal Code does not start with 100");
			}
		}
		catch(Exception e)
		{
			System.out.println("Postal Code does not start with 100");
		}
	
		//Find the total number of phone numbers listed.
		
		List<Object> totalNum = JsonPath.read(json,"$.person.phoneNumbers[*].number");
		
		System.out.println("Total phone number size :"+totalNum.size());
		for(Object num:totalNum)
		{
			System.out.println("Phone Number :"+num);
		}
		
		//Check if the person is older than 25.
		
		List<Object> personDetails = JsonPath.read(json,"$.person[?(@.age>25)]");
		
		if(personDetails.size()>0)
		{
			System.out.println("Person's age is greater than 25");
		}
		else
		{
			System.out.println("Person's age is lesser than 25");
		}
	}

}
