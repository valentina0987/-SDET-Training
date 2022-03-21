package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AuthorizationWayAutomationPage {

    WebDriver driver;

    public AuthorizationWayAutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // поле Username
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameField;

    // поле Password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    // поле username description
    @FindBy(xpath = "//input[@id='password']")
    private WebElement usernameDescription;

    // кнопка логин
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;

    // вы вошли!
    @FindBy(xpath = "//p[normalize-space()=\"You're logged in!!\"]")
    private WebElement youLogged ;


    // url входа
    //https://www.way2automation.com/angularjs-protractor/registeration/#/login

    // после регистрации
    //https://www.way2automation.com/angularjs-protractor/registeration/#/

    public void passAuthorization() {
        usernameField.clear();
        usernameField.sendKeys("angular");
        passwordField.clear();
        passwordField.sendKeys("password");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
    }




}
