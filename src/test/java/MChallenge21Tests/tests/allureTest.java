package MChallenge21Tests.tests;

import MChallenge21Main.pages.Allure;
import MChallenge21Tests.utilities.excelRead;
import TestBase.testBase;
import org.testng.annotations.Test;

public class allureTest extends testBase {


    Allure page;

    @Test(dataProvider = "invloginData", dataProviderClass = excelRead.class)
    public void dataDrivenTest1 (String UserName, String Password)
    {
        page = new Allure(driver);
        page.login(UserName, Password);
    }
}
