package homePage;
import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class MainPage extends BaseUtil {


    //Example
    @FindBy(id="top-nav-menu")
    public static WebElement WeddingReg;


    //Example
    public void checkWeddingReg(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WeddingReg.click();
    }


}
