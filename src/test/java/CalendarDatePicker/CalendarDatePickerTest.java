package CalendarDatePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDatePickerTest {

	@Test
	public void setDateInCalendar() throws Exception
	{
		try
		{
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 
		 String targetDate = "10/02/2023";
		 SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		 
		 Date reqDate = format.parse(targetDate);
		 format.setLenient(false);
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(reqDate);
		 int date = cal.get(Calendar.DAY_OF_MONTH);	
		 
		int targetMonth =  cal.get(Calendar.MONTH);	
		int targetYear = cal.get(Calendar.YEAR);
		
		driver.findElement(By.id("second_date_picker")).click();
		String currentDateMonth = driver.findElement(By.className("ui-datepicker-title")).getText();
		SimpleDateFormat monthFormat = new SimpleDateFormat("MMM yyyy");
		Date currentMonthDt =  monthFormat.parse(currentDateMonth);
		
		
		cal.setTime(currentMonthDt);
		 
		int actMonth = cal.get(Calendar.MONTH);
		int actYear = cal.get(Calendar.YEAR);
		System.out.println("Actual Month :"+actMonth);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		if(targetMonth< actMonth || targetYear < actYear)
		{
			WebElement prev = driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-prev')]"));
			  executor.executeScript("arguments[0].click();", prev);
			  actMonth = cal.get(Calendar.MONTH);
			  actYear = cal.get(Calendar.YEAR);
			 
		  }
		  while(targetMonth>actMonth || targetYear>actYear)
		  {
			  WebElement next =  driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]"));
			  executor.executeScript("arguments[0].click();", next);
			  currentDateMonth = driver.findElement(By.className("ui-datepicker-title")).getText();
			  cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDateMonth));
			  actMonth = cal.get(Calendar.MONTH);
			  actYear = cal.get(Calendar.YEAR);
		  }
		  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()='"
				  +date+"']")).click();
		  System.out.println(date+" "+targetMonth+" "+targetYear);
		  driver.quit();
		}
		catch(ParseException e)
		{
			throw new Exception("Invalid date change date input");
		}
		
		 		 
		 
		 
		 
	}
}
