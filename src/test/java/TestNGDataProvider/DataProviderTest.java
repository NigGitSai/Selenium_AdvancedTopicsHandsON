package TestNGDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name="UserData")
	public String[][] getTestData()
	{
		String[][] cred = new String[2][2];
		
		cred[0][0] = "abc@demo.com";
		cred[0][1] = "pwd@123";
		cred[1][0] = "test12@demo.com";
		cred[1][1] = "Test@123";
		
		return cred;
	}
	
	
		
	
	@Test(dataProvider = "UserData",groups = {"smoke"})
	public void test1(String username, String password)
	{
		System.out.println("User name :"+username);
		System.out.println("Password :"+password);
		int[] a = {1,2,3,5};
		System.out.println(a.length);
		
	}
	
}
