package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PageTitle extends BaseUtil {
    @FindBy (id ="Logo")
    public static WebElement pageLogo;
    @FindBy (css = "Bed Bath and beyond")
    public static WebElement pageTitle;
    @FindBy(css = "Footer_2WwfU0 center")
    public static WebElement pageFooter;
    @FindBy(css ="#rclModal > button")
    public static WebElement alertWin;
    public void setalarWin1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertWin.click();
    }
    public void setPageLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pageLogo.click();
    }
    public void setPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pageTitle.getText();
    }
    public void setPageFooter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pageFooter.click();
    }
}