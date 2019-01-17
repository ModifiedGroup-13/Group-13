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
    public void checkInvestmentsAndProtection() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement InvestmentsAndProtection = driver.findElement(By.xpath("//span[text()='Investments and Protection']"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        builder.moveToElement(InvestmentsAndProtection).build().perform();
        Thread.sleep(2000);
        System.out.println(InvestmentsAndProtection.getText());
    }
    public void checkCreditCards() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement CreditCards = driver.findElement(By.xpath("//span[text()='Credit Cards']"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        builder.moveToElement(CreditCards).build().perform();
        Thread.sleep(2000);
        System.out.println(CreditCards.getText());
    }
    public void checkProsperAndThrive() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement ProsperAndThrive = driver.findElement(By.xpath("//span[text()='Prosper and Thrive']"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        builder.moveToElement(ProsperAndThrive).build().perform();
        Thread.sleep(2000);
        System.out.println(ProsperAndThrive.getText());
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