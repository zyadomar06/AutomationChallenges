package Challenge1Tests.tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.time.Duration;

public class testBase
{
    public static WebDriver driver;
    final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

//    @BeforeMethod
//    public void setupDriver()
//    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.navigate().to(URL);
//    }
//
//    @AfterMethod
//    public void teardownDriver() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.quit();
//    }

}


