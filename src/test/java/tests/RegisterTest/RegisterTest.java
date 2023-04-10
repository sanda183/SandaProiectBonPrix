package tests.RegisterTest;

import pages.LogInPage.LogInPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;


public class RegisterTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    public RegisterTest(LogInPage logInPage) {
        super(logInPage);
    }


    @Test
    public void register() {

    }
}