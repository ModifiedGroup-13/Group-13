package testHomePage;

import homePage.BottomLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBottomLinks extends BottomLinks {
     BottomLinks bottomLinks;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
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
    @Test
    public void testAboutUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkAboutUs();
    }
    @Test
    public void testMediaCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkMediaCenter();
    }
    @Test
    public void testShareholderRelations(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkShareholderRelations();
    }
    @Test
    public void testCommunity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkCommunity();
    }
    @Test
    public void testCareers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkCareers();
    }
    @Test
    public void testCustomerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkCustomerService();
    }
    @Test
    public void testSiteMap(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkSiteMap();
    }
   @Test
    public void testAccessibility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkAccessibility();
    }
    @Test
    public void testFaceBookImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bottomLinks.checkFaceBookImage();
    }
}