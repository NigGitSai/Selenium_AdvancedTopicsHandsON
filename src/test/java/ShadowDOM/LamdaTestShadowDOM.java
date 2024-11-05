package ShadowDOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LamdaTestShadowDOM {

	static ChromeDriver driver;
	
	JavascriptExecutor jse ;
	
	
	@BeforeClass
	public void initializeDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");
	}
	@Test(enabled=false)
	public  void shadowDOMTest()
	{
		
		
		jse = (JavascriptExecutor)driver;
		WebElement name = (WebElement) jse.executeScript("return document.querySelector('#shadow_host').shadowRoot.querySelector(\"div > input[placeholder='Name']\")");
		
		
		jse.executeScript("arguments[0].value='Test123';", name);
		
	
	}
	
	@Test
	public void submitForm()
	{
		jse = (JavascriptExecutor)driver;
		WebElement username = (WebElement)jse.executeScript("return document.querySelector('shadow-signup-form').shadowRoot.querySelector(\"input[name='username']\")");
		
		username.sendKeys("Marshall Doe");
		//jse.executeScript("arguments[0].value='Jamie';",username);
	}
}
