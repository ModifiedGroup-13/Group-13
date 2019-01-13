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
        driver.manage().window().maximize();
        SantanderLogo.click();
    }
    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement SearchBox;

    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        SearchBox.click();
    }
    @FindBy(xpath = "//a[text()='Personal']")
    public static WebElement Personal;

    public void checkPersonal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Personal.click();
    }
    @FindBy(xpath = "//a[text()='Business' and @class='txtOpts ']")
    public static WebElement Business;

    public void checkBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Business.click();
    }
    @FindBy(xpath = "//a[text()='Commercial']")
    public static WebElement Commercial;

    public void checkCommercial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Commercial.click();
    }
    @FindBy(xpath = "//a[text()='About' and @class='txtOpts ']")
    public static WebElement About;

    public void checkAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        About.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement Login;

    public void checkLogin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Login.click();
    }
    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement SantanderCommercialBanking;

    public void checkSantanderCommercialBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        SantanderCommercialBanking.click();
    }

    @FindBy(xpath = "//span[text()='Banking']")
    public static WebElement Banking;

    public void checkBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Banking.click();
    }

    @FindBy(xpath = "//span[text()='Borrowing']")
    public static WebElement Borrowing;

    public void checkBorrowing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Borrowing.click();
    }

    @FindBy(xpath = " //span[text()='Investments and Protection']")
    public static WebElement InvestmentsAndProtection;

    public void checkInvestmentsAndProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        InvestmentsAndProtection.click();
    }

    @FindBy(xpath = " //span[text()='Credit Cards']")
    public static WebElement CreditCards;

    public void checkCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        CreditCards.click();
    }

    @FindBy(xpath = "//span[text()='Prosper and Thrive']")
    public static WebElement ProsperAndThrive;

    public void checkProsperAndThrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        ProsperAndThrive.click();
    }

    @FindBy(xpath = "//a[text() = 'ATM/Branch Locator']")
    public static WebElement ATMBranchLocator;

    public void checkATMBranchLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        ATMBranchLocator.click();
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
    public static WebElement UsefulLinksAndDocuments;

    public void checkUsefulLinksAndDocuments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        UsefulLinksAndDocuments.click();
    }
    @FindBy(xpath = "//a[@href='#Checking']")
    public static WebElement Checking;

    public void checkChecking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        Checking.click();
    }
    @FindBy(xpath = "//img[@class='image']")
    public static WebElement image;

    public void checkImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        image.click();
    }
}

