package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    WebDriver driver;

    // поле Username
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameField;

    // поле Password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    // поле username description
    @FindBy(xpath = "//input[@id='formly_1_input_username_0']")
    private WebElement usernameDescription;

    // кнопка логин
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;

    // вы вошли!
    @FindBy(xpath = "//p[normalize-space()=\"You're logged in!!\"]")
    private WebElement youLogged;


    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void passAuthorization() {
        usernameField.clear();
        usernameField.sendKeys("angular");
        passwordField.clear();
        passwordField.sendKeys("password");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
        youLoggedDisplayed();
    }

    public boolean youLoggedDisplayed() {
        return youLogged.isDisplayed();
    }
}
