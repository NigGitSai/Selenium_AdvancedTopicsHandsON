package Screenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest {
	
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Test
	public void outputAsFile() throws IOException

	{
		
		
		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile1,new File( "./src/test/resources/DemoWebShop1.png"));
		
		
		
	}
	
	@Test
	public void outputAsBytes() throws IOException

	{
		
		
		byte[] srcFile2 = driver.getScreenshotAs(OutputType.BYTES);
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/DemowebShop2.png");
		
		fos.write(srcFile2);
		fos.close();
		
		
		
	}
	
	@Test
	public void outputAsBase64() throws IOException
	{
		String base64 = driver.getScreenshotAs(OutputType.BASE64);
		
		byte[] src3 = Base64.getDecoder().decode(base64);
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/DemowebShop3.png");
		
		fos.write(src3);
		fos.close();
	}
	
	@Test
	public void elementScreenshot() throws IOException
	{
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		File registerLinkScreenshot = register.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(registerLinkScreenshot, new File("./src/test/resources/RegisterLink.png"));
	}
	
	@AfterClass
	public void quitDriver()
	{
		driver.quit();
	}
}
