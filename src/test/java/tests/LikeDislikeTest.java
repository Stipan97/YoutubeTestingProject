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

public class LikeDislikeTest {

    WebDriverSetup webDriverSetup;
    WebDriver webDriver;

    Integer before = 0, after = 0;

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
    public void Like() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        before = videoPage.getLikes();
        videoPage.clickLike();
        after = videoPage.getLikes();
        if(after != before+1){
            Assert.fail();
        }
    }

    @Test
    public void Unlike() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        before = videoPage.getLikes();
        videoPage.clickLike();
        after = videoPage.getLikes();
        if(after != before-1){
            Assert.fail();
        }
    }

    @Test
    public void Dislike() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        before = videoPage.getDislikes();
        videoPage.clickDislike();
        after = videoPage.getDislikes();
        if(after != before+1){
            Assert.fail();
        }
    }

    @Test
    public void Undislike() throws IOException, InterruptedException{
        VideoPage videoPage = new VideoPage(webDriver);
        videoPage.pauseVideo();
        before = videoPage.getDislikes();
        videoPage.clickDislike();
        after = videoPage.getDislikes();
        if(after != before-1){
            Assert.fail();
        }
    }

    @AfterMethod
    public void finishUp(){
        webDriver.quit();
    }

}
