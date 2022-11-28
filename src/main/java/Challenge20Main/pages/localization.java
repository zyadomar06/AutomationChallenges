package Challenge20Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class localization extends pageBase {
    public localization(WebDriver driver) {
        super(driver);
    }

    By helloList = By.id("nav-link-accountList");
    By helloSignIn = By.id("nav-link-accountList-nav-line-1");

    public String titleName ()
    {
        String title =  driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String targetLocator ()
    {
        clickOn(helloList , "hover");
        String target = findElement(helloSignIn).getText();
        System.out.println(target);
        return target;
    }
}
