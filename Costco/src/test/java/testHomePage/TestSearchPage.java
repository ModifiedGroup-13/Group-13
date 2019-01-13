package testHomePage;

import com.google.api.services.sheets.v4.Sheets;
import homePage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestSearchPage extends SearchPage {

    public String keys = "Honey";

    SearchPage searchPage;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }
    @Test
    public void testSearchENTERKeyword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys);
    }
    @Test
    public void testSearchBySubmitButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys);
    }
}

