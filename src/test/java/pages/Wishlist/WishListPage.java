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
    public static boolean isWishlistSectionDisplayed;


    private By ProductInWishList = By.xpath("//a[@class='wishlist-item__name']");//produse din wishlist

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
            driver.findElement(By.id("JOISH987_acceptAllBar_btn")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(new CharSequence[]{"Geantă de pai" + Keys.ENTER});
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]/span[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div[3]/div[12]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[8]/div/div/div/div[1]/div/div/div[2]/a[2]/em")).click();
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/div[2]/form/button")).click();
        }

    }


}







