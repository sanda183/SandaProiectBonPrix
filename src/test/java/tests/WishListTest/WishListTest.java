package tests.WishListTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LogInPage.LogInPage;
import tests.BaseTest;
import static org.testng.Assert.assertTrue;
import static pages.BasePage.getBaseUrl;


public class WishListTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(WishListTest.class);
    private static final pages.LogInPage.LogInPage logInPage = new LogInPage();
    private String newUrl = getBaseUrl() + "Wishlist.html";
    private By WishlistSection = By.xpath("//a[@href='/wishlist/']");

    public WishListTest(pages.LogInPage.LogInPage logInPage) {
        super(logInPage);
    }


    @Test
    public void WishList() {
        LOG.info("Verify if Wish list Section displayed");
        assertTrue(wishListPage.isIsWishlistSectionDisplayedDisplayed(), "Wishlist Section is not Displayed");
    }



}






