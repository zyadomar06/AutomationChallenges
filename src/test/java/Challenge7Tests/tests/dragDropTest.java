package Challenge7Tests.tests;

import Challenge7Main.pages.dragDrop;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dragDropTest extends testBase {

    dragDrop page;



    @Test
    public void dragDropTest1 ()
    {
        page = new dragDrop(driver);

        page.switchs();
        System.out.println(page.getElement2().getText());
        page.dragDropAction();
        System.out.println(page.getElement2().getText());
        Assert.assertEquals( page.getElement2().getText(),"Dropped!");
    }

}
