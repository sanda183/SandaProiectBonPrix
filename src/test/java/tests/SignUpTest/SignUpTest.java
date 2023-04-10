package tests.SignUpTest;

import pages.LogInPage.LogInPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

    public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";

        public SignUpTest(LogInPage logInPage) {
            super(logInPage);
        }

        //public SignUpTest() {
      //  super(logInPage);
    //}

    private String getBaseUrl() {

        return null;
    }




    @Test
    public void isLogoDisplayed() {

    }


}