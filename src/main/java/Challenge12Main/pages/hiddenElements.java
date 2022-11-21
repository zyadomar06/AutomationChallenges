package Challenge12Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hiddenElements extends pageBase {
    public hiddenElements(WebDriver driver) {
        super(driver);
    }

    By hide = By.id("hide-textbox");
    By show = By.id("show-textbox");


    By assertion = By.id("displayed-text");
    WebElement assertion1;

    WebElement element;

    JavascriptExecutor jse;

    String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";

    By assertion2 = By.id("nav-flyout-ya-signin");

    WebElement element2;
    public void hiddenElement () {
        clickOn(hide, "click");
    }

    public WebElement getAssertion1 ()
    {
        assertion1 = findElement(assertion);
        return assertion1;
    }


    public void hiddenElementsAmazon ()
    {
        jse = (JavascriptExecutor) driver;
        element = findElement(By.id("nav-link-accountList-nav-line-1"));
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        ((JavascriptExecutor) driver).executeScript(mouseOverScript,element);
    }

    public WebElement getAssertion2 ()
    {
        element2 = findElement(assertion2);
        return element2;
    }
}
