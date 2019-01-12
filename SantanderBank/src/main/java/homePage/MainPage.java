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
        SantanderLogo.click();
    }
    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement SearchBox;

    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchBox.click();
    }
    @FindBy(xpath = "//a[text()='Personal']")
    public static WebElement Personal;

    public void checkPersonal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Personal.click();
    }
    @FindBy(xpath = "//a[text()='Business' and @class='txtOpts ']")
    public static WebElement Business;

    public void checkBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Business.click();
    }
    @FindBy(xpath = "//a[text()='Commercial']")
    public static WebElement Commercial;

    public void checkCommercial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Commercial.click();
    }
    @FindBy(xpath = "//a[text()='About' and @class='txtOpts ']")
    public static WebElement viewAbout;

    public void checkviewAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewAbout.click();
    }

    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement viewSantanderCommercialBanking;

    public void checkviewSantanderCommercialBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewSantanderCommercialBanking.click();
    }

    @FindBy(xpath = "//span[text()='Banking']")
    public static WebElement viewBanking;

    public void checkviewBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewBanking.click();
    }

    @FindBy(xpath = " //span[text()='Borrowing']")
    public static WebElement viewBorrowing;

    public void checkviewBorrowing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewBorrowing.click();
    }

    @FindBy(xpath = " //span[text()='Investments and Protection']")
    public static WebElement viewInvestmentsAndProtection;

    public void checkviewInvestmentsAndProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewInvestmentsAndProtection.click();
    }

    @FindBy(xpath = " //span[text()='Credit Cards']")
    public static WebElement viewCreditCards;

    public void checkviewCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewCreditCards.click();
    }

    @FindBy(xpath = "//span[text()='Prosper and Thrive']")
    public static WebElement viewProsperAndThrive;

    public void checkviewProsperAndThrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewProsperAndThrive.click();
    }

    @FindBy(xpath = "//a[text() = 'ATM/Branch Locator']")
    public static WebElement viewATMBranchLocator;

    public void checkviewATMBranchLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewATMBranchLocator.click();
    }

    @FindBy(xpath = "//a[@class='button01 trk-btn']")
    public static WebElement findALocationNearYou;

    public void checkFindALocationNearYou() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findALocationNearYou.click();
    }

    @FindBy(xpath = "//h4[text()='Contact Us']")
    public static WebElement contactUs;

    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUs.click();
    }
    @FindBy(xpath = "//h4[text()='Privacy Policy']")
    public static WebElement privacyPolicy;

    public void checkPrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyPolicy.click();
    }
    @FindBy(xpath = "//h4[text()='Terms of Use']")
    public static WebElement termsOfUse;

    public void checkTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        termsOfUse.click();
    }
    @FindBy(xpath = "//h4[text()='Home']")
    public static WebElement home;

    public void checkHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        home.click();
    }
    @FindBy(xpath = "//p[contains(text(),'Useful Links and Documents')]")
    public static WebElement UsefulLinksAndDocuments;

    public void checkUsefulLinksAndDocuments() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        UsefulLinksAndDocuments.click();
    }
    @FindBy(xpath = "//a[@href='#Checking']")
    public static WebElement Checking;

    public void checkChecking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        Checking.click();
    }
}