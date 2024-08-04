package Selenium4_WindowHandling;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
	@Test(description = "Using Iterator While loop to switch to child windows", enabled = false)
	public void windowHandlingTestUsingIterator() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		String parentWindow= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.selenium.dev/");
		System.out.println("After switching to new Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		System.out.println("After switching to parent Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		String childWindow ="";
		while (iterator.hasNext()) {
			
			
			childWindow = iterator.next();
			
			System.out.println("Child window ID : "+childWindow);
		
			driver.switchTo().window(childWindow);
			System.out.println("Title : "+driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("Google"))
			{
				driver.findElement(By.name("q")).sendKeys("pencil");
				break;
			}
			
			
		}
		driver.quit();
	}
	
	@Test(description = "Using List<String> collection to switch to child Windows" , enabled = false)
	public void windowHandlingTestUsingList() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		String parentWindow= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.selenium.dev/");
		System.out.println("After switching to new Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		System.out.println("After switching to parent Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		// When we more child windows , list can be used to directly switch to a particular window with the index
		Set<String> windows = driver.getWindowHandles();
		
		List<String> lstWindows = new ArrayList<String>(windows);
		driver.switchTo().window(lstWindows.get(1));

		
		System.out.println("After switching :"+driver.getTitle());
		driver.quit();
	}
	
	@Test(description = "Using for each loop to switch to child Windows")
	public void windowHandlingTestUsingForEach() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		String parentWindow= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.selenium.dev/");
		System.out.println("After switching to new Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		System.out.println("After switching to parent Window :"+driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		// When we more child windows , list can be used to directly switch to a particular window with the index
		Set<String> windows = driver.getWindowHandles();
		
		for(String childWindow : windows)
		{
			driver.switchTo().window(childWindow);
			System.out.println("Title : "+driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("Google"))
			{
				driver.findElement(By.name("q")).sendKeys("pencil");
				break;
			}
			
		}
		
		
		driver.quit();
	}
}
