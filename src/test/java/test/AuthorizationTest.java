package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

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
    public void checkAuthorization() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization();
        Assert.assertEquals("You're logged in!!", authorizationPage.getLoginСonfirmText());

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    }




