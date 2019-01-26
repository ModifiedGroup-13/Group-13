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
    @FindBy(xpath = "//a[contains(@href,'/en/shop/cell-phones/samsung-galaxy-note9.html?INTCID=HP:PROS:B:phones:SGN9')]//figure[contains(@class,'soar-selection--simple')]//picture//img[contains(@class,'ui-image__file--responsive')]")
    public static WebElement SamsungGalaxyNote9 ;
    @FindBy(xpath = "//div[contains(@class,'text-center')]//span[contains(text(),'Shop Today')]")
    public static WebElement ShopTodayGalaxyS9 ;
    @FindBy(xpath = "//div[contains(@class,'mt-40')]//div[contains(@class,'center-xs start-md')]//span[contains(text(),'Call 1-844-812-0613')]")
    public static WebElement Call ;
    @FindBy(xpath = "//div[contains(@class,'col-md-auto py-20 border-right-md border--ash pr-md-40 text-center text-left-lg')]//a[contains(@title,'Shop Now')]")
    public static WebElement GalaxyWatch ;
    @FindBy(xpath = "//div[contains(@class,'col-md-auto py-20 border-top border-none-md border--ash pl-md-40 text-center text-left-lg')]//a[contains(@title,'Call 1-844-812-0613')]")
    public static WebElement GalaxyTab ;
    @FindBy(xpath ="/html/body/div[1]/header/div[2]/div/div[1]/div[1]/nav/div/div/ul[1]/li[1]/div/div/div/div/a")
    public static WebElement LearnMore ;
    @FindBy(xpath =" //*[@id=\"main\"]/div[3]/div/div/div/div/div[6]/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[3]/div/div[1]/div/div/div/strong/a")
    public static WebElement ReadOn ;
    @FindBy(xpath =" //a[contains(text(),'Shop Now')]")
    public static WebElement ShopNow1 ;
    @FindBy(xpath ="//div[contains(@class,'row row--column height-100 middle-xs')]//span[contains(text(),'Learn More')]")
    public static WebElement LearnMore1 ;
    @FindBy(xpath ="//*[@id=\"main\"]/div[3]/div/div/div/div/div[6]/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div[3]/a/span")
    public static WebElement FindOutNow1 ;
    @FindBy(xpath ="//span[contains(text(),'Which iPhone is Right For You?')]")
    public static WebElement WhichiPhone ;
    @FindBy(xpath ="//a[@title='Upgrade my Device']")
    public static WebElement UpgradeMyDevice ;
    @FindBy(xpath ="//a[contains(@title,'Add a New Line of Service')]")
    public static WebElement AddaNewLineofService  ;
    @FindBy(xpath ="//span[contains(text(),'Stay on top of your fitness goals.')]")
    public static WebElement FitnessGoals  ;
    @FindBy(xpath ="//div[contains(@class,'col-md-auto py-20 border-right-md border--ash text-center')]//a[contains(@title,'Shop Now')]")
    public static WebElement ShopNow2  ;
    @FindBy(xpath ="//body[contains(@class,'vanilla-modal')]")
    public static WebElement ShopNow3  ;
    @FindBy(xpath ="//div[contains(@class,'col-md-16 text-center text-left-md')]//span[contains(text(),'Call 1-844-812-0613')]")
    public static WebElement Call18448120613  ;
    @FindBy(xpath ="//div[contains(@class,'align-center')]//a[contains(@title,'Learn More')]")
    public static WebElement LearnMore2 ;
    @FindBy(xpath ="//*[@id=\"main\"]/div[14]/div/div/div/div/div[2]/div/div/div/div/div/div[4]/a/span")
    public static WebElement CallNow18448120613 ;
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
    public void checkSamsungGalaxyNote9() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SamsungGalaxyNote9.click();
    }
    public void checkCall() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Call.click();
    }
    public void checkShopTodayGalaxyS9() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopTodayGalaxyS9.click();
    }
    public void checkGalaxyWatch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        GalaxyWatch.click();
    }
    public void checkGalaxyTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        GalaxyTab.click();
    }
    public void checkLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LearnMore.click();
    }
    public void checkReadOn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ReadOn.click();
    }
    public void checkShopNow1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ShopNow1.click();
    }
    public void checkLearnMore1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LearnMore1.click();
    }
    public void checkFindOutNow1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FindOutNow1.click();
    }
    public void checkWhichiPhone() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WhichiPhone.click();
    }
    public void checkUpgradeMyDevice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        UpgradeMyDevice.click();
    }
    public void checkAddaNewLineofService() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        AddaNewLineofService.click();
    }
    public void checkFitnessGoals() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        FitnessGoals.click();
    }
    public void checkShopNow2() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        ShopNow2.click();
    }
    public void checkShopNow3() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
     }.getClass().getEnclosingMethod().getName()));
        ShopNow3.click();
   }
    public void checkCall18448120613() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        ShopNow3.click();
    }
    public void checkLearnMore2() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        LearnMore2.click();
    }
    public void checkCallNow18448120613() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        CallNow18448120613.click();
    }
}