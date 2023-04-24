package pages.Wishlist;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    private By MaiDeparteButtonLogFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By WishListIcon = By.xpath("//a[@href='/wishlist/']");
    private By Wishlistsection = By.xpath("//a[@class='wishlist-item__name']");
    private By ItemGeantaPai = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]");
    private By AddToWishListHeartIcon = By.id("//*[@id=\"__layout\"]/div/main/div/div[3]/div[1]/div[2]/div[2]/div/div/div[4]/div/button");

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
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for a maximum of 10 seconds
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(MaiDeparteButton));
        clickableElement.click();

        // driver.findElement(MaiDeparteButton).click();
    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in Password Field");
        driver.findElement(InputPasswordField).sendKeys(password);
    }

    public void clickMaiDeparteButtonLogFinal() {
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonLogFinal).click();
    }

    public void clickSearchBar() {
        LOG.info("Click Search Bar");
        driver.findElement(searchBar);
    }

    public void typeInSearchProduct() {
        LOG.info("Type in search Product");
        driver.findElement(searchProduct).sendKeys(new CharSequence[]{"Geanta pai" + Keys.ENTER});

    }

    public void clickItemGeantaPai() {
        LOG.info("Click Geanta Pai");
        driver.findElement(ItemGeantaPai).click();
    }

    public void clickAddToWishListHeartIcon() {
        LOG.info("Click Add to Wishlist Heart Icon");
        driver.findElement(AddToWishListHeartIcon);
    }
    //Check wishlist


    public void clickWishlistIcon() {
        LOG.info("Click wihlist icon");
        driver.findElement(WishListIcon).click();
    }

    public boolean isWishlistSectionDisplayedDisplayed() {
        LOG.info("Is wishlist section Displayed");
        return driver.findElement(Wishlistsection).isDisplayed();
    }


}



