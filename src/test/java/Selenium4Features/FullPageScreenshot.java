package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenshot {

	
	@Test
	public void fullPageScreenshotTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		
		File srcImage = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcImage, new File("./src/test/resources/FullPage.png"));
		driver.switchTo().frame(0);
		
		driver.quit();
	}
	
}
