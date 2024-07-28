package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToRefreshPage {
	
	@Test
	public void refreshPageUsingJS() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement checkout = driver.findElementByXPath("//a[@title='Checkout']");
		js.executeScript("location.reload()");
		Thread.sleep(2000);
		
		js.executeScript("history.go(0)");
		Thread.sleep(2000);
		js.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].setAttribute('style',background:yellow;border:2px solid red;');",checkout);
		
		driver.quit();
	}

}
