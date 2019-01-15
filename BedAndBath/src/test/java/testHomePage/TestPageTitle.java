package testHomePage;

import homePage.PageTitle;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPageTitle extends PageTitle {
    PageTitle PT;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}
        .getClass().getEnclosingMethod().getName()));
        PT = PageFactory.initElements(driver, PageTitle.class);
    }

    @Test
    public void checkPageHeader() {
        PT.setalarWin1();
        PT.setPageLogo();
        System.out.println("that's my logo");
    }
    @Test
    public void checkPageOffer() {
        {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            PT.setalarWin1();
            PT.setPageLogo();
            PT.setalarWin1();
        }
        }
        @Test
        public void checkPageTitle(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            PT.setalarWin1();
            PT.setPageTitle();

        }

    }
