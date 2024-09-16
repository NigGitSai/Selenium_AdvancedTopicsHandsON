package ShadowDOM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeExtensionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://extensions/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement search = (WebElement) jse.executeScript("return document.querySelector('extensions-manager').shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
		search.clear();
		search.sendKeys("Selector hub");
		search.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
