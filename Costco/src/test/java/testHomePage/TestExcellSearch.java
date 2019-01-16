package testHomePage;

import homePage.ExcellSearch;
import homePage.SearchItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestExcellSearch extends ExcellSearch{
 ExcellSearch search;

    @Test
    public void itemsearchfromExceldata() throws InterruptedException {
        search.searchfromExcel();
    }



//    @Test
//    public void testSearchItemsBySubmitButton() throws IOException, InterruptedException {
//        search = PageFactory.initElements(driver, search.getClass());
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        search.searchfromExcel();
//    }
//    @Test
//    public void testSearchItemsByENTERKeyword() throws IOException, InterruptedException {
//        search = PageFactory.initElements(driver, search.getClass());
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        search.searchfromExcel();
//    }

}
