package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='formly_1_input_username_0']")
    private WebElement usernameDescription;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='ng-scope']")
    private WebElement loginСonfirmText;

    @FindBy(xpath = "//div[@ng-message='required']")
    private WebElement didNotEnterUsername;

    @FindBy(xpath = "//div[@ng-messages='form.password.$error']//div[@class='ng-scope']")
    private WebElement didNotEnterPassword;


    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void passAuthorization(String username, String password, String usernameDesc) {
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        usernameDescription.clear();
        usernameDescription.sendKeys(usernameDesc);
        loginButton.click();
    }

    public String isLoginButtonClickable() {
        return loginButton.getAttribute("disabled");
    }

    public String getLoginСonfirmText() {
        return loginСonfirmText.getText();
    }
}
