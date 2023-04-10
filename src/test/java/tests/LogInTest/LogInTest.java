package tests.LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    private static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);


    @BeforeClass


    public static void voidsetUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.bonprix.ro/";
        driver.get(url);
        LOG.info("Open browser maximize");
        Dimension dimension = new Dimension(1366, 768);
        driver.manage().window().setSize(dimension);
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @Test

    public void LogInTest() {
    private WebDriver driver = null;


        // Click on "Contul meu"
        WebElement myAccountLink = driver.findElement(By.xpath("//a[@aria-label='Contul meu']")).click();

        // Fill out login form
        WebElement acceptbar = driver.findElement(By.id("JOISH987_acceptAllBar_btn")).click();
        WebElement emailInput = driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"test@gmail.com"});
        WebElement maideparte = driver.findElement(By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']")).click();
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input")).sendKeys(new CharSequence[]{"Password@123"});
        WebElement submitbtn = driver.findElement(By.cssSelector("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']")).click();


    }


}

