package Master3Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondHighestPrice extends pageBase {
    public secondHighestPrice(WebDriver driver) {
        super(driver);
    }

    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginBtn = By.id("login-button");
    By items = By.className("inventory_item");
    By itemPrice = By.className("inventory_item_price");


    public void highestPrice ()
    {
        setTextElement(userName , "standard_user");
        setTextElement(passWord , "secret_sauce");
        clickOn(loginBtn , "click");

        List<WebElement> elements = driver.findElements(items);
        List<Float> n = new ArrayList<>();

        for (int i=0; i<elements.size(); i++)
        {
            String s =  elements.get(i).findElement(itemPrice).getText();
            String newString = s.substring(1 , s.length());
            n.add(Float.parseFloat(newString));
        }
        System.out.println(n);
        Collections.sort(n);
        System.out.println("list after sorting =  " + n);
        System.out.println("second highest price =  " + n.get(n.size()-2));
    }
}
