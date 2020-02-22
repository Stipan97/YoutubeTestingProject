package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSetup {

    private static WebDriver webDriver;

    public WebDriverSetup(String browser){
        if (browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
            webDriver = new ChromeDriver();
        } else if (browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
            webDriver = new FirefoxDriver();
        }
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }
}
