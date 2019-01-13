package testHomePage;


import homePage.MainPage;
import homePage.Products;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.Set;

public class CollegeSearch extends Products {
  Products mp;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mp = PageFactory.initElements(driver, Products.class);
    }

    @Test
    public void popupClose() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mp.alarWin1();
    }

}
