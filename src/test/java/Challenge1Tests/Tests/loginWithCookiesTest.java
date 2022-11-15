package Challenge1Tests.Tests;

import TestBase.testBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Challenge1Main.pages.loginPage;
import Challenge1Tests.utilities.cookiesHandler;

import java.time.Duration;

public class loginWithCookiesTest extends testBase {

   loginPage loginPage;
   cookiesHandler cookiesHandler;


    @Test(priority = 1)
    public void loginTest ()
    {
        final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to(URL);

        loginPage = new loginPage(driver);
        loginPage.loginAdmin();
    }

    @Test(priority = 2)
    public void cookiesLoginTest () throws InterruptedException {

        Thread.sleep(5000);
        cookiesHandler = new cookiesHandler();
        cookiesHandler.cookiesWrite();
        cookiesHandler.cookiesRead();

    }
}
