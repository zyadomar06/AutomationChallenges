package PageBase;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class pageBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions actions;
    protected static Alert alert;

    public pageBase(WebDriver driver) {
        this.driver = driver;
    }

    // Wait Explicit for Element
    protected static void waitVisibility(By elementBy) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    // Click on Element
    protected static void clickOn(By btn, String chooseAction) {
        waitVisibility(btn);
        WebElement element = driver.findElement(btn);

        switch (chooseAction) {
            case "click":
                element.click();
                break;
            case "hover":
                takeAction().moveToElement(element).build().perform();
                break;
            default:
                System.out.println("Choose only from : {click , hover} ");
                break;
        }
    }

    // Write Text
    protected static void setTextElement(By textElement, String value) {
        waitVisibility(textElement);
        driver.findElement(textElement).sendKeys(value);
    }

    // Read Text
    protected String readText(By text) {
        waitVisibility(text);
        return driver.findElement(text).getText();
    }

    //Switch to Frame By ID or Name
    protected void switchToFrameByIDorName(String name) {
        driver.switchTo().frame(name);
    }

    //Switch To Default Frame
    protected void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
    }

    //Switch to Frame By Index
    protected void switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
    }

    protected void switchToFrameByWebElement(WebElement webElement) {
        driver.switchTo().frame(webElement);
    }

    // Find Element on Web Page
    protected static WebElement findElement(By elementBy) {
        WebElement element = driver.findElement(elementBy);
        return element;
    }

    // Actions for User Interactions
    protected static Actions takeAction() {
        actions = new Actions(driver);
        return actions;
    }

    // Switch To Alert
    protected static Alert switchToAlert() {
        alert = driver.switchTo().alert();
        return alert;
    }

    // Upload File
    protected void uploadFile(By elementBy, String filePath) {
        driver.findElement(elementBy).sendKeys(filePath);
    }

    // Window Handler
    protected void handleWindow(String window) {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();

        System.out.println("All open windows : \n" + windowHandles);
        switch (window) {
            case "parent":
                driver.switchTo().window(parentWindow);
                System.out.println("Parent window : " + parentWindow);
                break;
            case "child":
                driver.switchTo().window(childWindow);
                System.out.println("Child windows : " + childWindow);
                break;
            default:
                System.out.println("Please select Only from : { parent , child } ");
                break;
        }
    }

    // Generic JavaScript Executor
    protected void jsExecutor(String script, By element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element1 = findElement(element);
        js.executeScript(script, element1);
    }

    // Generic JavaScript Executor
    protected JavascriptExecutor jsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    // Select/Deselect By Index from List
    protected static void actionToListByIndex(By elementBy, int index, String action) {
        waitVisibility(elementBy);
        WebElement dropDown = driver.findElement(elementBy);
        Select obj = new Select(dropDown);

        switch (action) {
            case "select":
                obj.selectByIndex(index);
                break;
            case "deselect":
                obj.deselectByIndex(index);
                break;
            default:
                System.out.println("please enter only one from the Options : {select , deselect}");
                break;
        }
    }

    // Select/Deselect By Value from List
    protected static void actionToListByValue(By elementBy, String value, String action) {
        waitVisibility(elementBy);
        WebElement dropDown = driver.findElement(elementBy);
        Select obj = new Select(dropDown);

        switch (action) {
            case "select":
                obj.selectByValue(value);
                break;
            case "deselect":
                obj.deselectByValue(value);
                break;
            default:
                System.out.println("please enter only one from the Options : {select , deselect}");
                break;
        }
    }


    // Select/Deselect By Visible Text from List
    protected static void actionToListByVisibleText(By elementBy, String visibleText, String action) {
        waitVisibility(elementBy);
        WebElement dropDown = driver.findElement(elementBy);
        Select obj = new Select(dropDown);

        switch (action) {
            case "select":
                obj.selectByVisibleText(visibleText);
                break;
            case "deselect":
                obj.deselectByVisibleText(visibleText);
                break;
            default:
                System.out.println("please enter only one from the Options : {select , deselect}");
                break;
        }
    }

    // Get Broken Links
    public void getBrokenLinks()
    {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i=0; i<links.size(); i++)
        {
            String url = links.get(i).getAttribute("href");

            if ((url == null) || (url.isEmpty()))
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            try
            {
                URL link = new URL(url);
                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                httpConn.setRequestMethod("GET");
                httpConn.connect();
                if (httpConn.getResponseCode() >= 400)
                {
                    System.out.println(url + " is a broken link" + " " + httpConn.getResponseCode() + " " + httpConn.getResponseMessage());
                }
                else
                {
                    System.out.println(url + " is a valid link" + " " + httpConn.getResponseCode() + " " + httpConn.getResponseMessage());
                }
            }
            catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

