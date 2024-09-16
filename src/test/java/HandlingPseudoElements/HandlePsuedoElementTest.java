package HandlingPseudoElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePsuedoElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://play1.automationcamp.ir/advanced.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String content = js.executeScript("return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')").toString();
		content = content.replaceAll("\"", "");
		
		driver.findElement(By.id("txt_rating")).sendKeys(content);
		
		driver.findElement(By.id("check_rating")).click();
		
		String validationMsg = driver.findElement(By.id("validate_rating")).getText();
		
		System.out.println(validationMsg);
		
		String backgroundColor =driver.findElement(By.id("validate_rating")).getCssValue("background-color");
		
		backgroundColor = Color.fromString(backgroundColor).asHex();
		System.out.println("Background Color :"+backgroundColor);
		
		Assert.assertEquals("Verify Validation message", validationMsg, "Well done!");
		
		Assert.assertEquals("Verify Background color is green for Well Done text", backgroundColor, "#3fb618");
		
		
		driver.quit();
	}

}
