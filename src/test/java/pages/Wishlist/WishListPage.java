package pages.Wishlist;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

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

    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.xpath("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By WishListIcon = By.xpath("//a[@href='/wishlist/']");
    private By ProductInWishList = By.xpath("//a[@class='wishlist-item__name']");//produse din wishlist
    private By Wishlistsection = By.xpath("//a[@class='wishlist-item__name']");

    //Log In My Account

    public void clickContulMeuIcon() {
        LOG.info("Click the Contul meu Icon");
        driver.findElement(ContulMeuIcon).click();
    }

    public void typeInEmailField(String email) {
        LOG.info("Type in Email Adress");
        driver.findElement(InputEmailField).sendKeys(email);
    }

    public void clickMaiDeparteButton() {
        LOG.info("Click Mai Departe Button");
        driver.findElement(MaiDeparteButton).click();
    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in Password Field");
        driver.findElement(InputPasswordField).sendKeys(password);
    }

    public void clickMaiDeparteButtonFinal() {
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonFinal).click();
    }

    public void clickSearchBar() {
        LOG.info("Click Search Bar");
        driver.findElement(searchBar);
    }
    //Check wishlist

    public boolean isWishlistSectionDisplayedDisplayed(){
        LOG.info("Is wishlist section Displayed");
        return driver.findElement(Wishlistsection).isDisplayed();
    }
    public void clickWishlistIcon() {
        LOG.info("Click wihlist icon");
        driver.findElement(WishListIcon).click();
    }

    public void clickWishlistsection() {
        LOG.info("Click wishlist section");
        driver.findElement(Wishlistsection);
    }


}



