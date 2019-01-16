package testHomePage;

import homePage.SearchItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchItems extends SearchItems {
    SearchItems searchItems;
    @Test
    public void testSearchItemsBySubmitButton()throws IOException{
        searchItems = PageFactory.initElements(driver, SearchItems.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItems.searchItemsBySubmitButton();
    }
    @Test
    public void testSearchItemsByENTERKeyword() throws IOException, InterruptedException {
        searchItems = PageFactory.initElements(driver, SearchItems.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItems.searchItemsBySubmitButton();
    }


}