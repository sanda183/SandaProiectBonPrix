package pages.Bascket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

    public class BascketPage<id> extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BascketPage.class);
    public static BascketPage instance;


    private WebDriver driver;
    private String baseUrl = "https://www.bonprix.ro/";
    private String firstProductUrl = "https://www.bonprix.ro/produs/rochie-957362/";
    private String secondProductUrl = "https://www.bonprix.ro/produs/bluza-cu-maneci-lungi-957133/";

        public BascketPage() {
        }

        public static BascketPage getInstance() {
        if (instance == null) {
            instance = new BascketPage();
        }
        return instance;


    }
}