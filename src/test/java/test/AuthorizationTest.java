package test;

import org.junit.Assert;
import org.junit.Test;
import pages.AuthorizationPage;

public class AuthorizationTest extends TestBase {

    @Override
    public String getUrl() {
        return "https://www.way2automation.com/angularjs-protractor/registeration/#/login";
    }

    @Test
    public void checkAuthorizationPositive() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("angular", "password", "angular student");
        Assert.assertEquals("Authorization failed", "You're logged in!!", authorizationPage.getLoginСonfirmText());
    }

    @Test
    public void checkAuthorizationFirstNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("angular", "", "angular student");
        Assert.assertEquals("The password is not entered, but the login button is clickable", "true", authorizationPage.isLoginButtonClickable());
    }

    @Test
    public void checkAuthorizationSecondNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("", "password", "angular student");
        Assert.assertEquals("The username is not entered, but the login button is clickable","true", authorizationPage.isLoginButtonClickable());
    }

    @Test
    public void checkAuthorizationThirdNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("angular", "password", "");
        Assert.assertEquals("The username description is not entered, but the login button is clickable","true", authorizationPage.isLoginButtonClickable());
    }

    @Test
    public void checkAuthorizationFourthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("angular", "уаупукиук", "angular student");
        Assert.assertEquals("The password is not correct, but the login button is clickable","true", authorizationPage.isLoginButtonClickable());
    }

    @Test
    public void checkAuthorizationFifthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("dudu", "password", "angular student");
        Assert.assertEquals("The username is not correct, but the login button is clickable","true", authorizationPage.isLoginButtonClickable());
    }

    @Test
    public void checkAuthorizationSixthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization("", "",  "");
        Assert.assertEquals("The username, password, username description is not entered, but the login button is clickable","true", authorizationPage.isLoginButtonClickable());
    }

}




