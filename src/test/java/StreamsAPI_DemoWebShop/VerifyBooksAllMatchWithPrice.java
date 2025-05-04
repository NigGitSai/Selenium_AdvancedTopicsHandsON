package StreamsAPI_DemoWebShop;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyBooksAllMatchWithPrice {
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
	@Test(priority = 1)
	public void verifyAllBooksHavePriceLt25()
	{
		
	 WebElement books =	driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		wait.until(ExpectedConditions.visibilityOf(books)).click();
		
		 WebElement priceUnder25 = driver.findElement(By.xpath("//a[contains(@href,'price=-25')]"));
		 wait.until(ExpectedConditions.visibilityOf(priceUnder25)).click();
		
	    
	      
		 List<WebElement> priceEleList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		 
		boolean blFlag = priceEleList.stream().map(WebElement::getText).map(Double::parseDouble).allMatch(amt->amt<25.00);
		Assert.assertTrue(blFlag);
		WebElement removeFilter = driver.findElement(By.xpath("//a[@class='remove-price-range-filter']"));
		wait.until(ExpectedConditions.visibilityOf(removeFilter)).click();
	}
	
	@Test(priority = 2)
	public void verifyAllBooksHavePriceBW0To500()
	{
		 WebElement jwellery =	driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
			wait.until(ExpectedConditions.visibilityOf(jwellery)).click();
			
		WebElement priceBW0To500 = driver.findElement(By.xpath("//a[contains(@href,'price=0-500')]"));
		wait.until(ExpectedConditions.visibilityOf(priceBW0To500)).click();
		
		
		 List<WebElement> priceEleList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		 
		boolean blFlag = priceEleList.stream().map(WebElement::getText).map(Double::parseDouble).allMatch(e->e<500.00 && e>0.00);
		Assert.assertTrue(blFlag);
	}
	
	@AfterClass
	public void logoutDemoCart()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}
}
