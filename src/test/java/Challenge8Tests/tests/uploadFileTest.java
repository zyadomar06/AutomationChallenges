package Challenge8Tests.tests;

import Challenge8Main.pages.uploadFile;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class uploadFileTest extends testBase {

    uploadFile page;


    @Test
    public void uploadFileTest1 ()
    {
        page = new uploadFile(driver);

        page.fileUpload();
        Assert.assertTrue(page.getElement().isDisplayed());
    }
}
