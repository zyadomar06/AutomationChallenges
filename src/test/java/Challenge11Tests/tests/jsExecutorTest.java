package Challenge11Tests.tests;

import Challenge11Main.pages.jsExecutor;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jsExecutorTest extends testBase {


    jsExecutor page;



    @Test
    public void jsExecutorTest1 ()
    {
        page = new jsExecutor(driver);
        System.out.println("Webpage Title : " + page.jsExecute());
        Assert.assertEquals(page.jsExecute(), "OrangeHRM");

    }

    @Test
    public void jsExecutorTest2 () {
        page = new jsExecutor(driver);
        page.jsExecuteAmazon();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    }
}
