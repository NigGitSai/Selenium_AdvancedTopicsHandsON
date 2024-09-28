package ActionsTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DragAndDropTest1 {

	@Test
	public void dragAndDropTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://mikeplate.github.io/jquery-drag-drop-plugin/example/reorder.html");
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='list']/li"));
		WebElement from,to;
		int j=0;
		Actions actions = new Actions(driver);
		for(int i=0;i<ele.size();i++)
		{
			
				from = ele.get(ele.size()-1);
				to = ele.get(i);
				System.out.println(" from :"+from.getText());
				System.out.println(" to :"+to.getText());
				j=j+1;
				
				actions.dragAndDrop(from, to).build().perform();
				Thread.sleep(2000);
				ele = driver.findElements(By.xpath("//ul[@id='list']/li"));
			}
		
		
		String expNewOrder = "New order of items:E, D, C, B, A";
		
		String actNewOrder = driver.findElement(By.id("msg")).getText();
		
		Assert.assertEquals(actNewOrder,expNewOrder,"New Order List verification");
		driver.quit();
	}
	
}
