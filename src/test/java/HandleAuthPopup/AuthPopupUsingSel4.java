package HandleAuthPopup;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.network.Network;
import org.openqa.selenium.devtools.v123.network.model.Headers;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AuthPopupUsingSel4 {
	
	@Test(description= "Authenticate popup using Selenium 4")
	public void authPopUsingSelenium4()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools devTools = driver.getDevTools();
		//Create session using devTool reference
		devTools.createSession();
		
		//Enable the network domain of dev tools
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		String userName = "admin";
		String password = "admin";
		
		String encodeUserNamePwd =userName+":"+password;
		String encodedCred = Base64.getEncoder().encodeToString(encodeUserNamePwd.getBytes());
		
		Map<String,Object> headers = new HashMap<>();
		
		headers.put("Authorization", "Basic "+encodedCred);
		//set the headers using devtools
		
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		String successText = driver.findElement(By.xpath("//div[@id='content']//p")).getText().trim();
		Assert.assertEquals("Authentication success message", successText, "Congratulations! You must have the proper credentials.");
		
		
		driver.quit();
	}

}
