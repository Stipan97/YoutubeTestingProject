package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import pages.VideoPage;

import java.io.IOException;

public class SubscribeTest {

    WebDriverSetup webDriverSetup;
    WebDriver webDriver;

    private void PathToVideo(){
        HomePage homePage = new HomePage(webDriver);
        SearchPage searchPage = new SearchPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        loginPage.mailInput("ttestiranje2@gmail.com");
        loginPage.passInput("test123test123");
        searchPage.searchInput("We are FERIT");
        searchPage.clickSearch();
        Assert.assertTrue(searchPage.findVideo(), "Video not found");
        searchPage.clickVideo();
    }

    @BeforeMethod
    public void setup(){
        webDriverSetup = new WebDriverSetup("Chrome");
        webDriver = webDriverSetup.getWebDriver();
        PathToVideo();
    }

    @Test
    public void Subscribe() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        videoPage.Subscribe();
    }

    @Test
    public void SubAndNotif() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        videoPage.Subscribe();
        videoPage.enableNotifs();
    }

    @Test
    public void Unsubscribe() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        videoPage.Unsubscribe();
        videoPage.UnsubscribeConfirm();
    }

    @AfterMethod
    public void finishUp(){
        webDriver.quit();
    }
}
