package Challenge10Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newTab extends pageBase {
    public newTab(WebDriver driver) {
        super(driver);
    }

    By newTabs = By.id("opentab");
    By newWindows = By.id("openwindow");


    public void newTabClick ()
    {
        clickOn(newTabs, "click");
        handleWindow("child");
        System.out.println("Title : " + driver.getTitle());
    }

    public void newWindowClick ()
    {
        clickOn(newWindows, "click");
        handleWindow("child");
        System.out.println("Title : " + driver.getTitle());
    }
}
