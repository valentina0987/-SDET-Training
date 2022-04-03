package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeSiteOnePage {

        WebDriver driver;

        public PracticeSiteOnePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public String getUrl() {
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.urlToBe("https://www.way2automation.com/way2auto_jquery/index.php"));
            return driver.getCurrentUrl();
        }
    }
