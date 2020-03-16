package service;

import java.io.FileOutputStream;
import java.io.IOException;



import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import user.Choice;
import user.User;

//excel class
public class Excelgenerator 
{
  FileOutputStream out;
  //workbook method
  public HSSFWorkbook excelGenerate(User user,String towhom,String gift,int cost) throws IOException 
  {
    //object of HSSFWorkbook class
	HSSFWorkbook workbook=new HSSFWorkbook();
	//creating sheet
	HSSFSheet sheet = workbook.createSheet("User Details");
	//creating a row head
	HSSFRow hRow=sheet.createRow(0);
			
	//create a columns 
	hRow.createCell(0).setCellValue("Name");
	hRow.createCell(1).setCellValue("Number");
	hRow.createCell(2).setCellValue("To whom");
	hRow.createCell(3).setCellValue("Gift");
	hRow.createCell(4).setCellValue("Cost ($)");
	//getting the user data
	HSSFRow hrow = sheet.createRow(1);
	hrow.createCell(0).setCellValue(user.getName());
	hrow.createCell(1).setCellValue(user.getNumber());
	hrow.createCell(2).setCellValue(towhom);
	hrow.createCell(3).setCellValue(gift);
	hrow.createCell(4).setCellValue(cost);
	//creating a excel file
	out = new FileOutputStream("C:\\Users\\sourabh\\Desktop\\project.xlsx");
	//writing into excel
	workbook.write(out);
		
	//closing excel file		
	out.close();
	return workbook;

   }
}
