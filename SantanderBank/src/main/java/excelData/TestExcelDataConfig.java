package excelData;

public class TestExcelDataConfig {

    public static void main(String[] args) {
        ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\main\\java\\excelData\\Book1.xlsx");
        System.out.println(excel.getData(1, 0, 0));
    }
}

