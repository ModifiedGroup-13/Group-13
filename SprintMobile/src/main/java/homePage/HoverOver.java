package homePage;
import base.BaseUtil;
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
    public void checkShopDevices() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement shopdevices = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div[1]/nav/div/div/ul[1]/li[1]/a/span"));
        Thread.sleep(2000);
        builder.moveToElement(shopdevices).build().perform();
        Thread.sleep(2000);
        System.out.println(shopdevices.getText());
    }
    public void checkShopPlans() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement ShopPlans = driver.findElement(By.xpath("//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Shop Plans')]"));
        Thread.sleep(2000);
        builder.moveToElement(ShopPlans).build().perform();
        Thread.sleep(2000);
        System.out.println(ShopPlans.getText());
    }

    public void checkSupport() throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
            Actions builder = new Actions(driver);
            WebElement Support = driver.findElement(By.xpath("//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Support')]"));
            Thread.sleep(2000);
            builder.moveToElement(Support).build().perform();
            Thread.sleep(2000);
            System.out.println(Support.getText());
    }
    public void checkMySprint() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement MySprint = driver.findElement(By.xpath("//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'My Sprint')]"));
        Thread.sleep(2000);
        builder.moveToElement(MySprint).build().perform();
        Thread.sleep(2000);
        System.out.println(MySprint.getText());
    }
    public void checkActivate() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement Activate = driver.findElement(By.xpath("//a[@class='sprint-menu__root js-nav-link-root']//span[contains(text(),'Activate')]"));
        Thread.sleep(2000);
        builder.moveToElement(Activate).build().perform();
        Thread.sleep(2000);
        System.out.println(Activate.getText());
    }
}
