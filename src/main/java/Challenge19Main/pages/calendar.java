package Challenge19Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class calendar extends pageBase {
    public calendar(WebDriver driver) {
        super(driver);
    }
    By date1 = By.id("day");

    By date2 = By.id("datepicker");
    By calender2 = By.tagName("a");
    By month = By.className("ui-datepicker-month");
    By year = By.className("ui-datepicker-year");

    By date3 = By.id("datepicker");
    By year3 = By.className("datepicker-switch");
    By month3 = By.xpath("/html/body/div[2]/div[2]/table");
    By day3 = By.xpath("/html/body/div[2]/div[1]/table");
    By prevButton = By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[1]");
    By nextButton = By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[3]");

    By cccccc = By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[2]");


    public void setCalendar1 ()
    {
        setTextElement(date1 ,"10/26/2023");
    }

    public void setCalendar2 ()
    {
        clickOn(date2 , "click");
        actionToListByVisibleText(month , "Jun" , "select");
        actionToListByVisibleText(year , "2023" , "select");
        List<WebElement> elements = driver.findElements(calender2);
        for (WebElement e : elements)
        {
            if (e.getText().equalsIgnoreCase("5"))
            {
                e.click();
                System.out.println(e.getText());
                break;
            }
        }
    }

    public void setCalendar3 (String dates)
    {
        clickOn(date3 , "click");
        Date date = new Date(dates);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dat = formatter.format(date);
        String splitter[] = dat.split("-");
        String targetYear = splitter[2];
        String targetMonth = splitter[1];
        String targetDay = splitter[0];

        boolean z = false;
        WebElement days = driver.findElement(day3);

        clickOn(year3 , "click");

        while (!findElement(cccccc).getText().equals(targetYear))
        {
            if (Integer.parseInt(findElement(cccccc).getText()) > Integer.parseInt(targetYear))
            {
                clickOn(prevButton , "click");
                if (Integer.parseInt(findElement(cccccc).getText()) == Integer.parseInt(targetYear))
                {
                    break;
                }
            }
            else if (Integer.parseInt(findElement(cccccc).getText()) < Integer.parseInt(targetYear))
            {
                clickOn(nextButton , "click");
                if (Integer.parseInt(findElement(cccccc).getText()) == Integer.parseInt(targetYear))
                {
                    break;
                }
            }
        }
        System.out.println("Year is : " + findElement(cccccc).getText());
        List<WebElement> months = findElement(month3).findElement(By.tagName("tbody"))
                        .findElement(By.tagName("tr")).findElement(By.tagName("td")).findElements(By.tagName("span"));

        for (int i=0; i<months.size(); i++)
        {
            if (months.get(i).getText().equalsIgnoreCase(targetMonth))
            {
                WebElement element = months.get(i);
                System.out.println("Month is : " + element.getText());
                element.click();
            }
        }

        List<WebElement> rows = days.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        List<WebElement> cols;
        for (int i = 1; i < rows.size(); i++)
        {
            cols = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < cols.size(); j++)
            {
                if(cols.get(j).getText().equals(targetDay))
                {
                    WebElement element = cols.get(j);
                    System.out.println("Day is : " + element.getText());
                    element.click();
                    z= true;
                    break;
                }
            }
            if(z == true )
                break;
        }
    }
}
