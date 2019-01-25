package excelReader;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button//span[text()='Search']")
    public static WebElement searchKey;
    @FindBy(xpath = "//div[@class='sprint-brand-header-search']//input[@type='search']")
    public static WebElement searchField;
    //    @FindBy(id = "doc-48f933b2d075728595c2e7d3082744aa")
//    public static WebElement device;
    public void searchFromExcel() throws InterruptedException {
        ExcelReaderUtil excelReader = new ExcelReaderUtil("C:\\Users\\imran\\Desktop\\clone\\Group-13\\SprintMobile\\Data\\Book1.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        searchKey.click();
        Thread.sleep(500);
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchField.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
           searchField.click();

           searchField.clear();
        }
    }
}