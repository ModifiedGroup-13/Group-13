package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestMainPage extends MainPage {
    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
    TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testSantanderLogo(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    mainPage.checkSantanderLogo();
    }
    @Test
    public void testSearchBox() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkSearchBox();
    }
    @Test
    public void testPersonal() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkPersonal();
    }
    @Test
    public void testBusiness() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkBusiness();
    }
    @Test
    public void testCommercial() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkCommercial();
    }
    @Test
    public void testAbout() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkAbout();
    }
    @Test
    public void testFullImage() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkFullImage();
    }
    @Test
    public void testLogin() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkLogin();
    }
    @Test
    public void testSantanderCommercialBanking() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkSantanderCommercialBanking();
    }
    @Test
    public void testBorrowing() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkBorrowing();
    }
    @Test
    public void testBanking() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkBanking();
    }
    @Test
    public void testCreditCards() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkCreditCards();
    }
    @Test
    public void testProsperAndThrive() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkProsperAndThrive();
    }
    @Test
    public void testATMBranchLocator() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkATMBranchLocator();
    }
    @Test
    public void testFindALocationNearYou() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkFindALocationNearYou();
    }
    @Test
    public void testContactUs() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkContactUs();
    }
    @Test
    public void testPrivacyPolicy() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkPrivacyPolicy();
    }
    @Test
    public void testTermsOfUse() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkTermsOfUse();
    }
    @Test
    public void testHome() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkHome();
    }
    @Test
    public void testUsefulLinksAndDocuments() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkUsefulLinksAndDocuments();
    }
    @Test
    public void testChecking() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkChecking();
    }
    @Test
    public void testImage() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkImage();
    }
    @Test
    public void testRespectAddsUp() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkRespectAddsUp();
    }
    @Test
    public void testFAQs() {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mainPage.checkFAQs();
    }
    @Test
    public void webElementName(){
        List actual = (List) mainPage.webElementList();
        List expected = (List) mainPage.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }
}
