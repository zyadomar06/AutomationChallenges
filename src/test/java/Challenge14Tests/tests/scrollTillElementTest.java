package Challenge14Tests.tests;

import Challenge14Main.pages.scrollTillElement;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scrollTillElementTest extends testBase {

    scrollTillElement page;


    @Test
    public void scrollTillElementTest1 ()
    {
        page = new scrollTillElement(driver);
        page.scroll();
        Assert.assertTrue(page.assertion1().isDisplayed());
    }

    @Test
    public void scrollToInfiniteTest2 ()
    {
        page = new scrollTillElement(driver);
        page.infiniteScroll();
    }
}
