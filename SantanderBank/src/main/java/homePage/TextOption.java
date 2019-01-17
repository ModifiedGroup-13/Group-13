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
        actions.moveToElement(Checking);
    }
}
