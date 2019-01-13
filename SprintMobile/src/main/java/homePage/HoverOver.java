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
}
