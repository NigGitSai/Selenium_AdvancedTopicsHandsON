package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
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
	static Iterator<Row> rows;
	static Iterator<Cell> cellValues;
	static String columnName;

	protected static LinkedHashMap<String,Object> hm;

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

	/**
	 * 
	 * @param sheetName - Sheet Name
	 * @param rowData - Row Data
	 * @param columnName - Column Name
	 * @return - Cell Value as String
	 * @throws IOException
	 */
	public String getRequiredDataUsingIterator(String sheetName,String rowData,String columnName) throws IOException
	{
		initializeExcel();
		sheet = workbook.getSheet(sheetName);

		Iterator<Row> rows= sheet.iterator();

		Row firstRow = rows.next();

		Iterator<Cell> column = firstRow.cellIterator();


		int counter =0;
		while(column.hasNext())
		{
			cell =	 (XSSFCell) column.next();
			if(cell.getStringCellValue().equals(columnName))
			{
				colNO = counter;
				break;
			}
			counter++;
		}

		while(rows.hasNext())
		{
			row = (XSSFRow) rows.next();

			if(row.getCell(0).getStringCellValue().equals(rowData))
			{
				cell = row.getCell(colNO);

				cellType = cell.getCellType();

				switch(cellType)
				{
				case STRING:
				{
					cellValue =  cell.getStringCellValue();
					break;
				}
				case NUMERIC:
				{
					cellValue =  cell.getNumericCellValue();
					break;
				}
				case BOOLEAN:
				{
					cell.getBooleanCellValue();
					break;
				}
				default :
				{
					System.out.println(" no matching type");
					break;
				}

				}


			}
		}
		closeExcelWorkBook();
		return String.valueOf(cellValue);
	}

	public LinkedHashMap<String,Object> returnHashMapForExcelRow(String sheetName, String rowInfo) throws IOException
	{
		initializeExcel();
		hm = new LinkedHashMap<String, Object>();
		sheet = workbook.getSheet(sheetName);

		rows= sheet.rowIterator();
		Iterator<Cell> columns =  sheet.getRow(0).cellIterator();

		outerLoop:
			while(rows.hasNext())
			{
				row = (XSSFRow) rows.next();
				cell = row.getCell(0);
				if(cell.getStringCellValue().equals(rowInfo))
				{
					cellValues = row.cellIterator();
					break outerLoop;
				}
			}

		while(columns.hasNext())
		{
			columnName = columns.next().getStringCellValue();
			System.out.println("Column Name "+columnName);
			cell = (XSSFCell) cellValues.next();
			cellType = cell.getCellType();
			switch(cellType)
			{
			case STRING:
			{
				cellValue  = cell.getStringCellValue();
				break;
			}
			case NUMERIC:
			{
				cellValue = cell .getNumericCellValue();
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
			System.out.println("CellValue : "+cellValue);
			hm.put(columnName,cellValue);


		}

		return hm;
	}
}
