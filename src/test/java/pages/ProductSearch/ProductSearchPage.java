package pages.ProductSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ProductSearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.ProductSearch.ProductSearchPage.class);
    public static pages.ProductSearch.ProductSearchPage instance;

    public static ProductSearchPage getInstance() {
        if (instance == null) {
            instance = new ProductSearchPage();
        }
        return instance;
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
            driver.findElement(By.xpath("//div[@class='header__search']//div//input[@name='searchText']")).sendKeys(new CharSequence[]{"Rochie" + Keys.ENTER});
            Thread.sleep(10000L);
            driver.quit();
        }


        public static String[] getArgs() {
            return args;
        }

        public static void setArgs(String[] args) {
            ProductSearchTest.args = args;
        }
    }
}

