package dataFeatures;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import excelSheetReader.ExcelReaderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class TestExlReaderPage extends CommonAPI {
    ExcelReaderPage excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReaderPage();
        reports = ExtentManager.getInstance();
    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
    }
}


