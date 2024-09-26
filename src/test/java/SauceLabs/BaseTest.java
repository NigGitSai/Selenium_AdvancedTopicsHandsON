package SauceLabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static RemoteWebDriver driver;
	
	@Parameters({"platform","browser","browserVersion","testName"})
	@BeforeMethod()
	public void setUp(String platform,String browser,String browserVersion,String testName)
	{
		MutableCapabilities sauceOptions = new MutableCapabilities();
		
		sauceOptions.setCapability("username", "oauth-gitnig92-079a5");
		sauceOptions.setCapability("accessKey", "*****b8a5");
		sauceOptions.setCapability("seleniumVersion", "4.20.0");
		sauceOptions.setCapability("name", testName);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("sauce:options", sauceOptions);
		cap.setCapability("platformName", platform);
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			cap.setCapability("browserName", browser);
			cap.setCapability("browserVersion", browserVersion);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			cap.setCapability("browserName", browser);
			cap.setCapability("browserVersion", browserVersion);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			cap.setCapability("browserName", browser);
			cap.setCapability("browserVersion", browserVersion);
		}
		else
		{
			System.out.println("Not a valid browser name");
		}
		
		try {
			driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), cap);
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
