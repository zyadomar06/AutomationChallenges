package Challenge1Tests.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Challenge1Main.pages.loginPage;
import Challenge1Tests.tests.utilities.cookiesHandler;

import java.time.Duration;

public class loginWithCookiesTest extends testBase{

   loginPage loginPage;
   cookiesHandler cookiesHandler;


    @Test(priority = 1)
    public void loginTest ()
    {
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
