package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HoverOver extends CommonAPI {
    public void checkgroery() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement groery = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_0\"]"));
        Thread.sleep(2000);
        builder.moveToElement(groery).build().perform();
        Thread.sleep(2000);
        System.out.println(groery.getText());
    }
    public void checkbusinessdelivery() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement businessdelivery = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_1\"]"));
        Thread.sleep(2000);
        builder.moveToElement(businessdelivery).build().perform();
        Thread.sleep(2000);
        System.out.println(businessdelivery.getText());
    }
    public void checkmembership() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN common api
        WebElement membership = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_7\"]"));
        Thread.sleep(2000);
        builder.moveToElement(membership).build().perform();
        Thread.sleep(2000);
        System.out.println(membership.getText());
    }

}
