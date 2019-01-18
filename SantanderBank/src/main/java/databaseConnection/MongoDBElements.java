package databaseConnection;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class MongoDBElements extends CommonAPI {


    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking;
    @FindBy(xpath = "x")
     public  WebElement bankingDiv;

     public void waitForBankingDiv()throws InterruptedException{
       Actions actions = new Actions(driver);
       actions.moveToElement(Banking).perform();
        Thread.sleep(2000);
    }

    public List<String> banking() throws InterruptedException {
        waitForBankingDiv();
        List<WebElement> bankingList = driver.findElements(By.xpath("//*[@id=\"//body[contains(@class,'yui3-skin-sam controls-visible signed-out public-page site dockbar-split hide')]/div[@id='wrapper']/div[@id='content']/div[@id='wrapper-120']/div[@id='main-content']/div[@class='ah_row']/div[@id='column-1']/div[@id='layout-column_column-1']/div[@id='p_p_id_P002_Menu_WAR_P002_Menuportlet_']/div[@class='portlet-borderless-container']/div[@class='portlet-body']/div[@id='_P002_Menu_WAR_P002_Menuportlet__VIEW']/div[@data-layer-isban='{\"w\":\"_P002_Menu_WAR_P002_Menuportlet_\"}']/div[@class='wlrMenu05']/header/div[@class='wlrMenunav05']/div[@class='wlrMenuWrapper']/div[@class='wlrMenu_cont']/nav/ul[@class='optionsList']/li/ul[@class='wlrListLevel2']/li[1]/div[1]/div[1]/ul[1]"));
        List<String> listText = new ArrayList<>();
        for (WebElement it: bankingList){
            listText.add(it.getText());
        }
        return listText;
    }
}
