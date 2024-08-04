package Selenium4_WindowHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimizeWindow {
	
	@Test
	public void minimizeWindow()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().minimize();
		
		driver.findElement(By.name("q")).sendKeys("pencil"+Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[starts-with(@href,'https://en.wikipedia.org/')])[1]")).click();
		
		String actTitle = driver.getTitle();
		System.out.println("Title :"+actTitle);
		Assert.assertEquals(actTitle, "Pencil - Wikipedia", "Title verification");
		driver.quit();
	}

}
