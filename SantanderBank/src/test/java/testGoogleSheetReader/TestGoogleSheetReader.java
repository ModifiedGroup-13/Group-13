package testGoogleSheetReader;

import googleSheetReader.GoogleSheetReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.io.IOException;

import static homePage.MainPage.login;


public class TestGoogleSheetReader extends GoogleSheetReader {
    GoogleSheetReader googleSheetReader;
    ChromeDriver driver;
    @BeforeMethod
    public void init(){
        googleSheetReader= PageFactory.initElements(driver,GoogleSheetReader.class);
    }

    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);
        int i = 0;
       // String spreadsheetId = "1r7vJp3FX5oRzEK-4W5q3HRl9Jq5LYJmOVUcRDqguzag";
        String spreadsheetId = "hsbcgdkdsgsthsmhfudhsnchfdsguzag";
        String range = "Sheet1!A2:E";
        //List<String> actualErrorMessage = googleSheetReader.(spreadsheetId, range);
        List<String> actualErrorMessage = googleSheetReader.range;
        List<List<Object>> expectedErrorMessage = googleSheetReader.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected" + row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
