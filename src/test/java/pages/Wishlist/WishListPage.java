package pages.Wishlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishListPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishListPage.class);
    public static pages.Wishlist.WishListPage instance;

    private WishListPage() {
    }

    public static pages.Wishlist.WishListPage getInstance() {
        if (instance == null) {
            instance = new pages.Wishlist.WishListPage();
        }
        return instance;


    }

    public class BonprixWishlistTest {

        private String baseUrl = "https://www.bonprix.ro/";
        private String productUrl = "https://www.bonprix.ro/produs/rochie-957362/";


    }
}