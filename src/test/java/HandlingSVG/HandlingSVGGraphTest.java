package HandlingSVG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSVGGraphTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/coronavirus/country/india/");
		
		List<WebElement> lstGraphPoints = driver.findElements(By.xpath("//*[local-name()='svg' and @class='highcharts-root']//*[name()='g' and @class='highcharts-series highcharts-series-0 highcharts-column-series highcharts-tracker highcharts-dense-data']/*[name()='rect']"));
		WebElement dailyCasesText = driver.findElement(By.xpath("//h3[text()='Daily New Cases in India']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",dailyCasesText);
		System.out.println(lstGraphPoints.size());
		Actions actions = new Actions(driver);
		String tooltipText ="";
		for(int i=120;i<300;i++)
		{
			actions.moveToElement(lstGraphPoints.get(i)).build().perform();
			Thread.sleep(1000);
			tooltipText =driver.findElement(By.xpath("//*[name()='g' and contains(@class,'highcharts-tooltip')]")).getText();
			System.out.println(tooltipText);
		}
		 
		driver.quit();
	
	}
	

}
