package tests.LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class LogInTest {

    {
        ChromeDriver driver;
        String baseUrl;
        driver.get(baseUrl);
        @BeforeClass
        public void setUp () {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
    }

        // Click on "Contul meu" link in header
        WebElement myAccountLink = driver.findElement(By.cssSelector("#headerMyAccountLink a"));
        myAccountLink.click();

        // Fill out login form
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        emailInput.sendKeys("sandamarincas@example.com");
        passwordInput.sendKeys("password");

        // Submit login form
        WebElement submitButton = driver.findElement(By.cssSelector(".submitBtn"));
        submitButton.click();

        // Verify user is logged in
        WebElement loggedInMessage = driver.findElement(By.cssSelector("#headerUserNameLink a"));
        assertEquals(loggedInMessage.getText(), "Sanda Marincas");
    }

    private void assertEquals(String text, String sandamarincas) {
    }

    @AfterClass
    public void tearDown() {
        WebDriver driver;
        driver.quit();
    }


}





