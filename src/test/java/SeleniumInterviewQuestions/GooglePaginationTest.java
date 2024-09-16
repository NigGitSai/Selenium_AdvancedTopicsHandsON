package SeleniumInterviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePaginationTest {
	
	
	@Test
	public void traverseSearchResultAndRetreiveLinks() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Handling SVG elements using Selenium Java \n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> next = driver.findElements(By.xpath("//a[@id='pnnext']/span[text()='Next']"));
		
		System.out.println(next.size());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		List<String> links = new ArrayList<String>();
		
		List<WebElement> searchResultsURL = null;
		WebElement nextButton;
		while(!(next.size()==0))
		{
			searchResultsURL = driver.findElements(By.xpath("//div[@class='yuRUbf']//a[@jsname='UWckNb']"));
			for(WebElement ele:searchResultsURL)
			{
				links.add(ele.getAttribute("href"));
			}
			next = driver.findElements(By.xpath("//a[@id='pnnext']/span[text()='Next']"));
			if(!(next.size()==0))
			{
			  nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='pnnext']")));
			
			  actions.moveToElement(nextButton).click(nextButton).build().perform();
			}
			
			
			Thread.sleep(3000);
			
		}
		System.out.println("Search Result URLs");
		for(String temp: links)
		{
			System.out.println(temp);
		}
		driver.quit();
	}

}
