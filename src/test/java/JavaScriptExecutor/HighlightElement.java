package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement {

	@Test
	public void highlightElement() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0; i<5;i++)
		{
		
		WebElement myAccount = driver.findElementByXPath("//span[text()='My Account']");
		
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:3px solid red;');",myAccount);
		WebElement search = driver.findElementByName("search");
		
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:3px solid red;');", search);
		}
		WebElement iPhoneProduct = driver.findElementByXPath("//a[text()='iPhone']/../../../../../div[@class='product-thumb']");
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:3px solid red');", iPhoneProduct);
		
		
		driver.quit();
	}
	

}
