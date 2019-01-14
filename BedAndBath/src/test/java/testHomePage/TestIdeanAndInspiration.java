package testHomePage;

import homePage.College;
import homePage.IdeaAndInspiration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.BaseUtil.convertToString;
import static base.BaseUtil.driver;

public class TestIdeanAndInspiration extends IdeaAndInspiration {
    IdeaAndInspiration IdeaInsp;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        IdeaInsp = PageFactory.initElements(driver, IdeaAndInspiration.class);
    }
    @Test
    public void checkIdea() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            IdeaInsp.alarWin1();
            IdeaInsp.checkInspiration();
            IdeaInsp.checkInsp();
     }
     @Test
    public void checkPageTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
     }.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.bedbathandbeyond.com/onemorething/?utm_source=BBB%20HP%20Flyout&utm_medium=BBB%20Trends-Ideas&utm_campaign=Visit%20One%20More%20Thing");
        IdeaInsp.checkPageTitle();
     }
}
