package Challenge7Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragDrop extends pageBase {
    public dragDrop(WebDriver driver) {
        super(driver);
    }

    By dragElement = By.id("draggable");
    By dropElement = By.id("droppable");
   WebElement element1;
   WebElement element2;

   WebElement frame;
   Actions action;

   By framePath = By.className("demo-frame");

    public void dragDropAction ()
    {
        element1 = findElement(dragElement);
        element2 = findElement(dropElement);
        action = takeAction();
        action.dragAndDrop(element1, element2).build().perform();
    }

    public WebElement getElement2 ()
    {
        element2 = findElement(dropElement);
        return element2;
    }

    public void switchs ()
    {
        frame = findElement(framePath);
        switchToFrameByWebElement(frame);
    }
}
