package testHomePage;

import homePage.TextOption;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestTextOption extends TextOption {
        TextOption testTextOption;
        @BeforeMethod
        public void initelement() {
           testTextOption = PageFactory.initElements(driver, TextOption.class);
            driver.get("https://www.santanderbank.com/us/business");
        }
        @Test
        public void Banking1_Test(){Banking1();}
        @Test
        public void Borrowing_Test(){Borrowing();}
        @Test
        public void BusinessFirst_Test(){BusinessFirst();}
        @Test
        public void Banking_Test(){Banking();}
        @Test
        public void Banking2_Test(){Banking();}
        @Test
        public void Banking3_Test(){Banking();}
        @Test
        public void Banking4_Test(){Banking();}
        @Test
        public void Banking5_Test(){Banking();}
        @Test
        public void Banking6_Test(){Banking();}
        @Test
        public void Banking7_Test(){Banking();}
        @Test
        public void Borrowing1_Test(){Borrowing();}
        @Test
        public void Borrowing2_Test(){Borrowing();}
        @Test
        public void Borrowing3_Test(){Borrowing();}
        @Test
        public void InvestmentAndProtection_Test(){InvestmentAndProtection();}
        @Test
        public void CreditCards_Test(){CreditCards();}
        @Test
        public void ProsperAndThrive_Test(){ProsperAndThrive();}
        @Test
        public void Banking8_Test(){Banking();}
        @Test
        public void Banking9_Test(){Banking();}
        @Test
        public void Banking10_Test(){Banking();}
        @Test
        public void Banking11_Test(){Banking();}
        @Test
        public void Banking12_Test(){Banking();}
        @Test
        public void CommercialCapabilities_Test(){CommercialCapabilities();}
        @Test
        public void CommercialCapabilities1_Test(){CommercialCapabilities();}
        @Test
        public void CommercialCapabilities2_Test(){CommercialCapabilities();}
        @Test
        public void CommercialCapabilities3_Test(){CommercialCapabilities();}
        @Test
        public void GlobalCapabilities_Test(){GlobalCapabilities();}
        @Test
        public void WhoWeAre_Test(){WhoWeAre();}
        @Test
        public void SantanderUniversities_Test(){SantanderUniversities();}





    }


