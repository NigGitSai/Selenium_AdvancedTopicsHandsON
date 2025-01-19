import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartVerification {
	
	@Test
	public void carouselVerification() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> slickDots = driver.findElements(By.xpath("//div[@class='css-175oi2r r-1awozwy r-18u37iz r-1777fci r-kzbkwu r-tskmnb']/div"));
		
		for(WebElement ele : slickDots)
		{
			driver.executeScript("arguments[0].setAttribute('style','display:block !important');", ele);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@aria-label='Next Slide']")).click();
		}
	
	}

}
