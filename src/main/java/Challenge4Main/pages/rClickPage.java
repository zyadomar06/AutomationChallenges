package Challenge4Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class rClickPage extends pageBase {

    public rClickPage(WebDriver driver) {
        super(driver);
    }

    By value = By.xpath("//*[@id=\"authentication\"]/span");

    By menu = By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']");

    public WebElement targetLocator ()
    {
        WebElement element = findElement(value);
        return element;
    }

    public WebElement targetLocator1 ()
    {
        WebElement element = findElement(menu);
        return element;
    }

    public Actions actionsTaken ()
    {
        Actions action = takeAction();
        return action;
    }
}
