package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {
    MainPage mainPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void popupClose() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.alarWin1();
    }

    @Test
    public void testViewWeddingReg() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.alarWin1();
        mainPage.checkWeddingReg();
        driver.getCurrentUrl();
        mainPage.checkPrint();
    }

    @Test
    public void testSignin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.alarWin1();
        mainPage.checkSignIn();
        mainPage.alarWin1();
    }

    @Test
    public void testPrint() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkPrint();
    }

    @Test
    public void testSearchPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.alarWin1();
        mainPage.checkSearchPage();
        mainPage.alarWin1();
    }
}
