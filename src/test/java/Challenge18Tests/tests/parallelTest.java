package Challenge18Tests.tests;

import Challenge18Main.pages.parallel;
import Challenge18Tests.utilities.excelRead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parallelTest extends parallelTestBase {

    parallel page;

    @Test(dataProvider = "AdminLogin" , dataProviderClass = excelRead.class)
    public void parallelTest1 (String UserName, String Password) {
        page = new parallel(getDriver());
        page.login(UserName, Password);
        Assert.assertTrue(page.assertion().isDisplayed());
    }

    @Test(dataProvider = "invalidLogin", dataProviderClass = excelRead.class)
    public void parallelTest2 (String UserName, String Password) {
        page = new parallel(getDriver());
        page.login(UserName, Password);
        Assert.assertTrue(page.assertion1().isDisplayed());
    }

}
