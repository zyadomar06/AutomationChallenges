package Challenge1Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends pageBase
{
    public loginPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy (name = "username")
//    WebElement userName;
//    @FindBy (name = "password")
//    WebElement passWord;
//    @FindBy (xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
//    WebElement loginBtn;

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginBtn = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public void loginAdmin ()
    {
         setTextElement(userName, "Admin");
         setTextElement(passWord, "admin123");
         clickOn(loginBtn);
    }
}
