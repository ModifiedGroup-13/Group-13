package dataDrivenExcel;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static homePage.MainPage.login;

public class ExcelReader extends CommonAPI {


            public static void main (String[]args) throws IOException {
                File excelFile = new File("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\dataDrivenExcel\\Book1.xlsx");
                FileInputStream fileInputStream = new FileInputStream(excelFile);
                XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
                XSSFSheet sheet1 = workbook.getSheetAt(0);

                int rowcount = sheet1.getLastRowNum();
                System.out.println("Total number of row is " + rowcount);

                for (int i = 1; i <= rowcount; i++) {
                    String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
                    String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
                    System.out.println("Account holders User name is " + data0 + " and password is " + data1);
                }
                workbook.close();

                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\Generic\\browserDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.santanderbank.com/us/personal");
                driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
                driver.manage().window().maximize();
                login.click();
                driver.findElement(By.xpath("//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.alias']")).sendKeys("data0");
                driver.findElement(By.xpath("//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.pwd']")).sendKeys("data1");
                driver.close();
            }
}