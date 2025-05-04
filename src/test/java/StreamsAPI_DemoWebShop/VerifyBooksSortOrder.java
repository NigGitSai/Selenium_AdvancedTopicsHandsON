package StreamsAPI_DemoWebShop;

import java.time.Duration;
import java.util.Collections;
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

public class VerifyBooksSortOrder {
	
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
	public void verifyBooksSortedInAToZ()
	{
		
	 WebElement books =	driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		wait.until(ExpectedConditions.visibilityOf(books)).click();
		
	     sortBy =	driver.findElement(By.id("products-orderby"));
	     wait.until(ExpectedConditions.visibilityOf(sortBy));
	      sel = new Select(sortBy);
	      sel.selectByVisibleText("Name: A to Z");
	      
	     List<WebElement> productTitleEleList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
	     wait.until(ExpectedConditions.visibilityOfAllElements(productTitleEleList));
	    List<String> actualList = productTitleEleList.stream().map(WebElement::getText).collect(Collectors.toList());
	     
	    List<String> sortedList = productTitleEleList.stream().map(WebElement::getText).sorted().collect(Collectors.toList());
	    
	    System.out.println("Actual list :"+actualList);
	    System.out.println("sorterd List : "+sortedList);
	    Assert.assertEquals(actualList, sortedList, "The books sorted in A To Z order");
	}
	
	@Test(priority = 2)
	public void verifyBooksSortedInZToA()
	{
		
		sortBy =	driver.findElement(By.id("products-orderby"));
	     wait.until(ExpectedConditions.visibilityOf(sortBy));
	      sel = new Select(sortBy);
	      sel.selectByVisibleText("Name: Z to A");
	      
	     List<WebElement> productTitleEleList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
	     wait.until(ExpectedConditions.visibilityOfAllElements(productTitleEleList));
	    List<String> actualList = productTitleEleList.stream().map(WebElement::getText).collect(Collectors.toList());
	     
	    List<String> sortedList = productTitleEleList.stream().map(WebElement::getText).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	    
	    System.out.println("Actual list :"+actualList);
	    System.out.println("sorterd List : "+sortedList);
	    Assert.assertEquals(actualList, sortedList, "The books sorted in Z To A order");
	}
	
	@Test(priority = 3)
	public void verifyBooksSortedByPriceLowToHigh()
	{
		
		sortBy =	driver.findElement(By.id("products-orderby"));
	     wait.until(ExpectedConditions.visibilityOf(sortBy));
	      sel = new Select(sortBy);
	      sel.selectByVisibleText("Price: Low to High");
	      
	     List<WebElement> priceEleList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
	     wait.until(ExpectedConditions.visibilityOfAllElements(priceEleList));
	    List<Double> actualList = priceEleList.stream().map(WebElement::getText).map(e->Double.parseDouble(e)).collect(Collectors.toList());
	     
	    List<Double> sortedList = priceEleList.stream().map(WebElement::getText).map(e->Double.parseDouble(e)).sorted().collect(Collectors.toList());
	    
	    System.out.println("Actual list :"+actualList);
	    System.out.println("sorterd List : "+sortedList);
	    Assert.assertEquals(actualList, sortedList, "The books sorted by price low to high");
	}
	
	
	@AfterClass
	public void logoutDemoCart()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}
}
