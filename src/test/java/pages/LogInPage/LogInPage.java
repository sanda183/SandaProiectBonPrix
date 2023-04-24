package pages.LogInPage;

import org.openqa.selenium.By;
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


    private By cookiesButton = By.xpath("//a[@id='JOISH987_acceptAllBar_btn']");
    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.id("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonLogFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");


  public void clickcookiesButton(){
      LOG.info("Click cookies");
      driver.findElement(cookiesButton).click();
   }
    public void clickContulMeuIcon() {
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
    }

    public void typeInInputEmailField(String email) {
        LOG.info("Type in Email Adress");
        driver.findElement(InputEmailField).sendKeys(email);
    }

    public void clickMaiDeparteButton() {
        LOG.info("Click Mai Departe Button");
        driver.findElement(MaiDeparteButton).click();
    }

    public void typeInInputPasswordField(String password) {
        LOG.info("Type in Password Field");
        driver.findElement(InputPasswordField).sendKeys(password);
    }

    public void clickMaiDeparteButtonLogFinal() {
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonLogFinal).click();
    }

}

