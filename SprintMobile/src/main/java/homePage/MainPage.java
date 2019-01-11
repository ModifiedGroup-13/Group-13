package homePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class MainPage extends CommonAPI {
//example
@FindBy(xpath = "//img[@alt='Mount Sinai']")
public static WebElement logo;


//example
public void checkLogo() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    logo.click();
}


}
