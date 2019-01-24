package testHomePage;

import base.CommonAPI;
import homePage.LoginPage;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLoginPage extends LoginPage {
    LoginPage loginPage;
    MainPage mainPage;
    @BeforeMethod
    public void initelement(){
        mainPage= PageFactory.initElements(CommonAPI.driver,MainPage.class);
        loginPage= PageFactory.initElements(CommonAPI.driver,LoginPage.class);}

    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode) throws InterruptedException {TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
    }
    @Test
    public void checkinput()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.login();
        loginPage.checkLoginFuction();
    }
}
