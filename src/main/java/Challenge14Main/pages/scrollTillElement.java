package Challenge14Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollTillElement extends pageBase {
    public scrollTillElement(WebDriver driver) {
        super(driver);
    }

    String frameID = "courses-iframe";
    By Target = By.xpath("//*[@id=\"course-list\"]/div[4]/div/a");
    WebElement element;

    long initialLength;

    public void scroll ()
    {
        switchToFrameByIDorName(frameID);
        jsExecutor("arguments[0].scrollIntoView();",Target);
    }

    public WebElement assertion1 ()
    {
        element = findElement(Target);
        return element;
    }

    public void infiniteScroll ()
    {
        initialLength = (long) jsExecutor().executeScript("return document.body.scrollHeight");
        while(true)
        {
            jsExecutor().executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentLength = (long) jsExecutor().executeScript("return document.body.scrollHeight");
            if(initialLength == currentLength) {
                break;
            }
            initialLength = currentLength;

        }
    }
}
