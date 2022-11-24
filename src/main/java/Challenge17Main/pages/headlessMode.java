package Challenge17Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headlessMode extends pageBase {
    public headlessMode(WebDriver driver) {
        super(driver);
    }

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginBtn = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public void login (String users , String passwords)
    {
        setTextElement(userName, users);
        setTextElement(passWord, passwords);
        clickOn(loginBtn, "click");
    }
}
