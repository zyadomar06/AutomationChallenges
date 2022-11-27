package Challenge19Tests.tests;

import Challenge19Main.pages.calendar;
import TestBase.testBase;
import org.testng.annotations.Test;

public class calenderTest extends testBase {

    calendar page;

    @Test
    public void calendarTest1 () {
        page = new calendar(driver);
        page.setCalendar1();
    }

    @Test
    public void calendarTest2 () {
        page = new calendar(driver);
        page.setCalendar2();

    }

    @Test
    public void calendarTest3 () {
        page = new calendar(driver);
        page.setCalendar3("25-Dec-2020");

    }

    @Test
    public void calendarTest4 () {
        page = new calendar(driver);
        page.setCalendar3("25-Dec-2023");
    }
}
