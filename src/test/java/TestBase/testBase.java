package TestBase;

import com.beust.jcommander.Parameter;
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
    @BeforeMethod
    @Parameters("URL")
    public void setupDriver(String URL)
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(URL);
    }

    @AfterMethod
    public void teardownDriver()
    {
        driver.quit();
    }

}


