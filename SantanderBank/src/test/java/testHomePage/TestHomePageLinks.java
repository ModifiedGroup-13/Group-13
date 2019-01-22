package testHomePage;

import homePage.HomePageLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePageLinks extends HomePageLinks {
    HomePageLinks homePageLinks;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        homePageLinks = PageFactory.initElements(driver, HomePageLinks.class);
    }
    @Test
    public void testTenCreditTipsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageLinks.checkTenCreditTipsLink();
    }
    @Test
    public void testTopFiveAlerts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageLinks.checkTopFiveAlerts();
    }
    @Test
    public void testOverComeEnxiety(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageLinks.checkOverComeEnxiety();
    }
    @Test
    public void testNineWaysToSave(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageLinks.checkNineWaysToSave();
    }
    @Test
    public void testAbcsOfAppProcess(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageLinks.checkAbcsOfAppProcess();
    }
}
