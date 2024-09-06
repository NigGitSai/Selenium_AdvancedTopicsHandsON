package AlertHandling;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
static ChromeDriver driver;
Alert alert;
WebDriverWait wait;
	
	@BeforeClass
	public void setUpBrowser()
	{
		WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver();
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(description = "Simple Alert Verification", priority = 0)
	public void simpleAlertValidation()
	{
		driver.get("https://letcode.in/alert");
		WebElement acceptAlertBtn = driver.findElement(By.id("accept"));
		wait.until(ExpectedConditions.elementToBeClickable(acceptAlertBtn));
		acceptAlertBtn.click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getClass());
		alert.accept();
	}
	
	@Test(description = "confirm Alert Verification",priority = 1)
	public void confirmAlertValidation()
	{
		WebElement confirmBtn = driver.findElement(By.id("confirm"));
		wait.until(ExpectedConditions.elementToBeClickable(confirmBtn));
		confirmBtn.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getClass());
		System.out.println(alert.getText());
		alert.dismiss();
	}
	
	@Test(description = "Prompt Alert Verification",priority = 2)
	public void promptAlertValidation()
	{
		WebElement promptBtn = driver.findElement(By.id("prompt"));
		wait.until(ExpectedConditions.elementToBeClickable(promptBtn));
		promptBtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		System.out.println(alert.getClass());
		
		alert.sendKeys("Test");
		alert.accept();
		String actValue = driver.findElement(By.id("myName")).getText();
		
		org.testng.Assert.assertEquals(actValue, "Your name is: Test", "Prompt Alert verification");
		
	}
	
	@Test(description = "Web Popup Verification",priority = 3)
	public void webPopupValidation()
	{
		WebElement modernBtn = driver.findElement(By.id("modern"));
		wait.until(ExpectedConditions.elementToBeClickable(modernBtn));
		modernBtn.click();
		
		boolean actFlag = driver.findElement(By.xpath("//p[contains(text(),'Modern Alert - Some people address me as sweet alert as well')]")).isDisplayed();
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
	
		org.testng.Assert.assertEquals(actFlag, true, "Modern Alert popup is displayed");
	
	}

	@Test(description = "Alert Screenshot Verification",priority = 4)
	public void alertScreenshotValidation() throws AWTException, IOException
	{
		driver.findElement(By.id("prompt")).click();
		alert = driver.switchTo().alert();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();		
		Rectangle rect = new Rectangle(d);
		Robot rb = new Robot();
		BufferedImage io = rb.createScreenCapture(rect);
		ImageIO.write(io, "png", new File("src\\test\\resources\\AlertRect.png"));
		
		alert.accept();
		
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();	}
}
