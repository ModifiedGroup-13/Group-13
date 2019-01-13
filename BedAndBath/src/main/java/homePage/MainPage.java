package homePage;
import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    //Example
    @FindBy(id = "top-nav-menu")
    public static WebElement WeddingReg;
    @FindBy(id = "accountLink")
    public static WebElement SignIn;
    @FindBy(id = "app")
    public static WebElement Print;
    @FindBy(id = "searchInput")
    public static WebElement SearchPage;
    @FindBy(id = "firstTopNavItem")
    public static WebElement Product;
    @FindBy(id = "tabPanel0")
    public static WebElement PersonalizeGift;
    @FindBy(css ="#rclModal > button")
    public static WebElement alertWin;

    public void alarWin1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alertWin.click();
    }
    public void checkWeddingReg() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WeddingReg.click();
    }
    public void checkSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignIn.click();
    }
    public void checkPrint() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Print.click();
    }
    public void checkSearchPage()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage.sendKeys("mugs", Keys.ENTER);
    }
    public void checkProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Product.click();
    }
    public void checkPersonalizeGift()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        PersonalizeGift.click();

    }
}