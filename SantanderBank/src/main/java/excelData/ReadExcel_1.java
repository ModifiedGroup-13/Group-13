package excelData;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel_1 extends CommonAPI {
public static void main(String[] args) throws IOException {
    File src = new File("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\test\\Book1.xlsx");
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1  = wb.getSheetAt(0);
    int rowcount = sheet1.getLastRowNum();
    System.out.print("Total rows is "+rowcount);
    for (int i = 0; i<=rowcount; i++)
    {
        String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
        String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
        System.out.println("Account holders User name is " + data0 + " and password is " + data1);
    }
    wb.close();
}
}

