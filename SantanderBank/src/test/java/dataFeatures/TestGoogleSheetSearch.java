package dataFeatures;

import googleSheetReader.GoogleSheetReader;
import homePage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static utility.ConnectDB.loadProperties;

public class TestGoogleSheetSearch extends Search{
    Search search;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search = PageFactory.initElements(driver, Search.class);
    }
        @Test
        public void testSearchWithEnterfromSheet() throws IOException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            Properties properties=loadProperties();
            String spreadSheetId=properties.getProperty("GOOGLE.spreadsheetId");
            String range=properties.getProperty("GOOGLE.range");
            List<List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range );
            for(List cell:getRecords){
     //       String messageText=searchWithENTER(cell.get(0).toString());
            searchByENTERKeyword(cell.get(0).toString());
      //      String message=cell.get(1).toString();
            navigateBack();
     //       Assert.assertEquals( message,messageText);
            }
        }
    }

