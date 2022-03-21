package test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthorizationWayAutomationPage;

import java.util.concurrent.TimeUnit;

public class AuthorizationWayAutomationTest extends TestBase{

    private WebDriver driver;

    @Test
    public void AuthorizationTest() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
        AuthorizationWayAutomationPage authorizationWayAutomationPage = new AuthorizationWayAutomationPage(driver);
        authorizationWayAutomationPage.passAuthorization();

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
    }



        //this.driver = driver;
        //PageFactory.initElements(driver, this);

