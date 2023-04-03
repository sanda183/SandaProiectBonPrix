package pages.ProductSearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ProductSearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.ProductSearch.ProductSearchPage);
    public static pages.ProductSearch.ProductSearchPage instance;

    private ProductSearchPage() {
    }

    public static pages.ProductSearch.ProductSearchPage getInstance() {
        if (instance == null) {
            instance = new pages.ProductSearch.ProductSearchPage();
        }
        return instance;
    }
}
