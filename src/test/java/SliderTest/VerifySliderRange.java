package SliderTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySliderRange {
	
	@Test()
	public void lambdaTestSlider()
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement slider = driver.findElement(By.xpath("(//div[@id='slider1']/..//input[@type='range'])[1]"));
	
		WebElement range = driver.findElement(By.id("range"));
		
		Actions actions = new Actions(driver);

	
		Rectangle rect = slider.getRect();
		int width = rect.getWidth();
		int xPos = rect.getX();
		System.out.println("xPos "+xPos);
		System.out.println("Width "+width);
		
		System.out.println("Range value");
		int i = -190;
		while(i<-170)
		{
			actions.clickAndHold(slider).moveByOffset(i, 0).build().perform();
		
			System.out.println(range.getText());
			i= i+5;
		}
		driver.quit();
	}

}
