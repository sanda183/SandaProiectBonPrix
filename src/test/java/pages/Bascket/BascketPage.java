package pages.Bascket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BascketPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BascketPage.class);
    public static BascketPage instance;
    public WebElement typesearchProduct;


    private WebDriver driver;


    public BascketPage() {
    }

    public static BascketPage getInstance() {
        if (instance == null) {
            instance = new BascketPage();
        }
        return instance;


    }

    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By SearchResult = By.xpath("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button");//search result page
    private By ItemGeantaPai = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]");//geantapai
    private By AdaugaInCosButton = By.xpath("//*[@id=\"add-to-cart\"]/span[2]");//adauga in cos buton
    private By ExitButton = By.xpath("//*[@id=\"__layout\"]/div/main/div/div[3]/div[12]/div/div[1]");//click exit
    private By CartIcon = By.xpath("//*[@id=\"__layout\"]/div/div[8]/div/div/div/div[1]/div/div/div[2]/a[2]/em");//carticon
    private By TreciLaComandaButton = By.xpath("//*[@id=\"app\"]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/div[2]/form/button");//buton treci la  comanda


    //Log In My Account

//Search item and add to cart


    public void clicksearchBar() {
        LOG.info("Click the Search Bar");
        driver.findElement(searchBar).click();
    }

   public void searchProduct() {
       LOG.info("Type product name");
       driver.findElement(searchProduct).sendKeys("Geantă de pai");//produsul rezultat
   }

    //Cart item

    public boolean IsSearchResultDisplayed() {
        LOG.info("Verify if SearchResult is Displayed");
       return driver.findElement(SearchResult).isDisplayed();
    }
    public void clickItemGeantaPai() {
        LOG.info("Click Geanta Pai");
        driver.findElement(ItemGeantaPai).click();
    }

    public void clickAdaugaInCosButton() {
        LOG.info("Click Adauga in Cos Button");
        driver.findElement(AdaugaInCosButton).click();
    }

    public void clickExitButton(){
        LOG.info("Click exit Button");
        driver.findElement(ExitButton).click();
    }

    public void clickCartIcon() {
        LOG.info("Click cart icon");
        driver.findElement(CartIcon).click();
    }

    public void clickTreciLaComandaButton() {
        LOG.info("Click Treci la Comanda Button");
        driver.findElement(TreciLaComandaButton).click();
    }












}