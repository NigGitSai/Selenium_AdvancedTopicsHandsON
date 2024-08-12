package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RectAndMinimize {
	
	@Test
	public void rectAndMinimizeTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://letcode.in/");
		
		 WebElement newCourse =   driver.findElement(By.xpath("//a[text()='New Course!']"));
		 Rectangle rect = newCourse.getRect();
		 System.out.println(rect.getX());
		 System.out.println(rect.getY());
		 System.out.println(rect.getHeight());
		 System.out.println(rect.getWidth());
		 
		 newCourse.click();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
