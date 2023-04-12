package tests.LogInTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LogInPage.LogInPage;

import java.util.concurrent.TimeUnit;

import static pages.BasePage.getBaseUrl;

public class LogInTest {
    private static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private String newUrl = getBaseUrl() + "LogIn.html";


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

    String email = "Marincassanda@yahoo.com";
    String password = "18031990";
  @Test
public void login() {
  LOG.info("Click Contul Meu Icon");
  loginPage.clickContulMeuIcon;

 LOG.info("Type In Email");
 loginPage.typeInEmail(email);

 LOG.info("Click Mai Departe Button1");
    loginPage.clickMaiDeparteButton1;

  LOG.info("Type In Password")
  loginPage.typeInPassword(password);

   LOG.info("Click Mai Departe Button Final");
    loginPage.clickMaiDeparteButtonFinal;


}

