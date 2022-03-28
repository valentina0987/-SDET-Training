package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.AfterAuthorizationPage;
import pages.MainPage;
import pages.PracticeSiteOnePage;

import static org.junit.Assert.assertEquals;

public class MainPageTest extends TestBase {


    // проверяем наличие элементов на главной странице
    @Test
    public void headerWithContactsTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.headerDisplayed();
        Assert.assertEquals("+919711-111-558", mainPage.getContacts().get(0));
        Assert.assertEquals("+919711-191-558", mainPage.getContacts().get(1));
        Assert.assertEquals("+1 646-480-0603", mainPage.getContacts().get(2));
        Assert.assertEquals("seleniumcoaching", mainPage.getContacts().get(3));
        Assert.assertEquals("trainer@way2automation.com", mainPage.getContacts().get(4));
    }

    @Test
    public void horizontalMenuTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.horizontalMenuDisplayed());
    }

    @Test
    public void sliderBlockTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.sliderBlockDisplayed());
    }

    @Test
    public void certificateBlockTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.certificateBlockDisplayed());
    }

    @Test
    public void trainingCoursesTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.trainingCoursesBlockDisplayed());
    }

    @Test
    public void recordingLiveBatchesTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.recordingLiveBatchesDisplayed());
    }

    @Test
    public void liveTrainingsTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.modulesOfSeleniumOneDisplayed());
        Assert.assertTrue(mainPage.modulesOfSeleniumTwoDisplayed());
    }

    @Test
    public void rahulAroraFounderTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.rahulAroraFounderDisplayed());
    }

    @Test
    public void makesProudTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.makesProudDisplayed());
    }

    @Test
    public void reviewsTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.reviewsDisplayed());
    }

    @Test
    public void corporateTrainingTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.corporateTrainingDisplayed());
    }

    @Test
    public void photoBlockTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.photoBlockDisplayed());
    }

    @Test
    public void footerTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.footerDisplayed());
    }

    // проверяем, что основное меню отображается в шапке при скроллинге
    @Test
    public void menuOnScrollingTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkMenuWhenScrolling();
        Assert.assertTrue(mainPage.mainMenuOnScrollDisplayed());
    }

    // проверяем, что есть рекламное окно
    @Test
    public void advertisingWindowTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkScrolling();
        Assert.assertTrue(mainPage.advertisingWindowDisplayed());
    }

    // проверяем, что прошли регистрацию на странице https://www.way2automation.com/ и перешли на https://www.selenium-tutorial.com/
    @Test
    public void RegistrationTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.passRegistration();
        String firstUrl = "https://www.selenium-tutorial.com/";
        AfterAuthorizationPage afterAuthorizationPage = new AfterAuthorizationPage(driver);
        afterAuthorizationPage.getUrl();
        String secondUrl = driver.getCurrentUrl();
        Assert.assertEquals(firstUrl, secondUrl);
    }

    // проверяем, что прошли авторизацию на странице https://www.way2automation.com/ и перешли на https://www.selenium-tutorial.com/
    @Test
    public void lodInTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkLogIn();
        String expectedResult = "https://www.selenium-tutorial.com/";
        AfterAuthorizationPage authorizationPage = new AfterAuthorizationPage(driver);
        String actualResult = authorizationPage.getUrl();
        System.out.println(authorizationPage.getUrl());
        assertEquals(expectedResult, actualResult);
    }


    // проверяем переход по меню на любую из страниц
    @Test
    public void menuPagesNavigation() {
        MainPage mainPage = new MainPage(driver);
        mainPage.ResourcesPageTransition();
        PracticeSiteOnePage practiceSiteOnePage = new PracticeSiteOnePage(driver);
        practiceSiteOnePage.getUrl();
    }
}