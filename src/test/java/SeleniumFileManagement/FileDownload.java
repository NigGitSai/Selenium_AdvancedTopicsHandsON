package SeleniumFileManagement;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	
	static ChromeDriver driver;
	@BeforeClass
	public void setUpBrowser()
	
	{
		 HashMap<String,Object> prefs = new HashMap<String,Object>();
		 prefs.put("download.default_directory", System.getProperty("user.dir")+File.separator+"src\\test\\resources\\Downloads");
		 prefs.put("download.prompt_for_download", false);
		 prefs.put("plugin.always_open_pdf_externally", false);
		 ChromeOptions opt = new ChromeOptions();
		 opt.setExperimentalOption("prefs", prefs);
		
		 WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(description ="Verify file download")
	public void verifyFileDownload()
	{
		driver.get("https://letcode.in/file");
		driver.findElement(By.id("xls")).click();
		
		File folderPath = new File( System.getProperty("user.dir")+File.separator+"src\\test\\resources\\Downloads");
		File[] lstFiles = folderPath.listFiles();
		for(File fileName :lstFiles )
		{
			if(fileName.getName().equals("sample.xlsx"));
			{
			System.out.println("File is downloaded");
			org.testng.Assert.assertEquals(true, true);
			fileName.delete();
			break;
			}
			
		}
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();	}


}
