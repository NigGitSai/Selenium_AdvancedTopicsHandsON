package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomINZoomOut {
	
	@Test
	public void zoomInZoomOutUsingJS() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:3px solid red;')", signUp);
		js.executeScript("document.body.style.zoom='60%';");
		
		js.executeScript("document.body.style.zoom='100%';");
		js.executeScript("document.body.style.zoom='150%'");
		driver.quit();
	}

}
