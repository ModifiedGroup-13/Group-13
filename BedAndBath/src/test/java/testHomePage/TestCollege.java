package testHomePage;


import homePage.College;
import homePage.MainPage;
import homePage.Products;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.Set;

public class TestCollege extends College {
College clg;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clg = PageFactory.initElements(driver, College.class);
    }
    @Test
    public void popupClose() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clg.alarWin1();
    }
}
