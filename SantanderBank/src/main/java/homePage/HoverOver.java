package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.util.List;

public class HoverOver extends CommonAPI {

    public void checkBanking() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement Banking = driver.findElement(By.xpath("//span[text()='Banking']"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        builder.moveToElement(Banking).build().perform();
        Thread.sleep(2000);
        System.out.println(Banking.getText());
    }
}