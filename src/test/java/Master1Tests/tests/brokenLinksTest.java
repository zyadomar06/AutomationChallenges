package Master1Tests.tests;

import Master1Main.pages.brokenLinks;
import TestBase.testBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class brokenLinksTest extends testBase
{
    brokenLinks page;

    @Test
    public void masterTest1 () throws IOException {
        page = new brokenLinks(driver);
        page.broken();
    }

    @Test
    public void masterTest2 () throws IOException {
        page = new brokenLinks(driver);
        page.broken();
    }
}
