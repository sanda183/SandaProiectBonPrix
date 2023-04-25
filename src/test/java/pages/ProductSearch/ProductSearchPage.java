package pages.ProductSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class ProductSearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.ProductSearch.ProductSearchPage.class);
    public static pages.ProductSearch.ProductSearchPage instance;

    public static ProductSearchPage getInstance() {
        if (instance == null) {
            instance = new ProductSearchPage();
        }
        return instance;
    }


    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch


    public void typeInProductYouAreSearching() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Search a Product");
        driver.findElement(searchProduct).sendKeys(new CharSequence[]{"Rochie" + Keys.ENTER});


    }


}

