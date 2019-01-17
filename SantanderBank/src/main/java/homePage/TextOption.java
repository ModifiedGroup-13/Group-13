package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TextOption extends CommonAPI {
    // Find Elements for Banking by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking;
    @FindBy(xpath = "//a[contains(text(),'Checking')]")
    public static WebElement Checking;
    public void Banking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(Checking).perform();
    }
    //Find Elements for Business by HoverOver option
    @FindBy (xpath = "//span[contains(text(),'Business First')]")
    public static WebElement BusinessFirst;
    @FindBy (xpath = "//a[contains(text(),'Business First')]")
    public static WebElement BusinessFirst2;
    public void BusinessFirst(){
        Actions actions = new Actions(driver);
        actions.moveToElement(BusinessFirst).perform();
        actions.moveToElement(BusinessFirst2).perform();
    }
    //Find Elements for Borrowing by HoverOver option
    @FindBy (xpath = "//span[contains(text(),'Borrowing')]")
    public static WebElement Borrowing;
    @FindBy (xpath = "//a[contains(text(),'Borrowing Options')]")
    public static WebElement BorrowingOption;
    public void Borrowing(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(BorrowingOption).perform();
    }
}
