package Challenge1Main.pages;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class pageBase
{
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public pageBase(WebDriver driver)
    {
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    // Wait Explicit for Element
    protected static void waitVisibility(By elementBy)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }


    // Click on Element
    protected static void clickOn (By btn)
    {
        waitVisibility(btn);
        driver.findElement(btn).click();
    }

    // Write Text
    protected static void setTextElement (By textElement, String value)
    {
        waitVisibility(textElement);
        driver.findElement(textElement).sendKeys(value);
    }
}
