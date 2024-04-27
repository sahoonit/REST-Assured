package utilsutity;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public void getRowcount() throws Exception
	{
	    String excelPath ="\\Users\\asus\\eclipse-workspace\\RESTAssuredAutomation\\Data";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
	}

}
