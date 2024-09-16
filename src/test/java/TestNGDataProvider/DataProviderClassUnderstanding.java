package TestNGDataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClassUnderstanding {

	@DataProvider(indices = {0,1})
	public String[][] getCredentials()
	{
		String[][] cred = new String[3][2];
	
		
		
		cred[0][0]="Test1@demo.com";
		cred[0][1] = "Pwd@123";
		
	
		cred[1][0] = "Test2@demo.com";
		cred[1][1] = "Pwd@1234";
			
		cred[2][0] = "Test3@demo.com";
		cred[2][1] = "Pwd@124";
		return cred;
	}
}
