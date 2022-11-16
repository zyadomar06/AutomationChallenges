package PageBase;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class pageBase
{
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions actions;
    protected static Alert alert;

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

    //Switch to Frame By ID or Name
    protected void switchToFrameByIDorName(String name)
    {
        driver.switchTo().frame(name);
    }

    //Switch To Default Frame
    protected void switchToDefaultFrame()
    {
        driver.switchTo().defaultContent();
    }

    //Switch to Frame By Index
    protected void switchToFrameByIndex(int index)
    {
        driver.switchTo().frame(index);
    }

    // Find Element on Web Page
    protected static WebElement findElement(By elementBy)
    {
        WebElement element = driver.findElement(elementBy);
        return element;
    }

    //Actions for User Interactions
    protected static Actions takeAction ()
    {
        actions = new Actions(driver);
        return actions;
    }

    protected static Alert switchToAlert()
    {
        alert = driver.switchTo().alert();
        return alert;
    }

}

