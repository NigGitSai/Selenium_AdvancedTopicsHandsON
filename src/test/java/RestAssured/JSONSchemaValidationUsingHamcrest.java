package RestAssured;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JSONSchemaValidationUsingHamcrest {
	
	@Test
	public void verifyJSONSchemaUsingHamcrest() throws IOException
	{
		File responseJSON = new File("./src/test/resources/PetStore.json");
		
		String ipJSON = FileUtils.readFileToString(responseJSON,"UTF-8");
		File schemaJSON = new File("./src/test/resources/PetStoreJSONSchema.json");
		
		MatcherAssert.assertThat(ipJSON, JsonSchemaValidator.matchesJsonSchema(schemaJSON));
		
	}

}
