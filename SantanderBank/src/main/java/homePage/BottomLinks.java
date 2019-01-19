package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BottomLinks extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Get Started')]")
    public static WebElement getStarted;

    public void checkGetStarted() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        getStarted.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Correspondent Mortgage Lending')]")
    public static WebElement correspondMLending;

    public void checkCorrespondMLending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        correspondMLending.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Broker Mortgage Origination')]")
    public static WebElement brokerMortgageOrigination;

    public void checkBrokerMortgageOrigination() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        brokerMortgageOrigination.click();
    }
 /*   @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Santander Universities')]")
    public static WebElement santanderUniversities;

    public void checksantanderUniversities() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        santanderUniversities.click();
    }*/
}