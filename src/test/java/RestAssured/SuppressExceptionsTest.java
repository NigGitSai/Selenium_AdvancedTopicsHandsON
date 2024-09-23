package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class SuppressExceptionsTest {
	
	@Test
	public void suppressExceptionsTest() throws IOException
	{
		File ipJSON = new File("./src/test/resources/SimpleJSON.json");
		Configuration configure = Configuration.defaultConfiguration();
		
	configure = configure.addOptions(Option.SUPPRESS_EXCEPTIONS);
		
		List<String> name = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$..name1");
		
		System.out.println("Name is :"+name);
	}

}
