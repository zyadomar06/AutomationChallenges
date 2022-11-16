package Challenge4Tests.tests;

import Challenge4Main.pages.rClickPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rClickTest extends testBase {

    rClickPage page;


    @Test
    public void rightClickTest ()
    {
        page = new rClickPage(driver);
        page.actionsTaken().contextClick(page.targetLocator()).perform();

        Assert.assertTrue(page.targetLocator1().isDisplayed());
    }
}
