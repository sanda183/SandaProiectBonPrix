package tests.WishListTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class WishListTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(WishListTest.class);
    private String newUrl = getBaseUrl() + "/wishlist/";
    String email = "Marincassanda@yahoo.com";
    String password = "18031990";


    @Test

    public void Wishlist() {
        driver.get(newUrl);

        LOG.info("Click Cookies");
        wishListPage.clickcookiesButton();


        LOG.info("Click Contul Meu Icon");
        wishListPage.clickContulMeuIcon();

        LOG.info("Type In Email");
        wishListPage.typeInInputEmailField(email);

        LOG.info("Click Mai Departe Button");
        wishListPage.clickMaiDeparteButton();

        LOG.info("Type In Password");
        wishListPage.typeInPasswordField(password);

        LOG.info("Click Mai Departe Button Final");
        wishListPage.clickMaiDeparteButtonLogFinal();

        LOG.info("Click Exit NewsLetter PopUp Button");
        wishListPage.clickExitNewsLetterPopUpButton();

        LOG.info("Click the Search Bar");
        wishListPage.clickSearchBar();

        LOG.info("Type in Geanta Pai");
        wishListPage.typeInSearchProduct();

        LOG.info("clickItemGeantaPai");
        wishListPage.clickItemGeantaPai();

        LOG.info("clickAddToWishListHeartIcon");
        wishListPage.clickAddToWishListHeartIcon();

        LOG.info("Click Wishlist Icon");
        wishListPage.clickWishlistIcon();


    }
}








