package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AuthorizationTest {
    protected WebDriver driver;

    @BeforeTest()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
    }

    @Test
    public void checkAuthorizationPositive() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization();
        Assert.assertEquals("You're logged in!!", authorizationPage.getLoginСonfirmText());

    }

    @Test
    public void checkAuthorizationFirstNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeOne();
        Assert.assertEquals("You did not enter a username", authorizationPage.getDidNotEnterPassword());
    }

    @Test
    public void checkAuthorizationSecondNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeTwo();
        Assert.assertEquals("You did not enter a username", authorizationPage.getDidNotEnterUsername());

    }

    @Test
    public void checkAuthorizationThirdNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeThree();
        String expectedResult = "https://www.way2automation.com/angularjs-protractor/registeration/#/login";
        String actualResult = authorizationPage.getUrl();
        assertEquals(expectedResult, actualResult);
        System.out.print("Sorry, you are not logged in. Authorization failed");

    }

    @Test
    public void checkAuthorizationFourthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeFour();
        Assert.assertEquals("Username or password is incorrect", authorizationPage.getPasswordIncorrect());

    }

    @Test
    public void checkAuthorizationFifthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeFive();
        Assert.assertEquals("Username or password is incorrect", authorizationPage.getPasswordIncorrect());
    }

    @Test
    public void checkAuthorizationSixthNegative() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorizationNegativeSix();
        Assert.assertEquals("You did not enter a username", authorizationPage.getDidNotEnterUsername());
        Assert.assertEquals("You did not enter a username", authorizationPage.getDidNotEnterPassword());
    }


        @AfterTest
    public void tearDown() {
        driver.quit();
    }

    }




