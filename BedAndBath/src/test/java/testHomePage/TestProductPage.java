package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestProductPage extends MainPage {
    MainPage MP;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MP = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testviewProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MP.alarWin1();
        MP.checkProduct();
        MP.checkPersonalizeGift();
        MP.checkPrint();
    }
    @Test
    public void testviewPersonalizeGift()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MP.alarWin1();
        MP.wait(5);
        MP.checkPersonalizeGift();
    }
}