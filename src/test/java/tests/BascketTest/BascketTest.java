package tests.BascketTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Bascket.BascketPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class BascketTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(BascketTest.class);
    private String newUrl = getBaseUrl() + "/Cart/";


    @Test
    public void cart() {
        driver.get(newUrl);
        LOG.info ("Click Cookies");
        registerPage.clickcookiesButton();

        LOG.info("Type Search Product");
        registerPage.typeInProductYouAreSearching();

        LOG.info("Check Search Result");
        Assert.assertTrue(BascketPage.getInstance().IsSearchResultDisplayed());

        LOG.info("clickItemGeantaPai");
        bascketPage.clickItemGeantaPai();

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








