import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.LogInPage.class);
    public static pages.LogInPage instance;

    private LogInPage() {
    }

    public static pages.LogInPage.getInstance()

    {
        if (instance == null) {
            instance = new pages.LogInPage.();
        }
        return instance;
    }


}
