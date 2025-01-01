package MicrosoftAuthenticatorOTP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.jboss.aerogear.security.otp.Totp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;


public class OTPTest {
	
	@Test
	public void authenticationTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Properties properties = new Properties();
		File file = new File("./src/test/resources/config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		properties.load(fis);
		
		
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
		
		driver.findElement(By.name("login")).sendKeys(properties.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		
		driver.findElement(By.name("commit")).click();
		
		Totp totp = new Totp(properties.getProperty("MFASecret"));
		
		String otpCode = totp.now();
		
		driver.findElement(By.name("app_otp")).sendKeys(otpCode);
	}


}
