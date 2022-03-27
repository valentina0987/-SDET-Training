package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterAuthorizationPage {
    WebDriver driver;

    public AfterAuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrl() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.urlToBe("https://www.selenium-tutorial.com/"));
        return driver.getCurrentUrl();
    }

}
