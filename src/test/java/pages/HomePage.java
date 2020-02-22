package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver webDriver;
    private static String HOMEPAGE_URL = "https://www.youtube.com/";

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.get(HOMEPAGE_URL);
        PageFactory.initElements(webDriver, this);
    }

}
