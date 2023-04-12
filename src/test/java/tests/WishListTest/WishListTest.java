package tests.WishListTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LogInPage.LogInPage;
import pages.ProductSearch;
import pages.Wishlist.WishListPage;
import tests.BaseTest;
import static org.testng.Assert.assertTrue;
import static pages.BasePage.getBaseUrl;

public class WishListTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(WishListTest.class);
    private static final pages.LogInPage.LogInPage logInPage = new LogInPage();
    private String newUrl = getBaseUrl() + "Wishlist.html";


    @Test

    public void Login() {
    LOG.info("Click Contul Meu Icon");
    registerPage.clickContulMeuIcon;

    LOG.info("Type In Email");
    registerPage.typeInEmail(email);

    LOG.info("Click Mai Departe Button");
    registerPage.clickMaiDeparteButton;

    LOG.info("Type In Password");
    registerPage.typeInPassword(password);

    LOG.info("Click Mai Departe Button Final");
    registerPage.clickMaiDeparteButtonFinal();

}
    public void WishList() {
        LOG.info("Verify if Wish list Section displayed");
        assertTrue(wishListPage.isIsWishlistSectionDisplayedDisplayed();
        LOG.info("Click the Search Bar");
       registerPage.clickSearchBar();
        LOG.info("Type in Product You Are Searching for");
       registerPage.typeInProduct();
      LOG.info("Click WIshlist Icon");
       registerPage.clickwishlistIcon();



    }








