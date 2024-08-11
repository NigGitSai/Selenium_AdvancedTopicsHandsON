package Selenium4_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorTest {

	@Test
	public void relativeLocatorLearning()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// below 
		WebElement textAreadFieldTwo = driver.findElement(By.xpath("//h2[text()='Text Area Field Two']"));
		
		
		WebElement textArea2 = driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(textAreadFieldTwo));
		textArea2.clear();
		textArea2.sendKeys("Tulip flower garden");
		
		//above
		WebElement femaleRadio  =	driver.findElement(By.xpath("//input[@value='female']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(femaleRadio)).click();
		
		
		//toRightOF
		
		WebElement orangeChkBox = driver.findElement(By.xpath("//input[@value='orange']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(orangeChkBox)).click();
		
		//toLeftOf
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		String submitBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(loginBtn)).getText();
		System.out.println(submitBtn);
		
		//near
		WebElement searchInput = driver.findElement(By.name("q"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(searchInput)).click();
		
		String sorryText =driver.findElement(By.xpath("(//div[@class='status-msg-wrap']/div)[1]")).getText();
		System.out.println(sorryText);
		
		driver.get("https://omayo.blogspot.com/");
		WebElement compediumDev= driver.findElement(By.xpath("//a[text()='compendiumdev']"));
		
		
		WebElement testWisely = driver.findElement(By.xpath("//a[text()='testwisely']"));
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).above(testWisely).below(compediumDev)).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
