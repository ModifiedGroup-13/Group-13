package excelSheetReader;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//input[@id='_P001_Header_WAR_P001_Headerportlet_search']")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReaderUtil excelReader = new ExcelReaderUtil("C:\\Users\\Manir\\Desktop\\GroupProject\\Group-13\\SantanderBank\\src\\test\\java\\dataFeatures\\Book1.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchBox.clear();
        }
    }
}