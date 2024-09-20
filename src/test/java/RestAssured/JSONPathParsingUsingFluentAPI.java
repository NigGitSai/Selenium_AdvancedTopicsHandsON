package RestAssured;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JSONPathParsingUsingFluentAPI {
	
	@Test
	public void parseJSONUsingFluentAPI() throws IOException
	{
		File ipJSON = new File("./src/test/resources/SimpleJSON.json");
		
		DocumentContext context = JsonPath.parse(ipJSON);
		
		String name = context.read("$.person.name");
		System.out.println("Person name :"+name);
	}

}
