package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public RegisterPage() {
    }

    private String newUrl = getBaseUrl() + "Register.html";

    public static String getBaseUrl() {
        String baseUrl = returnBaseUrl();
        if (baseUrl != null) {
            return returnBaseUrl().replace("", "");
        }
        return returnBaseUrl();
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bonprix.ro/my-account/login/");
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By EmailField1 = By.xpath("//input[@type='email']");
    private By EmailField2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    private By PrenumeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
    private By NumeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]");
    private By PasswordField1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]");
    private By PasswordField2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    private By NewsletterCheckBox = By.xpath("//div[@data-cy='login-form-register__newsletter-agreement']//em[@class='icon-check']");
    private By PoliticaConfidentialitateCheckBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/label[1]/span[1]/em[1]");
    private By MaiDeparteButton1 = By.xpath("//*[@id=\"submit-button\"]/span[2]");//!!!!locator de gasit unic am2din 2
    private By InputEmailField = By.xpath("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct  = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch

    String email1 = "Sandutza183@icloud.com";
    String password = "18031990";
    String prenume = "Sanda";
    String nume = "Marincas";
    String email = "Marincassanda@yahoo.com";

//SignUp
    public void clickContulMeuIcon() {
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
    }

        public void typeInEmailField1(String email1){
            LOG.info("Type in Email Adress");
            driver.findElement(EmailField1).sendKeys(String email1);
        }

        public void typeInEmailField2(String email1){
            LOG.info("Retype Email Adress");
            driver.findElement(EmailField2).sendKeys(String email1);
        }

        public void typeInPrenumeField(String prenume){
            LOG.info("Type in  Prenume");
            driver.findElement(PrenumeField).sendKeys(String prenume);
        }
        public void typeInNumeField(String nume){
            LOG.info("Type in  Nume");
            driver.findElement(NumeField).sendKeys(String nume);
        }
        public void typeInPasswordField1(String password){
            LOG.info("Type in Password");
            driver.findElement(PasswordField1).sendKeys(password);
        }
        public void typeInPasswordField2(String password){
            LOG.info("Type in Password");
            driver.findElement(PasswordField2).sendKeys(password);
        }
        public void clickNewslettercheckbox() {
            LOG.info("Click the Newsletter Checkbox");
            driver.findElement(NewsletterCheckBox).click();
        }
        public void clickPoliticaConfidentialitatecheckbox() {
            LOG.info("Click the Politica de ConfidentialitateCheckbox");
            driver.findElement(PoliticaConfidentialitateCheckBox).click();
        }

        public void clickMaiDeparteButton() {
            LOG.info("Click mai Departe Button");
            driver.findElement(MaiDeparteButton).click();
        }


//LOG In
    public void clickContulMeu() {
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
    }
    public void typeInEmailField(String email) {
        LOG.info("Type in Email Adress");
        driver.findElement(InputEmailField).sendKeys(String email);
    }
    public void clickMaiDeparteButton1() {
        LOG.info("Click Mai Departe Button");
        driver.findElement(MaiDeparteButton1).click();
    }
    public void typeInPasswordField() {
        LOG.info("Type in Password Field");
        driver.findElement(InputPasswordField).sendKeys(String password);
    }
    public void clickMaiDeparteButtonFinal() {
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonFinal).click();
    }









}









