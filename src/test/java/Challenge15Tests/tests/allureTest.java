package Challenge15Tests.tests;

import Challenge15Main.pages.dataDriven;
import Challenge15Tests.utilities.excelRead;
import TestBase.testBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class allureTest extends testBase {


    dataDriven page;


    @Test(dataProvider = "invloginData", dataProviderClass = excelRead.class)
    public void dataDrivenTest1 (String UserName, String Password)
    {
        page = new dataDriven(driver);
        page.loginAdmin(UserName, Password);
    }
}
