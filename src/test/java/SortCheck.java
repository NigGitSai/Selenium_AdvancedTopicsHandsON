import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SortCheck {

	public static void main(String[] args) throws ParseException {

		/*List<String> lstString = Arrays.asList("994 zfeb12","992 March2 a PASS","99 6composite10 attribute");
		List<String> sortedList = lstString.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<String> lstStringDates = Arrays.asList("19/10/2020","10/5/1990","9/6/1954");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = new Date();
		List<Date> lstDates = new ArrayList<Date>();
		for(String str : lstStringDates)
		{
			dt =dateFormat.parse(str);	
			lstDates.add(dt);
		}
		List<String> sortedDates =	lstDates.stream().sorted().map(e->dateFormat.format(e)).collect(Collectors.toList());
		System.out.println("After sorting dates ");
		System.out.println(sortedDates);*/


		List<String> lstString1 = Arrays.asList("","","1234","234525","e123");
		boolean flagAllValueIsInteger =	lstString1.stream().allMatch(e->checkAllDataIsNumbers(e));
		System.out.println("Is all value Integers - "+flagAllValueIsInteger);
		
		boolean flagAllValueIsDate =	lstString1.stream().allMatch(e->checkAllDataIsDate(e));
		System.out.println("Is all value Dates - " +flagAllValueIsDate);
		
		List<String> numberList = Arrays.asList("122424","453532","2532352","23525","112");
		
		List<String> dateList = Arrays.asList("20-05-2022","18-09-1998","19-01-2000","23-09-2013","14-05-2022");
		
		List<String> numberAndStringList = Arrays.asList("122424 ab","E4532","2532352","23525","");
		
		List<String> numberAndStringList2 = Arrays.asList("","","2532352","23525","");
		
		List<String> dateAndString = Arrays.asList("A 20-05-2022","18-09-1998 cc","19-01-2000","23-09-2013","14-05-2022");

		List<String> dateAndString2 = Arrays.asList("","18-09-1998 cc","19-01-2000","23-09-2013","14-05-2022");

	}
	
	public boolean checkAndReturnAllValueIsnumber(List<String> lstValue)
	{
	   return	lstValue.stream().allMatch(e->checkAllDataIsNumbers(e));
	}
	
	public boolean checkAndReturnAllValueIsDate(List<String> lstValue)
	{
		return lstValue.stream().allMatch(e->checkAllDataIsDate(e));
	}

	public static boolean checkAllDataIsNotString(String value)
	{
		boolean flag = true;
		try
		{
			Long longVal =	Long.parseLong(value);
			flag = false;
		}
		catch(NumberFormatException e)
		{
			flag = true;
		}
		return flag;

	}
	
	public static boolean checkAllDataIsNumbers(String value)
	{
		boolean flag = false;
		try
		{
			Long longVal =	Long.parseLong(value);
			flag = true;
		}
		catch(NumberFormatException e)
		{
			flag = false;
		}
		return flag;

	}
	public static boolean checkAllDataIsDate(String value)
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = new Date();
		boolean flag = false;
		try
		{
			dt =	format.parse(value);
	
			flag = true;
		}
		catch(ParseException e)
		{
			flag = false;
		}
		return flag;

	}

}
