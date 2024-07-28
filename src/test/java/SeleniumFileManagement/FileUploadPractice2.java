package SeleniumFileManagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPractice2 {
	public static ChromeDriver driver;
	@BeforeClass
	public void setUpDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(enabled=false)
	public void fileUpload()
	{
		
		driver.get("https://www.lambdatest.com/selenium-playground/upload-file-demo");
		LocalFileDetector detector = new LocalFileDetector();
		File file = detector.getLocalFile("src/test/resources/tulipgarden.jpg");
		File file2 = new File("src/test/resources/tulipgarden.jpg");
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		driver.findElementById("file").sendKeys(file.getAbsolutePath());
		
	}
	
	@Test()
	public void fileUploadUsingRobot() throws AWTException  
	{
		
		driver.get("https://tinypng.com/");
		StringSelection sel = new StringSelection(System.getProperty("user.dir")+File.separator+"src\test\resources\tulipgarden.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		driver.findElementById("upload-dropbox-zone");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		String actName = driver.findElementByClassName("image-card__name").getText();
		org.testng.Assert.assertEquals(actName, "tulipgarden.jpg", "Image name uploaded");
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
