package StringPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat fromFormat = new SimpleDateFormat("MM/dd/yyyy");
		String expDate = "09/10/2024";
		Date objDt = fromFormat.parse(expDate);
		
		
		Calendar cal = Calendar.getInstance();
		 cal.setTime(objDt);
		cal.add(Calendar.DATE, 2);
		
		
		 Date newDt = cal.getTime();
		String newDate = fromFormat.format(newDt);
		System.out.println("New date is :"+newDate);
	}

}
