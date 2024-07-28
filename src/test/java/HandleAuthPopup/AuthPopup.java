package HandleAuthPopup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String userName = "admin";
		String password = "admin";
		String url= "https://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://bookcart.azurewebsites.net/'");
	}

}
