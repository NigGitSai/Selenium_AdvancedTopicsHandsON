package VerifyToastElememts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class VerifyToastElements {
	
	@Test
	public void verifyToastPopup()
	{
		//To inspect toast message / element  open inspect -> Source Tab . Perform the action that triggers the
		// toast message and click pause immediately in Source tab the browser will freeze post which we can inspect the element
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/signin");
		
		driver.findElement(By.name("email")).sendKeys("gitnig92@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pwd@1234");
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		boolean isDIspAct = driver.findElement(By.xpath("//div[@id='toast-container']")).isDisplayed();
		Assert.assertEquals(true, isDIspAct);
		driver.quit();
		
	}

}
