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

    // Select/Deselect By Index from List
    protected void actionToListByIndex(By elementBy , int index , String action)
    {
        waitVisibility(elementBy);
        WebElement dropDown = driver.findElement(elementBy);
        Select obj = new Select(dropDown);

        switch (action)
        {
            case "select" : obj.selectByIndex(index);break;
            case "deselect" : obj.deselectByIndex(index);break;
            default: System.out.println("please enter only one from the Options : {select , deselect}");break;
        }
    }

}

