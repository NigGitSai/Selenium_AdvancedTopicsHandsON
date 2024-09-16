package TestNGDataProvider;

import org.testng.annotations.Test;

public class DataProviderIndicesConcept {
	

	@Test(dataProvider = "getCredentials", dataProviderClass = DataProviderClassUnderstanding.class)
	public void yahoo(String userName, String password)
	{
		System.out.println("User name :"+userName);
		System.out.println("Password :"+ password);
	}

}
