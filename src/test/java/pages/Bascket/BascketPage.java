package pages.Bascket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

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

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver111.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bonprix.ro/");
    }

    private By ContulMeuIcon = By.xpath("//a[@aria-label='Contul meu']");
    private By InputEmailField = By.xpath("//input[@type='email']");
    private By MaiDeparteButton = By.xpath("//form[@class='login-form-email']//span[@class='btn__slots'][normalize-space()='Mai departe']");
    private By InputPasswordField = By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div/form/div[2]/div/div/div/input");
    private By MaiDeparteButtonFinal = By.xpath("div[class='login-logger__inner'] div form[class='login-form-register'] span[class='btn__slots']");
    private By searchBar = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//searchbar
    private By searchProduct = By.xpath("//div[@class='header__search']//div//input[@name='searchText']");//insertprodctsearch
    private By SearchResult = By.xpath("//*[@id=\"__layout\"]/div/div[11]/div/div/div[2]/div/div[1]/button");//search result page
    private By ItemGeantaPai = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/img[1]");//geantapai
    private By AdaugaInCosButton = By.xpath("//*[@id=\"add-to-cart\"]/span[2]");//adauga in cos buton
    private By ExitButton = By.xpath("//*[@id=\"__layout\"]/div/main/div/div[3]/div[12]/div/div[1]");//click exit
    private By CartIcon = By.xpath("//*[@id=\"__layout\"]/div/div[8]/div/div/div/div[1]/div/div/div[2]/a[2]/em");//carticon
    private By TreciLaComandaButton = By.xpath("//*[@id=\"app\"]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/div[2]/form/button");//buton treci la  comanda
    String email = "Marincassanda@yahoo.com";
    String password = "18031990";

    //Log In My Account

    public void clickContulMeu() {
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
        driver.findElement(InputPasswordField).sendKeys(String password);
    }

    public void clickMaiDeparteButtonFinal() {
        LOG.info("Click Mai Departe Button Final");
        driver.findElement(MaiDeparteButtonFinal).click();
    }

//Search item and add to cart


    public void clicksearchBar() {
        LOG.info("Click the Search Bar");
        driver.findElement(searchBar).click();
    }

    public void typeProductNameSearch() {
        LOG.info("Type product name");
        driver.findElement(searchProduct).sendKeys("Geantă de pai");//produsul rezultat
    }

    //Cart item

    public boolean IsSearchResultDisplayed() {
        LOG.info("Verify if SearchResult is Displayed");
        driver.findElement(SearchResult).isDisplayed();
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