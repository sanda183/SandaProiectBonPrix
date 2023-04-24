package tests.ProductSearchTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class ProductSearchTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ProductSearchTest.class);
    private final String newUrl = getBaseUrl() + "/search/";



    @Test

    public void productsearch(){

      LOG.info("Type in Product You Are Searching for");
       productSearchPage.typeInProductYouAreSearching();

    }
}