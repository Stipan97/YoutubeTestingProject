package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.io.IOException;


public class SearchTestFERIT {

    WebDriverSetup webDriverSetup;
    WebDriver webDriver;

    @BeforeMethod
    public void setup(){
        webDriverSetup = new WebDriverSetup("Chrome");
        webDriver = webDriverSetup.getWebDriver();
    }

    @Test
    public void SearchWeAreFERIT() throws IOException, InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.searchInput("We are FERIT");
        searchPage.clickSearch();
        Assert.assertTrue(searchPage.findVideo(), "Video not found");
        searchPage.clickVideo();
    }

    @Test
    public void SearchFERIT() throws IOException, InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.searchInput("FERIT Osijek");
        searchPage.clickSearch();
        Assert.assertTrue(searchPage.findVideo(), "Video not found");
        searchPage.clickVideo();
    }

    @AfterMethod
    public void finishUp(){
        webDriver.quit();
    }
}
