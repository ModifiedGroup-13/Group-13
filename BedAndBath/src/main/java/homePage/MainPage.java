package homePage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class MainPage {


    //Example
    @FindBy(id = "warehouse-savings")
    public static WebElement viewWareHouseSavings;


    //Example
    public void checkviewWareHouseSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click();
    }


}
