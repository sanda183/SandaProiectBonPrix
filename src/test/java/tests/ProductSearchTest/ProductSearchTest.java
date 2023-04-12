package tests.ProductSearchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LogInPage.LogInPage;
import pages.ProductSearch.ProductSearchPage;
import tests.BaseTest;
import static pages.BasePage.driver;
public class ProductSearchTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ProductSearchTest.class);
    private String newUrl = getBaseUrl();

    private String getBaseUrl() {
    }


    @Test
    public void ProductSearch () {
        driver.get(newUrl);

        LOG.info("Click the Search Bar");
        ProductSearchPage.clickSearchBar();
        LOG.info("Type in Product You Are Searching for");
        ProductSearchPage.typeProduct();

    }
}