package homePage;
import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class MainPage extends BaseUtil {


    //Example
    @FindBy(id="top-nav-menu")
    public static WebElement WeddingReg;

    @FindBy (id="accountLink")
    public static WebElement SignIn;

    @FindBy (id="app")
    public static WebElement Print;

    public By regName = By.id("searchRegistry-text");

    public By searchButton = By.xpath("//*[@id='tabPanel4']/div/div/div/section/div/ul[1]/div/form/div[2]/button");

    public By title = By.xpath("/html/head/title/text()");


    public By College = By.xpath("//*[@id=\'top-nav-menu\']/li[3]/div[1]/div/button");


    //Example
    public void checkWeddingReg(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WeddingReg.click();
    }

    public void checkSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignIn.click();
    }
    public void checkPrint(){
        Print.click();
    }




}
