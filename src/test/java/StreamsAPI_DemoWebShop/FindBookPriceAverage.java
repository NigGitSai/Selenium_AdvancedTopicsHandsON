package StreamsAPI_DemoWebShop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBookPriceAverage {
	static ChromeDriver driver ;
	 static WebElement sortBy;
	 static WebDriverWait wait ;
	static Select sel;
	

	@BeforeClass
	public void loginDemoCart()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("testA1.1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tosca123!");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	}
	
	@Test
	public void findAverage()
	{
		WebElement books =	driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		wait.until(ExpectedConditions.visibilityOf(books)).click();
		
		 List<WebElement> priceEleList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		 
		 
	}
	
	@AfterClass
	public void logoutDemoCart()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}
}
