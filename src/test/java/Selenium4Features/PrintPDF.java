package Selenium4Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPDF {
	
	@Test
	public void methodTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demo.opencart.com/");
		
		Pdf pdf = driver.print(new PrintOptions());
		
		Files.write(Paths.get("./src/test/resources/demoOpenCart.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
	
		
		driver.quit();
	}
}
