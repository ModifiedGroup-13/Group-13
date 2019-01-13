package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.BaseUtil.convertToString;

public class College extends BaseUtil {
    @FindBy(css = ".rclCloseBtnWrapper")
    public static WebElement ClosePopUp;
    @FindBy(id = "college")
    public static WebElement College;
    @FindBy(xpath = "//*[@id=\'tabPanel2\']/div/div/div/section/div/ul/li[1]/a")
    public static WebElement ShopForCollege;
    @FindBy(xpath = "//*[@id=\'tabPanel2\']/div/div/div/section/div/ul/li[3]/a")
    public static WebElement Tools;
    @FindBy(css ="#rclModal > button")
    public static WebElement alertWin;
    public void alarWin1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertWin.click();
    }
}
