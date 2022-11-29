package Master3Tests.tests;

import Master3Main.pages.secondHighestPrice;
import TestBase.testBase;
import org.testng.annotations.Test;

public class secondHighestPriceTest extends testBase {

    secondHighestPrice page;


    @Test
    public void master3Test1 ()
    {
        page = new secondHighestPrice(driver);
        page.highestPrice();
    }
}
