package Challenge13Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollTillBottom extends pageBase {
    public scrollTillBottom(WebDriver driver) {
        super(driver);
    }

    By assertion = By.xpath("//*[@class='css-1jymquo']");

    JavascriptExecutor jse;

    WebElement element;



    public void scrollTillEnd ()
    {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public WebElement assertion1 ()
    {
        element = findElement(assertion);
        return element;
    }
}
