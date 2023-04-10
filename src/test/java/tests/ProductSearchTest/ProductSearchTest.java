package tests.ProductSearchTest;

import pages.LogInPage.LogInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.BaseTest;

public class ProductSearchTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ProductSearchTest.class);
    private LogInPage logInPage;

    public ProductSearchTest(LogInPage logInPage) {
        super(logInPage);
        this.logInPage = logInPage;
    }


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        Object driver = new ChromeDriver();

    }




}