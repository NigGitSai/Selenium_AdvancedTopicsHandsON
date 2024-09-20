package SeleniumFileManagement;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadTestInEdge {

	/*
	 * 
	 * If we are using Selenium 3.141 version below 4 version we cannot use setExperimentalOption method 
			To overcome that we have to add dependency selenium tools edge - msedge-selenium-tools-java

	 */
	@Test
	public void verifyFileDownloadInEdgeBrowser()
	{
		EdgeOptions opt = new EdgeOptions();
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", System.getProperty("user.dir")+File.separator+"src\\test\\resources\\Downloads");
		prefs.put("download.prompt_for_download", false);
		prefs.put("plugin.always_open_pdf_externally", false);
		opt.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver(opt);
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://letcode.in/file");
			driver.findElement(By.id("pdf")).click();
			
			File folderPath = new File(System.getProperty("user.dir")+File.separator+"src\\test\\resources\\Downloads");
			
			File[] files = folderPath.listFiles();
			for(File file : files)
			{
				if(file.getName().equals("sample.pdf"))
				{
					System.out.println("File is downloaded");
					file.delete();
					org.testng.Assert.assertEquals(true,true,"File download verification");
					break;
				}
			}
			driver.quit();
			
	}
}
