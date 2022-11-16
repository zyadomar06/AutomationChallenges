package Challenge2Tests.tests;

import Challenge2Main.pages.framesPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class framesTest extends testBase {

    framesPage framesPage;

    @Test
    public void frameChallengeTest ()
    {
        framesPage = new framesPage(driver);
        framesPage.switchFrame();
        framesPage.chooseCourse();

        Assert.assertEquals(framesPage.getCourseChosen(),"JavaScript for beginners");

        framesPage.returnFrame();
        System.out.println("Test Passed Successfully ");
    }
}
