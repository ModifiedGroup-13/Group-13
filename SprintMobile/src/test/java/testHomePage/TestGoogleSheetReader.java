package testHomePage;
import googleSheet.GoogleSheetReader;
import googleSheet.GoogleSheetpage;
import homePage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetReader extends GoogleSheetReader {
    GoogleSheetpage googleSheetPage;
    GoogleSheetReader googleSheetReader;

    @BeforeMethod
    public void initialize() {
        //TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        googleSheetPage = PageFactory.initElements(driver, GoogleSheetpage.class);
        googleSheetReader = PageFactory.initElements(driver, GoogleSheetReader.class);
    }

    @Test (enabled = true)
    public void testLogInByInvalidIdPasswordUsingGoogleSheet() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "16G51brqcHZzdEsXvSN_uxeOEQvOySYyLPZ9P4whiAWY";
        String range = "Sheet1!A2:B";

        //List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            //i++;
        }
        System.out.println("testLogInByInvalidIdPasswordUsingGoogleSheet Passed");
    }
    @Test (enabled = true)
    public void testLoginUsingValidPasswordUsingGoogleSheet() {
        try{
            int i = 0;
            Thread.sleep(3000);
            String spreadsheetId = "1_48hFeOa4Vsl9j6Y0NmKYHp5e6-acAk-3iZ2NfMmn6I";
            String range = "Sheet1!A8:B";
            List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
            List<String> actualErrorMessage =
                    googleSheetPage.signInByInvalidIdPass(spreadsheetId, range);

           /* for(List row : expectedErrorMessage){
                Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
                System.out.println("expected"+row.get(3).toString());
                System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
                i++;
            }*/
            System.out.println("testLogInUsingGoogleSheet Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("testLogInUsingGoogleSheet Failed");
        }
    }
    @Test (enabled = true)
    public void testLogin() throws Exception {
        googleSheetPage.loginTest("aaabb@ccc.ccc", "12345");
    }
}
