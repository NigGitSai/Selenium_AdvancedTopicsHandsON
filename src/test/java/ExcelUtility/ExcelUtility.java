package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static String filePath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static int rowCount;
	static int colCount;
	static int colNO;
	static FileInputStream fis;
	static Object cellValue ="";
	static boolean writeDataStatus;
	static CellType cellType;
	static FileOutputStream fw;
	public ExcelUtility(String filePath)
	{
		this.filePath = filePath;
	}
	
	public void initializeExcel() throws IOException
	{
		 fis = new FileInputStream(filePath);
		 workbook = new XSSFWorkbook(fis);
		 
	}
	
	public int returnRowCount()
	{
		rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		return rowCount;
		
	}
	
	public int returnColumnCount()
	{
		colCount = sheet.getRow(0).getLastCellNum();
		return colCount;
		
	}
	/**
	 * 
	 * @param sheetName - Sheet Name
	 * @param colName - Column Name
	 * @param rowNO - Row NO
	 * @return cellValue
	 * @throws IOException
	 */
	public Object getCellData(String sheetName,String colName,int rowNO) throws IOException
	{
		initializeExcel();
		sheet = workbook.getSheet(sheetName);
		
		colNO = -1;
		colCount = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<colCount;i++)
		{
			if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(colName))
			{
				colNO = i;
				break;
			}
		}
		if(colNO==-1)
		{
			System.out.println(" The expected column is not available in sheet. Check the value passed");
		}
		else
		{
			cell = sheet.getRow(rowNO).getCell(colNO);
			cellType = cell.getCellType();
			switch(cellType)
			{
			case STRING:
			{
				cellValue = cell.getStringCellValue();
				break;
				
			}
			case NUMERIC:
			{
				cellValue = cell.getNumericCellValue();
				break;
			}
			case BOOLEAN:
			{
				cellValue = cell.getBooleanCellValue();
				break;
			}
			default :
			{
				System.out.println(" no matching type");
				break;
			}
		}
		}
		closeExcelWorkBook();
		return cellValue;
		
	}
	
	public void closeExcelWorkBook() throws IOException
	{
		
		workbook.close();
		fis.close();
	}
	/**
	 * 
	 * @param sheetName - Sheet Name
	 * @param colName - Column Name
	 * @param rowNO - Row NO
	 * @param value - Value to write
	 * @throws IOException
	 */
	public void setCellValue(String sheetName,String colName,int rowNO,Object value) throws IOException
	{
		initializeExcel();
		sheet = workbook.getSheet(sheetName);
		colNO = -1;
		colCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<colCount; i++)
		{
			if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(colName))
			{
				colNO = i;
				break;
			}
		}
		if(colNO==-1)
		{
			colNO = colCount;
			System.out.println("The column Name is not available in excel");
			sheet.getRow(0).createCell(colNO).setCellValue(colName);
			System.out.println("Column created with ColumnName in excel "+colName);
			
		}
		
			
			if(sheet.getRow(rowNO).equals(null))
			{
				row = sheet.createRow(rowNO);
				
			}
			else
			{
				row = sheet.getRow(rowNO);
				
			}
			cell = row.createCell(colNO);
			
			if(value instanceof String)
			{
				cell.setCellValue((String) value);
				writeDataStatus = true;
			}
			else if(value instanceof Integer)
			{
				cell.setCellValue((Integer) value);
				writeDataStatus = true;
			}
			else if(value instanceof Boolean)
			{
				cell.setCellValue((Boolean) value);
				writeDataStatus = true;
			}
			else
			{
				System.out.println("No Data Written");
			}
		
		
		writeDataInExcelAndClose();
		
	}
	
	public void writeDataInExcelAndClose() throws IOException
	{
		fw = new FileOutputStream(filePath);
		workbook.write(fw);
		workbook.close();
		fw.close();
	}
}
