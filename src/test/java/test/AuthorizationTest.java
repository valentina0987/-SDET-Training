package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class AuthorizationTest extends TestBase{

    private WebDriver driver;

    @Test
    public void AuthorizationTest() {

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization();


        }
    }





