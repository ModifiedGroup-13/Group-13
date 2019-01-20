package testHomePage;

import homePage.InPuts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static homePage.InPuts.*;

public class TestInPut extends InPuts {
    InPuts ip;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ip = PageFactory.initElements(driver, InPuts.class);
    }
    @Test
    public void testSearchENTERKeyword() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //searchByENTERKeyword(keys);
        checksearchKey();
    }
}
