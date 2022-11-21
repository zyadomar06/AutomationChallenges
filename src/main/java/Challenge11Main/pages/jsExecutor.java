package Challenge11Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jsExecutor extends pageBase {
    public jsExecutor(WebDriver driver) {
        super(driver);
    }

    String title;
    JavascriptExecutor jse;
    WebElement element;


    public String jsExecute ()
    {
        jse = (JavascriptExecutor) driver;
        title = jse.executeScript("return document.title;").toString();
        return title;
    }

    public void jsExecuteAmazon ()
    {
        element = findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
        jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
    }
}
