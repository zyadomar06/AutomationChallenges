package Challenge12Tests.tests;

import Challenge12Main.pages.hiddenElements;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hiddenElementsTest extends testBase {


    hiddenElements page;


    @Test
    public void hiddenElementsTest1 ()
    {
        page = new hiddenElements(driver);
        page.hiddenElement();
        Assert.assertTrue(!page.getAssertion1().isDisplayed());
    }

    @Test
    public void hiddenElementsTest2 ()
    {
        page = new hiddenElements(driver);
        page.hiddenElementsAmazon();
        Assert.assertTrue(page.getAssertion2().isDisplayed());
    }
}
