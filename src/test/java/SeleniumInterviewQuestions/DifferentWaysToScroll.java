package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWaysToScroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Vertical Scroll
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		
		//Scroll down to bottom of the page
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Scroll up to the page
		
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		
		//Scroll to a specific element
		
		WebElement giftCards = driver.findElement(By.xpath("//div[@class='listbox']//a[contains(text(),'Gift Cards')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", giftCards);
		
		Thread.sleep(3000);
		
		//Scroll using Robot class
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_PAGE_UP);
		rb.keyRelease(KeyEvent.VK_PAGE_UP);
		
		driver.quit();
		
	}

}
