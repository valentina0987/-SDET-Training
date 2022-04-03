package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;


public class MainPage extends BasePage{
    WebDriver driver;

    Faker faker = new Faker();
    String name = faker.name().fullName();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();


    @FindBy(xpath = "//section[@data-id='c4b9ad9']")
    private WebElement bannerOnHomePage;

    @FindBy(xpath = "//div[contains(@class, 'ast-above-header-bar')][@data-section='section-above-header-builder']")
    private WebElement headerOnHomePage;

    @FindBy(xpath = "//div[contains(@class,'site-header-primary-section-right')]//nav[@id='site-navigation']")
    private WebElement horizontalMenu;

    @FindBy(xpath = "//div[@data-id='155c094d']")
    private WebElement sliderBlock;

    @FindBy(xpath = "//section[@data-id='1e537621']")
    private WebElement certificateBlock;

    @FindBy(xpath = "//section[@data-id='166618a']")
    private WebElement trainingCoursesBlock;

    @FindBy(xpath = "//img[@id='MTA3Mjo1Mzk=-1']")
    private WebElement recordingLiveBatches;

    @FindBy(xpath = "//section[@data-id='bdfac60']")
    private WebElement modulesOfSeleniumOne;

    @FindBy(xpath = "//section[@data-id='30ee559']")
    private WebElement modulesOfSeleniumTwo;

    @FindBy(xpath = "//div[@data-id='7037673b']")
    private WebElement rahulAroraFounder;

    @FindBy(xpath = "//section[@data-id='a132a9a']")
    private WebElement makesProud;

    @FindBy(xpath = "//section[@data-id='14f241ad']")
    private WebElement reviews;

    @FindBy(xpath = "//div[@data-id='2a7fdab']")
    private WebElement corporateTraining;

    @FindBy(xpath = "//section[@data-id='62d0d84']")
    private WebElement photoBlock;

    @FindBy(xpath = "//div[@data-id='573bc308']")
    private WebElement footerOnHomePage;

    @FindBy(xpath = "//div[contains(@class, 'ast-builder-grid-row-container')][@data-section='section-primary-header-builder']")
    private WebElement mainMenuOnScroll;

    @FindBy(xpath = "//li[@id='menu-item-27625']//span[@class='menu-text'][normalize-space()='Member Login']")
    private WebElement memberLogin;

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    private WebElement createAccount;

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement fullNameField;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='allow_marketing_emails']")
    private WebElement checkAgree;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmailField;

    @FindBy(xpath = "//li[@id='menu-item-27617']//span[@class='sub-arrow']")
    private WebElement menuResources;

    @FindBy(xpath = "//li[@id='menu-item-27618']//span[@class='menu-text']")
    private WebElement pagePracticeSiteOne;

    @FindBy(xpath = "//ul[contains(@class, 'elementor-inline-items')]//span[@class='elementor-icon-list-text']")
    private List<WebElement> mainContacts;



    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void passRegistration() {
        memberLogin.click();
        createAccount.click();
        fullNameField.clear();
        fullNameField.sendKeys(name);
        emailField.clear();
        emailField.sendKeys(email);
        fieldPassword.clear();
        fieldPassword.sendKeys(password);
        checkAgree.click();
        signUpButton.click();
    }

    public void checkLogIn(String userEmail, String password) {
        memberLogin.click();
        userEmailField.clear();
        userEmailField.sendKeys(userEmail);
        fieldPassword.clear();
        fieldPassword.sendKeys(password);
        signUpButton.click();
    }

    public void checkMenuWhenScrolling(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", photoBlock);
    }

    public boolean mainMenuOnScrollDisplayed() {
        return mainMenuOnScroll.isDisplayed();
    }


    public void checkScrolling() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", rahulAroraFounder);
    }

    public boolean advertisingWindowDisplayed() {
        waiters(driver, bannerOnHomePage);
        return bannerOnHomePage.isDisplayed();
    }

        public boolean headerDisplayed() {
            return headerOnHomePage.isDisplayed();
        }

        public List getContacts() {
            ArrayList<String> contacts = new ArrayList<>();
            for (WebElement e : mainContacts) {
                contacts.add(e.getText());
            }
            return contacts;
        }

        public boolean horizontalMenuDisplayed() {
            return horizontalMenu.isDisplayed();
        }

        public boolean sliderBlockDisplayed() {
            return sliderBlock.isDisplayed();
        }

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

    public void ResourcesPageTransition() {
        menuResources.click();
        pagePracticeSiteOne.click();
    }
}






