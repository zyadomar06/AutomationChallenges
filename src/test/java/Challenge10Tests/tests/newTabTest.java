package Challenge10Tests.tests;

import Challenge10Main.pages.newTab;
import TestBase.testBase;
import org.testng.annotations.Test;

public class newTabTest extends testBase {

    newTab page;

    @Test
    public void newTabTest1 ()
    {
        page = new newTab(driver);
        page.newTabClick();

    }

    @Test
    public void newTabTest2 ()
    {
        page = new newTab(driver);
        page.newWindowClick();

    }
}
