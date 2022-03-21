package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class WayAutomationCheckElement {
    private WebDriver driver;

    @Test
    public void CheckElementTest() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://www.way2automation.com/");

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
}
