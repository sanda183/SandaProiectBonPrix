package pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class RegisterPage<newUrl> extends BasePage {
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
        driver.findElement(By.id("JOISH987_acceptAllBar_btn")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(new CharSequence[]{"test1@hotmail.com" + Keys.ENTER});
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(new CharSequence[]{"test1@hotmail.com"});
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys(new CharSequence[]{"Adam"});
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys(new CharSequence[]{"John"});
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys(new CharSequence[]{"Password@123"});
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(new CharSequence[]{"Password@123"});
        driver.findElement(By.xpath("//div[@data-cy='login-form-register__newsletter-agreement']//em[@class='icon-check']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/label[1]/span[1]/em[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"submit-button\"]/span[2]")).click();
    }}









