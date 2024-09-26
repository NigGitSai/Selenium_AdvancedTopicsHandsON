package SauceLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SauceDemoTest extends BaseTest {
	
	public void doLogin()
	{
		driver.get("https://saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	public WebElement itemPrice(WebDriver driver, String itemName)
	{
		return driver.findElement(By.xpath("//div[text()='"+itemName+"']/../../..//div[@class='inventory_item_price']"));
	}
	
	@Test
	public void verifyProductPrice()
	{
		doLogin();
		
		String actPrice = itemPrice(driver, "Sauce Labs Backpack").getText();
		Assert.assertEquals(actPrice ,"$29.99","Price of Sauce Labs Backpack");
		
		System.out.println("Price of Sauce Labs Backpack is "+actPrice);
	}

}
