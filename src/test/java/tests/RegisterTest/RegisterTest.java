package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;


public class RegisterTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "/my-account/login/?step=register";


    String email1 = "Sandutza183@icloud.com";
    String password = "18031990";
    String prenume = "Sanda";
    String nume = "Marincas";




    @Test
    public void register() {
        LOG.info ("Click Cookies");
       registerPage.clickcookiesButton();

        LOG.info("Click Contul Meu Icon");
        registerPage.clickContulMeuIcon();

        LOG.info("Type In Email");
        registerPage.typeInEmailField1(email1);

        LOG.info("Click Mai Departe Button1");
        registerPage.clickMaiDeparteButton1();

        LOG.info("Type In EmailField2");
        registerPage.typeInEmailField2(email1);

        LOG.info("Type In Prenume");
        registerPage.typeInPrenumeField(prenume);

        LOG.info("Type In Nume");
        registerPage.typeInNumeField(nume);

        LOG.info("Type in PasswordField1");
        registerPage.typeInPasswordField1(password);

        LOG.info("Type in PasswordField2");
        registerPage.typeInPasswordField2(password);

        LOG.info("Click the Newsletter Checkbox");
        registerPage.clickNewsletterCheckBox();

        LOG.info("Click the Politica Confidentialitate CheckBox");
        registerPage.clickPoliticaConfidentialitateCheckBox();

        LOG.info("Click Mai Departe Button Final");
        registerPage.clickMaiDeparteButtonFinal();


















    }
}