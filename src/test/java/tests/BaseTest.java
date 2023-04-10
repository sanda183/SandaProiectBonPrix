package tests;

import pages.LogInPage.LogInPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.Bascket.BascketPage;
import pages.BasePage;
import pages.ProductSearch.ProductSearchPage;
import pages.RegisterPage.RegisterPage;
import pages.SignUpPage.SignUpPage;
import pages.Tabs.TabsPage;
import pages.Wishlist.WishListPage;

public class BaseTest {
    public SignUpPage signUpPage = new SignUpPage();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public LogInPage LogInPage;
    public TabsPage tabsPage = TabsPage.getInstance();
    public ProductSearchPage productSearchPage = ProductSearchPage.getInstance();
    public WishListPage wishListPage = WishListPage.getInstance();
    public BascketPage bascketPage = BascketPage.getInstance();

    public BaseTest(LogInPage logInPage) {
        LogInPage = logInPage;
    }

    @BeforeSuite
    public void init() {
        BasePage.setUp();

    }


    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}




