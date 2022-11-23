package PageBase;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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
    protected static void clickOn (By btn , String chooseAction)
    {
        waitVisibility(btn);
        WebElement element = driver.findElement(btn);

        switch (chooseAction)
        {
            case "click" :  element.click(); break;
            case "hover" : takeAction().moveToElement(element).click().build().perform(); break;
            default: System.out.println("Choose only from : {click , hover} "); break;
        }
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

    protected void switchToFrameByWebElement(WebElement webElement)
    {
        driver.switchTo().frame(webElement);
    }

    // Find Element on Web Page
    protected static WebElement findElement(By elementBy)
    {
        WebElement element = driver.findElement(elementBy);
        return element;
    }

    // Actions for User Interactions
    protected static Actions takeAction ()
    {
        actions = new Actions(driver);
        return actions;
    }

    // Switch To Alert
    protected static Alert switchToAlert()
    {
        alert = driver.switchTo().alert();
        return alert;
    }

    // Upload File
    protected void uploadFile (By elementBy , String filePath)
    {
        driver.findElement(elementBy).sendKeys(filePath);
    }

    // Window Handler
    protected void handleWindow (String window)
    {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();

        System.out.println("All open windows : \n" + windowHandles);
        switch (window)
        {
            case "parent" : driver.switchTo().window(parentWindow); System.out.println("Parent window : " + parentWindow);break;
            case "child" : driver.switchTo().window(childWindow); System.out.println("Child windows : " + childWindow);break;
            default: System.out.println("Please select Only from : { parent , child } ");break;
        }
    }

    // Generic JavaScript Executor
    protected void jsExecutor (String script , By element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element1 = findElement(element);
        js.executeScript(script,element1);
    }

    // Generic JavaScript Executor
    protected JavascriptExecutor jsExecutor ()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

}

