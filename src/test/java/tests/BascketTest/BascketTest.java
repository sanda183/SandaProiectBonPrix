package tests.BascketTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Bascket.BascketPage;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class BascketTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.LogInTest.LogInTest.class);
    private String newUrl = getBaseUrl() + "Cart.html";


    String email = "Marincassanda@yahoo.com";
    String password = "18031990";
    @Test
    public void login() {
        LOG.info("Click Contul Meu Icon");
        bascketPage.clickContulMeuIcon();

        LOG.info("Type In Email");
        bascketPage.typeInEmailField(email);

        LOG.info("Click Mai Departe Button");
        bascketPage.clickMaiDeparteButton();

        LOG.info("Type In Password");
        bascketPage.typeInPasswordField(password);

        LOG.info("Click Mai Departe Button Final");
        bascketPage.clickMaiDeparteButtonFinal();

        LOG.info("Click the Search Bar");
        bascketPage.clicksearchBar();

//        LOG.info("Type in Product Name");
//        bascketPage.typeProductNameSearch.sendKeys(new CharSequence[]{"Geanta pai + Keys.ENTER})

    }
  @Test
  public void cart(){

      LOG.info("Check Search Result");
      Assert.assertTrue(BascketPage.getInstance().IsSearchResultDisplayed());

      LOG.info("Click adauga in cos button");
      bascketPage.clickAdaugaInCosButton();

      LOG.info("Click Exit Button");
      bascketPage.clickExitButton();

      LOG.info("Click Cart Icon");
      bascketPage.clickCartIcon();

      LOG.info("Click Treci La Comanda Button");
      bascketPage.clickTreciLaComandaButton();







    }
















}








