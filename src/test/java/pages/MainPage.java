package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainPage {
    WebDriver driver;

    // баннер на главной
    @FindBy(xpath = "//div[@class='dialog-widget-content dialog-lightbox-widget-content animated']")
    private WebElement bannerOnHomePage;

    // кнопка "Закрыть баннер"
    @FindBy(xpath = "//i[@class='eicon-close']")
    private WebElement closeBannerButton;

    // хидер с контактами
    @FindBy(xpath = "//div[@class='ast-above-header-bar ast-above-header  site-header-focus-item']")
    private WebElement headerOnHomePage;

    // Номер 1
    @FindBy(xpath = "//span[normalize-space()='+919711-111-558']")
    private WebElement phoneNumberOne;

    // Номер 2
    @FindBy(xpath = "//span[normalize-space()='+919711-191-558']")
    private WebElement phoneNumberTwo;

    // Номер 3
    @FindBy(xpath = "//span[normalize-space()='+1 646-480-0603']")
    private WebElement phoneNumberThree;

    // Скайп
    @FindBy(xpath = "//span[normalize-space()='seleniumcoaching']")
    private WebElement skypeNumber;

    // email
    @FindBy(xpath = "(//span[contains(@class,'elementor-icon-list-text')][normalize-space()='trainer@way2automation.com'])[1]")
    private WebElement emailAdress;

    // иконки соцсетй
    @FindBy(xpath = "//div[@class='site-header-above-section-right site-header-section ast-flex ast-grid-right-section']")
    private WebElement socialNetwork;

    // горизонтальное меню
    @FindBy(xpath = "//div[contains(@class,'site-header-primary-section-right')]//nav[@id='site-navigation']")
    private WebElement horizontalMenu;

    // блок слайдер
    @FindBy(xpath = "//div[@data-id='155c094d']")
    private WebElement sliderBlock;

    //слайд 1
    @FindBy(xpath = "//div[@class='swiper-wrapper elementor-slides']//div[@data-swiper-slide-index='0'][2]")
    private WebElement slideOne;

    ////div[@class='elementor-slide-heading'][normalize-space()='3 New Automation Batches starting']

    //слайд 2
    @FindBy(xpath = "//div[@class='swiper-wrapper elementor-slides']//div[@data-swiper-slide-index='1'][2]")
    private WebElement slideTwo;
    ////div[@class='elementor-slide-heading'][normalize-space()='LIFETIME MEMBERSHIP CLUB']

    // блок сертификатов
    @FindBy(xpath = "//section[@data-id='1e537621']")
    private WebElement certificateBlock;

    // блок курсов
    @FindBy(xpath = "//section[@data-id='166618a']")
    private WebElement trainingCoursesBlock;

    // запись видео
    @FindBy(xpath = "//img[@id='MTA3Mjo1Mzk=-1']")
    private WebElement recordingLiveBatches;

    // блок модулей Selenium 1
    @FindBy(xpath = "//section[@data-id='bdfac60']")
    private WebElement modulesOfSeleniumOne;

    // блок модулей Selenium 2
    @FindBy(xpath = "//section[@data-id='30ee559']")
    private WebElement modulesOfSeleniumTwo;

    //Rahul Arora
    @FindBy(xpath = "//div[@data-id='7037673b']")
    private WebElement rahulAroraFounder;

    // мы гордимся
    @FindBy(xpath = "//section[@data-id='a132a9a']")
    private WebElement makesProud;

    // отзывы
    @FindBy(xpath = "//section[@data-id='14f241ad']")
    private WebElement reviews;

    // новейшее корпоративное обучение
    @FindBy(xpath = "//div[@data-id='2a7fdab']")
    private WebElement corporateTraining;

    // блок фото
    @FindBy(xpath = "//section[@data-id='62d0d84']")
    private WebElement photoBlock;

    // футер
    @FindBy(xpath = "//div[@data-id='573bc308']")
    private WebElement footerOnHomePage;

     // основное меню в шапке при скролинге
     @FindBy(xpath = "//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']")
     private WebElement mainMenuOnScroll;

     //регистрация
     @FindBy(xpath = "//li[@id='menu-item-27625']//span[@class='menu-text'][normalize-space()='Member Login']")
     private WebElement memberLogin;

    // создать аккаунт
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    private WebElement createAccount;

    // полное имя
    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement fullNameField;

    // почта
    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement emailField;

    // пароль
    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    // согласие на обработку данных
    @FindBy(xpath = "//input[@id='allow_marketing_emails']")
    private WebElement checkAgree;

    // кнопка "зарегистрироваться"
    @FindBy(xpath = "//input[@name='commit']")
    private WebElement signUpButton;


    //вход зарегистрированного пользователя

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmailField;


    //методы

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
// регистрация
    public void passRegistration() {
        memberLogin.click();
        createAccount.click();
        fullNameField.clear();
        fullNameField.sendKeys("Kill Bill");
        emailField.clear();
        emailField.sendKeys("Sisofttt@yandex.ru");
        fieldPassword.clear();
        fieldPassword.sendKeys("Sisofttest");
        checkAgree.click();
        signUpButton.click();
    }
// вход
    public void checkLogIn() {
        memberLogin.click();
        userEmailField.clear();
        userEmailField.sendKeys("Sisofttest@yandex.ru");
        fieldPassword.clear();
        fieldPassword.sendKeys("Sisofttest");
        signUpButton.click();
    }
// проверка меню в шапке при скроллинге
    public void checkMenuWhenScrolling(){
        WebElement element = driver.findElement(By.xpath("//section[@data-id='62d0d84']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean mainMenuOnScrollDisplayed() {
        return mainMenuOnScroll.isDisplayed();
    }


// проверка рекламного окна
    public void checkScrolling() {
        WebElement element = driver.findElement(By.xpath("//div[@data-id='7037673b']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean advertisingWindowDisplayed() {
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dialog-widget-content dialog-lightbox-widget-content animated']")));
        return bannerOnHomePage.isDisplayed();
    }

    // проверка всех элементов на главной

        public boolean headerDisplayed() {
            return headerOnHomePage.isDisplayed();
        }

        public boolean phoneNumberOneDisplayed() {
            return phoneNumberOne.isDisplayed();
        }

        public boolean phoneNumberTwoDisplayed() {
            return phoneNumberTwo.isDisplayed();
        }

        public boolean phoneNumberThreeDisplayed() {
            return phoneNumberThree.isDisplayed();
        }

        public boolean skypeNumberDisplayed() {
            return skypeNumber.isDisplayed();
        }

        public boolean emailAdressDisplayed() {
            return emailAdress.isDisplayed();
        }

        public boolean socialNetworkDisplayed() {
            return socialNetwork.isDisplayed();
        }

        public boolean horizontalMenuDisplayed() {
            return horizontalMenu.isDisplayed();
        }

        public boolean sliderBlockDisplayed() {
            return sliderBlock.isDisplayed();
        }

        public boolean slideOneDisplayed() { return slideOne.isDisplayed(); }

        public boolean slideTwoDisplayed() { return slideTwo.isDisplayed(); }

        public boolean certificateBlockDisplayed() {
            return certificateBlock.isDisplayed();
        }

        public boolean trainingCoursesBlockDisplayed() {
            return trainingCoursesBlock.isDisplayed();
        }

        public boolean recordingLiveBatchesDisplayed() {
            return recordingLiveBatches.isEnabled();
        }

        public boolean modulesOfSeleniumOneDisplayed() {
            return modulesOfSeleniumOne.isDisplayed();
        }

        public boolean modulesOfSeleniumTwoDisplayed() {
            return modulesOfSeleniumTwo.isDisplayed();
        }

        public boolean rahulAroraFounderDisplayed() {
            return rahulAroraFounder.isDisplayed();
        }

        public boolean makesProudDisplayed() {
            return makesProud.isDisplayed();
        }

        public boolean reviewsDisplayed() {
            return reviews.isDisplayed();
        }

        public boolean corporateTrainingDisplayed() {
            return corporateTraining.isDisplayed();
        }

        public boolean photoBlockDisplayed() {
            return photoBlock.isDisplayed();
        }

        public boolean footerDisplayed() {
            return footerOnHomePage.isDisplayed();
        }

        // провeрка, что у блока-слайдера работает скроллинг
        public void checksliderScrolling() {
            //WebElement element = driver.findElement(By.xpath("//div[@data-id='155c094d']"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            slideTwo.isDisplayed();
            new WebDriverWait(driver, 200);
            //((JavascriptExecutor) driver).executeScript("scroll(0,300)");
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(6000,50)");
            slideTwo.isDisplayed();
        }

    // проверка, что блока с курсами работает слайдер

    }






