package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllCheckboxes {
	
	@Test
	public void selectAllCheckboxes()
	{
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
		 
		List<WebElement> lstCheckboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		
		for(WebElement temp:lstCheckboxes)
		{
			temp.click();
		}
	}
}
