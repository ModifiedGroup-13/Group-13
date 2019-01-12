package testHomePage;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestMainPage extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }


    @Test
    public void testShopDevices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkShopDevices();
    }
    @Test
    public void testShopPlans(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkShopPlans();
    }
    @Test
    public void testSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSupport();
    }
    @Test
    public void testMySprint(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkMySprint();
    }

    @Test
    public void testActivate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkActivatet();
    }
    @Test
    public void testCalltoorder(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCalltoorder();
    }
    @Test
    public void testSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearch();
    }
    @Test
    public void testCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkCart();
    }
    @Test
    public void testSignin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSignin();
    }
    @Test
    public void testEspanol(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkEspanol();
    }
    @Test
    public void testBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkBusiness();
    }
    @Test
    public void testStores(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkStores();
    }
    @Test
    public void testThisIsMe(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkThisIsMe();
    }
    @Test
    public void testThisIsUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkThisIsUs();
    }
    @Test
    public void testWhichiPhoneisRightForYou(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkWhichiPhoneisRightForYou();
    }
    @Test
    public void testUpgrademyDevice(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkUpgrademyDevice();
    }
}
