package Challenge5Tests.tests;

import Challenge5Main.pages.keyBoardEventPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class keyBoardEventTest extends testBase {

    keyBoardEventPage page;


    @Test
    public void keyBoardEventTest1 () throws AWTException
    {
        page = new keyBoardEventPage(driver);
        page.loginAdmin();
        page.clickRecruitment();
        page.RobotActions();

        Assert.assertTrue(page.assertion().isDisplayed());
    }
}
