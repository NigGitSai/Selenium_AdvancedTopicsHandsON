package SeleniumInterviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWaysToLaunchURL {
	ChromeDriver driver;	
	@BeforeMethod
	public void invokeBrowserDriver()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void usingGet()
	{
		// TODO Auto-generated method stub
		
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	@Test
	public void usingNavigate()
	{
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		
	}
	
	@Test
	public void usingJavaScript()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.location='https://demowebshop.tricentis.com'");
		
		
	}
	
	
	@AfterMethod
	public void quitDriver()
	{
		driver.quit();
	}
	

}
