package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private WebDriver webDriver;
    private WebDriverWait driverWait;

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchText;

    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]")
    WebElement searchButton;

    @FindBy(xpath = "//*[@href=\"/watch?v=NHD9AxPrOD0\"]")
    WebElement video;

    public SearchPage(WebDriver webDriver){
        this.webDriver = webDriver;
        driverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    public void searchInput(String input){
        driverWait.until(ExpectedConditions.visibilityOf(searchText));
        searchText.sendKeys(input);
    }

    public void clickSearch(){
        driverWait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }

    public boolean findVideo(){
        driverWait.until(ExpectedConditions.visibilityOf(video));
        return video.getAttribute("href").contains("/watch?v=NHD9AxPrOD0");
    }

    public void clickVideo(){
        video.click();
    }

}
