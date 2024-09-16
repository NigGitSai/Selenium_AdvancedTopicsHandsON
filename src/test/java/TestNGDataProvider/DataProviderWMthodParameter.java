package TestNGDataProvider;

import java.lang.reflect.Method;
import java.net.PasswordAuthentication;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWMthodParameter {

	
	@Test(dataProvider = "getCredentials")
	public void gmail(String userName, String password)
	{
		System.out.println("User name :"+userName);
		System.out.println("Password :"+ password);
	}
	
	@Test(dataProvider = "getCredentials")
	public void yahoo(String userName, String password)
	{
		System.out.println("User name :"+userName);
		System.out.println("Password :"+ password);
	}
	
	@DataProvider
	public String[][] getCredentials(Method m)
	{
		String[][] cred = new String[1][2];
	
		if(m.getName().equalsIgnoreCase("gmail"))
		{
	
		
		cred[0][0]="Test1@demo.com";
		cred[0][1] = "Pwd@123";
		
		}
				
		else if(m.getName().equalsIgnoreCase("yahoo"))
				{
		cred[0][0] = "Test2@demo.com";
		cred[0][1] = "Pwd@1234";
				}
		else
		{
			System.out.println("No matching methods found");
		}
		
		return cred;
	}
}
