package StreamsAPI_DemoWebShop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingDynamicWebtable {
	static ChromeDriver driver ;
	 static WebElement sortBy;
	 static WebDriverWait wait ;
	static Select sel;
	@Test
	public void handlingDynamicWebTable()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 List<WebElement> colNames =  driver.findElements(By.xpath("//table[@id='taskTable']//th"));
		 int colNO =0;
		 for(int i=0;i<colNames.size();i++)
		 {
			 if(colNames.get(i).getText().equalsIgnoreCase("Network (Mbps)")) {
				 colNO=i+1;
				 break;
			 }

		 }
	String firefoxNetworkMbps =	 tableData(driver,"Firefox",colNO).getText();
		 
	System.out.println("Firefox network Mbps :"+firefoxNetworkMbps);	 
	}
	
	public WebElement tableData(ChromeDriver driver,String rowField, int colNO)
	{
		return driver.findElement(By.xpath("//table[@id='taskTable']//td[text()='"+rowField+"']/../td["+colNO+"]"));
	}

}
