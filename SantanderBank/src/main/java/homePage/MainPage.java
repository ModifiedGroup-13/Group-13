package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends CommonAPI {
    @FindBy(xpath = "//img[@alt = 'Santander Bank N.A.']")
    public static WebElement SantanderLogo;

    public void checkSantanderLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SantanderLogo.click();
    }


}