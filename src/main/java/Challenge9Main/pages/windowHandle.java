package Challenge9Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowHandle extends pageBase {
    public windowHandle(WebDriver driver) {
        super(driver);
    }


    By windowHandle = By.xpath("//*[@class='twitter']");


    By assertion = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[1]/h1/a/div");
    WebElement element;

    By windowHandle1 = By.xpath("//*[@id=\"__next\"]/section[4]/div/div/div[2]/div[1]/a[1]");

    WebElement element1;

    public void windowHandlers ()
    {
        clickOn(windowHandle, "click");
        handleWindow("child");
    }

    public WebElement getElement ()
    {
        element = findElement(assertion);
        return element;
    }

    public void parentHandle ()
    {
        handleWindow("parent");
    }


    public void windowHandle1 ()
    {
        System.out.println("title1 =  " +driver.getTitle());
        clickOn(windowHandle1, "click");
        handleWindow("child");
        System.out.println("title2 =  " +driver.getTitle());
    }

}
