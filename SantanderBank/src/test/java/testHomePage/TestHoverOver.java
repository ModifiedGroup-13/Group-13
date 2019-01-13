package testHomePage;

import homePage.HoverOver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;

public class TestHoverOver extends HoverOver {
    HoverOver hoverOver;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class);
    }
    @Test(enabled = true)
    public void testBanking () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkBanking();
    }
    @Test(enabled = true)
    public void testBorrowing () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkBorrowing();
    }
    @Test(enabled = true)
    public void testInvestmentsAndProtection () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkInvestmentsAndProtection();
    }
    @Test(enabled = true)
    public void testCreditCards () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkCreditCards();
    }
    @Test(enabled = true)
     public void testListOfHoverOver() throws Exception{
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
      hoverOver.checkListOfHoverOver();
  }
}