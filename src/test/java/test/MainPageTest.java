package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AfterAuthorizationPage;
import pages.MainPage;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class MainPageTest extends TestBase {


    // проверяем наличие элементов на главной странице
    @Test
    public void headerWithContactsTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.headerDisplayed();
        Assert.assertEquals("+919711-111-558", mainPage.getContacts().get(0));
        Assert.assertEquals("+919711-191-558", mainPage.getContacts().get(1));
        Assert.assertEquals("+1 646-480-0603", mainPage.getContacts().get(2));
//        mainPage.phoneNumberTwoDisplayed();
//        mainPage.phoneNumberThreeDisplayed();
//        mainPage.skypeNumberDisplayed();
//        mainPage.emailAdressDisplayed();
//        mainPage.socialNetworkDisplayed();
    }

    @Test
    public void horizontalMenuTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.horizontalMenuDisplayed());
    }

    @Test
    public void sliderBlockTest()  {
        MainPage mainPage = new MainPage(driver);
        mainPage.sliderBlockDisplayed();
    }

    @Test
    public void certificateBlockTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.certificateBlockDisplayed();
    }

    @Test
    public void trainingCoursesTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.trainingCoursesBlockDisplayed();
    }

    @Test
    public void recordingLiveBatchesTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.recordingLiveBatchesDisplayed();
    }

    @Test
    public void liveTrainingsTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.modulesOfSeleniumOneDisplayed();
        mainPage.modulesOfSeleniumTwoDisplayed();
    }

    @Test
    public void rahulAroraFounderTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.rahulAroraFounderDisplayed();
    }

    @Test
    public void makesProudTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.makesProudDisplayed();
    }

    @Test
    public void reviewsTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.reviewsDisplayed();
    }

    @Test
    public void corporateTrainingTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.corporateTrainingDisplayed();
    }

    @Test
    public void photoBlockTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.photoBlockDisplayed();
    }

    @Test
    public void footerTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.footerDisplayed();
    }

    // проверяем, что основное меню отображается в шапке при скроллинге
    @Test
    public void menuOnScrollingTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkMenuWhenScrolling();
        mainPage.mainMenuOnScrollDisplayed();
    }

    // проверяем, что есть рекламное окно
    @Test
    public void advertisingWindowTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkScrolling();
        mainPage.advertisingWindowDisplayed();
    }

    // проверяем, что прошли регистрацию на странице https://www.way2automation.com/ и перешли на https://www.selenium-tutorial.com/
    @Test
    public void RegistrationTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.passRegistration();
        String obj1 = "https://www.selenium-tutorial.com/";
        String obj2 = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        assertEquals(obj1, obj2);
    }

    // проверяем, что прошли авторизацию на странице https://www.way2automation.com/ и перешли на https://www.selenium-tutorial.com/
    @Test
    public void lodInTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkLogIn();
        String expectedResult = "https://www.selenium-tutorial.com/";
        AfterAuthorizationPage authorizationPage = new AfterAuthorizationPage(driver);
        String actualResult = authorizationPage.getUrl();
        System.out.println(authorizationPage.getUrl());
        assertEquals(expectedResult, actualResult);
    }

    // проверяем, что у блока-слайдера работает скроллинг
    @Test
    public void sliderScrollingTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.checksliderScrolling();

    }
}