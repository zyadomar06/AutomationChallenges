package Challenge6Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mouseHoverPage extends pageBase {

    public mouseHoverPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginBtn = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    By recruitment = By.linkText("Recruitment");

    By vacancies = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]");
    By vacAssert = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5");

    By reqAssert = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");

    public void loginAdmin ()
    {
        setTextElement(userName, "Admin");
        setTextElement(passWord, "admin123");
        clickOn(loginBtn, "click");
    }

    public void clickRecruitment ()
    {
        clickOn(recruitment, "hover");
    }

    public void clickVacancies ()
    {
        clickOn(vacancies , "hover");
    }

    public WebElement assertion1 ()
    {
       WebElement element = driver.findElement(vacAssert);
       return element;
    }

    public WebElement assertion2 ()
    {
        WebElement element = driver.findElement(reqAssert);
        return element;
    }

}