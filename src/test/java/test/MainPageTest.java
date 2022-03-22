package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import pages.MainPage;

public class MainPageTest extends TestBase{
    WebDriver driver;

    @Test
    public void CheckHeaderTest() {
        MainPage mainPage = new MainPage(driver);
        //Assert.assertTrue(mainPage.headerDisplayed());

        mainPage.footerDisplayed();
    }
}
