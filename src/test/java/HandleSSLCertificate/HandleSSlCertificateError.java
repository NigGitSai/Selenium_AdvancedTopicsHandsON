package HandleSSLCertificate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSlCertificateError {

	
	@Test
	public void handleSSLCertInChrome()
	{
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://revoked.badssl.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void usingJSToHandleSSLCert()
	{
	
		WebDriverManager.safaridriver().setup();
		
		
		SafariDriver driver = new SafariDriver();
		
		driver.get("https://revoked.badssl.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void handleSSLCertInEdge()
	{
	
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://revoked.badssl.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
}
