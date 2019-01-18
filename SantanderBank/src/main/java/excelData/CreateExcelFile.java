package excelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class CreateExcelFile {
public static void main(String[] args) {
    try{
        XSSFWorkbook workbook = new XSSFWorkbook();
        FileOutputStream out = new FileOutputStream("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\test\\Book1.xlsx");
        XSSFSheet Spreadsheet = workbook.createSheet("LogInData");
        workbook.write(out);
        out.close();
    }catch (Exception e){
        System.out.println(e);
    }
    System.out.println("Excel File Created");
}
}

