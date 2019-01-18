package test;

import excelData.ExcelDataConfig;

public class TestExcelReaderPage {
public static void main(String[] args) {
    ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\test\\Book1.xlsx");
    System.out.println(excel.getData(1, 0, 0));
}
}

