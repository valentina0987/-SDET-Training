package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    protected WebDriver driver;

    @Before()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
    }

    @Test
    public void checkAuthorization() throws InterruptedException {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization();
        authorizationPage.youLoggedDisplayed();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    }




