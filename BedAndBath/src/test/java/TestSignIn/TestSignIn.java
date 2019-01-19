package TestSignIn;

import homePage.College;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import userSignIn.SignIn;

public class TestSignIn extends SignIn {
    SignIn si;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        si = PageFactory.initElements(driver, SignIn.class);
    }
    @Test
    public void checkSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        si.alarWin1();
        si.checksignIn();
        si.alarWin1();
        si.checkclickOnSignIn();
    }
}
