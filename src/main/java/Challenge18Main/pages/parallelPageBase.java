package Challenge18Main.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class parallelPageBase {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions actions;

    public parallelPageBase(WebDriver driver)
    {
        this.driver = driver;
    }


    protected static void waitVisibility(By elementBy)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    // Write Text
    protected static void setTextElement (By textElement, String value)
    {
        waitVisibility(textElement);
        driver.findElement(textElement).sendKeys(value);
    }

    protected static WebElement findElement(By elementBy)
    {
        WebElement element = driver.findElement(elementBy);
        return element;
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

    // Actions for User Interactions
    protected static Actions takeAction ()
    {
        actions = new Actions(driver);
        return actions;
    }
}
