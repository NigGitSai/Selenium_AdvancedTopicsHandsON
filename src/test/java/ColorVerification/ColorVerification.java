package ColorVerification;

import java.awt.Color;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorVerification {
	
	
	@Test
	public void makeMyTripColorVerify() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		 
		 WebElement extraSavings = driver.findElement(By.xpath("//div[contains(@class,'titleTag')]"));
		 
		 String background = extraSavings.getCssValue("background-image");
		 System.out.println(background);
		 String[] rgbvalues = background.split("rgb");
		 System.out.println(rgbvalues.toString());
		 
		 String actColor="";
		 for(int i=1;i<rgbvalues.length;i++)
		 {
			 background = rgbvalues[i].replaceAll("[()]", "");
			 actColor = rgbToHex(background);
		 }
		 driver.quit();
	}
	
	public String rgbToHex(String strColor)
	{
		StringTokenizer st = new StringTokenizer(strColor);
		int r = Integer.parseInt(st.nextToken(",").trim());
		 int g = Integer.parseInt(st.nextToken(",").trim());
		 int b = Integer.parseInt(st.nextToken(",").trim());
		 Color c = new Color(r, g, b);
		 System.out.println(Integer.toHexString(c.getRGB()));
		 String hex = "#"+Integer.toHexString(c.getRGB()).substring(2);
		 return hex;
	}

}
