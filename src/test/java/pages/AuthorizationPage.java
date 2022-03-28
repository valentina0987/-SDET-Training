package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    @FindBy(xpath = "//p[@class='ng-scope']")
    private WebElement loginСonfirmText;

    // вы не ввели username
    @FindBy(xpath = "//div[@ng-message='required']")
    private WebElement didNotEnterUsername;

    // вы не ввели password
    @FindBy(xpath = "//div[@ng-messages='form.password.$error']//div[@class='ng-scope']")
    private WebElement didNotEnterPassword;

    // неверный пароль
    @FindBy(xpath = "//div[@class='alert alert-danger ng-binding ng-scope']")
    private WebElement passwordIncorrect;



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
    }

    public String getLoginСonfirmText() {
        return loginСonfirmText.getText();
    }


    public void passAuthorizationNegativeOne() {
        usernameField.clear();
        usernameField.sendKeys("angular");
        passwordField.clear();
        passwordField.sendKeys("");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
    }
    public String getDidNotEnterPassword() {
        return didNotEnterPassword.getText();
    }

    public void passAuthorizationNegativeTwo() {
        usernameField.clear();
        usernameField.sendKeys("");
        passwordField.clear();
        passwordField.sendKeys("password");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
    }
    public String getDidNotEnterUsername() {
        return didNotEnterUsername.getText();
    }

    public void passAuthorizationNegativeThree() {
        usernameField.clear();
        usernameField.sendKeys("angular");
        passwordField.clear();
        passwordField.sendKeys("password");
        usernameDescription.clear();
        usernameDescription.sendKeys("");
        loginButton.click();
    }

    public void passAuthorizationNegativeFour() {
        usernameField.clear();
        usernameField.sendKeys("angular");
        passwordField.clear();
        passwordField.sendKeys("уаупукиук");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
    }
    public String getPasswordIncorrect() {
        return passwordIncorrect.getText();
    }

    public void passAuthorizationNegativeFive() {
        usernameField.clear();
        usernameField.sendKeys("dudu");
        passwordField.clear();
        passwordField.sendKeys("password");
        usernameDescription.clear();
        usernameDescription.sendKeys("angular student");
        loginButton.click();
    }

    public void passAuthorizationNegativeSix() {
        usernameField.clear();
        usernameField.sendKeys("");
        passwordField.clear();
        passwordField.sendKeys("");
        usernameDescription.clear();
        usernameDescription.sendKeys("");
        loginButton.click();
    }

    // url на странице авторизации https://www.way2automation.com/angularjs-protractor/registeration/#/login
    public String getUrl() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.urlToBe("https://www.way2automation.com/angularjs-protractor/registeration/#/login"));
        return driver.getCurrentUrl();
    }

}
