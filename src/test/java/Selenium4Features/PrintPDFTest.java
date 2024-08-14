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

public class PrintPDFTest {
	
	@Test
	public void printPDFTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Pdf pdf = driver.print(new PrintOptions());
		
		Files.write(Paths.get("./src/test/resources/TestWebSite.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
	
		driver.quit();
	}

}
