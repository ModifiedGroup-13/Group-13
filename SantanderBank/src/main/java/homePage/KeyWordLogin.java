package homePage;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;
import java.io.IOException;

public class KeyWordLogin extends CommonAPI {
    MainPage mainPage= PageFactory.initElements(driver,MainPage.class);
    LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);

    public void navigateToLoginPage(){mainPage.login();}
    public void navigateTologin(){loginPage.checkLoginFuction();}
    public void selectAction(String featureName) throws IOException,InterruptedException {
        switch (featureName) {
            case "ClickLogin":
                navigateToLoginPage();
                break;
            case "Login":
                navigateTologin();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword (String fileName) throws IOException {
        String path="../SantanderBank/Data/"+ fileName;
      //  String path="C:/Users/Manir/Desktop/GroupProject/Group-13/SantanderBank/Data/keywords.xls"+ fileName;
        String [] output = reader.colReader(path,2);
        return output;
    }
    public void loginByKeyword() throws IOException, InterruptedException{
        String [] keyword = getDataFromSignInKeyword("Keywords.xls");
        for (int i=0;i<keyword.length;i++)
        {
            selectAction(keyword[i]);
        }
    }
}
