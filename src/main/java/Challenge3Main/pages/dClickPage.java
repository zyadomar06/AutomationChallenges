package Challenge3Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dClickPage extends pageBase {

    public dClickPage(WebDriver driver) {
        super(driver);
    }

    By box = By.cssSelector("body > div");
    String cssValue = "background-color";


    By value = By.xpath("//*[@id=\"authentication\"]/button");


    public void switchFrame ()
    {
        switchToFrameByIndex(0);
    }

    public String cssValue ()
    {
        return cssValue;
    }

    public WebElement targetLocator ()
    {
        WebElement element = findElement(box);
        return element;
    }

    public Actions actionsTaken ()
    {
       Actions action = takeAction();
       return action;
    }

    public WebElement target ()
    {
        WebElement element = findElement(value);
        return element;
    }

    public Actions actionsTaken1 ()
    {
        Actions action = takeAction();
        return action;
    }

    public Alert alert ()
    {
        Alert alert = switchToAlert();
        return alert;
    }
}
