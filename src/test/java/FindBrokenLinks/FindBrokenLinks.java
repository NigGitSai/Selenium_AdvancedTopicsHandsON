package FindBrokenLinks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.com/");
		 
		List<WebElement> lstLinks =  driver.findElements(By.tagName("a"));
		lstLinks.addAll(driver.findElements(By.tagName("img")));
		
		List<String> activeLinks = new ArrayList<String>();
		String href ="";
		for(WebElement temp : lstLinks)
		{
			href = temp.getAttribute("href");
			if(href!=null)
			{
				activeLinks.add(href);
			}
		}
		for(String temp: activeLinks)
		{
			findBrokenLink(temp);
		}
		
		driver.quit();
	}
	
	public static void findBrokenLink(String href) throws IOException
	{
		URL url = new URL(href);
		
		HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
		
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode()>400)
		{
			System.out.println("Broken link :"+httpURLConnection.getResponseCode()+" "+httpURLConnection.getResponseMessage());
		}
		else
		{
			System.out.println("Not a broken link :"+href +" "+ httpURLConnection.getResponseCode()+" "+httpURLConnection.getResponseMessage());
			
		}
		
	}

}
