package JavaScriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndTypeTest {
	
	@Test
	public void clickUsingJS()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		WebElement beachDest = driver.findElement(By.xpath("(//span[contains(@class,'itemDescTop') and text()='Top 11'])[1]"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", beachDest);
		String actURL = driver.getCurrentUrl();
	
		org.testng.Assert.assertEquals(actURL, "https://www.makemytrip.com/tripideas/beach-destinations", "Beach Destination URL Navigation");
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement mobileNum = driver.findElement(By.xpath("//button[@class='getAppLinkBtn']/..//input"));
		js.executeScript("arguments[0].click();", mobileNum);
		js.executeScript("arguments[0].value='9444673128';", mobileNum);
	}

}
