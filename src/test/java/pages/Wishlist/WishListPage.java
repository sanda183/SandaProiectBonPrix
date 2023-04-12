package pages.Wishlist;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

    public class WishListPage extends BasePage {
        public static final Logger LOG = LoggerFactory.getLogger(WishListPage.class);
        public static pages.Wishlist.WishListPage instance;


        private WishListPage() {
        }

        public static pages.Wishlist.WishListPage getInstance() {
            if (instance == null) {
                instance = new pages.Wishlist.WishListPage();
            }
            final WishListPage instance = WishListPage.instance;
            return instance;
        }

        public boolean isIsWishlistSectionDisplayedDisplayed() {
            return true;
        }

        public class SelectProduct {

            public void main(String[] args) {
                System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.bonprix.ro/");
                WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

            }

            private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
            private By InputEmailField = By.xpath("//input[@type='email']");
            private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
            private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
            private By MaiDeparteButtonFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
            private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
            private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
            private By WishListIcon = By.xpath("//a[@href='/wishlist/']");
            private By ProductInWishList = By.xpath("//a[@class='wishlist-item__name']");//produse din wishlist

            String email = "Marincassanda@yahoo.com";
            String password = "18031990";

            //Log In My Account

            public void clickContulMeu() {
                LOG.info("Click the Contul meu Icon");
                driver.findElement(ContulMeuIcon).click();
            }

            public void typeInEmailField(String email) {
                LOG.info("Type in Email Adress");
                driver.findElement(InputEmailField).sendKeys(String email);
            }

            public void clickMaiDeparteButton() {
                LOG.info("Click Mai Departe Button");
                driver.findElement(MaiDeparteButton).click();
            }

            public void typeInPasswordField() {
                LOG.info("Type in Password Field");
                driver.findElement(InputPasswordField).sendKeys(String password);
            }

            public void clickMaiDeparteButtonFinal() {
                LOG.info("Click Mai Departe Button Final");
                driver.findElement(MaiDeparteButtonFinal).click();
            }


            //Check wishlist
            public boolean Wishlist() {
                LOG.info("Verify is Product In WishList Displayed");
                driver.findElement(ProductInWishlist).isDisplayed();

           public void clickWishlistIcon(){
           LOG.info("Click wihlist icon");
           driver.findElement(WishListIcon).click();
           }
        }


