package pages.SignUpPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignUpPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpPage.class);
    public static SignUpPage instance;

    private SignUpPage() {
    }

    public static SignUpPage getInstance() {
        if (instance == null) {
            instance = new SignUpPage();
        }
        return instance;
    }