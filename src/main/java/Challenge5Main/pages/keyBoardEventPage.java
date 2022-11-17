package Challenge5Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class keyBoardEventPage extends pageBase {

    public keyBoardEventPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginBtn = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    By recruitment = By.linkText("Recruitment");


    public void loginAdmin ()
    {
        setTextElement(userName, "Admin");
        setTextElement(passWord, "admin123");
        clickOn(loginBtn, "click");
    }

    public void clickRecruitment ()
    {
        clickOn(recruitment, "click");
    }

    public void RobotActions () throws AWTException
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public WebElement assertion ()
    {
        WebElement element = driver.findElement(recruitment);
        return element;
    }
}
