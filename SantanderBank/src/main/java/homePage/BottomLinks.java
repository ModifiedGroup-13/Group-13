package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BottomLinks extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;
    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Get Started')]")
    public static WebElement getStarted;
    public void checkGetStarted() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        getStarted.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Correspondent Mortgage Lending')]")
    public static WebElement correspondMLending;
    public void checkCorrespondMLending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        correspondMLending.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Broker Mortgage Origination')]")
    public static WebElement brokerMortgageOrigination;
    public void checkBrokerMortgageOrigination() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        brokerMortgageOrigination.click();
    }
    @FindBy(xpath = "//span[contains(text(),'About Us')]")
    public static WebElement aboutUs;
    public void checkAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        aboutUs.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Media Center')]")
    public static WebElement mediaCenter;
    public void checkMediaCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        mediaCenter.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Shareholder Relations')]")
    public static WebElement shareholderRelations;
    public void checkShareholderRelations() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        shareholderRelations.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Community')]")
    public static WebElement community;
    public void checkCommunity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        community.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Careers')]")
    public static WebElement careers;
    public void checkCareers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        careers.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Customer Service')]")
    public static WebElement customerService;
    public void checkCustomerService() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        customerService.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Site Map')]")
    public static WebElement siteMap;
    public void checkSiteMap() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        siteMap.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Accessibility')]")
    public static WebElement accessibility;
    public void checkAccessibility() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        accessibility.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Servicemember Civil Relief Act (SCRA) Benefits')]")
    public static WebElement faceBookImage;
    public void checkFaceBookImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        faceBookImage.click();
    }
 }