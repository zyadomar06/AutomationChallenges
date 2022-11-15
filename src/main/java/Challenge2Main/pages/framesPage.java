package Challenge2Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class framesPage extends pageBase {

    public framesPage(WebDriver driver) {
        super(driver);
    }

    String frameID = "courses-iframe";
    By courseHref = By.xpath("//*[@id=\"course-list\"]/div[1]/div/a");

    By courseChosen = By.xpath("//h1[@class='dynamic-heading text-blue custom-heading']");

    public void switchFrame ()
    {
        switchToFrameByIDorName(frameID);
    }

    public void chooseCourse ()
    {
        clickOn(courseHref);
    }

    public String getCourseChosen ()
    {
        return readText(courseChosen);
    }
}
