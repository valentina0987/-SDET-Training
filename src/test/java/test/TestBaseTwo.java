package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBaseTwo {
    protected WebDriver driver;

    @Before()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

// Черновик
//div[@class='elementor-repeater-item-2c17d9c swiper-slide swiper-slide-active']//div[@class='elementor-slide-heading'][normalize-space()='LIFETIME MEMBERSHIP CLUB']

}
