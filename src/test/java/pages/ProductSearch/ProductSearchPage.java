package pages.ProductSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import static pages.BasePage.driver;
public class ProductSearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.ProductSearch.ProductSearchPage.class);
    public static pages.ProductSearch.ProductSearchPage instance;

    public static ProductSearchPage getInstance() {
        if (instance == null) {
            instance = new ProductSearchPage();
        }
        return instance;
    }

    public static void typeProduct() {
    }

    public static class ProductSearchTest {

        private WebDriver driver;
        private static String[] args;

        public ProductSearchTest(WebDriver driver) {
            this.driver = driver;
        }

        public static void main(String[] args) throws InterruptedException {
            ProductSearchTest.args = args;
            System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.bonprix.ro/");
            Thread.sleep(10000L);
            driver.quit();
        }

        private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
        private By searchProduct  = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch

    }

    public void clickSearchBar(){
        LOG.info("Click Search Bar");
        driver.findElement(searchBar).click();
    }
    public void typeInProductYouAreSearching(){
        LOG.info("Search a Product");
        driver.findElement(searchProduct).sendKeys(new CharSequence[]{"Rochie" + Keys.ENTER});


    }












}

