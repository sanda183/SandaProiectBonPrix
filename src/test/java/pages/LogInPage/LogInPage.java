package pages.LogInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance = new LogInPage();

    public LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bonprix.ro/");
    }

    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.xpath("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    String email = "Marincassanda@yahoo.com";
    String password = "18031990";

        public void clickContulMeu() {
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
        }
        public void typeInEmailField(String email) {
            LOG.info("Type in Email Adress");
            driver.findElement(InputEmailField).sendKeys(String email);
        }
        public void clickMaiDeparteButton() {
            LOG.info("Click Mai Departe Button");
            driver.findElement(MaiDeparteButton).click();
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

