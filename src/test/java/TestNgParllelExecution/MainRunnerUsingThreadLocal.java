package TestNgParllelExecution;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainRunnerUsingThreadLocal {
	
	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		threadLocalDriver.set(new ChromeDriver());
		
		threadLocalDriver.get().get("https://www.saucedemo.com/");
		threadLocalDriver.get().manage().window().maximize();
	}
	
	@Test
	public void loginUsingValidCredentials() {
		threadLocalDriver.get().findElement(By.id("user-name")).sendKeys("standard_user");
		threadLocalDriver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		threadLocalDriver.get().findElement(By.id("login-button")).click();
		WebElement sauceLabsBackPack = threadLocalDriver.get().findElement(By.linkText("Sauce Labs Backpack"));
		Assert.assertTrue(sauceLabsBackPack.isDisplayed());
	}
	
	@Test
	public void loginUsingInValidCredentials() {
		threadLocalDriver.get().findElement(By.id("user-name")).sendKeys("locked_out_user");
		threadLocalDriver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		threadLocalDriver.get().findElement(By.id("login-button")).click();
		WebElement userLockedOutErrorMessage = threadLocalDriver.get().findElement(By.xpath("//h3[@data-test='error']"));
		String actualErrorMessage = userLockedOutErrorMessage.getText();
		Assert.assertEquals("Locked Out error", "Epic sadface: Sorry, this user has been locked out.", actualErrorMessage);
	}
	
	@AfterMethod
	public void tearDown() {
		threadLocalDriver.get().quit();
	}
}
