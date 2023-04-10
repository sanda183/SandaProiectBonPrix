package pages.SignUpPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignUpPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpPage.class);
    public static SignUpPage instance;

    public SignUpPage() {
    }

    public static SignUpPage getInstance() {
        if (instance == null) {
            instance = new SignUpPage();
        }
        return instance;
    }
//HomePage
private final By logo = By.id("logo Bonprix");//locator bun










    public boolean isLogoDisplayed() {
        LOG.info("Verify if LogoisDisplayed");
        return driver.findElement(logo).isDisplayed();
    }



}


