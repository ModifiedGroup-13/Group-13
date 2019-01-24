package testHomePage;

import homePage.KeyWordLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestKeyWordLogin extends KeyWordLogin{
    KeyWordLogin keyWordLogin;
    @BeforeMethod
    public void init(){
        keyWordLogin= PageFactory.initElements(driver,KeyWordLogin.class);
    }
    @Test
    public void testLoginByKeyword() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }
    @Test
    public void testLoginByKeyword1() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }

    @Test
    public void testLoginByKeyword2() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }

    @Test
    public void testLoginByKeyword3() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }

    @Test
    public void testLoginByKeyword4() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }
}
