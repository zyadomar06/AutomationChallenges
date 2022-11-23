package Challenge13Tests.tests;

import Challenge13Main.pages.scrollTillBottom;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scrollTillBottomTest extends testBase {


    scrollTillBottom page;

    @Test
    public void scrollTillBottomTest1 ()
    {
        page = new scrollTillBottom(driver);
        page.scrollTillEnd();
        Assert.assertTrue(page.assertion1().isDisplayed());
    }
}
