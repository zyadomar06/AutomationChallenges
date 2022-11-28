package Master1Main.pages;

import PageBase.pageBase;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;

public class brokenLinks extends pageBase {
    public brokenLinks(WebDriver driver) {
        super(driver);
    }

    public void broken () throws IOException {
        getBrokenLinks();
    }
}
