package testHomePage;

import homePage.TextOption;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static homePage.MainPage.home;


    public class TestTextOption extends TextOption {
        TextOption testTextOption;

        @BeforeMethod
        public void initelement() {
           testTextOption = PageFactory.initElements(driver, TextOption.class);
            driver.get("https://www.santanderbank.com/us/business");
        }
        //    @Test
//    public void BusinessPage_Test(){Business();}
        @Test
        public void Banking_Test(){Banking();}
     //   @Test
      //  public void Borrowing_Test(){Borrowing();}
     //   @Test
     //   public void BusinessFirst_Test(){BusinessFirst();}


    }

