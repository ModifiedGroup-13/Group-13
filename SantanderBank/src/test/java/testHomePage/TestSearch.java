package testHomePage;

import homePage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearch extends Search {
    public String keys = "Personal loan";
    public String keys1 = "Car loan";
    public String keys3 = "Home loan";
    public String keys4 = "Study loan";
    public String keys5 = "Opportunities";
    public String keys6 = "Mortgage";
    public String keys7 = "Home Buying";
    public String keys8 = "Loan Payment";
    public String keys9 = "House Sell";
    public String keys10 = "Loan Paid";

    Search search;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search = PageFactory.initElements(driver, Search.class);
    }
    @Test
    public void testSearchENTERKeyword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys);
    }
    @Test
    public void testSearchBySubmitButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys1);
    }
    @Test
    public void testSearchENTERKeyword1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys3);
    }
    @Test
    public void testSearchBySubmitButton1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys4);
    }
    @Test
    public void testSearchENTERKeyword2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys5);
    }
    @Test
    public void testSearchBySubmitButton2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys6);
    }
    @Test
    public void testSearchENTERKeyword3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys7);
    }
    @Test
    public void testSearchBySubmitButton3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys8);
    }
    @Test
    public void testSearchENTERKeyword4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys9);
    }
    @Test
    public void testSearchBySubmitButton4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys10);
    }
}
