package tests.TabsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;


public class TabsTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(tests.RegisterTest.RegisterTest.class);
    private final String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void Tabs() {
        LOG.info("Check Femei");
        Assert.assertTrue(tabsPage.isFemeiCategoryDisplayed());
        LOG.info("Check Barbati");
        Assert.assertTrue(tabsPage.isBarbatiCategoryDisplayed());
        LOG.info("Check Casa");
        Assert.assertTrue(tabsPage.isCasaCategoryDisplayed());
    }


}

