package Master2Tests.tests;

import Master2Main.pages.flakiness;
import Master2Tests.utilities.excelRead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class flakinessTest extends flakinessTestBase {

    flakiness page;

    @Test(dataProvider = "AdminLogin" , dataProviderClass = excelRead.class)
    public void flakinessTest1 (String UserName, String Password) {
        page = new flakiness(getDriver());
        page.login(UserName, Password);
        Assert.assertTrue(page.assertion().isDisplayed());
    }

    @Test(dataProvider = "invalidLogin", dataProviderClass = excelRead.class)
    public void flakinessTest2 (String UserName, String Password) {
        page = new flakiness(getDriver());
        page.login(UserName, Password);
        Assert.assertTrue(page.assertion1().isDisplayed());
    }

}
