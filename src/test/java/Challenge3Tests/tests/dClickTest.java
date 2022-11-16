package Challenge3Tests.tests;

import Challenge3Main.pages.dClickPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dClickTest extends testBase {

    dClickPage dClickPage;

    @Test
    public void doubleClickTest1 ()
    {
        dClickPage = new dClickPage(driver);
        dClickPage.switchFrame();
        System.out.println(dClickPage.targetLocator().getCssValue(dClickPage.cssValue()));
        dClickPage.actionsTaken().doubleClick(dClickPage.targetLocator()).perform();
        System.out.println(dClickPage.targetLocator().getCssValue(dClickPage.cssValue()));
        Assert.assertEquals(dClickPage.targetLocator().getCssValue(dClickPage.cssValue()),"rgba(255, 255, 0, 1)");
    }

    @Test
    public void doubleClickTest2 ()
    {
        dClickPage = new dClickPage(driver);
        dClickPage.actionsTaken1().doubleClick(dClickPage.target()).perform();

        Assert.assertEquals(dClickPage.alert().getText(),"You double clicked me.. Thank You..");
    }
}
