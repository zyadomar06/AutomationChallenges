package Challenge8Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadFile extends pageBase {
    public uploadFile(WebDriver driver) {
        super(driver);
    }

    By upload = By.xpath("//input[@id='file-upload']");

    By assertion = By.xpath("//*[@class='errorUploadFile ellips fs-12 lh16 mt10']");

    WebElement element;


    public void fileUpload ()
    {
        uploadFile(upload, "D:\\Wallpapers\\locked.jpg");
    }

    public WebElement getElement ()
    {
        element = findElement(assertion);
        return element;
    }
}
