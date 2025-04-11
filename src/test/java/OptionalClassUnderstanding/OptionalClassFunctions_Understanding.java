package OptionalClassUnderstanding;

import java.util.Optional;

import org.junit.Assert;
import org.testng.annotations.Test;



public class OptionalClassFunctions_Understanding {
	
	@Test(enabled = false)
	public void emptyUnderstanding()
	{
		Optional<String> emptyStr =     Optional.empty();
		Assert.assertTrue(emptyStr.isEmpty());
	}
	@Test(enabled = false)
	public void ofUnderstanding()
	{
		String name = "Daria";
		name = null;
		Optional<String> ofEx =     Optional.of(name);
		
		Assert.assertTrue(ofEx.isPresent());
	}
	
	@Test
	public void ofNullableUnderstanding()
	{
		String name = "Daria";
		name = null;
		Optional<String> ofEx =     Optional.ofNullable(name);
		
		Assert.assertFalse(ofEx.isPresent());
	}
}

