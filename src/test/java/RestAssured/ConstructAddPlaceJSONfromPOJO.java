package RestAssured;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class ConstructAddPlaceJSONfromPOJO {

	
	@Test
	public void constructAddPlaceJSON() throws JsonProcessingException
	{
		LocationPOJO locationPOJO = new LocationPOJO();
		locationPOJO.setLat(-384500);
		locationPOJO.setLng(33.427365);
		
		AddPlacePOJO addPlacePOJO = new AddPlacePOJO();
		addPlacePOJO.setLocation(locationPOJO);
		addPlacePOJO.setAccurancy(69);
		addPlacePOJO.setName("Weeafafs houasfs");
		
		addPlacePOJO.setPhoneNumber("(+91) 232 232 3937");
		
		addPlacePOJO.setAddress("29, side lane, asff 09");
		
		addPlacePOJO.setTypes(Arrays.asList("shoe park","shop"));
		
		addPlacePOJO.setWebsite("http://google.com");
		
		addPlacePOJO.setLanguage("ENGLISH-IN");
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonForLocation = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(addPlacePOJO);
		
		System.out.println(jsonForLocation);
	
	}
}
