package pages.Tabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import java.util.concurrent.TimeUnit;

public class TabsPage extends BasePage {
        public static final Logger LOG = LoggerFactory.getLogger(TabsPage.class);
        public static pages.Tabs.TabsPage instance;

        public static pages.Tabs.TabsPage getInstance() {

                if (instance == null) {
                    instance = new pages.Tabs.TabsPage();
                }
                return instance; }

//Verify  "Haine femei Haine barbati Casa" is displayed

        private final By HaineFemeiCategory = By.xpath("//a[@class='menu__category']//span[contains(text(),'Femei')]");//locatorbun
        private final By HaineBarbatiCategory= By.xpath("//a[@class='menu__category']//span[contains(text(),'Bărbaţi')]");//locatorbun
        private final By CasaCategory = By.xpath("//a[@class='menu__category']//span[contains(text(),'Casă')]");//locatorbun


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bonprix.ro/");
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);


    }
    //Category displayed
        public boolean isFemeiCategoryDisplayed() {
            LOG.info("Verify if HaineFemeiCategory is Displayed");
            return driver.findElement(HaineFemeiCategory).isDisplayed();
        }

        public boolean isBarbatiCategoryDisplayed() {
            LOG.info("Verify if HaineBarbatiCategory is Displayed");
            return driver.findElement(HaineBarbatiCategory).isDisplayed();
        }
        public boolean isCasaCategoryDisplayed() {
            LOG.info("Verify if CasaCategory is Displayed");
            return driver.findElement(CasaCategory).isDisplayed();
        }


//




    }


