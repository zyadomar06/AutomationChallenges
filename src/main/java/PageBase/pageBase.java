package PageBase;

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
    }

    // Wait Explicit for Element
    protected static void waitVisibility(By elementBy)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
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

    // Read Text
    protected String readText (By text) {
        waitVisibility(text);
        return driver.findElement(text).getText();
    }


    //Switch to Frame By Index
    protected void switchToFrameByIndex(int index)
    {
        driver.switchTo().frame(index);
    }

    //Switch to Frame By ID or Name
    protected void switchToFrameByIDorName(String name)
    {
        driver.switchTo().frame(name);
    }

    //Switch to Frame By Web Element
    protected void switchToFrameByWebElement(WebElement webElement)
    {
        driver.switchTo().frame(webElement);
    }

    //Switch To Default Frame
    protected void switchToDefaultFrame()
    {
        driver.switchTo().defaultContent();
    }

    // Switch To Parent Frame
    protected void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }


}
