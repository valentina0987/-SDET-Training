package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public void waiters(WebDriver driver, WebElement webElement) {
        new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(webElement));
    }
}
