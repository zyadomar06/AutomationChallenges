package Challenge18Tests.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class parallelTestBase {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

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
                    driver.set(new ChromeDriver());break;

                case "headlessChrome" :
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driver.set(new ChromeDriver());break;


                default: System.out.println("please enter only from : { chrome , headlessChrome }");
            }
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());

        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().navigate().to(URL);
    }

    @AfterMethod
    public void teardownDriver() {
        getDriver().quit();
    }


    public  WebDriver getDriver()
    {
        return driver.get();
    }

}
