package loginTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class TestLogin {
	 
	
	public static void main(String args[]) throws IOException{
		HSSFWorkbook workbook;
		HSSFSheet sheet;
		HSSFCell cell1;
		HSSFCell cell2;
		HSSFCell cell3;
		HSSFCell cell4;
		FileInputStream fs = new FileInputStream ("C:\\Users\\USER\\Desktop\\selenium_interview_questions\\poi.xls");
		
		//load the work book
		workbook = new HSSFWorkbook(fs);
		sheet = workbook.getSheetAt(0);
		cell3=sheet.getRow(0).createCell(4);
		cell4=sheet.getRow(0).createCell(5);
		
		for(int i=1; i<=sheet.getLastRowNum();i++) {
			cell1 = sheet.getRow(i).getCell(0);
			DataFormatter formatter = new DataFormatter();
			String strValue = formatter.formatCellValue(cell1);
			cell2=sheet.getRow(i).getCell(1);
			String strValue2 = formatter.formatCellValue(cell2);
			
			if(strValue!="User name" || strValue2!=" Password") {
				System.out.println("User name: "+strValue + " Password: "+strValue2);
			}
			
		}
		
		/*String writeValue1 ="Result";
		String writeValue2 ="Comment";
		
		
		cell3.setCellValue("Result");
		
		
		cell4.setCellValue("Comment");*/
	
		
		
	}
}
    