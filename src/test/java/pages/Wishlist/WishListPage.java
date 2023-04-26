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
        return instance;

    }


    private By cookiesButton = By.xpath("//a[@id='JOISH987_acceptAllBar_btn']");
    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.id("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonLogFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By ExitNewsLetterPopUpButton = By.cssSelector("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By WishListIcon = By.xpath("//a[@href='/wishlist/']");
    private By ItemGeantaPai = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]");
    private By AddToWishListHeartIcon = By.id("//*[@id=\"__layout\"]/div/main/div/div[3]/div[1]/div[2]/div[2]/div/div/div[4]/div/button");

    //Log In My Account

    public void clickcookiesButton() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click cookies");
        //driver.findElement(cookiesButton).click();
    }

    public void clickContulMeuIcon() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click the Contul meu Icon");
        //driver.findElement(ContulMeuIcon).click();
    }

    public void typeInInputEmailField(String email) {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Type in Email Adress");
        //driver.findElement(InputEmailField).sendKeys(email);
    }


    public void clickMaiDeparteButton() {
        LOG.info("Click Mai Departe Button");
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         //driver.findElement(MaiDeparteButton).click();
    }

    public void typeInPasswordField(String password) {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Type in Password Field");
        //driver.findElement(InputPasswordField).sendKeys(password);
    }

    public void clickMaiDeparteButtonLogFinal() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click Mai Departe Button Final");
        //driver.findElement(MaiDeparteButtonLogFinal).click();
    }

    public void clickExitNewsLetterPopUpButton() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click Exist NewsLetter PopUp Button");
        //driver.findElement(ExitNewsLetterPopUpButton);
    }

    public void clickSearchBar() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click Search Bar");
        //driver.findElement(searchBar);
    }

    public void typeInSearchProduct() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Type in search Product");
        //driver.findElement(searchProduct).sendKeys(new CharSequence[]{"Geanta pai" + Keys.ENTER});

    }

    public void clickItemGeantaPai() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click Geanta Pai");
        //driver.findElement(ItemGeantaPai).click();
    }

    public void clickAddToWishListHeartIcon() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click Add to Wishlist Heart Icon");
        //driver.findElement(AddToWishListHeartIcon);
    }
    //Check wishlist


    public void clickWishlistIcon() {
        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("Click wihlist icon");
        //driver.findElement(WishListIcon).click();
    }



}



