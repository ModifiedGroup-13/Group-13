package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

    public class MainPage extends CommonAPI {
    @FindBy(xpath = "//img[@src='https://www.santanderbank.com/us/documents/22507/1276166/im-wcsanusa-logo-7-19-18/dcfe6d3c-58ab-445d-8e8c-7c876435b87b']")
    public static WebElement santanderLogo;

    public void checkSantanderLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderLogo.click();
    }
    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement searchBox;

    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        searchBox.click();
    }
    @FindBy(xpath = "//a[text()='Personal']")
    public static WebElement personal;

    public void checkPersonal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        personal.click();
    }
    @FindBy(xpath = "//a[text()='Business' and @class='txtOpts ']")
    public static WebElement business;

    public void checkBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        business.click();
    }
    @FindBy(xpath = "//a[text()='Commercial']")
    public static WebElement commercial;

    public void checkCommercial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        commercial.click();
    }
    @FindBy(xpath = "//a[text()='About' and @class='txtOpts ']")
    public static WebElement about;

    public void checkAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        about.click();
    }
    @FindBy(xpath = "//img[@class='image_full']")
    public static WebElement fullimage;

    public void checkFullImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        fullimage.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement login;

    public void checkLogin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        login.click();
    }
    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement santanderCommercialBanking;

    public void checkSantanderCommercialBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderCommercialBanking.click();
    }
    @FindBy(xpath = "//span[text()='Banking']")
    public static WebElement banking;

    public void checkBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        banking.click();
    }
    @FindBy(xpath = "//span[text()='Borrowing']")
    public static WebElement borrowing;

    public void checkBorrowing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        borrowing.click();
    }
    @FindBy(xpath = " //span[text()='Investments and Protection']")
    public static WebElement investmentsAndProtection;

    public void checkInvestmentsAndProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        investmentsAndProtection.click();
    }
    @FindBy(xpath = " //span[text()='Credit Cards']")
    public static WebElement creditCards;

    public void checkCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        creditCards.click();
    }
    @FindBy(xpath = "//span[text()='Prosper and Thrive']")
    public static WebElement prosperAndThrive;

    public void checkProsperAndThrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        prosperAndThrive.click();
    }
    @FindBy(xpath = "//a[text() = 'ATM/Branch Locator']")
    public static WebElement aTMBranchLocator;

    public void checkATMBranchLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        aTMBranchLocator.click();
    }
    @FindBy(xpath = "//a[@class='button01 trk-btn']")
    public static WebElement findALocationNearYou;

    public void checkFindALocationNearYou() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        findALocationNearYou.click();
    }
    @FindBy(xpath = "//h4[text()='Contact Us']")
    public static WebElement contactUs;

    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        contactUs.click();
    }
    @FindBy(xpath = "//h4[text()='Privacy Policy']")
    public static WebElement privacyPolicy;

    public void checkPrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        privacyPolicy.click();
    }
    @FindBy(xpath = "//h4[text()='Terms of Use']")
    public static WebElement termsOfUse;

    public void checkTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        termsOfUse.click();
    }
    @FindBy(xpath = "//h4[text()='Home']")
    public static WebElement home;

    public void checkHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        home.click();
    }
    @FindBy(xpath = "//p[contains(text(),'Useful Links and Documents')]")
    public static WebElement usefulLinksAndDocuments;

    public void checkUsefulLinksAndDocuments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        usefulLinksAndDocuments.click();
    }
    @FindBy(xpath = "//a[@href='#Checking']")
    public static WebElement checking;

    public void checkChecking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        checking.click();
    }
    @FindBy(xpath = "//img[@class='image']")
    public static WebElement image;

    public void checkImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        image.click();
    }
    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement respectAddsUp;

    public void checkRespectAddsUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        respectAddsUp.click();
    }
    @FindBy(xpath = "//span[contains(text(),'FAQs')]")
    public static WebElement fAQs;

    public void checkFAQs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        fAQs.click();
    }
}
