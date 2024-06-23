package SeleniumFileManagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FileUpload {
	static ChromeDriver driver;
	
	@BeforeClass
	public void setUpBrowser()
	{
		WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(description = "Single File upload verification" , enabled = false)
	public void uploadFileForLambaTestSingleFile() throws InterruptedException
	{
		
		driver.get("https://www.lambdatest.com/selenium-playground/upload-file-demo");
		WebElement chooseFile = driver.findElementById("file");
		File imageFile = new File("src/test/resources/tulipgarden.jpg");
		chooseFile.sendKeys(imageFile.getAbsolutePath());
		String expSuccessfulMsg = driver.findElementById("error").getText();
		System.out.println(imageFile.getAbsolutePath());
		org.testng.Assert.assertEquals("File Successfully Uploaded",expSuccessfulMsg,"File Successful Message" );
		Thread.sleep(2000);
		
	}
	
	
	@Test(description = "Multiple File upload verification", enabled = false)
	public void uploadMultipleFile() throws InterruptedException
	{
				
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		WebElement chooseFile = driver.findElementById("drag-drop-upload");
		LocalFileDetector detector = new LocalFileDetector();
		
		File imageFile = detector.getLocalFile("src/test/resources/tulipgarden.jpg");
		File wordFile = detector.getLocalFile("src/test/resources/TestDoc.docx");
		
		System.out.println(imageFile);
		System.out.println(wordFile);
		chooseFile.sendKeys(imageFile.getAbsolutePath(),"\n",wordFile.getAbsolutePath());
		Thread.sleep(2000);
		driver.findElementById("file-submit").click();
		driver.findElementByXPath("//h3[text()='File Uploaded!']").isDisplayed();
		String actUploadedFileName = driver.findElementById("uploaded-files").getText().trim();
		org.testng.Assert.assertEquals( actUploadedFileName,"tulipgarden.jpg", "Uploaded File name ");
		
		
		
	}
	
	@Test(description = "Verify File upload using Robot class" ,enabled = true)
	public void fileUploadUsingRobot() throws InterruptedException, AWTException
	{
		driver.get("https://www.file.io/");
	
		StringSelection sel = new StringSelection(System.getProperty("user.dir")+File.separator+"src\\test\\resources\\TestDoc.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[local-name()='svg' and @class ='css-1kh0tap']").click();
		
		Robot rb = new Robot();
		Thread.sleep(3000);



		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		String fileNameUplaodedAct = driver.findElementByXPath("//input[@name='title']").getAttribute("value");
		org.testng.Assert.assertEquals(fileNameUplaodedAct, "TestDoc.docx", "File Name uploaded");
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();	}

}
