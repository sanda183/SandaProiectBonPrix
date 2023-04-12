package tests.SignUpTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage.SignUpPage;
import tests.BaseTest;

    public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";



    private String getBaseUrl() {

        return null;
    }

    @Test
    public void isLogoDisplayed() {
     LOG.info("Check Logo");
     Assert.assertTrue(SignUpPage).isLogoDisplayed;

    LOG.info("Check title");
     Assert.assertTrue(SignUpPage).isTitleDisplayed;
}

}