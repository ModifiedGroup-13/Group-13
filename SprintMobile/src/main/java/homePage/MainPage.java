package homePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class MainPage extends CommonAPI {

    @FindBy(xpath = "//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Shop Devices')]")
    public static WebElement ShopDevices;

    @FindBy(xpath = "//body[contains(@class,'vanilla-modal')]/div[@class='sprint-app']/header[@class='layout-header new-layout']/div/div[@class='sprint-header-bottom new-header-bottom']/div[@class='sprint-header-inner new-header']/div[@class='sprint-header-meta']/nav[@class='sprint-header-nav sprint-header-nav__alt new-header hide-with-overlay']/div/div/ul[@class='sprint-menu sprint-new-alt--menu show-desktop hide-mobile']/li[2]/a[1]")
    public static WebElement ShopPlans;
    @FindBy(xpath = "//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Support')]")
    public static WebElement Support;
    @FindBy(xpath = "//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'My nt Activate;Sprint')]")
    public static WebElement MySprint;
    @FindBy(xpath = "//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Activate')]")
    public static WebElement Activate;
    @FindBy(xpath = "//span[contains(text(),'Call to order')]")
    public static WebElement Calltoorder;
    @FindBy(xpath = "//span[@class='font-size-12']")
    public static WebElement Search;
    @FindBy(xpath = "//p[contains(text(),'Cart')]")
    public static WebElement Cart;

    public void checkShopDevices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopDevices.click();
    }

    public void checkShopPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopPlans.click();
    }
    public void checkSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Support.click();
    }

    public void checkMySprint() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MySprint.click();
    }
    public void checkActivatet() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Activate.click();
    }
    public void checkCalltoorder() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Calltoorder.click();
    }
    public void checkSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.click();
    }
    public void checkCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Cart.click();
    }



}