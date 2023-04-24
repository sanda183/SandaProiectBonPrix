package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By cookiesButton = By.xpath("//a[@id='JOISH987_acceptAllBar_btn']");
    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By EmailField1 = By.xpath("//input[@type='email']");
    private By EmailField2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    private By PrenumeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
    private By NumeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]");
    private By PasswordField1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]");
    private By PasswordField2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    private By NewsletterCheckBox = By.xpath("//div[@data-cy='login-form-register__newsletter-agreement']//em[@class='icon-check']");
    private By PoliticaConfidentialitateCheckBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/label[1]/span[1]/em[1]");
    private By MaiDeparteButton1 = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputEmailField = By.id("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonFinal = By.xpath("//div[@class='login-logger__inner']//button[@id='submit-button']");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch


    //SignUp
    public void clickcookiesButton() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click cookies");
        driver.findElement(cookiesButton).click();
    }

    public void clickContulMeuIcon() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
    }

    public void typeInEmailField1(String email1) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in Email Adress");
        driver.findElement(EmailField1).sendKeys(email1);
    }

    public void clickMaiDeparteButton1() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click mai Departe Button");
        driver.findElement(MaiDeparteButton1).click();
    }

    public void typeInEmailField2(String email1) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Retype Email Adress");
        driver.findElement(EmailField2).sendKeys(email1);
    }

    public void typeInPrenumeField(String prenume) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in  Prenume");
        driver.findElement(PrenumeField).sendKeys(prenume);
    }

    public void typeInNumeField(String nume) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in  Nume");
        driver.findElement(NumeField).sendKeys(nume);
    }

    public void typeInPasswordField1(String password) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in Password");
        driver.findElement(PasswordField1).sendKeys(password);
    }

    public void typeInPasswordField2(String password) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in Password");
        driver.findElement(PasswordField2).sendKeys(password);
    }

    public void clickNewsletterCheckBox() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click the Newsletter Checkbox");
        driver.findElement(NewsletterCheckBox).click();
    }

    public void clickPoliticaConfidentialitateCheckBox() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click the Politica de ConfidentialitateCheckbox");
        driver.findElement(PoliticaConfidentialitateCheckBox).click();
    }

    public void clickMaiDeparteButtonFinal() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click mai Departe ButtonFinal");
        driver.findElement(MaiDeparteButtonFinal).click();
    }

    public void typeInProductYouAreSearching() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Search a Product");
        //driver.findElement(searchProduct).sendKeys("Geanta Pai" + Keys.ENTER);


    }
}









