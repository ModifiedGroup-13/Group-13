package homePage;

import base.BaseUtil;
import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchItems extends CommonAPI {

    @FindBy(xpath = "//input[@id='search-field']")
    public static WebElement searchField;
    @FindBy(xpath= "//div[@class='inner-addon right-addon flex-child']//i[@class='co-search-thin']")
    public static WebElement submitButton;

    public List<String> getItemsList(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Milk");
        itemList.add("Honey");
        itemList.add("Rice");
        itemList.add("Salt");
        return itemList; }
    public static WebElement getSearchField() {
        return searchField;
    }
    public static void setSearchField(WebElement searchField) {
        SearchItems.searchField = searchField;
    }
    public static WebElement getSubmitButton() {
        return submitButton;
    }
    public static void setSubmitButton(WebElement submitButton) {
        SearchItems.submitButton = submitButton;
    }
    public void searchItemsBySubmitButton()throws IOException {
        List<String> itemList = getItemsList();
        for(int i=0; i<itemList.size(); i++) {
            getSearchField().sendKeys(itemList.get(i));
            getSubmitButton().click(); }
    }
    public void searchItemsByENTERKeyword()throws InterruptedException, IOException {
        List<String> itemList = getItemsList();
        for(String st: itemList) {
            getSearchField().sendKeys(st, Keys.ENTER); }
    }
}