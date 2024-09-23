package RestAssured;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
	
	import com.fasterxml.jackson.core.exc.StreamReadException;
	import com.fasterxml.jackson.databind.DatabindException;
	import com.fasterxml.jackson.databind.ObjectMapper;
	
	
	
	public class DeserializationUsingObjectMapper {
		
		@Test
		public void deserializeUsingObjectMapperTest() throws StreamReadException, DatabindException, IOException
		{
			File file = new File("./src/test/resources/SimpleJSON.json");
		
			ObjectMapper mapper = new ObjectMapper();
			
			SimpleJSONPersonDetails person = mapper.readValue(file, SimpleJSONPersonDetails.class);
			
			String name = person.getPerson().getName();
			System.out.println("Name is :"+name);
			
			String postalCode = person.getPerson().getAddress().getPostalCode();
			System.out.println("Postal code is :"+postalCode);
			
			String type = person.getPerson().getPhoneNumbers().get(0).getType();
			
			System.out.println("Type is :"+type);
			
		}
	}
