package SeleniumInterviewQuestions;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		String addToCartTextColor =  driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).getCssValue("color");
		String addToCartTextColorHex = Color.fromString(addToCartTextColor).asHex();
		
		System.out.println("Color of Add to cart button text :"+addToCartTextColorHex);
		
		String addToCartBGColor =  driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).getCssValue("background-color");
		String addToCartBGColorHex = Color.fromString(addToCartBGColor).asHex();
		
		System.out.println("Color of Add to cart button background :"+addToCartBGColorHex);
		
		driver.quit();
	}

}
