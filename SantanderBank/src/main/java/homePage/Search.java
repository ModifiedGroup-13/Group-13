package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class Search extends CommonAPI {


   // @FindBy(xpath = "//a[@class='hidden-xs dropdown']//i[@class='fa fa-search']")
  //  public static WebElement searchKey;
    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement searchField;
    @FindBy(xpath= "//input[@id='_P001_Header_WAR_P001_Headerportlet_searchButton']")
    public static WebElement submitButton;

   // public static void waitToBeVisible(){
     //   TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
     //   searchKey.click();
        //wait.until(ExpectedConditions.visibilityOf(searchField));
   // }
    public void searchByENTERKeyword(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      //  waitToBeVisible();
        driver.manage().window().maximize();
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchBySubmitButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      //  waitToBeVisible();
        driver.manage().window().maximize();
        searchField.sendKeys(searchKeys);//have question
        submitButton.click();
    }
}