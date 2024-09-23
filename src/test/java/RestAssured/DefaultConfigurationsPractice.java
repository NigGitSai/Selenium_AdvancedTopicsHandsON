package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class DefaultConfigurationsPractice {

	File ipJSON = new File("./src/test/resources/SimpleJSON.json");
	Configuration configure = Configuration.defaultConfiguration();
	@Test (priority = 1,enabled = false)
	public void defaultConfigurationEg1() throws IOException
	{
		
		
		
		
		configure = 	configure.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		
		String gender = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$.person.gender");
		
		
		System.out.println("Gender is "+gender);
		
		/*Important the result type should be of Non Primitive Data type Wrapper Class
			Eg Double , Float , Integer ,Boolean, Character, Long
			If we give primitive data type like double , int , float it will still throw null pointer exception
			Because primitive data type cannot hold null value.

		 * 
		 *
		 */
		Integer age = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$.person.Age");
		
		System.out.println("Age is :"+age);
		
	}
	
	@Test(priority = 2,enabled = false)
	public void allReturnListDefaultConfiguration() throws IOException
	{
		configure = configure.builder().options(Option.ALWAYS_RETURN_LIST).build();
		
	 List<String> name = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$.person.name");
		
		System.out.println("Name is :"+name);
	}
	
	@Test
	public void suppressExceptionConfigTest() throws IOException
	{
		configure = configure.addOptions(Option.SUPPRESS_EXCEPTIONS);
		
		String name = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$..name");
		
		System.out.println("Name is :"+name);
	}
	
	@Test
	public void requiredPropertiesTest() throws IOException
	{
		configure = configure.addOptions(Option.REQUIRE_PROPERTIES);
		
		String roamingEnabled = JsonPath
		.using(configure)
		.parse(ipJSON)
		.read("$.person.phoneNumber[*].roamingEnabled");
		
		System.out.println("Roaming enabled :"+roamingEnabled);
		
	}
}
