package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TextOption extends CommonAPI {
    // Find Elements for Banking under Personal by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking1;
    @FindBy(xpath = "//a[contains(text(),'Checking')]")
    public static WebElement Checking;

    public void Banking1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking1).perform();
        actions.moveToElement(Checking).perform();
    }

    //Find Elements for BusinessFirst under Business by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Business First')]")
    public static WebElement BusinessFirst;
    @FindBy(xpath = "//a[contains(text(),'Business First')]")
    public static WebElement BusinessFirst2;

    public void BusinessFirst() {
        Actions actions = new Actions(driver);
        actions.moveToElement(BusinessFirst).perform();
        actions.moveToElement(BusinessFirst2).perform();
    }

    //Find Elements for Borrowing under Business by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Borrowing')]")
    public static WebElement Borrowing;
    @FindBy(xpath = "//a[contains(text(),'Borrowing Options')]")
    public static WebElement BorrowingOption;

    public void Borrowing() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(BorrowingOption).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking;
    @FindBy(xpath = "//a[contains(text(),'Checking & Savings')]")
    public static WebElement CheckingAndSavings;

    public void Banking() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(CheckingAndSavings).perform();
    }

    //Find Elements for Banking under Personal by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking2;
    @FindBy(xpath = "//a[contains(text(),'Savings & Money Market')]")
    public static WebElement SavingsAndMoneyMarket;

    public void Banking2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(SavingsAndMoneyMarket).perform();
    }

    //Find Elements for Banking under Personal by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking3;
    @FindBy(xpath = "//a[contains(text(),'Certificates of Deposit (CDs)')]")
    public static WebElement DepositCertificates;

    public void Banking3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(DepositCertificates).perform();
    }

    //Find Elements for Banking under Personal by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking4;
    @FindBy(xpath = "//a[contains(text(),'Digital Banking')]")
    public static WebElement DigitalBanking;

    public void Banking4() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(DigitalBanking).perform();
    }

    //Find Elements for Banking under Personal by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking5;
    @FindBy(xpath = "//a[contains(text(),'Overdrafts')]")
    public static WebElement Overdrafts;

    public void Banking5() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(Overdrafts).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking6;
    @FindBy(xpath = "//a[contains(text(),'Business Online & Mobile Banking')]")
    public static WebElement BOAndMobileBanking;

    public void Banking6() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(BOAndMobileBanking).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking7;
    @FindBy(xpath = "//a[contains(text(),'Payments & Processing')]")
    public static WebElement PaymentProcessing;

    public void Banking7() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(PaymentProcessing).perform();
    }

    //Find Elements for Borrowing under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Borrowing')]")
    public static WebElement Borrowing1;
    @FindBy(xpath = "//a[contains(text(),'Lines of Credit')]")
    public static WebElement LinesOfCredit;

    public void Borrowing1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(LinesOfCredit).perform();
    }

    //Find Elements for Borrowing under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Borrowing')]")
    public static WebElement Borrowing2;
    @FindBy(xpath = "//a[contains(text(),'Loans')]")
    public static WebElement Loans;

    public void Borrowing2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(Loans).perform();
    }

    //Find Elements for Borrowing under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Borrowing')]")
    public static WebElement Borrowing3;
    @FindBy(xpath = "//a[contains(text(),'Mortgages')]")
    public static WebElement Mortgages;

    public void Borrowing3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Borrowing).perform();
        actions.moveToElement(Mortgages).perform();
    }

    //Find Elements for InvestmentAndProtection under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Investments and Protection')]")
    public static WebElement InvestmentAndProtection;
    @FindBy(xpath = "//a[contains(text(),'Investment Services offered by Santander Investmen')]")
    public static WebElement InvestmentAndServices;

    public void InvestmentAndProtection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(InvestmentAndProtection).perform();
        actions.moveToElement(InvestmentAndServices).perform();
    }

    //Find Elements for CreditCards under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Credit Cards')]")
    public static WebElement CreditCards;
    @FindBy(xpath = "//a[@href='#Credit Cards'][contains(text(),'Credit Cards')]")
    public static WebElement CreditCards1;

    public void CreditCards() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CreditCards).perform();
        actions.moveToElement(CreditCards1).perform();
    }

    //Find Elements for ProsperAndThrive under Personal by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Prosper and Thrive')]")
    public static WebElement ProsperAndThrive;
    @FindBy(xpath = "//a[contains(text(),'Prosper and Thrive')]")
    public static WebElement ProsperAndThrive1;

    public void ProsperAndThrive() {
        Actions actions = new Actions(driver);
        actions.moveToElement(ProsperAndThrive).perform();
        actions.moveToElement(ProsperAndThrive1).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking8;
    @FindBy(xpath = "//li[@class='wlrlevel3 notchild']")
    public static WebElement WhyBankWithUs;

    public void Banking8() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(WhyBankWithUs).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking9;
    @FindBy(xpath = "//a[contains(text(),'Business Online & Mobile Banking')]")
    public static WebElement MobileBanking;

    public void Banking9() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(MobileBanking).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking10;
    @FindBy(xpath = "//a[contains(text(),'Payments & Processing')]")
    public static WebElement PaymentsProcessing;

    public void Banking10() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(PaymentsProcessing).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking11;
    @FindBy(xpath = "//a[contains(text(),'Merchant Services')]")
    public static WebElement MerchantServices;

    public void Banking11() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(MerchantServices).perform();
    }

    //Find Elements for Banking under business by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Banking')]")
    public static WebElement Banking12;
    @FindBy(xpath = "//a[contains(text(),'International Services')]")
    public static WebElement InternationalServices;

    public void Banking12() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Banking).perform();
        actions.moveToElement(InternationalServices).perform();
    }
    //Find Elements for CommercialCapabilities under Commercial by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Commercial Capabilities')]")
    public static WebElement CommercialCapabilities;
    @FindBy(xpath = "//a[contains(text(),'Financing')]")
    public static WebElement Financing;

    public void CommercialCapabilities() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CommercialCapabilities).perform();
        actions.moveToElement(Financing).perform();
    }
    //Find Elements for CommercialCapabilities under Commercial by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Commercial Capabilities')]")
    public static WebElement CommercialCapabilities1;
    @FindBy(xpath = "//a[contains(text(),'Working Capital Solutions')]")
    public static WebElement WorkingCapitalSolutions;

    public void CommercialCapabilities1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CommercialCapabilities).perform();
        actions.moveToElement(WorkingCapitalSolutions).perform();
    }
    //Find Elements for CommercialCapabilities under Commercial by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Commercial Capabilities')]")
    public static WebElement CommercialCapabilities2;
    @FindBy(xpath = "//a[contains(text(),'Capital Markets')]")
    public static WebElement CapitalMarkets;

    public void CommercialCapabilities2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CommercialCapabilities).perform();
        actions.moveToElement(CapitalMarkets).perform();
    }
    //Find Elements for CommercialCapabilities under Commercial by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Commercial Capabilities')]")
    public static WebElement CommercialCapabilities3;
    @FindBy(xpath = "//a[contains(text(),'Government Banking')]")
    public static WebElement GovernmentBanking;

    public void CommercialCapabilities3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CommercialCapabilities).perform();
        actions.moveToElement(GovernmentBanking).perform();
    }
    //Find Elements for GlobalCapabilities under Commercial by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Global Capabilities')]")
    public static WebElement GlobalCapabilities;
    @FindBy(xpath = "//a[contains(text(),'International Trade Finance')]")
    public static WebElement InternationalTradeFinance;

    public void GlobalCapabilities() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CommercialCapabilities).perform();
        actions.moveToElement(InternationalTradeFinance).perform();
    }
    //Find Elements for WhoWeAre under About by HoverOver option
    @FindBy(xpath = "//span[contains(text(),'Who We Are')]")
    public static WebElement WhoWeAre;
    @FindBy(xpath = "//a[@href='#Santander Bank']")
    public static WebElement SantanderBank;

    public void WhoWeAre() {
        Actions actions = new Actions(driver);
        actions.moveToElement(WhoWeAre).perform();
        actions.moveToElement(SantanderBank).perform();
    }
    //Find Elements for SantanderUniversities under About by HoverOver option
    @FindBy(xpath = "//a[@class='wlrItem2']//span[contains(text(),'Santander Universities')]")
    public static WebElement SantanderUniversities;
    @FindBy(xpath = "//a[contains(text(),'Program Overview')]")
    public static WebElement ProgramOverview;

    public void SantanderUniversities() {
        Actions actions = new Actions(driver);
        actions.moveToElement(SantanderUniversities).perform();
        actions.moveToElement(ProgramOverview).perform();
    }
}








