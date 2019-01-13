package testHomePage;

import base.CommonAPI;
import homePage.HoverOver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testHoverOver extends HoverOver {

    HoverOver hoverOver;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class); }
    @Test(enabled = true, priority =1)
    public void testgroery () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkGroery(); }
    @Test(enabled = true, priority =2)
    public void testbusinessdelivery () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkBusinessDelivery(); }
    @Test(enabled = true, priority =3)
    public void testOptical () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkOptical(); }
    @Test(enabled = true, priority =4)
    public void testPharmacy () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkPharmacy(); }
    @Test(enabled = true, priority = 4)
    public void testMembership () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkMembership(); }



}
