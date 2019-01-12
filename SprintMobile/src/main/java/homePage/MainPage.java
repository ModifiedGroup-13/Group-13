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
    @FindBy(xpath = "//a[@title='Sign In']")
    public static WebElement Signin;
    @FindBy(xpath = "//a[contains(text(),'Espanol')]")
    public static WebElement Espanol;
    @FindBy(xpath = "//a[@class='color--black'][contains(text(),'Business')]")
    public static WebElement Business;
    @FindBy(xpath = "//a[@class='color--black'][contains(text(),'Stores')]")
    public static WebElement Stores;
    @FindBy(xpath = "//a[@title='This Is Me']")
    public static WebElement ThisIsMe;
    @FindBy(xpath = "//a[@title='This Is Us']")
    public static WebElement ThisIsUs;
    @FindBy(xpath = "//span[contains(text(),'Which iPhone is Right For You?')]")
    public static WebElement WhichiPhoneisRightForYou;
    @FindBy(xpath = "//a[@title='Upgrade my Device']")
    public static WebElement UpgrademyDevice;
    @FindBy(xpath = "//span[contains(text(),'Stay on top of your fitness goals.')]")
    public static WebElement Stayontopofyourfitnessgoals;
    @FindBy(xpath = "//body[contains(@class,'vanilla-modal')]")
    public static WebElement AddaNewLineofservice ;
    @FindBy(xpath = "//div[contains(@class,'col-md-auto py-20 border-right-md border--ash text-center')]//span[contains(text(),'Shop Now')]")
    public static WebElement ShopNow ;
    @FindBy(css = "body.vanilla-modal div.sprint-app:nth-child(2) div.ui-bucket div.ui-bucket__wrap div.ui-bucket__content.align-center:nth-child(1) div.row.row--column.height-100.top-xs div.col-xs-auto div.ui-bucket:nth-child(3) div.ui-bucket__wrap div.ui-bucket__content.align-left.container-xl:nth-child(1) div.row.row--column.height-100.top-xs div.col-xs-auto div.ui-columns div.row div.col-xs-24.col-md-auto.py-20.border-top.border-none-md.border--ash.text-center:nth-child(2) div.ui-button:nth-child(4) > a.button.button--minwidth-md.mt-20")
    public static WebElement ShopNowiPad ;
    @FindBy(xpath = "//div[contains(@class,'col-md-auto col-lg-13 col-xl-auto text-center text-left-md mt-md-20')]//a[contains(@title,'Shop Now')]")
    public static WebElement ShopNowiPhonex ;
    @FindBy(css = "body.vanilla-modal div.sprint-app:nth-child(2) div.ui-bucket div.ui-bucket__wrap div.ui-bucket__content.align-center:nth-child(1) div.row.row--column.height-100.top-xs div.col-xs-auto div.ui-bucket:nth-child(6) div.ui-bucket__wrap.my-40.bgc--ash-light.pa-40 div.ui-bucket__content.align-left.container-xl:nth-child(1) div.row.row--column.height-100.top-xs div.col-xs-auto div.ui-columns div.row.row--gutter-narrow div.col-xs-24.col-md-8.mb-20.mb-md-0:nth-child(1) div.ui-bucket div.ui-bucket__wrap div.ui-bucket__content.align-center:nth-child(1) div.row.row--column.height-100.middle-xs div.col-xs-auto div.ui-columns div.row.row--gutter-narrow.around-xs div.col-xs-auto:nth-child(1) div.text.parbase div.wysiwyg.mt-20.mb-20 > div.font-size-16.font-size-xs-14.font-size-sm-14.font-size-md-16")
    public static WebElement Readon ;
    @FindBy(xpath = "//a[contains(text(),'Shop Now')]")
    public static WebElement ShopNowiPhoneXR ;
    @FindBy(xpath = "//span[contains(text(),'Get Inspired')]")
    public static WebElement GetInspired ;
    @FindBy(xpath = "//a[@title='Find Out Now']")
    public static WebElement FindOutNow ;
    @FindBy(xpath = "//a[contains(@href,'/en/shop/cell-phones.html?INTCID=HP:PROS:B:brand:samsung&credit=A2&sort=FEATURED&manufacturer=Samsung')]//figure[contains(@class,'')]//img[contains(@class,'ui-image__file ui-image__file--responsive')]")
    public static WebElement Samsung ;
    @FindBy(xpath = "//a[contains(@href,'/en/shop/cell-phones.html?INTCID=HP:PROS:B:brand:lg&credit=A2&sort=FEATURED&manufacturer=LG')]//figure[contains(@class,'mt-20 mb-20 ml-25')]//img[contains(@class,'ui-image__file ui-image__file--responsive')]")
    public static WebElement LG ;
    @FindBy(xpath = "//a[contains(@href,'/en/shop/cell-phones.html?INTCID=HP:PROS:B:brand:Motorola&credit=A2&sort=FEATURED&manufacturer=Motorola')]//figure[contains(@class,'mt-20 mb-20 ml-25')]//img[contains(@class,'ui-image__file ui-image__file--responsive')]")
    public static WebElement Motorola ;
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
    public void checkSignin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Signin.click();
    }
    public void checkEspanol() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Espanol.click();
    }
    public void checkBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Business.click();
    }
    public void checkStores() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Stores.click();
    }
    public void checkThisIsMe() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ThisIsMe.click();
    }
    public void checkThisIsUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ThisIsUs.click();
    }
    public void checkWhichiPhoneisRightForYou() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WhichiPhoneisRightForYou.click();
    }
    public void checkUpgrademyDevice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        UpgrademyDevice.click();
    }
    public void checkStayontopofyourfitnessgoals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Stayontopofyourfitnessgoals.click();
    }

    public void checkAddaNewLineofservice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AddaNewLineofservice.click();
    }
    public void checkShopNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopNow.click();
    }
    public void checkShopNowiPad() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopNowiPad.click();
    }

    public void checkShopNowiPhonex() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopNowiPhonex.click();
    }
    public void checkReadon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Readon.click();
    }
    public void checkShopNowiPhoneXR() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopNowiPhoneXR.click();
    }
    public void checkGetInspired() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        GetInspired.click();
    }
    public void checkFindOutNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FindOutNow.click();
    }
    public void checkSamsung() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Samsung.click();
    }
    public void checkLG() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LG.click();
    }
    public void checkMotorola() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Motorola.click();
    }
}