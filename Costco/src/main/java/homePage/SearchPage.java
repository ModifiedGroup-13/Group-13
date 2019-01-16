package homePage;

import Helper.ExcellReader;
import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//input[@id='search-field']")
    public static WebElement searchField;
    @FindBy(xpath= "//div[@class='inner-addon right-addon flex-child']//i[@class='co-search-thin']")
    public static WebElement submitButton;


    public void searchByENTERKeyword(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchBySubmitButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchField.sendKeys(searchKeys);
        submitButton.click();
    }

    }


