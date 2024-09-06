package CopyPasteURLFromNotepad;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURLCopiedFromNotepad {
	
	@Test
	public void launchURLCopyFromNotepad() throws IOException
	{
		File file = new File("./src/test/resources/DemoWebShopURL.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String s="";
		
		StringBuffer targetURL = new StringBuffer();
		while((s=br.readLine())!=null)
		{
			targetURL.append(s);
		}
		
		StringSelection sel = new StringSelection(targetURL.toString());
		 Clipboard clipboard =  Toolkit.getDefaultToolkit().getSystemClipboard();

		 clipboard.setContents(sel, null);
		 
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver();
		 WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.com/");
		 
		 WebElement search = driver.findElement(By.name("q"));
		 
		 Actions actions = new Actions(driver);
		 actions.click(search);
		 
		 actions.keyDown(Keys.CONTROL);
		 actions.sendKeys("v");
		 actions.keyUp(Keys.CONTROL);
		 actions.sendKeys(Keys.ENTER);
		 actions.build().perform();
	}

}
