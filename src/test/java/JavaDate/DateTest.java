package JavaDate;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class DateTest {

	@Test
	public void dateTest()
	{
		Date dt = new Date();
		
		SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy");
		String currdate = objFormat.format(dt);
		
		System.out.println(currdate);
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dt);
		cal.add(Calendar.DATE, 2);
		
		Date newDt = cal.getTime();
		
		String newDate = objFormat.format(newDt);
	
		System.out.println("New Date is :"+newDate);
	}
}
