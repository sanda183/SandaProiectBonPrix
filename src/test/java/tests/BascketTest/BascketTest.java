package tests.BascketTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Bascket.BascketPage;


import javax.naming.directory.SearchResult;
import java.util.concurrent.TimeUnit;

import static pages.BasePage.getBaseUrl;

public class BascketTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.LogInTest.LogInTest.class);
    private String newUrl = getBaseUrl() + "Cart.html";


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
        register.Page.clickContulMeuIcon;

        LOG.info("Type In Email");
        registerPage.typeInEmail(email);

        LOG.info("Click Mai Departe Button");
        registerPage.clickMaiDeparteButton;

        LOG.info("Type In Password");
        registerPage.typeInPassword(password);

        LOG.info("Click Mai Departe Button Final");
        registerPage.clickMaiDeparteButtonFinal();

        LOG.info("Click the Search Bar");
        registerPage.clickSearchBar;

        LOG.info("Type in Product Name");
        registerPage.typeinproductname:"Geanta Pai";

    }
  @Test
  public void cart(){

      LOG.info("Check Search Result");
      Assert.assertTrue(BascketPage.getInstance().IsSearchResultDisplayed());

      LOG.info("Click adauga in cos button");
      bascketPage.clickAdaugaInCosButton;

      LOG.info("Click Exit Button");
      bascketPage.clickExitButton;

      LOG.info("Click Cart Icon");
      bascketPage.clickCartIcon;

      LOG.info("Click Treci La Comanda Button");
      bascketPage.clickTreciLaComandaButton;







    }
















}








