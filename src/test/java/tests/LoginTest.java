package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginTest {

    WebDriverSetup webDriverSetup;
    WebDriver webDriver;

    @BeforeMethod
    public void setup(){
        webDriverSetup = new WebDriverSetup("Chrome");
        webDriver = webDriverSetup.getWebDriver();
    }

    @Test
    public void Login() throws IOException, InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        loginPage.mailInput("ttestiranje2@gmail.com");
        loginPage.passInput("test123test123");
    }

    @AfterMethod
    public void finishUp(){
        webDriver.quit();
    }
}
