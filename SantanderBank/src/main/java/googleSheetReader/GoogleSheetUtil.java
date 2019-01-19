package googleSheetReader;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleSheetReader.GoogleSheetReader.getSheetsService;

public class GoogleSheetUtil extends CommonAPI {

    //find elements for login page
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement login;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.alias']")
    public static WebElement UserInput;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.pwd']")
    public static WebElement PasswordInput;
    @FindBy(xpath = "//button[@id='_P002_Menu_WAR_P002_Menuportlet_loginButtonTM']")
    public static WebElement LogIn;
    @FindBy(xpath = "//a[text()='Forgot your user ID?']")
    public static WebElement errorMsgID;
    @FindBy(name = "//a[text()='Forgot your password?']")
    public static WebElement errorMsgPW;

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null; }
        else { return values; }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            Thread.sleep(5000);
            inputValueInTextBoxByWebElement(UserInput, row.get(1).toString());
            inputValueInTextBoxByWebElement(PasswordInput, row.get(2).toString());
            Thread.sleep(5000);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(errorMsgID));
            System.out.println(getTextByWebElement(errorMsgPW));
            //clearInputBox(Textbox);
            clearInputBox(UserInput);
            clearInputBox(PasswordInput);
            Thread.sleep(5000);}
        return actual;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}

