package ExcelUtility;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadAndWriteExcel {

	@Test
	public void verifyReadAndWriteExcel() throws IOException
	{
		ExcelUtility excelReader = new ExcelUtility("./src/test/resources/LoginTest.xlsx");
		excelReader.initializeExcel();
		String userName = String.valueOf(excelReader.getCellData("LoginData", "Username",1));
		System.out.println("User Name :"+userName);
		
		excelReader.setCellValue("LoginData", "Username", 2, "auaptest@bd.com");
		
		userName = String.valueOf(excelReader.getCellData("LoginData", "Username",2));
		System.out.println("User Name :"+userName);
		
		excelReader.setCellValue("LoginData", "CartCount", 3, 4);
		
		String cartCount = String.valueOf(excelReader.getCellData("LoginData", "CartCount", 3));
		double count = Double.parseDouble(cartCount);
		System.out.println("Cart count :"+ count);
	}
}
