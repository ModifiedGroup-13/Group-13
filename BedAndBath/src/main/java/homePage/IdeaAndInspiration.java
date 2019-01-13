package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class IdeaAndInspiration extends BaseUtil {
    @FindBy (css = "TabButton-inline_2jeqS0")
    public static WebElement Inspiration;
    @FindBy(css ="#rclModal > button")
    public static WebElement alertWin;
    @FindBy (xpath ="//*[@id=\'top-nav-menu\']/li[3]")
    public static WebElement insp;



    public void alarWin1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertWin.click();
    }
    public void CheckInspiration(){
        Inspiration.click();
    }
    public void checkInsp(){
        insp.click();
    }
}
