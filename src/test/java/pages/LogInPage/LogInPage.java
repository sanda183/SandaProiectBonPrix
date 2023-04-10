package pages.LogInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
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


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bonprix.ro/");
        driver.findElement(By.xpath("//a[@aria-label='Contul meu']")).click();
        Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.findElement(By.id("JOISH987_acceptAllBar_btn")).click();
        driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"test@gmail.com"});
        driver.findElement(By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input")).sendKeys(new CharSequence[]{"Password@123"});
        driver.findElement(By.cssSelector("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']")).click();
    }


}

