package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {
	
	@Test
	public void scrollTestUsingJS() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElementByLinkText("Phones & PDAs").click();
		
		WebElement palmTreeAddToCart = driver.findElementByXPath("//a[text()='Palm Treo Pro']/../../..//button[@title='Add to Cart']");
		
		js.executeScript("arguments[0].scrollIntoView();", palmTreeAddToCart);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
