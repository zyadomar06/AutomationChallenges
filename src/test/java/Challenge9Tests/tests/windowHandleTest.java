package Challenge9Tests.tests;

import Challenge9Main.pages.windowHandle;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windowHandleTest extends testBase {

    windowHandle page;

    @Test
    public void windowHandleTest1 ()
    {
        page = new windowHandle(driver);
        page.windowHandlers();
        Assert.assertTrue(page.getElement().isDisplayed());
        page.parentHandle();
    }

    @Test
    public void windowHandleTest2 ()
    {
        page = new windowHandle(driver);
        page.windowHandle1();
    }
}
