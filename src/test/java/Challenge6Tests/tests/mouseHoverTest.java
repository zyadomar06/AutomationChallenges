package Challenge6Tests.tests;

import Challenge6Main.pages.mouseHoverPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mouseHoverTest extends testBase {

    mouseHoverPage page;


    @Test
    public void mouseHoverTest1 ()
    {
        page = new mouseHoverPage(driver);

        page.loginAdmin();
        page.clickRecruitment();
        page.clickVacancies();

        Assert.assertTrue(page.assertion1().isDisplayed());
    }


    @Test
    public void mouseHoverTest2 ()
    {
        page = new mouseHoverPage(driver);

        page.loginAdmin();
        page.clickRecruitment();

        Assert.assertTrue(page.assertion2().isDisplayed());
    }

}
