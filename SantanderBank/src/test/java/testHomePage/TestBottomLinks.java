package testHomePage;

import homePage.BottomLinks;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import static base.CommonAPI.convertToString;

public class TestBottomLinks extends BottomLinks {
     BottomLinks bottomLinks;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bottomLinks = PageFactory.initElements(driver, BottomLinks.class);
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testGetStarted(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkGetStarted();
    }
    @Test
    public void testcorrespondMLending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkCorrespondMLending();
    }
    @Test
    public void testBrokerMortgageOrigination(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkBrokerMortgageOrigination();
    }
 /*   @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }
    @Test
    public void testsantanderUniversities(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checksantanderUniversities();
    }*/

}