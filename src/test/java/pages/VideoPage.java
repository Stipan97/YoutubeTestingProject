package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideoPage {

    private WebDriver webDriver;
    private WebDriverWait driverWait;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[1]/a/yt-icon-button/button/yt-icon")
    WebElement likeButton;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[1]/a/yt-formatted-string")
    WebElement likes;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[2]/a/yt-icon-button/button/yt-icon")
    WebElement dislikeButton;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[2]/a/yt-formatted-string")
    WebElement dislikes;

    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[23]/div[2]/div[1]/button")
    WebElement playButton;

    @FindBy(xpath = "//*[@id=\"subscribe-button\"]/ytd-subscribe-button-renderer/paper-button")
    WebElement subButton;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[7]/div[3]/ytd-video-secondary-info-renderer/div/div[2]/div/ytd-subscribe-button-renderer/div[2]/ytd-subscription-notification-toggle-button-renderer/a/yt-icon-button")
    WebElement notifButton;

    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-menu-popup-renderer/paper-listbox/ytd-menu-service-item-renderer[1]/paper-item")
    WebElement allNotifs;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[7]/div[3]/ytd-video-secondary-info-renderer/div/div[2]/div/ytd-subscribe-button-renderer/paper-button")
    WebElement unSubButton;

    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/paper-dialog/yt-confirm-dialog-renderer/div[2]/div/yt-button-renderer[2]/a/paper-button")
    WebElement unSubConfirmButton;

    public VideoPage(WebDriver webDriver){
        this.webDriver = webDriver;
        driverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    public void clickLike(){
        driverWait.until(ExpectedConditions.visibilityOf(likeButton));
        likeButton.click();
    }

    public void clickDislike(){
        driverWait.until(ExpectedConditions.visibilityOf(dislikeButton));
        dislikeButton.click();
    }

    public Integer getLikes(){
        driverWait.until(ExpectedConditions.visibilityOf(likes));
        return Integer.parseInt(likes.getText());
    }

    public Integer getDislikes(){
        driverWait.until(ExpectedConditions.visibilityOf(dislikes));
        return Integer.parseInt(dislikes.getText());
    }

    public void pauseVideo(){
        driverWait.until(ExpectedConditions.visibilityOf(playButton));
        playButton.click();
    }

    public void Subscribe(){
        driverWait.until(ExpectedConditions.visibilityOf(subButton));
        subButton.click();
    }

    public void Unsubscribe(){
        driverWait.until(ExpectedConditions.visibilityOf(unSubButton));
        unSubButton.click();
    }

    public void UnsubscribeConfirm(){
        driverWait.until(ExpectedConditions.visibilityOf(unSubConfirmButton));
        unSubConfirmButton.click();
    }

    public void enableNotifs(){
        driverWait.until(ExpectedConditions.visibilityOf(notifButton));
        notifButton.click();
        driverWait.until(ExpectedConditions.visibilityOf(allNotifs));
        allNotifs.click();
    }
}
