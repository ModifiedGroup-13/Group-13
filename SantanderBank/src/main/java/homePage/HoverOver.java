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
    public void checkBorrowing() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement Borrowing = driver.findElement(By.xpath("//span[text()='Borrowing']"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        builder.moveToElement(Borrowing).build().perform();
        Thread.sleep(2000);
        System.out.println(Borrowing.getText());
    }
      public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement banking = driver.findElement(By.xpath("//span[text()='Banking']"));
        Thread.sleep(2000);
        builder.moveToElement(banking).build().perform();
        Thread.sleep(2000);
        System.out.println(banking.getText());
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='wlrListLevel3 alignLeft' and @role='list']//li[@class='wlrlevel3 child']"));
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
        System.out.println(list.get(i).getText());
      }
  }
}