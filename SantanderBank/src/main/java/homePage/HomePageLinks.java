package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePageLinks extends CommonAPI {
    @FindBy(id = "PandT-10-credit-tips-someone-perfect-credit-score")
    public static WebElement tenCreditTipsLink;
    public void checkTenCreditTipsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        tenCreditTipsLink.click();
    }
    @FindBy(css = "#PandT-top-5-text-email-mobile-alerts-belong-electronic-devices")
    public static WebElement topFiveAlerts;
    public void checkTopFiveAlerts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        topFiveAlerts.click();
    }
    @FindBy(css = "#PandT-overcome-anxiety-buying-house")
    public static WebElement overComeEnxiety;
    public void checkOverComeEnxiety() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        overComeEnxiety.click();
    }
}
