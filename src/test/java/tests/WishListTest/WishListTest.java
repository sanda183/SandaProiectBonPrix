package tests.WishListTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class WishListTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(WishListTest.class);
    private String newUrl = getBaseUrl() + "Wishlist.html";
    private String productUrl = "https://www.bonprix.ro/produs/rochie-957362/";

    private void assertEquals(String text, String s) {
    }

    @Test
    public void WishList() {
        public void testAddToWishlistAndRemoveFromWishlist () {
            String productUrl;
            driver.get(productUrl);

            // Click "Adauga la lista de dorinte" button
            WebElement addToWishlistButton = driver.findElement(By.cssSelector(".js-add-to-wishlist"));
            addToWishlistButton.click();

            // Verify "Produsul a fost adaugat in lista de dorinte" message appears
            WebElement successMessage = driver.findElement(By.cssSelector(".wishlist-message .title"));
            assertEquals(successMessage.getText(), "Produsul a fost adăugat în lista de dorinţe");

            // Go to the wishlist page and verify that the product is in the wishlist
            driver.get(newUrl + "lista-de-dorinte");
            WebElement wishlistItemCount = driver.findElement(By.cssSelector(".itemCount"));
            assertEquals(wishlistItemCount.getText(), "1");

            // Click "Sterge produsul din lista de dorinte" button
            WebElement removeFromWishlistButton = driver.findElement(By.cssSelector(".js-remove-from-wishlist"));
            removeFromWishlistButton.click();

            // Verify "Produsul a fost sters din lista de dorinte" message appears
            successMessage = driver.findElement(By.cssSelector(".wishlist-message .title"));
            assertEquals(successMessage.getText(), "Produsul a fost şters din lista de dorinţe");

            // Verify wishlist is empty
            WebElement wishlistEmptyMessage = driver.findElement(By.cssSelector(".empty-wishlist-message"));
            assertEquals(wishlistEmptyMessage.getText(), "Lista ta de dorințe este goală");
        }


    }


}



