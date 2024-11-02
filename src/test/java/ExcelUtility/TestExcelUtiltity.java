package ExcelUtility;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class TestExcelUtiltity {

	@Test
	public void retireveHashMapForMatchingRow() throws IOException
	{
		ExcelUtility excelReader = new ExcelUtility("./src/test/resources/LoginTest.xlsx");
		
	LinkedHashMap<String, Object> hmget =	  excelReader.returnHashMapForExcelRow("LoginData","Smoke");
	
	System.out.println(hmget.entrySet());
	hmget.get("Username");
	}
}
