package Challenge17Tests.tests;

import Challenge15Main.pages.dataDriven;
import Challenge15Tests.utilities.excelRead;
import Challenge17Main.pages.headlessMode;
import TestBase.testBase;
import org.testng.annotations.Test;

public class headlessModeTest extends testBase {
    headlessMode page;

    @Test(dataProvider = "invloginData", dataProviderClass = excelRead.class)
    public void headlessModeTest1 (String UserName, String Password)
    {
        page = new headlessMode(driver);
        page.login(UserName, Password);
    }

}
