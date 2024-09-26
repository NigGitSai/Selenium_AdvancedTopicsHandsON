package SliderTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAmazonSliderRange {

	
	@Test
	public void verifyAmazonPriceRangeSlider() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/s?k=drawer+organizer&crid=2DG3BXKK4JR0M&sprefix=dr%2Caps%2C282&ref=nb_sb_ss_ts-doa-p_3_2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		WebElement slider = driver.findElement(By.xpath("(//input[contains(@id,'p_36/range-slider_slider-item_lower-bound')])[1]"));
		
	
		int desiredValue = 100;
		
		String minValueSet = slider.getAttribute("aria-valuetext").replace("$", "");
		System.out.println("minValueSet "+minValueSet);
		
		int minValue = Integer.parseInt(minValueSet);
		 int valueToSet = desiredValue-minValue;
		
		 System.out.println("valueToSet :"+valueToSet);
		//act.clickAndHold(slider).moveByOffset(width/2, height/2).build().perform();
		
		// Use JavaScriptExecutor to set the value of the slider
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Set the slider value to the desired amount (e.g., 70)
        js.executeScript("arguments[0].value='"+valueToSet+"'; arguments[0].dispatchEvent(new Event('change'));", slider);

        // Optional: Verify the slider's value (debugging purpose)
        String sliderValue = slider.getAttribute("value");
        System.out.println("Slider value set to: " + sliderValue);
		
		//act.dragAndDropBy(slider, 950, 0).build().perform();
		//driver.quit();
	}
}
