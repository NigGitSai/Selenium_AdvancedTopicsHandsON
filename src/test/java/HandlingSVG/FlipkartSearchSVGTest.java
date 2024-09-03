package HandlingSVG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSearchSVGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Jeans");
		
		
		WebElement search = driver.findElement(By.xpath("(//button[contains(@aria-label,'Search for Products')]//*[name()='svg'])[1]"));
		
		search.click();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", search);
		 */
		
		driver.quit();
	}

}
