package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainWayAutomationPage {
    WebDriver driver;

    public MainWayAutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // баннер на главной
    @FindBy(xpath = "//div[@class='dialog-widget-content dialog-lightbox-widget-content animated']")
    private WebElement bannerOnHomePage;

    // кнопка "Закрыть баннер"
    @FindBy(xpath = "//i[@class='eicon-close']")
    private WebElement closeBannerButton;

    // хидер с контактами
    @FindBy(xpath = "//div[@class='ast-above-header-bar ast-above-header  site-header-focus-item']")
    //или вот такой //ul[contains(@class,'elementor-icon-list-items elementor-inline-items')]
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
    @FindBy(xpath = "//li[contains(@class,'elementor-icon-list-item elementor-inline-item')]//span[contains(@class,'elementor-icon-list-text')][normalize-space()='trainer@way2automation.com']")
    private WebElement emailAdress;

    // горизонтальное меню
    @FindBy(xpath = "//div[contains(@class,'site-header-primary-section-right')]//nav[@id='site-navigation']")
    private WebElement horizontalMenu;

    // блок слайдер
    @FindBy(xpath = "//div[@data-id='155c094d']")
    private WebElement sliderBlock;

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

    // Rahul Arora основатель (фото)
    @FindBy(xpath = "//img[@id='MTQ3Njo0ODY=-1']") //или //div[@data-id='d8d3b72']
    private WebElement rahulAroraPhoto;


    // Rahul Arora основатель (текст)
    @FindBy(xpath = "//div[@data-id='42038e01']")
    private WebElement rahulAroraText;

//ИЛИ Rahul Arora текст / фото
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


    // все права защищены
    @FindBy(xpath = "//h2[contains(text(),'Ⓒ Way2Automation - All Rights Are Reserved')]")
    private WebElement allRightsReserved;

     // основное меню в шапке при скролинге
     @FindBy(xpath = "")
     private WebElement mainMenuOnScroll;
     //найти!


    }




