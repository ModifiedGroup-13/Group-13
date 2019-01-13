package testHomePage;

import homePage.HoverOver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestHoverOver extends HoverOver {
    HoverOver hoverOver;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class);
    }
    @Test(enabled = true, priority = 1)
    public void testShopDevices () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkShopDevices();
    }
    @Test(enabled = true, priority = 1)
    public void testShopPlans () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkShopPlans();
    }
    @Test(enabled = true, priority = 1)
    public void testSupport () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkSupport();
    }
    @Test(enabled = true, priority = 1)
    public void testMySprint () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkMySprint();
    }
    @Test(enabled = true, priority = 1)
    public void testActivate () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkActivate();
    }
}