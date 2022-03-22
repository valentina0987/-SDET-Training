package test;

import org.junit.Test;
import pages.MainPage;
import static java.lang.Thread.sleep;

public class MainPageTest extends TestBase{

    @Test
    public void CheckHeaderTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.headerDisplayed();
    }
}
