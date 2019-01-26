package homePage;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//button//span[text()='Search']")
    public static WebElement searchKey;
    @FindBy(xpath = "//div[@class='sprint-brand-header-search']//input[@type='search']")
    public static WebElement searchField;
    @FindBy(id = "doc-48f933b2d075728595c2e7d3082744aa")
    public static WebElement device;

    public void checksearchKey() throws InterruptedException {
        TestLogger.log(SearchPage.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
       // Thread.sleep(2000);
       // searchField.sendKeys(searchKey, Keys.ENTER);
        searchField.sendKeys("iphone");
        Thread.sleep(2000);
       // device.click();
        //wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchBySubmitButton(String searchKeys) throws InterruptedException {
        TestLogger.log(SearchPage.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        searchField.sendKeys(searchKeys);
        Thread.sleep(2000);
        device.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
}