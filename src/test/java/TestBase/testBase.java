package TestBase;

import com.beust.jcommander.Parameter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.time.Duration;

public class testBase
{

    public static WebDriver driver;


    @BeforeMethod
    @Parameters({"URL" , "browserName"})
    public void setupDriver(@Optional("chrome") String URL , String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("headlessChrome"))
        {
            switch (browserName)
            {
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                     driver = new ChromeDriver();break;

                case "headlessChrome" :
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);break;


                default: System.out.println("please enter only from : { chrome , headlessChrome }");
            }
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(URL);
    }

    @AfterMethod
    public void teardownDriver() {
        driver.quit();
    }


}
//BDD Test Base
//public class testBase extends AbstractTestNGCucumberTests {
//    public static WebDriver driver;
//
//    @BeforeMethod
//    @Parameters("URL")
//    public void setupDriver(String URL) {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.navigate().to(URL);
//    }
//
//    @AfterMethod
//    public void teardownDriver() {
//        driver.quit();
//    }
//}


