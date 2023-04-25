package pages.LogInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

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


    private By cookiesButton = By.xpath("//a[@id='JOISH987_acceptAllBar_btn']");
    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.xpath("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonLogFinal = By.cssSelector("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By ExitNewsLetterPopUpButton = By.cssSelector("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button");

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

    public void typeInInputEmailField(String email) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in Email Adress");
        driver.findElement(InputEmailField).sendKeys(email);
    }

    public void clickMaiDeparteButton() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click Mai Departe Button");
        driver.findElement(MaiDeparteButton).click();
    }

    public void typeInInputPasswordField(String password) {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Type in Password Field");
        driver.findElement(InputPasswordField).sendKeys(password);
    }

    public void clickMaiDeparteButtonLogFinal() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonLogFinal).click();
    }

//    public void clickExitNewsLetterPopUpButton() {
//        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
//        LOG.info("Click Exit NewsLetter PopUp Button");
//        driver.findElement(ExitNewsLetterPopUpButton);
//    }


}


