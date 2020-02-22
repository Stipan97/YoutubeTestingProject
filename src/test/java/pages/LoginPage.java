package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver webDriver;
    private WebDriverWait driverWait;

    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/div[2]/ytd-button-renderer/a/paper-button")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
    WebElement inputMail;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
    WebElement inputPass;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        driverWait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    public void mailInput(String input){
        driverWait.until(ExpectedConditions.visibilityOf(inputMail));
        inputMail.sendKeys(input);
        inputMail.sendKeys(Keys.RETURN);
    }

    public void passInput(String input){
        driverWait.until(ExpectedConditions.visibilityOf(inputPass));
        inputPass.sendKeys(input);
        inputPass.sendKeys(Keys.RETURN);
    }

    public void clickLogin(){
        driverWait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

}
