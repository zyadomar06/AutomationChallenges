package Master2Main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flakiness extends flakinessPageBase {
    public flakiness(WebDriver driver) {
        super(driver);
    }

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginBtn = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    By Admin = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    WebElement element;
    WebElement element1;


    public void login (String users , String passwords) {
        setTextElement(userName, users);
        setTextElement(passWord, passwords);
       // clickOn(loginBtn, "click");
    }

    public void login1 (String users , String passwords) {
        setTextElement(userName, users);
        setTextElement(passWord, passwords);
        clickOn(loginBtn, "click");
    }

    public WebElement assertion ()
    {
        element = findElement(Admin);
        return element;
    }

    public WebElement assertion1 ()
    {
        element1 = findElement(loginBtn);
        return element1;
    }
}
