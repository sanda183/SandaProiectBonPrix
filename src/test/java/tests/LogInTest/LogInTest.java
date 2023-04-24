package tests.LogInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class LogInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private String newUrl = getBaseUrl() + "/my-account/login/.html";


    String email = "Marincassanda@yahoo.com";
    String password = "18031990";

    @Test
    public void login() {
       LOG.info("Click Cookies Button");
      logInPage.clickcookiesButton();

        LOG.info("Click Contul Meu Icon");
        logInPage.clickContulMeuIcon();

        LOG.info("Type In Email");
        logInPage.typeInInputEmailField(email);

        LOG.info("Click Mai Departe Button1");
        logInPage.clickMaiDeparteButton();

        LOG.info("Type In Password");
        logInPage.typeInInputPasswordField(password);

        LOG.info("Click Mai Departe Button Final");
        logInPage.clickMaiDeparteButtonLogFinal();

        LOG.info("Click Exit NewsLetter PopUp Button");
        logInPage.clickExitNewsLetterPopUpButton();

    }
}

