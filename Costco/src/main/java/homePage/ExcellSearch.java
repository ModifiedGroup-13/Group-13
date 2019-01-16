package homePage;

import Helper.ExcellReader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExcellSearch extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"search-field\"]")
    public static WebElement searchField;
//    @FindBy(xpath= "//div[@class='inner-addon right-addon flex-child']//i[@class='co-search-thin']")
//    public static WebElement submitButton;


    public void searchfromExcel() throws InterruptedException {
        ExcellReader simmplexlreader = new ExcellReader("C:\\Users\\nafas\\Desktop\\sohag\\Group-13\\Costco\\src\\main\\java\\Helper\\TestData.xlsx");
        int rowcount = simmplexlreader.getRowCount(0);
        searchField.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = simmplexlreader.getData(0, i, 0);
            searchField.sendKeys(searchItems, Keys.ENTER);
            searchField.clear();
            Thread.sleep(500);
        }}
}
