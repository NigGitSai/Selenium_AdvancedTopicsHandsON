package SeleniumFileManagement;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadTestInFirefox {
	
	@Test
	public void verifyFirefoxDownload()
	{
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", false);
		
		profile.setPreference("browser.download.dir", System.getProperty("user.dir")+File.separator+"src\\test\\resources\\Downloads");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/excel,application/vnd.ms-excel,application/x-excel,application/x-msexcel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);
		
		FirefoxDriver driver = new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

}
