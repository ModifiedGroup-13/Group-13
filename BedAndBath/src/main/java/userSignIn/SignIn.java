package userSignIn;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends BaseUtil {
    @FindBy (id = "accountLink")
    public static WebElement signIn;
    @FindBy (xpath = "//*[@id=\'profileList\']/li[1]/a")
    public static WebElement clickOnSignIn;
    @FindBy(css ="#rclModal > button")
    public static WebElement alertWin;

    public void alarWin1(){
        alertWin.click();
    }
    public void checksignIn(){
        signIn.click();
    }
    public void checkclickOnSignIn(){
        clickOnSignIn.click();
    }
}
