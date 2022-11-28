package Challenge20Tests.tests;

import Challenge20Main.pages.localization;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class localizationTest extends testBase
{
    localization page;

    @Test
    public void localizationTest1 ()
    {
        page = new localization(driver);
        Assert.assertEquals(page.titleName() , "Amazon.com. Spend less. Smile more.");
        Assert.assertEquals(page.targetLocator() , "Hello, sign in");
    }

    @Test
    public void localizationTest2 ()
    {
        page = new localization(driver);
        Assert.assertEquals(page.titleName() , "Amazon.com. Gasta menos. Sonríe más.");
        Assert.assertEquals(page.targetLocator() , "Hola, Identifícate");
    }

    @Test
    public void localizationTest3 ()
    {
        page = new localization(driver);
        Assert.assertEquals(page.titleName() , "Amazon.com. Spend less. Smile more.");
        Assert.assertEquals(page.targetLocator() , "Hallo, anmelden");
    }
}
