package googleSheetReader;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.driver;
import static googleSheetReader.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage {

    //find elements for login page
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement login;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.alias']")
    public static WebElement UserInput;
    @FindBy(xpath = "//input[@id='_P002_Menu_WAR_P002_Menuportlet_entrada.pwd']")
    public static WebElement PasswordInput;
    @FindBy(xpath = "//button[@id='_P002_Menu_WAR_P002_Menuportlet_loginButtonTM']")
    public static WebElement logInSubmitButton;
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
            return null;
        } else {
            return values;
        }
    }
    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> valueInColumn = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : valueInColumn) {
            Thread.sleep(3000);
           // myChart.click();
            //userName.sendKeys(row.get(0).toString());
            inputValueInTextBoxByWebElement(UserInput, row.get(0).toString());
            //password.sendKeys(row.get(1).toString(),Keys.ENTER);
            inputValueInTextBoxByWebElement(PasswordInput, row.get(1).toString());
            WebDriverWait wait = new WebDriverWait(driver,3);
            wait.until(ExpectedConditions.elementToBeClickable(logInSubmitButton));
            logInSubmitButton.click();
            //actual.add(getCurrentPageTitle());
            // actual.add(getTextByWebElement(errorMsg));
            //System.out.println(getTextByWebElement(errorMsg));
        }
        return actual;
    }
    //checking fileds are taking input or not //no need
    public void loginTest(String emailIn, String pass) throws Exception{
        Thread.sleep(3000);
       // Login.click();
        UserInput.sendKeys(emailIn);
        PasswordInput.sendKeys(pass);
        logInSubmitButton.click();
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value);
    }
    public void clearInputBox(WebElement webElement) {webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}


