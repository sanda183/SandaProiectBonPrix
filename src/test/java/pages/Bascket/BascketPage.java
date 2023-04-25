package pages.Bascket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BascketPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BascketPage.class);
    public static BascketPage instance;


    private WebDriver driver;


    public BascketPage() {
    }

    public static BascketPage getInstance() {
        if (instance == null) {
            instance = new BascketPage();
        }
        return instance;


    }

    private By cookiesButton = By.xpath("//a[@id='JOISH987_acceptAllBar_btn']");
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By SearchResult = By.xpath("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button");//search result page
    private By ItemGeantaPai = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]");//geantapai
    private By AdaugaInCosButton = By.xpath("//*[@id=\"add-to-cart\"]/span[2]");//adauga in cos buton
    private By ExitButton = By.xpath("//*[@id=\"__layout\"]/div/main/div/div[3]/div[12]/div/div[1]");//click exit
    private By CartIcon = By.xpath("//*[@id=\"__layout\"]/div/div[8]/div/div/div/div[1]/div/div/div[2]/a[2]/em");//carticon
    private By TreciLaComandaButton = By.xpath("//*[@id=\"app\"]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/div[2]/form/button");//buton treci la  comanda




//Search item and add to cart




    public void typeInProductYouAreSearching() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Search a Product");
        //driver.findElement(searchProduct).sendKeys("Geanta Pai" + Keys.ENTER);


    }
    //Cart item

    public boolean IsSearchResultDisplayed() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Verify if SearchResult is Displayed");
       return driver.findElement(SearchResult).isDisplayed();
    }
    public void clickItemGeantaPai() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click Geanta Pai");
        //driver.findElement(ItemGeantaPai).click();
    }

    public void clickAdaugaInCosButton() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click Adauga in Cos Button");
        //driver.findElement(AdaugaInCosButton).click();
    }

    public void clickExitButton(){
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click exit Button");
        //driver.findElement(ExitButton).click();
    }

    public void clickCartIcon() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click cart icon");
        //driver.findElement(CartIcon).click();
    }

    public void clickTreciLaComandaButton() {
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        LOG.info("Click Treci la Comanda Button");
        //driver.findElement(TreciLaComandaButton).click();
    }












}