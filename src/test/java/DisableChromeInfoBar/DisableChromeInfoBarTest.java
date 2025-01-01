package DisableChromeInfoBar;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableChromeInfoBarTest {
	
	@Test
	public void testDisableInfoBar()
	{
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
