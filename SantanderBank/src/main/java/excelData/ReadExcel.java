package excelData;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel extends CommonAPI {
public static void main(String[] args) throws IOException {
    File src = new File("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\test\\Book1.xlsx");
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1  = wb.getSheetAt(0);
    String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
    System.out.println("UserName from Excel is "+ data0);
    String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
    System.out.println("Password from Excel is "+ data1);
    wb.close();
}
}
